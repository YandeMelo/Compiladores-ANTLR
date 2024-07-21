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
        this.grafo = new GraphGUI(800, 800);
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

    // CONEXAO
    @Override
    public Object visitConexao(ExprParser.ConexaoContext ctx) {
        
        if (ctx.distanciaCabo == null) {
            distanciaCabo = "100";
        } else {
            distanciaCabo = ctx.distanciaCabo.getText();
        }

        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int alturaTela = (int) tela.getHeight();
        int larguraTela = (int) tela.getWidth();

     

        this.grafo = new GraphGUI(alturaTela, larguraTela);
        return visitChildren(ctx);
    }

    @Override
    public Object visitModem(ExprParser.ModemContext ctx) {
        String nome = ctx.nome.getText();
        Double x = Integer.parseInt(ctx.x.getText()) / escalaX;
        Double y = Integer.parseInt(ctx.y.getText()) / escalaY;

        conexoesList.add(new Conexao(nome, x.intValue(), y.intValue(), "modem"));

        grafo.addVertex(nome, x.intValue(), y.intValue(), "conexao");
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

        grafo.addVertex(nome, xSwitch, ySwitch, "conexao");
        grafo.addEdge("Cabo - " + distancia, nome, conectado);
        conexoesList.add(new Conexao(nome, xSwitch, ySwitch, "switch"));

        return visitChildren(ctx);
    }

    @Override
    public Object visitRepetidor(ExprParser.RepetidorContext ctx) {
        String nome = ctx.nome.getText();
        int xRep = Integer.parseInt(ctx.x.getText()) ;
        int yRep = Integer.parseInt(ctx.y.getText()) ;
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

        grafo.addVertex(nome, xRep, yRep, "conexao");
        conexoesList.add(new Conexao(nome, xRep, yRep, "repetidor"));
        grafo.addEdge("Wi-fi - " + distancia, nome, conectado);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDispositivo(ExprParser.DispositivoContext ctx) {
        String nome = ctx.nome.getText();
        int xDisp = Integer.parseInt(ctx.x.getText()) ;
        int yDisp = Integer.parseInt(ctx.y.getText()) ;
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

        grafo.addVertex(nome, xDisp, yDisp, "");
        System.out.println(xDisp);
        System.out.println(yDisp);
        grafo.addEdge(nomeAresta, nome, conexaoNome);
        return visitChildren(ctx);
    }
    ////

    // REDE
    @Override
    public Object visitRede(ExprParser.RedeContext ctx) {
        
        
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int alturaTela = (int) tela.getHeight();
        int larguraTela = (int) tela.getWidth();

        
        this.grafo = new GraphGUI(alturaTela, larguraTela);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCasa(ExprParser.CasaContext ctx) {
        String numero = ctx.numeroCasa.getText();

        int xCasa = Integer.parseInt(ctx.x.getText());
        int yCasa = Integer.parseInt(ctx.y.getText());
    

        casasList.add(new Casa(numero, xCasa, yCasa));
       
        grafo.addVertex(numero, xCasa, yCasa, "");
    
        return visitChildren(ctx);
    }
    
    @Override
    public Object visitTorre(ExprParser.TorreContext ctx) {
        String nomeTorre = ctx.nomeTorre.getText();
        int xTorre = Integer.parseInt(ctx.x.getText()) ;
        int yTorre = Integer.parseInt(ctx.y.getText()) ;
        Long distanciaDaCasa;
        String numeroCasa = "";
        alcanceTorre = Integer.parseInt(ctx.alcance.getText());

        grafo.addVertex(nomeTorre, xTorre, yTorre, "torre");
        for(Casa casa : casasList){
            distanciaDaCasa = calcularDistancia(xTorre, casa.getXCasa(), yTorre, casa.getYCasa());
            numeroCasa = casa.getNumero();

            if (distanciaDaCasa <= alcanceTorre*0.9) {
                grafo.addEdge(distanciaDaCasa.toString(), nomeTorre , numeroCasa);
            }
        }
      
        return visitChildren(ctx);
    }

    public Long calcularDistancia(int x1, int x2, int y1, int y2) {
        double deltaX = (x1 - x2) ;
        double deltaY = (y1 - y2) ; 
        double distancia = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        return Math.round(distancia);
    }
}
