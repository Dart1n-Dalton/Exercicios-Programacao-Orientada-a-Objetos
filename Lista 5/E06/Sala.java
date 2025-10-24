/*
 * Dalton Augusto Pontes de Santis Filho 
 */
public class Sala {
    private String nome;
    private Aluno[] alunos = new Aluno[30];
    private Professor professor;
    private int qtdAlunos = 0;

    public Sala(String nome) {
        this.nome = nome;
    }

    public void setProfessor(Professor p) {
        this.professor = p;
    }

    public void adicionarAluno(Aluno a) {
        if (qtdAlunos < alunos.length) {
            alunos[qtdAlunos++] = a;
        }
    }

    public double calcularReceitaMensal() {
        double total = 0;
        for (int i = 0; i < qtdAlunos; i++) {
            total += alunos[i].getMensalidade();
        }
        return total;
    }

    public double calcularDespesas() {
        return professor != null ? professor.getSalario() : 0;
    }

    public double calcularLucro() {
        return calcularReceitaMensal() - calcularDespesas();
    }

    public String toString() {
        String info = "Sala " + nome + "\nProfessor: " + (professor != null ? professor.toString() : "Nenhum") + "\nAlunos:\n";
        for (int i = 0; i < qtdAlunos; i++) {
            info += " - " + alunos[i].toString() + "\n";
        }
        info += "Total alunos: " + qtdAlunos + "\n";
        info += "Receita: R$" + calcularReceitaMensal() + " | Despesas: R$" + calcularDespesas() + " | Lucro: R$" + calcularLucro() + "\n";
        return info;
    }
}
