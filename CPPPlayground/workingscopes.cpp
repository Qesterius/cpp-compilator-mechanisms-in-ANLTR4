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

    //SCOPE MANIPULATION
    void createNewScope()
        { 
            variables.push_back({});
            printLog("Created scope.");
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
    void addVariableToLocalScope(std::string name, T value)
    {
        addVariable(name,value,variables.back());
    }

    //VARIABLE GET
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

    Variable& getVariableFromParentScope(std::string name)
        {   
            return getVariableFromKScope(name,1);
        }
    Variable& getVariableFromLocalScope(std::string name)
        {   
            return getVariableFromKScope(name,0);
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

            
    

    

} memory;

int main()
{
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

    return 0;
}