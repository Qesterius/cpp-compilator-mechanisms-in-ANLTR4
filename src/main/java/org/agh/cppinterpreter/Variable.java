package org.agh.cppinterpreter;

import java.util.Locale;

public class Variable<Object> {
    String type;
    String code="";
    Object value ;

    public Variable( String type, Object value, String code) {
        this.type = type;
        this.value = value;
        this.code = code;
        //kurwa gowno i syf
    }

    public Variable(String type, String code) {
        this.type = type;
        this.value = null;
        this.code = code;
        switch(type.toLowerCase(Locale.ROOT)){
                case "int":  break;
                case "string": break;
                case "float": break;
                case "double": break;
                case "else": break;
        }

    }
    boolean compareTypes(Variable Y) {
        return this.type.toLowerCase(Locale.ROOT).equals(Y.type.toLowerCase());
    }
}
