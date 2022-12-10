package org.agh.cppinterpreter;

public class ValidationVisitor<T> extends gBaseVisitor<T>{
    Object scopeTree; //TODO: implement how to store information about scopes; likely a tree where parent node is parent scope and value is line beg/end
    //TODO:next we have to place our declarations somewhere on that tree and check whether declarations are placed before references in tree

}
