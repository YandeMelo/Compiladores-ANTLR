
public class Casa {

    private String numero;
    private int xCasa;
    private int yCasa;

    public Casa() {
    }

    public Casa(String numero, int xCasa, int yCasa) {
        this.numero = numero;
        this.xCasa = xCasa;
        this.yCasa = yCasa;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getXCasa() {
        return this.xCasa;
    }

    public void setXCasa(int xCasa) {
        this.xCasa = xCasa;
    }

    public int getYCasa() {
        return this.yCasa;
    }

    public void setYCasa(int yCasa) {
        this.yCasa = yCasa;
    }
    
}
