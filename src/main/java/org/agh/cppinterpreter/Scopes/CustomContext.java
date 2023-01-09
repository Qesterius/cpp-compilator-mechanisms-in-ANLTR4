package org.agh.cppinterpreter.Scopes;

import org.antlr.v4.runtime.ParserRuleContext;

public class CustomContext extends ParserRuleContext {
    Scope myScope;
    public CustomContext() {
        super();
    }
}
