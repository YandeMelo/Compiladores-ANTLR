public class CustomVisitor extends ExprBaseVisitor<Object> {
    
    private GraphGUI grafo;
    private String distanciaCabo;

    public CustomVisitor() {
        
    }

    // GRAFOS
    @Override
    public Object visitGrafo(ExprParser.GrafoContext ctx){
        this.grafo = new GraphGUI(800, 800);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVertice(ExprParser.VerticeContext ctx) {
        String nome = ctx.nome.getText();
        int x = Integer.parseInt(ctx.x.getText());
        int y = Integer.parseInt(ctx.y.getText());
        grafo.addVertex(nome, x, y);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAresta(ExprParser.ArestaContext ctx) {
        String nomeAresta = ctx.nome.getText();
        String verticeInicio = ctx.verticeInicio.getText();
        String verticeFinal = ctx.verticeFinal.getText();
        grafo.addEdge(nomeAresta, verticeInicio, verticeFinal);
        return visitChildren(ctx);
    }

    // CONEXAO
    @Override
    public Object visitConexao(ExprParser.ConexaoContext ctx) {
        int width = Integer.parseInt(ctx.areaX.getText());
        int height = Integer.parseInt(ctx.areaY.getText());
        distanciaCabo = ctx.distanciaCabo.getText();

        this.grafo = new GraphGUI(width, height);
        return visitChildren(ctx);
    }

    @Override
    public Object visitModem(ExprParser.ModemContext ctx) {
        String nome = ctx.nome.getText();
        int x = Integer.parseInt(ctx.x.getText());
        int y = Integer.parseInt(ctx.y.getText());
        grafo.addVertex(nome, x, y);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSwitch(ExprParser.SwitchContext ctx) {
        String nome = ctx.nome.getText();
        int x = Integer.parseInt(ctx.x.getText());
        int y = Integer.parseInt(ctx.y.getText());
        String conectado = ctx.conectado.getText();
        grafo.addVertex(nome, x, y);
        // Ajustar tamanho da linha/cabo
        grafo.addEdge(distanciaCabo, nome, conectado);
        return visitChildren(ctx);
    }

    @Override
    public Object visitRepetidor(ExprParser.RepetidorContext ctx) {
        String nome = ctx.nome.getText();
        int x = Integer.parseInt(ctx.x.getText());
        int y = Integer.parseInt(ctx.y.getText());
        String conectado = ctx.conectado.getText();
        grafo.addVertex(nome, x, y);
        // Ajustar tamanho da linha/cabo
        grafo.addEdge(distanciaCabo, nome, conectado);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDispositivo(ExprParser.DispositivoContext ctx){
        String nome = ctx.nome.getText();
        int x = Integer.parseInt(ctx.x.getText());
        int y = Integer.parseInt(ctx.y.getText());
        grafo.addVertex(nome, x, y);
        return visitChildren(ctx);
    }
}
