/*
 * Dalton Augusto Pontes de Santis Filho
 */
public class Filme extends Midia {
    private String classificacao;
    private int duracao;

    public Filme(int codigo, String titulo, String tipo, String genero, double valor, String classificacao, int duracao) {
        super(codigo, titulo, tipo, genero, valor);
        this.classificacao = classificacao;
        this.duracao = duracao;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Classificação: " + classificacao);
        System.out.println("Duração: " + duracao + " min");
    }
}
