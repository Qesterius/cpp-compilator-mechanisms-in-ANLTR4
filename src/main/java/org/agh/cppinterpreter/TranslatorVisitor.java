package org.agh.cppinterpreter;

import java.util.*;
import java.util.function.Predicate;

public class TranslatorVisitor extends gBaseVisitor<StringBuilder> {

        Stack<HashMap<String,Variable<Object>>> notFinishedOuterScopes = new Stack<>();
        Boolean isError = false;
        StringBuilder appenderLines = new StringBuilder();

        void addLineAboveOnBottom(String line){appenderLines.append(line+";\n");}
        void addLineAboveOnTopBottom(String line){appenderLines = new StringBuilder(line+";\n"+appenderLines.toString()+";\n");}


    @Override
    protected StringBuilder defaultResult() {
        return new StringBuilder();
    }

    @Override
    protected StringBuilder aggregateResult(StringBuilder aggregate, StringBuilder nextResult) {
        return new StringBuilder(aggregate).append(nextResult);
    }

    @Override
    public StringBuilder visitBlockItem(gParser.BlockItemContext ctx) {
            StringBuilder chldr =super.visitBlockItem(ctx);
            return new StringBuilder(flush()+chldr);
    }

    @Override
    public StringBuilder visitJumpStatement(gParser.JumpStatementContext ctx) {
            if(ctx.expression() != null)
            {
                addLineAboveOnBottom(CodeGenerator.setLocalVariable("\"__returnValue\"",visitExpression(ctx.expression()).toString()));
            }
            return new StringBuilder("return;\n");
    }

    String flush(){
            if(appenderLines.isEmpty())
                return "";
            String toReturn = appenderLines.toString();
            appenderLines = new StringBuilder();
            return toReturn;
        }

        public Boolean getError() {
            return isError;
        }

        public TranslatorVisitor() {
            notFinishedOuterScopes.add(new HashMap<String,Variable<Object>>());
        }

        @Override public StringBuilder visitBlockItemList(gParser.BlockItemListContext ctx) {
            System.out.println("OPENING NEW SCOPE");
            notFinishedOuterScopes.add(new HashMap<>());
            StringBuilder concat = new StringBuilder();
            for(int i=0; i<ctx.blockItem().size();i++)
                concat.append(visitBlockItem(ctx.blockItem(i))+";\n");

            return new StringBuilder("{\n"+concat+"}\n");
        }
        public StringBuilder visitBlockItemListWithoutScopeOpen(gParser.BlockItemListContext ctx) {
            StringBuilder concat = new StringBuilder();
            for(int i=0; i<ctx.blockItem().size();i++)
            {
                String child = visitBlockItem(ctx.blockItem(i)).toString();
                System.out.println(String.format("%d; %s; %s; %s;",i,ctx.blockItem(i),ctx.blockItem(i).getText(),child));
                concat.append(child+";\n");
            }
            return new StringBuilder(concat);
        }

        @Override
        public StringBuilder visitDeclaration(gParser.DeclarationContext ctx) {
            String type = "";
            String varname = "";

            StringBuilder output = new StringBuilder();
            try{
                type =ctx.declarationSpecifiers().declarationSpecifier().get(0).typeSpecifier().getText();
                String code = ctx.getText();
                //can addd functionality to declare multiple in one line;///...
                varname = ctx.initDeclaratorList(0).initDeclarator().get(0).declarator().getText();

                validateDeclaration(varname,type,code);
                output.append(CodeGenerator.declareLocalVariable(type,"\""+varname+"\"")+";\n");


                if(ctx.initDeclaratorList(0).initDeclarator(0).initializer() != null)
                {
                    StringBuilder childrenCode = visitInitializer(ctx.initDeclaratorList(0).initDeclarator(0).initializer());
                    output.append(flush());
                    output.append(CodeGenerator.setLocalVariable("\""+varname+"\"",childrenCode.toString()));
                }

            }catch(Exception e)
            {
                System.out.println("EXCEPTION "+e.toString());
            }


            return output;
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


        @Override public StringBuilder visitPrimaryExpression(gParser.PrimaryExpressionContext ctx)
        {
            if(ctx.Identifier() != null) {
                String varname = ctx.Identifier().getText();
                System.out.println("VALIDATING USE OF:" + varname);

                var variable = findAndGetDeclaration(varname);
                if (variable == null) {
                    System.out.println(varname + " is not declared in this scope");
                    isError = true;
                    return new StringBuilder("ERROR");
                }
                return new StringBuilder(CodeGenerator.getLocalVariable(variable.type,"\""+varname+"\""));

            }else
            {
                return new StringBuilder(ctx.getText());
            }
        }
    public class typeArgumentPair{
            String type;
            String value;

        public typeArgumentPair(String type, String value) {
            this.type = type;
            this.value = value;
        }
    }

    String[] IGNOREDFUNCTIONS = new String[]{"printf"};
    @Override
    public StringBuilder visitPostfixExpression(gParser.PostfixExpressionContext ctx) {
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
                ArrayList<typeArgumentPair> argumentText  = new ArrayList<>();
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
                                    String typename = CodeGenerator.typeName((Integer) typeCheck.visit(assexpr));
                                    functionName.append(typename);
                                    argumentText.add(new typeArgumentPair(typename, visitAssignmentExpression(assexpr).toString()));
                                }
                            }
                        }
                    }
                }
                if( isIgnored)
                    return new StringBuilder(functionName +"("+ arguments +")");

                var functionDeclaration =findAndGetDeclaration(functionName.toString());
                addLineAboveOnBottom(CodeGenerator.generateFunctionInvocation(functionDeclaration.type,functionName.toString(),argumentText));
                //if not void ... and if its not a statement
                return new StringBuilder(CodeGenerator.functionInvocationReturnAddress(functionDeclaration.type,"\""+functionName.toString()+"\""));

            }
            else{
                //isconstorIdentifier
                return visitPrimaryExpression(ctx.primaryExpression());
            }

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
        public Variable<Object> findAndGetDeclaration(String name)
        {
            if(notFinishedOuterScopes.empty())
                return null;
            for (HashMap<String, Variable<Object>> map: notFinishedOuterScopes.stream().toList() ) {
                Variable<Object> variable = map.get(name);
                if(variable != null)
                {
                    return variable;
                }
            }
            return null;
        }
        public boolean findDeclarationInLocalScope(String name)
        {
            if(notFinishedOuterScopes.empty())
                return false;
            HashMap<String, Variable<Object>> map  = notFinishedOuterScopes.peek();
            return map.containsKey(name);
        }
        //blockitemList visit -> new scope


    @Override
    public StringBuilder visitCompilationUnit(gParser.CompilationUnitContext ctx) {
        StringBuilder out = new StringBuilder();
        for(int i=0; i<ctx.translationUnit().children.size();i++)
            out.append(visit(ctx.translationUnit().getChild(i)));
        System.out.println(out.toString()) ;
        return new StringBuilder().append(CodeGenerator.core()+ out.toString());
    }

    class FunctionData{
        ArrayList<String> argumentTypes;
        ArrayList<String> argumentNames;
            public FunctionData(ArrayList<String> argumentNames, ArrayList<String> argTypes)
            {
                this.argumentNames = argumentNames;
                this.argumentTypes = argTypes;
            }
    }
    @Override
    public StringBuilder visitFunctionDefinition(gParser.FunctionDefinitionContext ctx)
    {
        String type = ctx.declarationSpecifiers().getText();
        StringBuilder name = new StringBuilder(ctx.declarator().directDeclarator().directDeclarator().getText());
        ArrayList<String> argNames = new ArrayList<>();
        ArrayList<String> argTypes = new ArrayList<>();
        notFinishedOuterScopes.add(new HashMap<>());

        if(ctx.declarator().directDeclarator().parameterTypeList() != null)
        {
            for (var parameter:ctx.declarator().directDeclarator().parameterTypeList().parameterList().parameterDeclaration() ){
                name.append(parameter.declarationSpecifiers().getText());
                argTypes.add(parameter.declarationSpecifiers().getText());
                argNames.add(parameter.declarator().getText());
            }
        }

        System.out.println(String.format("Found function declaration: {funname:%s, argtypes:%s, argnames:%s }",name.toString(),argTypes.toString(), argNames.toString()));
        StringBuilder code = new StringBuilder();
        if(name.toString().equals("main"))
        {
            code.append("int "+ name+ "(){\n");
            code.append(CodeGenerator.createNewScope()+";\n");
            code.append(visitBlockItemListWithoutScopeOpen(ctx.compoundStatement().blockItemList()));
            code.append(" return 0;\n}");
        }else {

            notFinishedOuterScopes.peek().put(name.toString(), new Variable<>(type, (Object) (new FunctionData(argNames, argTypes)), ctx.getText()));
            code.append("void " + name + "(){\n");
            for (int i = 0; i < argNames.size(); i++) {
                code.append(CodeGenerator.declareLocalVariable(argTypes.get(i), "\"" + argNames.get(i) + "\"") + ";\n");
                code.append(CodeGenerator.setLocalVariable("\"" + argNames.get(i) + "\"", CodeGenerator.getLocalVariable(argTypes.get(i), "\"__arg" + i + "\"")) + ";\n");
                validateDeclaration(argNames.get(i), argTypes.get(i), "");
            }
            code.append(visitBlockItemListWithoutScopeOpen(ctx.compoundStatement().blockItemList()));
            code.append(" return;\n}");
        }
        return code;
    }
}
