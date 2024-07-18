import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

public class Main {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromString("vertice v1 80 80 + aresta a v1 v2");
        ExprLexer lexer = new ExprLexer( input);
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        ExprParser parser = new ExprParser( tokens );
        ParserRuleContext tree = parser.expr();
        System.out.printf("Tree = %s\n",
        tree.toStringTree(parser));
    }

    public static void avalieVisitor(ExprParser.ExprContext expr) {

        ExprBaseVisitor visitor = new ExprBaseVisitor(){
            public String visitVertice(ExprParser.VerticeContext ctx){
                return ctx.getText();
            }
            public String visitAresta(ExprParser.ArestaContext ctx){
                return ctx.getText();
            }
            // public String visitGrupo(ExprParser.GrupoContext ctx){
            //     String esq = ctx.e.accept(this);
            // }
        };

    }

}
