package org.agh.cppinterpreter;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Objects;

public class EvalVisitor extends gBaseVisitor<Integer>{




    @Override
    public Integer visitAdditiveExpression(gParser.AdditiveExpressionContext ctx) {
        int value=visit(ctx.getChild(0));
        for(int i=1;i<ctx.getChildCount();i+=2){
            if(Objects.equals(((TerminalNode) ctx.getChild(i)).getSymbol().getText(), "+")){
                value+=visit(ctx.getChild(i+1));
            }else{
                value-=visit(ctx.getChild(i+1));
            }
        }
        return value;
    }

    @Override
    public Integer visitMultiplicativeExpression(gParser.MultiplicativeExpressionContext ctx) {
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

    @Override
    public Integer visitConstant(gParser.ConstantContext ctx) {
        return Integer.valueOf(ctx.getText());
    }

    @Override
    public Integer visitPrimaryExpression(gParser.PrimaryExpressionContext ctx) {
        return visit(ctx.getChild(ParserRuleContext.class,0));
    }

    @Override
    public Integer visitInitializer(gParser.InitializerContext ctx) {
        int val = super.visitInitializer(ctx);
        System.out.println(val);
        return val;
    }
}
