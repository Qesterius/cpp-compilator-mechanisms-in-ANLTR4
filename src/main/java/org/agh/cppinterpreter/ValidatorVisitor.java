package org.agh.cppinterpreter;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Stack;

public class ValidatorVisitor<T> extends gBaseVisitor<T>{

    Stack<HashMap<String,Variable<Object>>> notFinishedOuterScopes = new Stack<>();
    Boolean isError = false;

    public Boolean getError() {
        return isError;
    }

    public ValidatorVisitor() {
        notFinishedOuterScopes.add(new HashMap<String,Variable<Object>>());
    }

    @Override public T visitBlockItemList(gParser.BlockItemListContext ctx) {
        System.out.println("OPENING NEW SCOPE");
        notFinishedOuterScopes.add(new HashMap<>());
        return visitChildren(ctx);
    }
    @Override public T visitCompilationUnit(gParser.CompilationUnitContext ctx) {
        System.out.println("VALIDATION START");
        return visitChildren(ctx);
    }

    @Override public T visitDirectDeclarator(gParser.DirectDeclaratorContext ctx)
    {


        try{
        if(ctx.directDeclarator() != null)
            return super.visitDirectDeclarator(ctx);

        if(ctx.identifierList() != null && ctx.identifierList().Identifier() != null)
        for (TerminalNode identif:ctx.directDeclarator().identifierList().Identifier()
             ) {
            String varname =identif.getSymbol().getText();
            validateDeclaration(varname);
        }
        if(ctx.Identifier() != null)
        {
            String varname = ctx.Identifier().getSymbol().getText();
            validateDeclaration(varname);
        }
        }catch(Exception e)
        {
            System.out.println("EXCEPTION "+e.toString());
        }

        return super.visitDirectDeclarator(ctx);
    }

    private void validateDeclaration(String varname)
    {
        System.out.println("VALIDATING DECLARATION OF:"+varname);
        if(findDeclaration(varname))
        {
            System.out.println(varname+ " is de clared multiple times. Hiding previous declartion in this scope..."); /// not error!!
            //isError=true;
        }
            notFinishedOuterScopes.peek().put(varname, new Variable<Object>("") { //needed later, not in validation
            });

    }
    void validateDeclaration(String varname, String type)
    {
        System.out.println("VALIDATING DECLARATION OF:"+varname);
        if(findDeclaration(varname))
        {
            System.out.println(varname+ " is de clared multiple times. Hiding previous declartion in this scope..."); /// not error!!
            //isError=true;
        }
            notFinishedOuterScopes.peek().put(varname, new Variable<Object>(type) { //needed later, not in validation
            });

    }

    /// inside declaration should overwrite external declaration


    @Override public T visitPrimaryExpression(gParser.PrimaryExpressionContext ctx)
    {
        if(ctx.Identifier() != null) {
            String varname = ctx.Identifier().getText();
            System.out.println("VALIDATING USE OF:" + varname);

            if (!findDeclaration(varname)) {
                System.out.println(varname + " is not declared in this scope");
                isError = true;
            }
        }
        return visitChildren(ctx);
    }
    public boolean findDeclaration(String name)
    {
        if(notFinishedOuterScopes.empty())
            return false;
        for (HashMap<String, Variable<Object>> map: notFinishedOuterScopes.stream().toList() ) {
            if(map.containsKey(name))
                return true;
        }
        return false;
    }
    //blockitemList visit -> new scope
}

