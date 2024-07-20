public class Conexao {

    private String nome;
    private int xConexao;
    private int yConexao;
    private String tipo;

    public Conexao() {
    }

    public Conexao(String nome, int xConexao, int yConexao, String tipo) {
        this.nome = nome;
        this.xConexao = xConexao;
        this.yConexao = yConexao;
        this.tipo = tipo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getXConexao() {
        return this.xConexao;
    }

    public void setXConexao(int xConexao) {
        this.xConexao = xConexao;
    }

    public int getYConexao() {
        return this.yConexao;
    }

    public void setYConexao(int yConexao) {
        this.yConexao = yConexao;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
