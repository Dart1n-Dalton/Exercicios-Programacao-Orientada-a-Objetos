/*
 * Dalton Augusto Pontes de Santis Filho
 */
public class Cliente {
    private int codigo;
    private String nome;
    private int idade;

    public Cliente(int codigo, String nome, int idade) {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
