public class GrafosVisitor extends ExprBaseVisitor<Object>{
    
    private GraphGUI grafo;

    public GrafosVisitor() {
        this.grafo = new GraphGUI();
    }

    @Override
    public Integer visitVertice(ExprParser.VerticeContext ctx) {
        String nome = ctx.nome.getText();
        int x = Integer.parseInt(ctx.x.getText());
        int y = Integer.parseInt(ctx.y.getText());
        grafo.addVertex(nome, x, y);
        return 0;
    }

    @Override
    public Integer visitAresta(ExprParser.ArestaContext ctx) {
        String nomeAresta = ctx.nome.getText();
        String verticeInicio = ctx.verticeInicio.getText();
        String verticeFinal = ctx.verticeFinal.getText();
        grafo.addEdge(nomeAresta, verticeInicio, verticeFinal);
        return 0;
    }

}
