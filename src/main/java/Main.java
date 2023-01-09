import org.agh.cppinterpreter.EvalVisitor;
import org.agh.cppinterpreter.ValidatorVisitor;
import org.agh.cppinterpreter.gLexer;
import org.agh.cppinterpreter.gParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;

public class Main {
//TODO: Translation
//TODO: Validation of scope execution and declaration of variables --- DONE but maybe we would like to modify our parsing tree and specify scopes
//TODO: Promotion of types (?) casting float a = 7 -> 7.0 ...


    public static void main(String[] args) throws Exception{
        boolean failure=false;
        CharStream input = null;
        FileInputStream file = null;
        //Antlr setup for parsing
        try {
            file = new FileInputStream(args[0]);
        }catch(FileNotFoundException fnf)
        {
            System.out.println("File not found, exiting... "+ args[0]);
            failure = true;
        }
        if(failure)
            return;
        input = CharStreams.fromStream(file);
        gLexer lexer = new gLexer(input);


        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gParser parser = new gParser(tokens);
        gParser.CompilationUnitContext programEntry = parser.compilationUnit();

        ValidatorVisitor<Boolean> scopeValidator = new ValidatorVisitor<>();
        scopeValidator.visitCompilationUnit(programEntry);



        FileOutputStream outFile = new FileOutputStream("src\\generated-cpp.cpp");
        OutputStreamWriter fileWriter = new OutputStreamWriter(outFile);
        BufferedWriter writer = new BufferedWriter(fileWriter);


        try {
            if (!scopeValidator.getError()) {
                EvalVisitor eval = new EvalVisitor(writer);
                eval.visit(programEntry);
            }
        }catch(Exception e)
        {   System.out.println("Eval Exception occured "+e);}

        /*
        //Start of cpp translated code
        //writer.write("code segment");
        //writer.newLine();

        //Assembly codes generated with EvalVisitor class

        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);

        //End of assembly code for exit, print and data variables
        eval.PrintExit();

        if (eval.IsVisitPrint)
            eval.CallPrint();
        eval.PrintData();



        //Writing output to Simple.out
        for(int i = 0; i < eval.printList.size(); i++)
        {
            writer.write((String) eval.printList.get(i));
            writer.newLine();
        }

        writer.close();

        //Warning label for Simple.out
        System.out.println("\n*********************************");
        System.out.println("*                               *");
        System.out.println("*  OUTPUT IS IN THE Simple.out  *");
        System.out.println("*                               *");
        System.out.println("*********************************");
        */
    }
}
