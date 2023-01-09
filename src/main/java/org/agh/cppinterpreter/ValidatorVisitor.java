package org.agh.cppinterpreter;

import java.util.HashMap;
import java.util.Objects;
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

/*    @Override public T visitDirectDeclarator(gParser.DirectDeclaratorContext ctx)
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
    }*/
    @Override
    public T visitDeclaration(gParser.DeclarationContext ctx) {

        try{
            String type =ctx.declarationSpecifiers().declarationSpecifier().get(0).typeSpecifier().getText();
            String code = ctx.getText();
            String varname = ctx.initDeclaratorList().initDeclarator().get(0).declarator().getText();

            validateDeclaration(varname,type,code);
        }catch(Exception e)
        {
            System.out.println("EXCEPTION "+e.toString());
        }

        return super.visitDeclaration(ctx);
    }


    private void validateDeclaration(String varname, String declarationCode)
    {
        validateDeclaration(varname,"undefined",declarationCode);
    }
    void validateDeclaration(String varname, String type, String declarationCode)
    {
        System.out.println("VALIDATING DECLARATION OF:"+varname);
        if(findDeclarationInLocalScope(varname))
        {
            System.out.println(varname+ " is de clared multiple times in this scope!");
            isError=true;
        }

        notFinishedOuterScopes.peek().put(varname, new Variable<>(type, Objects.equals(declarationCode, "") ? type +" "+ varname : declarationCode) { //needed later, not in validation
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
    public boolean findDeclarationInLocalScope(String name)
    {
        if(notFinishedOuterScopes.empty())
            return false;
        HashMap<String, Variable<Object>> map  = notFinishedOuterScopes.peek();
        return map.containsKey(name);
    }
    //blockitemList visit -> new scope
}

