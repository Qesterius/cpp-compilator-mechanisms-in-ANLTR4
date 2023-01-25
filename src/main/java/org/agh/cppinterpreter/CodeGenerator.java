package org.agh.cppinterpreter;

import java.util.HashMap;

public class CodeGenerator {
    public static String core() {
        return baseClassCode();//baseclass code tutaj
    }

    String typeName(int type){
        switch(type){
            case gParser.IntegerConstant -> {
                return "int";
            }
            case gParser.FloatingConstant -> {
                return "float";
            }
            case gParser.Bool -> {
                return "bool";
            }
            case gParser.StringLiteral -> {
                return "string";
            }

        }
        return "undefined";
    }

    public static String declareLocalVariable(String type, String varname) {
        return String.format("memory.addVariableToLocalScope<%s>(\"%s\")\n;", type, varname);
    }
    public static String getLocalVariable(String type, String varname) {

        return String.format("memory.getValueOfVariable<%s>(memory.getVariableFromLocalScope(\"%s\"));\n",type,varname);
    }

    public static String getParentVariable(String type, String varname) {

        return String.format("memory.getVariableFromParentScope<%s>(\"%s\");\n",type,varname);
    }

    public static String generateFunctionInvocation(String type, String varname) {
        return "TODO W CPP";
    }

    public static String setLocalVariable(String varname, String value) {
        return String.format("memory.assignValueToVariable(memory.getVariableFromLocalScope(\"%s\"),%s);\n",varname,value);
    }


    static String baseClassCode()
    {
        return """
                                
                #include <map>
                #include <iostream>
                #include <vector>
                #include <string>
                                
                static bool isDebug = true;
                void printLog(std::string out)
                {
                    if(isDebug)
                        std::cout<< out << std::endl;
                }
                static class Memory
                {
                    public:
                                
                    struct Variable {
                        void* value;
                    };
                                
                    std::vector<std::map<std::string, Variable>> variables;
                    std::vector<std::map<std::string, Variable>> functionInvocations; // idk hwo it should look in the end ... :ppp
                                
                    template <typename T>
                    void addVariable(std::string name, T value, std::map<std::string,Variable> &scope )
                    {
                            T* variable_ptr = (T*) malloc(sizeof(T));
                            *variable_ptr = value;
                            scope[name] = { variable_ptr };
                           \s
                            printLog("Added new variable");
                    }
                                
                    template <typename T>
                    void assignValueToVariable(Variable& var, T value)
                    {
                            *(T*)(var.value) = value;
                    }
                                
                    template <typename T>
                    void addVariableToLocalScope(std::string name, T value)
                    {
                        addVariable(name,value,variables.back());
                    }
                                
                    void printMemory()
                    {
                        for(int i=0; i<variables.size();i++)
                        {
                            auto stack = variables[i];
                            std::cout << "Next stack "<< i << " "<< std::endl;
                                
                            for(auto var : stack){
                                std::cout << " " << var.first << ":"<< var.second.value <<"   ";
                            }
                            std::cout<< std::endl;
                        }
                    }
                                
                    void createNewScope()
                        {\s
                            variables.push_back({});
                            printLog("Created scope.");
                        }
                   \s
                    Vaariable& getVariableFromParentScope(std::string name)
                        {  \s
                            return getVariableFromKScope(name,1);
                        }
                    Variable& getVariableFromLocalScope(std::string name)
                        {  \s
                            return getVariableFromKScope(name,0);
                        }
                    \s
                    template <typename T>
                    T getValueOfVariable(Variable& var )
                    {
                        return *(T*)(var.value);
                    }
                                
                           \s
                    Variable& getVariableFromKScope(std::string name,int K){
                        int i;
                        for(i=K; i<variables.size();i++ )
                          {
                            auto finder = variables[i].find(name);
                            if(finder != variables[i].end())
                            {
                               return finder ->second;
                            }
                          }
                        throw std::runtime_error("Variable not found: " + name);
                    }
                                
                   \s
                                
                                
                    /*template <typename T>
                    T getParentVariable(std::string name)
                    {
                       \s
                        try{getVariableFromKScope<T>(name,1);}
                        catch(std::runtime_error err)
                        {
                            std::string buff;
                            std:sprintf(buff,"\\"parent %s\\" does not have parent in any of the outer scopes. In that case %s is a nullptr.", name,name);
                            throw std::runtime_error(buff);
                        }
                    }*/
                                
                } memory;
                                
                """;

    }
}
