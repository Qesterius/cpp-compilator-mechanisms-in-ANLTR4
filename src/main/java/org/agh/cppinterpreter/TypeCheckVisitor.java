package org.agh.cppinterpreter;


import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Stack;

public class TypeCheckVisitor<Integer> extends gBaseVisitor<Integer>{

    Stack<HashMap<String,Integer>> notFinishedOuterScopes = new Stack<>();
    Boolean isError = false;

    public Boolean getError() {
        return isError;
    }

    public TypeCheckVisitor() {
        notFinishedOuterScopes.add(new HashMap<String,Integer>());
    }
    public TypeCheckVisitor(Stack<HashMap<String,Variable<Object>>> nf) {
        notFinishedOuterScopes = new Stack<>();
        for (HashMap<String,Variable<Object>> a: nf
             ) {
                HashMap<String,Integer> hm = new HashMap<>();
            for (var b:a.entrySet()
                 ) {
                hm.put(b.getKey(),typeToInt(b.getValue().type));
            }

            notFinishedOuterScopes.push(hm);
        }
    }

    private Integer typeToInt(String TYPETMP)
    {
        int type= 0;
        switch (TYPETMP){
            case "int": type=gParser.IntegerConstant; break;
            case "float": type=gParser.FloatingConstant; break;
            case "string": type=gParser.StringLiteral; break;
        }
        return (Integer) new java.lang.Integer(type);
    }

    @Override public Integer visitBlockItemList(gParser.BlockItemListContext ctx) {
        System.out.println("OPENING NEW SCOPE");
        notFinishedOuterScopes.add(new HashMap<>());
        return visitChildren(ctx);
    }
    @Override public Integer visitCompilationUnit(gParser.CompilationUnitContext ctx) {
        System.out.println("VALIDATION START");
        return visitChildren(ctx);
    }

    @Override
    public Integer visitDeclaration(gParser.DeclarationContext ctx) {

        try{
            String typetemp = (String) ctx.declarationSpecifiers().declarationSpecifier().get(0).typeSpecifier().getText();
            int type = gParser.IntegerConstant;
            switch (typetemp){
                case "int": type=gParser.IntegerConstant; break;
                case "float": type=gParser.FloatingConstant; break;
                case "string": type=gParser.StringLiteral; break;
            }
            String code = (String) ctx.getText();
            String varname = (String) ctx.initDeclaratorList(0).initDeclarator().get(0).declarator().getText();

            validateDeclaration(varname,type,code);
        }catch(Exception e)
        {
            System.out.println("EXCEPTION "+e.toString());
        }

        return super.visitDeclaration(ctx);
    }

    @Override
    public Integer visitAdditiveExpression(gParser.AdditiveExpressionContext ctx) {
        Integer type=visit(ctx.getChild(0));
        for(int i=2;i<ctx.getChildCount();i+=2)
        {
            Integer childType = visit(ctx.getChild(i));
            System.out.println(childType);
            if(!childType.equals(type)){
                System.out.println("TypeError in line "+ctx.getStart().getLine()+". Invalid type, required: "+type+", provided: "+childType);
                isError = true;
            }

        }
        return type;
    }

    @Override
    public Integer visitMultiplicativeExpression(gParser.MultiplicativeExpressionContext ctx) {
        Integer type=visit(ctx.getChild(0));

        for(int i=1;i<ctx.getChildCount();i+=1)
        {
            Integer childType = visit(ctx.getChild(i));
            if(!childType.equals(type)){
                System.out.println("Invalid type, required: "+type+", provided: "+childType);
                isError = true;
            }
        }
        return type;
    }


    void validateDeclaration(String varname, int type, String declarationCode)
    {
        System.out.println("VALIDATING DECLARATION OF:"+varname);
        if(findDeclarationInLocalScope(varname))
        {
            System.out.println(varname+ " is de clared multiple times in this scope!");
            isError=true;
        }

        notFinishedOuterScopes.peek().put(varname, (Integer) new java.lang.Integer(type));

    }

    /// inside declaration should overwrite external declaration

    @Override
    public Integer visitConstant(gParser.ConstantContext ctx) {
        ///co tutaj; variable ma code bo haszmapa chce, ale tu tez ammy code i po co to i co ococoo
        //
        ///trzeba dac obsluge innych literalow
        //StringLiteral=102 IntegerConstant=99 FloatingConstant=100
        TerminalNode tnode = (TerminalNode) ctx.getChild(0);
        Token symbol = tnode.getSymbol();
        return (Integer) new java.lang.Integer(symbol.getType());
    }



    @Override public Integer visitPrimaryExpression(gParser.PrimaryExpressionContext ctx)
    {
        if(ctx.Identifier() != null) {
            String varname = (String) ctx.Identifier().getText();
            System.out.println("VALIDATING USE OF:" + varname);


            if (!findDeclaration(varname)) {
                System.out.println(varname + " is not declared in this scope");
                isError = true;
            }else{
                return idType(varname);
            }

        }
        if(ctx.expression() != null){
            return visit(ctx.expression());
        }
        return visitChildren(ctx);
    }

    public Integer idType(String name){
        return notFinishedOuterScopes.peek().get(name);
    }
    public Integer tokenSymbol(ParseTree ch){
        TerminalNode tnode = (TerminalNode) ch;
        Token symbol = tnode.getSymbol();
        return (Integer) new java.lang.Integer(symbol.getType());
    }

    void checkTypes(ParseTree ctx, int line){
            Integer type1 = visit(ctx.getChild(0));
            Integer type2 = visit(ctx.getChild(2));
            if(!type1.equals(type2)){
                System.out.println("TypeError in line " +line+": Can't compare type "+type1+" with type "+type2);
            }

    }


    @Override
    public Integer visitEqualityExpression(gParser.EqualityExpressionContext ctx) {
        if(ctx.getChildCount()>1) {
            checkTypes(ctx,ctx.getStart().getLine());
            return (Integer) new java.lang.Integer(gParser.Bool);
        }


        return super.visitEqualityExpression(ctx);
    }

    @Override
    public Integer visitRelationalExpression(gParser.RelationalExpressionContext ctx) {
        if(ctx.getChildCount()>1) {
            checkTypes(ctx,ctx.getStart().getLine());
            return (Integer) new java.lang.Integer(gParser.Bool);
        }


        return super.visitRelationalExpression(ctx);
    }

    @Override
    public Integer visitLogicalAndExpression(gParser.LogicalAndExpressionContext ctx) {
        if(ctx.getChildCount()>1){

            Integer type1 = visit(ctx.getChild(0));
            Integer type2 = visit(ctx.getChild(2));
            Integer tt = (Integer) new java.lang.Integer(gParser.Bool);
            if(!type1.equals(tt) || !type1.equals(tt)){
                System.out.println("TypeError in line " +ctx.getStart().getLine()+": Required two booleans, provided: "+type1+" and "+type2);
            }
            return (Integer) new java.lang.Integer(gParser.Bool);
        }
        return super.visitLogicalAndExpression(ctx);
    }

    public boolean findDeclaration(String name)
    {
        System.out.println(notFinishedOuterScopes.toString());

        if(notFinishedOuterScopes.empty())
            return false;
        for (HashMap<String, Integer> map: notFinishedOuterScopes.stream().toList() ) {
            if(map.containsKey(name))
                return true;
        }
        return false;
    }
    public boolean findDeclarationInLocalScope(String name)
    {
        if(notFinishedOuterScopes.empty())
            return false;
        HashMap<String, Integer> map  = notFinishedOuterScopes.peek();
        return map.containsKey(name);
    }
    //blockitemList visit -> new scope
}


