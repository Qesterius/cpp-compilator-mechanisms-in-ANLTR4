package org.agh.cppinterpreter;

import java.util.HashMap;
import java.util.Objects;
import java.util.Stack;

public class ValidatorVisitor<T> extends gBaseVisitor<T>{

    Stack<HashMap<String,Variable<Object>>> notFinishedOuterScopes = new Stack<>();
    private void pushScope()
    {
        System.out.println("OPENING NEW SCOPE");
        notFinishedOuterScopes.add(new HashMap<String,Variable<Object>>());

    }
    private void popScope()
    {
        notFinishedOuterScopes.pop();
        System.out.println("CLOSING SCOPE");
    }
    Boolean isError = false;

    public Boolean getError() {
        return isError;
    }

    public ValidatorVisitor() {
        pushScope();
    }
    public ValidatorVisitor(Stack<HashMap<String,Variable<Object>>> nf) {
        notFinishedOuterScopes = nf;
    }

    @Override public T visitBlockItemList(gParser.BlockItemListContext ctx) {
        pushScope();
        var a= visitChildren(ctx);
        popScope();
        return a;
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
            String varname = ctx.initDeclaratorList(0).initDeclarator().get(0).declarator().getText();

            validateDeclaration(varname,type,code);
        }catch(Exception e)
        {
            System.out.println("EXCEPTION "+e.toString());
        }

        return super.visitDeclaration(ctx);
    }

    String[] IGNOREDFUNCTIONS = new String[]{"printf"};
 /*   @Override
    public T visitPostfixExpression(gParser.PostfixExpressionContext ctx) {
        System.out.println(ctx.getText()+"  " + ctx.getChildCount());
        if(ctx.getChildCount()>2)
        {//isfunciton
            StringBuilder functionName = new StringBuilder(ctx.primaryExpression().getText());
            StringBuilder arguments = new StringBuilder();
            Boolean isIgnored = false;

            System.out.println("POSTFIX:"+ctx.getText());
            if(Arrays.stream(IGNOREDFUNCTIONS).anyMatch(new Predicate<String>() {
                @Override
                public boolean test(String s) {
                    return functionName.toString().equals(s);
                }
            }))
            {
                isIgnored = true;
            }

            TypeCheckVisitor typeCheck = new TypeCheckVisitor();
            ArrayList<TranslatorVisitor.typeArgumentPair> argumentText  = new ArrayList<>();
            if( ctx.argumentExpressionList() !=null) {
                for (var argExpList: ctx.argumentExpressionList()) {
                    if(argExpList.assignmentExpression() != null)
                    {
                        for (var assexpr: argExpList.assignmentExpression()
                        ) {
                            if(isIgnored)
                            {
                                if(!arguments.isEmpty())
                                    arguments.append(",");
                                arguments.append(visitAssignmentExpression(assexpr).toString());
                            }
                            else {
                                System.out.println(String.format("TYPE CHECKING %s",assexpr.getText()));
                                String argument = visitAssignmentExpression(assexpr).toString();
                                typeCheck = new TypeCheckVisitor();
                                String typename = CodeGenerator.typeName((Integer) typeCheck.visit(assexpr));
                                functionName.append(typename);
                                argumentText.add(new TranslatorVisitor.typeArgumentPair(typename, visitAssignmentExpression(assexpr).toString()));
                            }
                        }
                    }
                }
            }
            if( isIgnored)
                return defaultResult();

            var functionDeclaration =findAndGetDeclaration(functionName.toString());
            return new StringBuilder(CodeGenerator.functionInvocationReturnAddress(functionDeclaration.type,"\""+functionName.toString()+"\""));
        }
        else{
            //isconstorIdentifier
            return visitPrimaryExpression(ctx.primaryExpression());
        }
    }*/

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

