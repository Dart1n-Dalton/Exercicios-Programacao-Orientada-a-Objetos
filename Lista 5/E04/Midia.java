/*
 * Dalton Augusto Pontes de Santis Filho
 */
public class Midia {
    private int codigo;
    private String titulo;
    private String tipo;
    private String genero;
    private double valor;

    public Midia(int codigo, String titulo, String tipo, String genero, double valor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.tipo = tipo;
        this.genero = genero;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getGenero() {
        return genero;
    }

    public double getValor() {
        return valor;
    }

    public void exibirDetalhes() {
        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Gênero: " + genero);
        System.out.println("Valor: R$" + valor);
    }
}
