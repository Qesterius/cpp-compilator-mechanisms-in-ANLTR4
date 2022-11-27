public class Main {

    public static void main(String[] args) throws Exception{

        //Antlr setup for parsing
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(args[1]));
        ExprGrammarFileLexer lexer = new ExprGrammarFileLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprGrammarFileParser parser = new ExprGrammarFileParser(tokens);
        ParseTree tree = parser.stm();
        //Prints parsing tree to screen
        System.out.println(tree.toStringTree(parser));

        FileOutputStream file = new FileOutputStream("src\\Simple.out");
        OutputStreamWriter fileWriter = new OutputStreamWriter(file);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        //Start of assembly code
        writer.write("code segment");
        writer.newLine();
        //System.out.println("code segment");

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

    }
}
