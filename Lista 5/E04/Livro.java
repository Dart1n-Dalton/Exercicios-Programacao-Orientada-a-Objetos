/*
 * Dalton Augusto Pontes de Santis Filho
 */
public class Livro extends Midia {
    private String autor;
    private String editora;
    private int edicao;

    public Livro(int codigo, String titulo, String tipo, String genero, double valor, String autor, String editora, int edicao) {
        super(codigo, titulo, tipo, genero, valor);
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        System.out.println("Edição: " + edicao);
    }
}
