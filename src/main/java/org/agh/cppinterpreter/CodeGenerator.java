package org.agh.cppinterpreter;

import java.util.ArrayList;

public class CodeGenerator {
    public static String core() {
        return baseClassCode();//baseclass code tutaj
    }

    static String typeName(int type){
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
    public static String setVariableValue(String type, String variableStruct, String value){
        return String.format("memory.assignValueToVariable<%s>(%s,%s)", type, variableStruct, value);
    }

    public static String declareLocalVariable(String type, String varname) {
        return String.format("memory.addVariableToLocalScope<%s>(\"%s\")", type, varname);
    }
    public static String declareLocalVariableWithValue(String type, String varname, String value) {
        return String.format("memory.addVariableToLocalScope<%s>(\"%s\", %s)", type, varname,value);
    }
    public static String getLocalVariable(String type, String varname) {

        return String.format("memory.getValueOfVariable<%s>(memory.getVariableFromLocalScope(\"%s\"))",type,varname);
    }
    public static String setLocalVariable(String varname, String value) {
        return String.format("memory.assignValueToVariable(memory.getVariableFromLocalScope(\"%s\"),%s)",varname,value);
    }

    public static String getParentVariable(String type, String varname) {
        return String.format("memory.getVariableFromParentScope<%s>(%s)",type,varname);
    }
    public static String createNewScope() {
        return "memory.createNewScope()";
    }
    public static String assignInvocationID(String name)
    {
        return String.format("memory.assignIdNumber(%s)",name);
    }
    public static String retrieveInvocationID(String name)
    {
        return String.format("memory.resolveIdNumber(%s)",name);
    }


    public static String generateFunctionInvocation(String type, String varname, ArrayList<TranslatorVisitor.typeArgumentPair> aguments) {
        StringBuilder bldr = new StringBuilder();
        //push id to queue
        bldr.append(String.format("memory.setStaticGlobalInteger(\"tmp\",%s);\n", assignInvocationID("\""+varname+"\"")));
        bldr.append(String.format("memory.addVariableToLocalScope<%s>(\"%s\"+memory.getStaticGlobalInteger(\"tmp\"));\n",type,varname)); //variable for fucntion return invocation
        bldr.append(createNewScope()+";\n");
        bldr.append(declareLocalVariableWithValue("int","__invocationId", "memory.getStaticGlobalInteger(\"tmp\")")+";\n");
        bldr.append(declareLocalVariable(type,"__returnValue")+";\n");

        for (int i = 0; i < aguments.size(); i++) {
            bldr.append(CodeGenerator.declareLocalVariable(aguments.get(i).type,"__arg"+i)+";\n");
            bldr.append(CodeGenerator.setLocalVariable("__arg"+i,aguments.get(i).value)+";\n");
        }

        bldr.append(varname+"();\n");
        String functionInvocationFullName = '\"'+varname+'\"'+"+"+getLocalVariable("int","__invocationId");
        bldr.append(setVariableValue(
                type,
                getParentVariable(
                        type,
                        functionInvocationFullName
                ),
                getLocalVariable(type,"__returnValue"))+";\n");
        return bldr.toString();
    }

    public static String functionInvocationReturnAddress(String funname,String type)
    {
        return getLocalVariable(type,String.format("%s+memory.resolveIdNumber(%s)",funname,funname));
    }




    static String baseClassCode()
    {
        return """
                #include <map>
                         #include <iostream>
                         #include <vector>
                         #include <string>
                         #include <queue>
                         //NEWEST
                         
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
                             std::map<std::string, int> staticGlobalIntegers;\s
                             //STATIC INTEGERS INTERNAL
                             void setStaticGlobalInteger(std::string name, int value)
                             {
                                 staticGlobalIntegers[name] =value;
                             }
                             int getStaticGlobalInteger(std::string name)
                             {
                                 return staticGlobalIntegers[name];
                             }
                             //STATIC INTEGERS INTERFACE
                             int getFunctionInvocationID(std::string name)
                             {
                                 auto finder =staticGlobalIntegers.find(name);
                                 if(finder == staticGlobalIntegers.end())
                                 {
                                     staticGlobalIntegers[name] =0;
                                 }
                                 staticGlobalIntegers[name]+=1;
                                 return staticGlobalIntegers[name];
                             }
                            \s
                             //SCOPE MANIPULATION
                             void createNewScope()
                                 {\s
                                     variables.push_back({});
                                     printLog("Created scope.");
                                 }
                             void popScope()
                             {
                                     variables.pop_back();
                                     printLog("Popped scope.");
                             }
                         \s
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
                            \s
                             //VARIABLES ALLOCATION
                             template <typename T>
                             void addVariable(std::string name, T value, std::map<std::string,Variable> &scope )
                             {
                                     T* variable_ptr = (T*) malloc(sizeof(T));
                                     *variable_ptr = value;
                                     scope[name] = { variable_ptr };
                                    \s
                                     printLog("Added new variable");
                             }
                            \s
                             template <typename T>
                             void addVariable(std::string name, std::map<std::string,Variable> &scope ) //without value but knowing type of Var
                             {
                                     T* variable_ptr = (T*) malloc(sizeof(T));
                                     scope[name] = { variable_ptr };
                                    \s
                                     printLog("Added new variable without set value");
                             }
                             template <typename T>
                             void addVariableToLocalScope(std::string name, T value)
                             {
                                 addVariable(name,value,variables.back());
                             }
                             template <typename T>
                             void addVariableToLocalScope(std::string name)
                             {
                                 addVariable(name,variables.back());
                             }
                         
                             //VARIABLE GET
                             Variable& getVariableFromKScope(std::string name,int K){
                                 int i;
                                 for(i=K; i>=0;i-- )
                                   {
                                     auto finder = variables[i].find(name);
                                     if(finder != variables[i].end())
                                     {
                                        return finder ->second;
                                     }
                                   }
                                 throw std::runtime_error("Variable not found: " + name);
                            }
                         
                             Variable& getVariableFromParentScope(std::string name)
                                 {  \s
                                     return getVariableFromKScope(name,variables.size()-2);
                                 }
                             Variable& getVariableFromLocalScope(std::string name)
                                 {  \s
                                     return getVariableFromKScope(name, variables.size()-1 );
                                 }
                             \s
                            \s
                         
                             //VARIABLE VALUE SET
                             template <typename T>
                             void assignValueToVariable(Variable& var, T value)
                             {
                                     *(T*)(var.value) = value;
                             }
                         
                         
                             //VARIABLE VALUE GET\s
                             template <typename T>
                             T getValueOfVariable(Variable& var )
                             {
                                 return *(T*)(var.value);
                             }
                         
                                    \s
                         
                             //FUNCTION INCANTATIONS
                             int assignIdNumber(std::string funcitonName){
                                 auto currentIdQueue = variables.back().find("__"+funcitonName);\s
                                 if(currentIdQueue == variables.back().end())
                                 {
                                     addVariableToLocalScope("__"+funcitonName, std::queue<int>());
                                 }
                                 int id = getFunctionInvocationID(funcitonName);
                                 getValueOfVariable<std::queue<int>>(getVariableFromLocalScope("__"+funcitonName)).push(id);
                                 return id;
                             }
                             int resolveIdNumber(std::string functionName)
                             {
                               int fr = getValueOfVariable<std::queue<int>>(getVariableFromLocalScope("__"+functionName)).front();
                               getValueOfVariable<std::queue<int>>(getVariableFromLocalScope("__"+functionName)).pop();
                               return fr;\s
                             }
                            \s
                         
                         } memory;       
                """;

    }
}
