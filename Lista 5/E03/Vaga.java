/*
 * Dalton Augusto Pontes de Santis Filho 
 */
public class Vaga {
    protected String descricao;
    protected double salario;

    public Vaga(String descricao, double salario) {
        this.descricao = descricao;
        this.salario = salario;
    }

    public String getTipo() {
        return "Tipo indefinido";
    }

    public String getDescricao() {
        return descricao;
    }

    public String toString() {
        return "[" + getTipo() + "] " + descricao + " - R$" + salario;
    }
}
