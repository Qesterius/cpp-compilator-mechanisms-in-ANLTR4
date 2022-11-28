import org.agh.cppinterpreter.gBaseVisitor;
import org.agh.cppinterpreter.gLexer;
import org.agh.cppinterpreter.gParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception{

        //Antlr setup for parsing
        CharStream input = CharStreams.fromStream(new FileInputStream(args[1]));
        gLexer lexer = new gLexer(input);


        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gParser parser = new gParser(tokens);
        ParseTree tree = parser.translationUnit();

        //Prints parsing tree to screen
        System.out.println(tree.toStringTree(parser));

        FileOutputStream file = new FileOutputStream("src\\Simple.out");
        OutputStreamWriter fileWriter = new OutputStreamWriter(file);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        //Start of cpp translated code
        writer.write("code segment");
        writer.newLine();

        //Assembly codes generated with EvalVisitor class
        gBaseVisitor eval = new gBaseVisitor();
        eval.visit(tree);

        //End of assembly code for exit, print and data variables
        /*eval.PrintExit();

        if (eval.IsVisitPrint)
            eval.CallPrint();
        eval.PrintData();
        */


     /*   //Writing output to Simple.out
        for(int i = 0; i < eval.printList.size(); i++)
        {
            writer.write((String) eval.printList.get(i));
            writer.newLine();
        }
     */
        writer.close();

        //Warning label for Simple.out
        System.out.println("\n*********************************");
        System.out.println("*                               *");
        System.out.println("*  OUTPUT IS IN THE Simple.out  *");
        System.out.println("*                               *");
        System.out.println("*********************************");

    }
}
