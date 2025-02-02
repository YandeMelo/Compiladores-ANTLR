import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;

public class CustomVisitor extends ExprBaseVisitor<Object> {

    private GraphGUI grafo;

    private String distanciaCabo;
    private Double escalaX = 1.0;
    private Double escalaY = 1.0;
    private List<Conexao> conexoesList = new ArrayList<Conexao>();

    private int alcanceTorre;
    private List<Casa> casasList = new ArrayList<Casa>();

    public CustomVisitor() {

    }

    // GRAFOS
    @Override
    public Object visitGrafo(ExprParser.GrafoContext ctx) {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int alturaTela = (int) tela.getHeight();
        int larguraTela = (int) tela.getWidth();
        this.grafo = new GraphGUI(alturaTela, larguraTela);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVertice(ExprParser.VerticeContext ctx) {
        String nome = ctx.nome.getText();
        int x = Integer.parseInt(ctx.x.getText());
        int y = Integer.parseInt(ctx.y.getText());
        grafo.addVertex(nome, x, y, "");
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
    ////
    
    // CONEXAO
    @Override
    public Object visitConexao(ExprParser.ConexaoContext ctx) {
        Double width = Double.parseDouble(ctx.areaX.getText());
        Double height = Double.parseDouble(ctx.areaY.getText());
        if (ctx.distanciaCabo == null) {
            distanciaCabo = "100";
        } else {
            distanciaCabo = ctx.distanciaCabo.getText();
        }

        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int alturaTela = (int) tela.getHeight();
        int larguraTela = (int) tela.getWidth();

        if (height > alturaTela && height >= 1000) {
            escalaY = height / alturaTela;
        } else {
            escalaY = alturaTela / height;
        }
        if (width > larguraTela && height >= 1000) {
            escalaX = width / larguraTela;
        } else {
            escalaX = larguraTela / width;
        }

        this.grafo = new GraphGUI(alturaTela, larguraTela);
        return visitChildren(ctx);
    }

    @Override
    public Object visitModem(ExprParser.ModemContext ctx) {
        String nome = ctx.nome.getText();
        Double x = Integer.parseInt(ctx.x.getText()) * escalaX;
        Double y = Integer.parseInt(ctx.y.getText()) * escalaY;

        //Para os valores das distancias
        Double xAtual = x/escalaX;
        Double yAtual = y/escalaX;
        conexoesList.add(new Conexao(nome, xAtual.intValue(), yAtual.intValue(), "modem"));

        grafo.addVertex(nome, x.intValue(), y.intValue(), "conexao");
        return visitChildren(ctx);
    }

    @Override
    public Object visitSwitch(ExprParser.SwitchContext ctx) {
        String nome = ctx.nome.getText();
        Double xSwitch = Integer.parseInt(ctx.x.getText()) * escalaX;
        Double ySwitch = Integer.parseInt(ctx.y.getText()) * escalaY;
        String conectado = ctx.conectado.getText();
        String distancia = distanciaCabo;

        //Para os valores das distancias
        Double xAtual = xSwitch/escalaX;
        Double yAtual = ySwitch/escalaY;

        for (Conexao modem : conexoesList) {
            if (modem.getNome().equals(conectado)) {
                Conexao modemConectado = modem;
                distancia = calcularDistancia(xAtual.intValue(), modemConectado.getXConexao(), yAtual.intValue(),
                        modemConectado.getYConexao()).toString();
                break;
            }
        }

        grafo.addVertex(nome, xSwitch.intValue(), ySwitch.intValue(), "conexao");
        grafo.addEdge("Cabo - " + distancia, nome, conectado);
        conexoesList.add(new Conexao(nome, xAtual.intValue(), yAtual.intValue(), "switch"));

        return visitChildren(ctx);
    }

    @Override
    public Object visitRepetidor(ExprParser.RepetidorContext ctx) {
        String nome = ctx.nome.getText();
        Double xRep = Integer.parseInt(ctx.x.getText()) * escalaX;
        Double yRep = Integer.parseInt(ctx.y.getText()) * escalaY;

        //Para os valores das distancias
        Double xAtual = xRep/escalaX;
        Double yAtual = yRep/escalaY;

        String conectado = ctx.conectado.getText();
        String distancia = distanciaCabo;

        for (Conexao modem : conexoesList) {
            if (modem.getNome().equals(conectado)) {
                Conexao modemConectado = modem;
                distancia = calcularDistancia(xAtual.intValue(), modemConectado.getXConexao(), yAtual.intValue(), modemConectado.getYConexao())
                        .toString();
                break;
            }
        }

        grafo.addVertex(nome, xRep.intValue(), yRep.intValue(), "conexao");
        conexoesList.add(new Conexao(nome, xAtual.intValue(), yAtual.intValue(), "repetidor"));
        grafo.addEdge("Wi-fi - " + distancia, nome, conectado);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDispositivo(ExprParser.DispositivoContext ctx) {
        String nome = ctx.nome.getText();
        Double xDisp = Integer.parseInt(ctx.x.getText()) * escalaX;
        Double yDisp = Integer.parseInt(ctx.y.getText()) * escalaY;

        //Para os valores das distancias
        Double xAtual = xDisp/escalaX;
        Double yAtual = yDisp/escalaY;

        Long distanciaConexao = Long.MAX_VALUE;
        String conexaoNome = "";
        String nomeAresta = "";

        for (Conexao conexao : conexoesList) {
            Long distanciaCalculada = calcularDistancia(xAtual.intValue(), conexao.getXConexao(), yAtual.intValue(), conexao.getYConexao());
            if (distanciaCalculada < distanciaConexao) {
                switch (conexao.getTipo()) {
                    case "modem":
                        distanciaConexao = distanciaCalculada;
                        conexaoNome = conexao.getNome();
                        if (distanciaCalculada <= Long.parseLong(distanciaCabo)) {
                            nomeAresta = "Cabo ou Wi-fi - " + distanciaConexao.toString();
                        } else {
                            nomeAresta = "Wi-fi - " + distanciaConexao.toString();
                        }
                        break;
                    case "repetidor":
                        distanciaConexao = distanciaCalculada;
                        conexaoNome = conexao.getNome();
                        nomeAresta = "Wi-fi - " + distanciaConexao.toString();
                        break;
                    case "switch":
                        if (distanciaCalculada <= Long.parseLong(distanciaCabo)) {
                            distanciaConexao = distanciaCalculada;
                            conexaoNome = conexao.getNome();
                            nomeAresta = "Cabo - " + distanciaConexao.toString();
                        }
                        break;
                    default:
                        break;
                }

            }
        }

        grafo.addVertex(nome, xDisp.intValue(), yDisp.intValue(), "");
        grafo.addEdge(nomeAresta, nome, conexaoNome);
        return visitChildren(ctx);
    }
    ////

    // REDE
    @Override
    public Object visitRede(ExprParser.RedeContext ctx) {
        Double width = Double.parseDouble(ctx.areaX.getText());
        Double height = Double.parseDouble(ctx.areaY.getText());
        
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int alturaTela = (int) tela.getHeight();
        int larguraTela = (int) tela.getWidth();

        if (height > alturaTela && height >= 2000) {
            escalaY = (height / alturaTela)/3;
        } else {
            escalaY = (alturaTela / height)-0.2;
        }
        if (width > larguraTela && height >= 2000) {
            escalaX = (width / larguraTela)/2;
        } else {
            escalaX = (larguraTela / width)-0.2;
        }

        this.grafo = new GraphGUI(alturaTela, larguraTela);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCasa(ExprParser.CasaContext ctx) {
        String numero = ctx.numeroCasa.getText();

        Double xCasa = Integer.parseInt(ctx.x.getText()) * escalaX;
        Double yCasa = Integer.parseInt(ctx.y.getText()) * escalaY;

        //Para os valores das distancias
        Double xAtual = xCasa/escalaX;
        Double yAtual = yCasa/escalaY;

        casasList.add(new Casa(numero, xAtual.intValue(), yAtual.intValue()));

        grafo.addVertex(numero, xCasa.intValue(), yCasa.intValue(), "");
        return visitChildren(ctx);
    }
    
    @Override
    public Object visitTorre(ExprParser.TorreContext ctx) {
        String nomeTorre = ctx.nomeTorre.getText();
        Double xTorre = Integer.parseInt(ctx.x.getText()) * escalaX;
        Double yTorre = Integer.parseInt(ctx.y.getText()) * escalaY;
        Long distanciaDaCasa;
        String numeroCasa = "";
        alcanceTorre = Integer.parseInt(ctx.alcance.getText());

        //Para os valores das distancias
        Double xAtual = xTorre/escalaX;
        Double yAtual = yTorre/escalaY;

        grafo.addVertex(nomeTorre, xTorre.intValue(), yTorre.intValue(), "torre");
        for(Casa casa : casasList){
            distanciaDaCasa = calcularDistancia(xAtual.intValue(), casa.getXCasa(), yAtual.intValue(), casa.getYCasa());
            numeroCasa = casa.getNumero();

            if (distanciaDaCasa <= alcanceTorre*0.9) {
                grafo.addEdge(distanciaDaCasa.toString(), nomeTorre , numeroCasa);
            }
        }

        return visitChildren(ctx);
    }

    public Long calcularDistancia(int x1, int x2, int y1, int y2) {
        double deltaX = (x1 - x2);
        double deltaY = (y1 - y2);
        double distancia = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        return Math.round(distancia);
    }
}
