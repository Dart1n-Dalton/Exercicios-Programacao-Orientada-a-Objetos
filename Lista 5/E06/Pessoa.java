/*
 * Dalton Augusto Pontes de Santis Filho 
 */
public class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String toString() {
        return nome + " (" + idade + " anos)";
    }
}
