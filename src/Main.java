import javax.swing.SwingUtilities;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

public class Main {
    public static void main(String[] args) throws Exception {

        String filename = "grafo1.txt";
        CharStream input = CharStreams.fromFileName(filename);
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        ParserRuleContext tree = parser.expr();

        GrafosVisitor visitor = new GrafosVisitor();
        visitor.visit(tree);

        SwingUtilities.invokeLater(() -> {});
    }

    // public static void main(String[] args) throws Exception {
    //     CharStream input = CharStreams.fromString("vertice v1 80 80 +"+
    //                                               "vertice v2 100 200 +"+ 
    //                                               "aresta a v1 v2 +"+ 
    //                                               "vertice v3 300 300 +"+ 
    //                                               "aresta b v1 v3 +"+ 
    //                                               "vertice v4 300 100 +"+ 
    //                                               "aresta c v2 v4 +"+ 
    //                                               "aresta d v3 v4");
    //     ExprLexer lexer = new ExprLexer( input);
    //     CommonTokenStream tokens = new CommonTokenStream( lexer );
    //     ExprParser parser = new ExprParser( tokens );
    //     ParserRuleContext tree = parser.expr();
    
    //     GrafosVisitor visitor = new GrafosVisitor();
    //     visitor.visit(tree);

    //     SwingUtilities.invokeLater(() -> {});
    // }

    
}
