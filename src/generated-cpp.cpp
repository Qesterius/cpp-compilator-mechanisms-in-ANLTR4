
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
        { 
            variables.push_back({});
            printLog("Created scope.");
        }
    
    Vaariable& getVariableFromParentScope(std::string name)
        {   
            return getVariableFromKScope(name,1);
        }
    Variable& getVariableFromLocalScope(std::string name)
        {   
            return getVariableFromKScope(name,0);
        }
     
    template <typename T>
    T getValueOfVariable(Variable& var )
    {
        return *(T*)(var.value);
    }

            
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

    


    /*template <typename T>
    T getParentVariable(std::string name)
    {
        
        try{getVariableFromKScope<T>(name,1);}
        catch(std::runtime_error err)
        {
            std::string buff;
            std:sprintf(buff,"\"parent %s\" does not have parent in any of the outer scopes. In that case %s is a nullptr.", name,name);
            throw std::runtime_error(buff);
        }
    }*/

} memory;

void customfunint(){
memory.addVariableToLocalScope<int>("a");
memory.assignValueToVariable(memory.getVariableFromLocalScope("a"),memory.getValueOfVariable<int>(memory.getVariableFromLocalScope("__arg0"));
);
nullmemory.assignValueToVariable(memory.getVariableFromLocalScope("__returnValue"),memory.getValueOfVariable<int>(memory.getVariableFromLocalScope("a"));
);
return;
 return;
}void main(){
memory.setStaticGlobalInteger("tmp",memory.getFunctionInvocationID("customfunint"));
memory.addVariableToLocalScope<int>(customfunint+memory.getStaticGlobalInteger("tmp"));
memory.createNewScope();
memory.addVariableToLocalScope<int>("__invocationId", memory.getStaticGlobalInteger("tmp"));
memory.addVariableToLocalScope<%s>("__returnValue");
memory.addVariableToLocalScope<int>("__arg0");
memory.assignValueToVariable(memory.getVariableFromLocalScope("__arg0"),1);
memory.addVariableToLocalScope<%s>("__returnValue");
void customfunint();
SET VARIABLE RETURN TO POINTER
nullmemory.addVariableToLocalScope<int>("b");
memory.assignValueToVariable(memory.getVariableFromLocalScope("b"),1);
memory.addVariableToLocalScope<int>("a");
 return;
}