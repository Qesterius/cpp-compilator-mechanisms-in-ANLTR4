package org.agh.cppinterpreter;

import com.ibm.icu.impl.Pair;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Stack;

public class TranslatorVisitor extends gBaseVisitor<StringBuilder> {

        Stack<HashMap<String,Variable<Object>>> notFinishedOuterScopes = new Stack<>();
        Boolean isError = false;
        StringBuilder appenderLines = new StringBuilder();

        void addLineAboveOnBottom(String line){appenderLines.append(line);}
        void addLineAboveOnTopBottom(String line){appenderLines = new StringBuilder(line+appenderLines.toString());}

    @Override
    public StringBuilder visitBlockItem(gParser.BlockItemContext ctx) {
            StringBuilder chldr =super.visitBlockItem(ctx);
            return new StringBuilder(flush()+chldr);
    }

    @Override
    public StringBuilder visitJumpStatement(gParser.JumpStatementContext ctx) {
            if(ctx.expression() != null)
            {
                addLineAboveOnBottom(CodeGenerator.setLocalVariable("__returnValue",visitExpression(ctx.expression()).toString()));
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
            return new StringBuilder("{\n"+visitChildren(ctx)+"}\n");
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
                varname = ctx.initDeclaratorList().initDeclarator().get(0).declarator().getText();

                validateDeclaration(varname,type,code);
                output.append(CodeGenerator.declareLocalVariable(type,varname));


                if(ctx.initDeclaratorList().initDeclarator(0).initializer() != null)
                {
                    StringBuilder childrenCode = visitInitializer(ctx.initDeclaratorList().initDeclarator(0).initializer());
                    output.append(flush());
                    output.append(CodeGenerator.setLocalVariable(varname,childrenCode.toString()));
                }

            }catch(Exception e)
            {
                System.out.println("EXCEPTION "+e.toString());
            }


            return new StringBuilder(CodeGenerator.declareLocalVariable(type,varname));
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
                return new StringBuilder(CodeGenerator.getLocalVariable(variable.type,varname));

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


    @Override
    public StringBuilder visitPostfixExpression(gParser.PostfixExpressionContext ctx) {
            if(ctx.getChildCount()>0)
            {//isfunciton
                if(Objects.equals(ctx.primaryExpression().getText(), "printf"))
                    return new StringBuilder(ctx.getText());
                StringBuilder functionName = new StringBuilder(ctx.primaryExpression().getText());
                TypeCheckVisitor typeCheck = new TypeCheckVisitor();
                ArrayList<typeArgumentPair> argumentText  = new ArrayList<>();
                if( ctx.argumentExpressionList() !=null) {
                    for (var argExpList: ctx.argumentExpressionList()) {
                        if(argExpList.assignmentExpression() != null)
                        {
                            for (var assexpr: argExpList.assignmentExpression()
                                 ) {
                                String typename = CodeGenerator.typeName((Integer) typeCheck.visit(assexpr));
                                functionName.append(typename);
                                argumentText.add(new typeArgumentPair(typename,visitAssignmentExpression(assexpr).toString()));//pair -> class
                            }
                        }
                    }
                }
                var functionDeclaration =findAndGetDeclaration(functionName.toString());
                addLineAboveOnBottom(CodeGenerator.generateFunctionInvocation(functionDeclaration.type,functionName.toString(),argumentText));

                //TODO:get argument names to pass;
                //or pass them like __arg1 ...



            }
            else{
                //isconstorIdentifier
                return visitPrimaryExpression(ctx.primaryExpression());
            }


            return super.visitPostfixExpression(ctx);
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
        return new StringBuilder().append(CodeGenerator.core()+super.visitCompilationUnit(ctx).toString());
    }

    class FunctionData{
            ArrayList<String> argumentNames;
            public FunctionData(ArrayList<String> argumentNames,types)
            {
                this.argumentNames = argumentNames;
                this.argumentTypes = types;
            }
    }
    @Override
    public StringBuilder visitFunctionDefinition(gParser.FunctionDefinitionContext ctx) {

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

        notFinishedOuterScopes.peek().put(name.toString(),new Variable<>(type,(Object)(new FunctionData(argNames)),ctx.getText()));
        StringBuilder code = new StringBuilder();
        code.append("void "+ name+ "(){\n");
        for(int i=0; i<argNames.size();i++)
        {
            code.append(CodeGenerator.declareLocalVariable(argTypes.get(i),argNames.get(i)));
            code.append(CodeGenerator.setLocalVariable(argNames.get(i),CodeGenerator.getLocalVariable(argTypes.get(i),"__arg"+i));
            validateDeclaration(argNames.get(i),argTypes.get(i),"");
        }
        code.append(visitBlockItemList(ctx.compoundStatement().blockItemList()));
        code.append(" return;\n}");

        return super.visitFunctionDefinition(ctx);
    }
}
