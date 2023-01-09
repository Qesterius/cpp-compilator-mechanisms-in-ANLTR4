package org.agh.cppinterpreter.Scopes;

import org.agh.cppinterpreter.gParser;
import org.antlr.v4.runtime.ParserRuleContext;

public class ASTNodes {

    public class ScopeContext extends gParser.BlockItemListContext {
        Scope scope = new Scope();
        public ScopeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        public ScopeContext(gParser.BlockItemContext adam)
        {

        }
    }

    abstract class ExpressionNode extends gParser.PrimaryExpressionContext
    {
        public ExpressionNode(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
    }

    class InfixExpressionNode extends ExpressionNode
    {
        public ExpressionNode Left;
        public ExpressionNode Right;

        public InfixExpressionNode(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
    }

    class AdditionNode : InfixExpressionNode
    {
    }

    internal class SubtractionNode : InfixExpressionNode
    {
    }

    internal class MultiplicationNode : InfixExpressionNode
    {
    }

    internal class DivisionNode : InfixExpressionNode
    {
    }

    internal class NegateNode : ExpressionNode
    {
        public ExpressionNode InnerNode { get; set; }
    }

    internal class FunctionNode : ExpressionNode
    {
        public Func<double, double> Function { get; set; }
        public ExpressionNode Argument { get; set; }
    }

    internal class NumberNode : ExpressionNode
    {
        public double Value { get; set; }
    }
}
