/*
 * Dalton Augusto Pontes de Santis Filho 
 */
public class Habitat {
    private String tipo;
    private double comprimento;
    private double largura;
    private String localizacao;

    public Habitat(String tipo, double comprimento, double largura, String localizacao) {
        this.tipo = tipo;
        this.comprimento = comprimento;
        this.largura = largura;
        this.localizacao = localizacao;
    }

    public double getArea() {
        return comprimento * largura;
    }

    public String getTipo() {
        return tipo;
    }

    public String toString() {
        return tipo + " em " + localizacao + " (" + getArea() + " m²)";
    }
}
