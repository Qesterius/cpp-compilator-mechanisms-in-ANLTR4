package org.agh.cppinterpreter;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.Stack;

import static java.lang.Math.max;

public class EvalVisitor extends gBaseVisitor<EvaluatorContainer>{
    class Scope {
        HashMap<String,Variable<Object>> SCOPE;
        Integer id;
        static int currId=0;
        public Scope(HashMap<String, Variable<Object>> SCOPE) {
            this.SCOPE = SCOPE;
            this.id = currId;
            currId+=1;
        }
        public Scope() {
            this.SCOPE = new HashMap<String,Variable<Object>>();
            this.id = currId;
            currId+=1;
        }
    }
    Stack<Scope> notFinishedOuterScopes = new Stack<>();
    public EvalVisitor(BufferedWriter writer) {

        notFinishedOuterScopes.add(new Scope());
    }

    @Override
    public EvaluatorContainer visitAdditiveExpression(gParser.AdditiveExpressionContext ctx) {
        EvaluatorContainer evalChild = visit(ctx.getChild(0));
        Integer mode=0; //0- Int; 1-Float; 2-Double; 3-String;

        for(int i=0;i<ctx.getChildCount();i+=2)
            {
                EvaluatorContainer child = visit(ctx.getChild(i));
                int curmode = switch (child.value.type.toLowerCase(Locale.ROOT)) {
                    case "int" -> 0;
                    case "float" -> 1;
                    case "double" -> 2;
                    case "string" -> 3;
                    default -> -1;
                };
                if(curmode!=mode)
                {
                    mode = max(curmode,mode);
                }

            }

        Object value;
        switch(mode)
        {
            case 0: value = (Integer) evalChild.value.value;break;
            case 1: value = (Float) evalChild.value.value;break;
            case 2: value = (Double) evalChild.value.value;break;
            case 3: value = new String((String) evalChild.value.value);break;
            default: System.out.println("Type of evaluation is unidentifable. Line  "+ctx.getStart().getLine());
            return new EvaluatorContainer("ERROR",null);
        }
        String code = evalChild.code;

            for(int i=1;i<ctx.getChildCount();i+=2){
                EvaluatorContainer nchild = visit(ctx.getChild(i+1));

                if(Objects.equals(((TerminalNode) ctx.getChild(i)).getSymbol().getText(), "+")){
                    switch(mode)
                    {
                        case 0: value = (Integer) value + (Integer) evalChild.value.value;break;
                        case 1: value = (Float) value +(Float) evalChild.value.value;break;
                        case 2: value = (Double) value +(Double) evalChild.value.value;break;
                        case 3: value = new String((String) value +(String) evalChild.value.value);break;
                    }
                    code += "+"+nchild.code;
                }else{
                    switch(mode)
                    {
                        case 0: value = (Integer) value - (Integer) evalChild.value.value;break;
                        case 1: value = (Float) value -(Float) evalChild.value.value;break;
                        case 2: value = (Double) value -(Double) evalChild.value.value;break;
                        case 3: System.out.println("Incorrect operator to use with type String. Line  "+ctx.getStart().getLine());
                        return new EvaluatorContainer("ERROR",null);
                    }
                    code += "-" +nchild.code;
                }
            }
            String type = switch(mode){
                case 0->"int";
                case 1->"float" ;
                case 2->"double";
                case 3->"string";
                default -> "undefined";
            };
            return new EvaluatorContainer(code,new Variable(type,value,code));
        }


    @Override
    public EvaluatorContainer visitMultiplicativeExpression(gParser.MultiplicativeExpressionContext ctx) {
        EvaluatorContainer evalChild = visit(ctx.getChild(0));
        Integer mode=0; //0- Int; 1-Float; 2-Double; 3-String;

        for(int i=0;i<ctx.getChildCount();i+=2)
        {
            EvaluatorContainer child = visit(ctx.getChild(i));
            int curmode = switch (child.value.type.toLowerCase(Locale.ROOT)) {
                case "int" -> 0;
                case "float" -> 1;
                case "double" -> 2;
                case "string" -> 3;
                default -> -1;
            };
            if(curmode!=mode)
            {
                mode = max(curmode,mode);
            }

        }

        Object value;
        switch(mode)
        {
            case 0: value = (Integer) evalChild.value.value;break;
            case 1: value = (Float) evalChild.value.value;break;
            case 2: value = (Double) evalChild.value.value;break;
            case 3: value = new String((String) evalChild.value.value);break;
            default: System.out.println("Type of evaluation is unidentifable. Line  "+ctx.getStart().getLine());
                return new EvaluatorContainer("ERROR",null);
        }
        String code = evalChild.code;

        for(int i=1;i<ctx.getChildCount();i+=2){
            EvaluatorContainer nchild = visit(ctx.getChild(i+1));

            if(Objects.equals(((TerminalNode) ctx.getChild(i)).getSymbol().getText(), "*")){
                switch(mode)
                {
                    case 0: value = (Integer) value * (Integer) evalChild.value.value;break;
                    case 1: value = (Float) value *(Float) evalChild.value.value;break;
                    case 2: value = (Double) value *(Double) evalChild.value.value;break;
                    case 3: System.out.println("Incorrect operator to use with type String. Line  "+ctx.getStart().getLine());
                    return new EvaluatorContainer("ERROR",null);
                }
                code += "*"+nchild.code;
            }else{
                switch(mode)
                {
                    case 0: value = (Integer) value / (Integer) evalChild.value.value;break;
                    case 1: value = (Float) value /(Float) evalChild.value.value;break;
                    case 2: value = (Double) value /(Double) evalChild.value.value;break;
                    case 3: System.out.println("Incorrect operator to use with type String. Line  "+ctx.getStart().getLine());
                    return new EvaluatorContainer("ERROR",null);
                }
                code += "/" +nchild.code;
            }
        }
        String type = switch(mode){
            case 0->"int";
            case 1->"float" ;
            case 2->"double";
            case 3->"string";
            default -> "undefined";
        };
        return new EvaluatorContainer(code,new Variable(type,value,code));
    }

    @Override
    public EvaluatorContainer visitConstant(gParser.ConstantContext ctx) {
        ///co tutaj; variable ma code bo haszmapa chce, ale tu tez ammy code i po co to i co ococoo
        //
        ///trzeba dac obsluge innych literalow
        return new EvaluatorContainer(ctx.getText(),new Variable("int",(Object) Integer.valueOf(ctx.getText()), ctx.getText())
        );
    }

    @Override
    public EvaluatorContainer visitPrimaryExpression(gParser.PrimaryExpressionContext ctx) {
        //CAN USE DECLARED VARIABLES IN SCOPE

        return visit(ctx.getChild(ParserRuleContext.class,0));
    }

    @Override
    public EvaluatorContainer visitInitializer(gParser.InitializerContext ctx) {
        EvaluatorContainer val = super.visitInitializer(ctx);
        System.out.println(val.value.code+" "+val.value.value);
        return val;
    }
    @Override
    public EvaluatorContainer visitDeclaration(gParser.DeclarationContext ctx) {
        try{
            String type =ctx.declarationSpecifiers().declarationSpecifier().get(0).typeSpecifier().getText();
            String code = ctx.getText();
            String varname = ctx.initDeclaratorList(0).initDeclarator().get(0).declarator().getText();

            addDeclaration(varname,type,code);

        }catch(Exception e)
        {
            System.out.println("EXCEPTION "+e.toString());
        }

        return super.visitDeclaration(ctx);
    }

    /*@Override
    public EvaluatorContainer visitDirectDeclarator(gParser.DirectDeclaratorContext ctx) {
        try{
            if(ctx.directDeclarator() != null)
                return super.visitDirectDeclarator(ctx);

            if(ctx.identifierList() != null && ctx.identifierList().Identifier() != null)
                for (TerminalNode identif:ctx.directDeclarator().identifierList().Identifier()
                ) {
                    String varname =identif.getSymbol().getText();
                    addDeclaration(varname,);
                }
            if(ctx.Identifier() != null)
            {
                String varname = ctx.Identifier().getSymbol().getText();
                addDeclaration(varname);
            }
        }catch(Exception e)
        {
            System.out.println("EXCEPTION "+e.toString());
        }

        return //super.visitDirectDeclarator(ctx);
    }*/
    @Override
    public EvaluatorContainer visitBlockItemList(gParser.BlockItemListContext ctx) {
        notFinishedOuterScopes.add(new Scope());
        return super.visitBlockItemList(ctx);
    }

    public boolean findDeclaration(String name)
    {
        if(notFinishedOuterScopes.empty())
            return false;
        for (Scope scope: notFinishedOuterScopes.stream().toList() ) {

            if(scope.SCOPE.containsKey(name))
                return true;
        }
        return false;
    }
    private void addDeclaration(String varname, String type, String code) //renamed validateDeclaration from ValidationVisitor
    {
        notFinishedOuterScopes.peek().SCOPE.put(varname, new Variable<Object>(type,code) { //needed later, not in validation
        });

    }
    void addDeclaration(String varname, String type, Object valueInit,String code)
    {
        notFinishedOuterScopes.peek().SCOPE.put(varname, new Variable<Object>(type,valueInit,code) { //needed later, not in validation
        });

    }
    /*
    String createScopeVariables(Scope scope)
    {
        String mapName= "scopeID"+ scope.id;
        StringBuilder out = new StringBuilder("std::map<std::string, void*> " + mapName + ";");
        scope.SCOPE.forEach(
                (key, value)
                        -> {
                    out.append(value.code+";"+mapName + "[" + key + "] = " + "&"+key + ";");
                });
        return out.toString();
    }*/

}
