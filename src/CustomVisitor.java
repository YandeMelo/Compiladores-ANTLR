import java.util.ArrayList;
import java.util.List;

public class CustomVisitor extends ExprBaseVisitor<Object> {

    private GraphGUI grafo;
    private String distanciaCabo;

    private List<Conexao> conexoesList = new ArrayList<Conexao>();

    public CustomVisitor() {

    }

    // GRAFOS
    @Override
    public Object visitGrafo(ExprParser.GrafoContext ctx) {
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
        if (ctx.distanciaCabo == null) {
            distanciaCabo = "100";
        } else {
            distanciaCabo = ctx.distanciaCabo.getText();
        }
        System.out.println(distanciaCabo);
        this.grafo = new GraphGUI(width, height);
        return visitChildren(ctx);
    }

    @Override
    public Object visitModem(ExprParser.ModemContext ctx) {
        String nome = ctx.nome.getText();
        int x = Integer.parseInt(ctx.x.getText());
        int y = Integer.parseInt(ctx.y.getText());

        conexoesList.add(new Conexao(nome, x, y, "modem"));

        grafo.addVertex(nome, x, y);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSwitch(ExprParser.SwitchContext ctx) {
        String nome = ctx.nome.getText();
        int xSwitch = Integer.parseInt(ctx.x.getText());
        int ySwitch = Integer.parseInt(ctx.y.getText());
        String conectado = ctx.conectado.getText();
        String distancia = distanciaCabo;

        for (Conexao modem : conexoesList) {
            if (modem.getNome().equals(conectado)) {
                Conexao modemConectado = modem;
                distancia = calcularDistancia(xSwitch, modemConectado.getXConexao(), ySwitch,
                        modemConectado.getYConexao()).toString();
                break;
            }
        }

        grafo.addVertex(nome, xSwitch, ySwitch);
        grafo.addEdge("Cabo - "+ distancia, nome, conectado);
        conexoesList.add(new Conexao(nome, xSwitch, ySwitch, "switch"));

        return visitChildren(ctx);
    }

    @Override
    public Object visitRepetidor(ExprParser.RepetidorContext ctx) {
        String nome = ctx.nome.getText();
        int xRep = Integer.parseInt(ctx.x.getText());
        int yRep = Integer.parseInt(ctx.y.getText());
        String conectado = ctx.conectado.getText();
        String distancia = distanciaCabo;

        for (Conexao modem : conexoesList) {
            if (modem.getNome().equals(conectado)) {
                Conexao modemConectado = modem;
                distancia = calcularDistancia(xRep, modemConectado.getXConexao(), yRep, modemConectado.getYConexao())
                        .toString();
                break;
            }
        }

        grafo.addVertex(nome, xRep, yRep);
        conexoesList.add(new Conexao(nome, xRep, yRep, "repetidor"));
        grafo.addEdge("Wi-fi - "+ distancia, nome, conectado);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDispositivo(ExprParser.DispositivoContext ctx) {
        String nome = ctx.nome.getText();
        int xDisp = Integer.parseInt(ctx.x.getText());
        int yDisp = Integer.parseInt(ctx.y.getText());
        Long distanciaConexao = Long.MAX_VALUE;
        String conexaoNome = "";
        String nomeAresta = "";

        for (Conexao conexao : conexoesList) {
            Long distanciaCalculada = calcularDistancia(xDisp, conexao.getXConexao(), yDisp, conexao.getYConexao());
            if (distanciaCalculada < distanciaConexao) {
                switch (conexao.getTipo()) {
                    case "modem":
                        distanciaConexao = distanciaCalculada;
                        conexaoNome = conexao.getNome();
                        if (distanciaCalculada <= Long.parseLong(distanciaCabo)) {
                            nomeAresta = "Cabo ou Wi-fi - "+ distanciaConexao.toString();
                        } else {
                            nomeAresta = "Wi-fi - "+ distanciaConexao.toString();
                        }
                        break;
                    case "repetidor":
                        distanciaConexao = distanciaCalculada;
                        conexaoNome = conexao.getNome();
                        nomeAresta = "Wi-fi - "+ distanciaConexao.toString();
                        break;
                        case "switch":
                        if (distanciaCalculada <= Long.parseLong(distanciaCabo)) {
                            distanciaConexao = distanciaCalculada;
                            conexaoNome = conexao.getNome();
                            nomeAresta = "Cabo - "+ distanciaConexao.toString();
                        }
                        break;
                    default:
                        break;
                }

            }
        }

        grafo.addVertex(nome, xDisp, yDisp);
        grafo.addEdge(nomeAresta, nome, conexaoNome);
        return visitChildren(ctx);
    }

    public Long calcularDistancia(int x1, int x2, int y1, int y2) {
        int deltaX = x1 - x2;
        int deltaY = y1 - y2;
        double distancia = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        return Math.round(distancia);
    }
}
