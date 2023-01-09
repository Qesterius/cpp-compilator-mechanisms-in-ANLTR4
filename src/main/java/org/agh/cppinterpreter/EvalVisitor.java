package org.agh.cppinterpreter;

import org.antlr.v4.runtime.ParserRuleContext;

import java.io.BufferedWriter;
import java.util.HashMap;
import java.util.Stack;

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
    private BufferedWriter outputWriter;
    Stack<Scope> notFinishedOuterScopes = new Stack<>();
    public EvalVisitor(BufferedWriter writer) {

        notFinishedOuterScopes.add(new Scope());
        this.outputWriter = writer;
    }
/*
    //
    @Override
    public EvaluatorContainer visitAdditiveExpression(gParser.AdditiveExpressionContext ctx) {
        EvaluatorContainer evalChild = visit(ctx.getChild(0));
        Number value = (Number) evalChild.value.value;
        String code = evalChild.code;

            for(int i=1;i<ctx.getChildCount();i+=2){
                if(Objects.equals(((TerminalNode) ctx.getChild(i)).getSymbol().getText(), "+")){
                    EvaluatorContainer nchild = visit(ctx.getChild(i+1));
                    value += (Number) nchild.value.value;
                    code += "+"+nchild.code;
                }else{

                    EvaluatorContainer nchild = visit(ctx.getChild(i+1));
                    value -= (Number) nchild.value.value;
                    code += "-" +nchild.code;
                }
            }
            return new EvaluatorContainer(code,new Variable(value));
        }


    @Override
    public EvaluatorContainer visitMultiplicativeExpression(gParser.MultiplicativeExpressionContext ctx) {
        int value=visit(ctx.getChild(0));
        for(int i=1;i<ctx.getChildCount();i+=2){
            if(Objects.equals(((TerminalNode) ctx.getChild(i)).getSymbol().getText(), "*")){
                value*=visit(ctx.getChild(i+1));
            }else{
                value/=visit(ctx.getChild(i+1));
            }
        }
        return value;
    }
*/
    @Override
    public EvaluatorContainer visitConstant(gParser.ConstantContext ctx) {
        ///co tutaj; variable ma code bo haszmapa chce, ale tu tez ammy code i po co to i co ococoo
        //niepewny czy tutaj ma byc robiona wartosc bo wariable to przy identifierach raczej
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
        System.out.println(val.value);
        return val;
    }
    @Override
    public EvaluatorContainer visitDeclaration(gParser.DeclarationContext ctx) {
        try{
            String type =ctx.declarationSpecifiers().declarationSpecifier().get(0).typeSpecifier().getText();
            String code = ctx.getText();
            String varname = ctx.initDeclaratorList().initDeclarator().get(0).declarator().getText();

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
    }

}
