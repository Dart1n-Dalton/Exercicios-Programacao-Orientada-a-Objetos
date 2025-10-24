/*
 * Dalton Augusto Pontes de Santis Filho 
 */
public class Desempregado extends Candidato {
    private int mesesSemTrabalho;

    public Desempregado(String nome, int idade, int mesesSemTrabalho) {
        super(nome, idade);
        this.mesesSemTrabalho = mesesSemTrabalho;
    }

    @Override
    public String getSituacao() {
        return "Desempregado há " + mesesSemTrabalho + " meses";
    }
}
