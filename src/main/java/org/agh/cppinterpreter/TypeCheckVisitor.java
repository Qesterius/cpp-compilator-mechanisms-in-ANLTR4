package org.agh.cppinterpreter;


import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.Stack;
import java.lang.String;

import static java.lang.Math.max;

public class TypeCheckVisitor<Integer> extends gBaseVisitor<Integer>{

    Stack<HashMap<String,Variable<Object>>> notFinishedOuterScopes = new Stack<>();
    Boolean isError = false;

    public Boolean getError() {
        return isError;
    }

    public TypeCheckVisitor() {
        notFinishedOuterScopes.add(new HashMap<String,Variable<Object>>());
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
    public Integer visitDeclaration(gParser.DeclarationContext ctx) {

        try{
            String type = (String) ctx.declarationSpecifiers().declarationSpecifier().get(0).typeSpecifier().getText();
            String code = (String) ctx.getText();
            String varname = (String) ctx.initDeclaratorList().initDeclarator().get(0).declarator().getText();

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
        System.out.println(type);
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

    private void validateDeclaration(String varname, String declarationCode)
    {
        validateDeclaration(varname,(String) "undefined",declarationCode);
    }
    void validateDeclaration(String varname, String type, String declarationCode)
    {
        System.out.println("VALIDATING DECLARATION OF:"+varname);
        if(findDeclarationInLocalScope(varname))
        {
            System.out.println(varname+ " is de clared multiple times in this scope!");
            isError=true;
        }

        notFinishedOuterScopes.peek().put(varname, new Variable<Object>((java.lang.String) type, Objects.equals(declarationCode, "") ? type +" "+ varname : (java.lang.String) declarationCode) { //needed later, not in validation
        });

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


