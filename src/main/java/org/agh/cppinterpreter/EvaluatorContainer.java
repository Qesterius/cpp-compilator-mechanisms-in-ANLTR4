package org.agh.cppinterpreter;

public class EvaluatorContainer {
    String code;
    Variable value;

    public EvaluatorContainer(String code, Variable value) {
        this.code = code;
        this.value = value;
    }
}
