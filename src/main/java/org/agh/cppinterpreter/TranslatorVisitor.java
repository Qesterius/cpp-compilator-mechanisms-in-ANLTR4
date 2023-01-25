package org.agh.cppinterpreter;

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
            return visitChildren(ctx);
        }

        @Override
        public StringBuilder visitDeclaration(gParser.DeclarationContext ctx) {
            String type;
            String varname;

            StringBuilder output = new StringBuilder();
            try{
                type =ctx.declarationSpecifiers().declarationSpecifier().get(0).typeSpecifier().getText();
                String code = ctx.getText();
                //can addd functionality to declare multiple in one line;///...
                varname = ctx.initDeclaratorList().initDeclarator().get(0).declarator().getText();

                validateDeclaration(varname,type,code);
                output.append(CodeGenerator.declareVariable(type,varname));


                if(ctx.initDeclaratorList().initDeclarator(0).initializer() != null)
                {
                    StringBuilder childrenCode = visitInitializer(ctx.initDeclaratorList().initDeclarator(0).initializer());
                    output.append(flush());
                    output.append(CodeGenerator.setVariableValue(varname,childrenCode));
                }

            }catch(Exception e)
            {
                System.out.println("EXCEPTION "+e.toString());
            }


            return new StringBuilder(CodeGenerator.declareVariable(type,varname)+";"+ ;
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




    @Override
    public StringBuilder visitCompilationUnit(gParser.CompilationUnitContext ctx) {
        return new StringBuilder().append(CodeGenerator.core()+super.visitCompilationUnit(ctx).toString());
    }

    @Override
    public StringBuilder visitFunctionDefinition(gParser.FunctionDefinitionContext ctx) {
        return super.visitFunctionDefinition(ctx);
    }
}
