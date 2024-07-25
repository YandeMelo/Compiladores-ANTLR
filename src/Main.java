import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String filename = "Conexão1.txt";
        CharStream input = CharStreams.fromFileName(filename);
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        
        // Tratamento de Erros
        lexer.removeErrorListeners();
        parser.removeErrorListeners();
        lexer.addErrorListener(new CustomErrorListener());
        parser.addErrorListener(new CustomErrorListener());
        
        try {
            ParserRuleContext tree = parser.com();
            CustomVisitor visitor = new CustomVisitor();
            visitor.visit(tree);
        } catch (RuntimeException e) {
            System.err.println("\nFalha ao fazer parsing: " + e.getMessage());
        }
    }
}
