/*
 * Dalton Augusto Pontes de Santis Filho
 */
public class Jogo extends Midia {
    private String console;

    public Jogo(int codigo, String titulo, String tipo, String genero, double valor, String console) {
        super(codigo, titulo, tipo, genero, valor);
        this.console = console;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Console: " + console);
    }
}
