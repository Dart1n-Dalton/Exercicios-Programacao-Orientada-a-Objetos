/*
 * Dalton Augusto Pontes de Santis Filho 
 */
public class Professor extends Pessoa {
    private double salario;
    private String[] disciplina = new String[5];

    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public void setDisciplina(String disciplina) {
        for (int i = 0; i < this.disciplina.length; i++) {
            if (this.disciplina[i] == null) {
                this.disciplina[i] = disciplina;
                return;
            }
        }
    }

    public double getSalario() {
        return salario;
    }

    public String toString() {
        String d = "";
        for (String s : disciplina) {
            if (s != null) d += s + ", ";
        }
        return super.toString() + " - Professor - Salário: R$" + salario + " - Disciplinas: " + d;
    }
}
