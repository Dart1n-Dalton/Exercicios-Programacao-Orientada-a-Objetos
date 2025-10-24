/*
 * Dalton Augusto Pontes de Santis Filho 
 */
public class Candidato {
    protected String nome;
    protected int idade;

    public Candidato(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getSituacao() {
        return "Situação indefinida";
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String toString() {
        return nome + " (" + idade + " anos) - " + getSituacao();
    }
}
