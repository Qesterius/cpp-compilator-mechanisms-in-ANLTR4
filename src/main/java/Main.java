import org.agh.cppinterpreter.*;
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
        System.out.println(args[0]);
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
        System.out.println("Finished validating scopes---------------------------------\n");

        //TypeCheckVisitor<Boolean> typeValidator = new TypeCheckVisitor<>();
        //typeValidator.visitCompilationUnit(programEntry);

        //System.out.println("a");
        FileOutputStream outFile;
        try {
            outFile= new FileOutputStream("src\\generated-cpp.cpp");
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            return;
        }
        OutputStreamWriter fileWriter = new OutputStreamWriter(outFile);
        BufferedWriter writer = new BufferedWriter(fileWriter);



        try {
            if (!scopeValidator.getError()) {
                EvalVisitor eval = new EvalVisitor(writer);
                eval.visit(programEntry);
            }
        }catch(Exception e)
        {   System.out.println("Eval Exception occured "+e);}

        TranslatorVisitor translatorVisitor = new TranslatorVisitor();

        writer.write(translatorVisitor.visit(programEntry).toString());
        writer.close();
    }
}
