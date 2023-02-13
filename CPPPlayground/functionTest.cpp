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
    std::map<std::string, int> staticGlobalIntegers; 
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
    
    //SCOPE MANIPULATION
    void createNewScope()
        { 
            variables.push_back({});
            printLog("Created scope.");
        }
    void popScope()
    {
            variables.pop_back();
            printLog("Popped scope.");
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
    
    //VARIABLES ALLOCATION
    template <typename T>
    void addVariable(std::string name, T value, std::map<std::string,Variable> &scope )
    {
            T* variable_ptr = (T*) malloc(sizeof(T));
            *variable_ptr = value;
            scope[name] = { variable_ptr };
            
            printLog("Added new variable");
    }
    
    template <typename T>
    void addVariable(std::string name, std::map<std::string,Variable> &scope ) //without value but knowing type of Var
    {
            T* variable_ptr = (T*) malloc(sizeof(T));
            scope[name] = { variable_ptr };
            
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
        {   
            return getVariableFromKScope(name,variables.size()-2);
        }
    Variable& getVariableFromLocalScope(std::string name)
        {   
            return getVariableFromKScope(name, variables.size()-1 );
        }
     
    

    //VARIABLE VALUE SET
    template <typename T>
    void assignValueToVariable(Variable& var, T value)
    {
            *(T*)(var.value) = value;
    }


    //VARIABLE VALUE GET 
    template <typename T>
    T getValueOfVariable(Variable& var )
    {
        return *(T*)(var.value);
    }

            

    //FUNCTION INCANTATIONS
    int assignIdNumber(std::string funcitonName){
        auto currentIdQueue = variables.back().find("__"+funcitonName); 
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
      return fr; 
    }
    

} memory;

int main()
{

        
    /*
    memory.createNewScope();
    memory.addVariableToLocalScope("abba",'1');
    memory.printMemory();
    memory.assignValueToVariable<int>(memory.getVariableFromLocalScope("abba"),10);
    memory.printMemory();
    memory.createNewScope();
    memory.printMemory();
    memory.addVariableToLocalScope("abba1","12");

    std::cout << memory.getValueOfVariable<char*>(memory.getVariableFromLocalScope("abba1"))<< std::endl;
    std::cout << memory.getValueOfVariable<int>(memory.getVariableFromLocalScope("abba"))<< std::endl;
    memory.printMemory();
    //*(char*)memory.getLocalVariable("abba1") = ;
    memory.printMemory();
    */

   //name of funciton return is held in

/*
    visitdeclarator()
    addVariale...
    
asfoasjoijfsaiofasjifd
asfjiofjioasfjioasji
jdosiafjioasijof
jfsajoifsaoijf



    setValue(C , pionterfun1(pointera) + pinterfun2(pointerb);
     int C = 
     
     fun1(a) + fun2(b);
      | going in direction to leaf it should be executed in that order
      |      arguments a in fun 1 -> fun1 -> 
      |      arguments in fun2 b -> fun2 -> 
      |      additive operation -> allocation of C
      v
    addVariable(fun1execStaticINT pointerToTypeOfFunction) // return  -> pointerToTypeOF.. = *returnValue
    createNewScope();
    allocate arguments 
    foreach argument generate line
    addVariable(argumentName,value)
    ...
    addVariable "__return", lineOfStart
    goto function
    popFunctionScope
    int C = getVariable<Int>( fun1execStaticINT) + getVariable(...) 

    addFunctionTo
    functioncode:
    goto functionEnd:
    //ENTRYPOINT
    return ... ->     
    */
    memory.setStaticGlobalInteger("tmp",memory.getFunctionInvocationID("INVOCATIONffunctionName+argumentTypes"));

    memory.addVariableToLocalScope<int>("INVOCATIONfunctionName+argumentTypes"+memory.getStaticGlobalInteger("tmp")); //variable for fucntion return invocation
    memory.createNewScope();
    memory.addVariableToLocalScope<int>("__invocationId", memory.getStaticGlobalInteger("tmp"));
    memory.addVariableToLocalScope<bool>("argument1Name",false);
    /* ... line above for each argument passed to function */
    memory.addVariableToLocalScope<int>("__returnPoint",memory.getk.)

    return 0;
}