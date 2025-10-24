/*
 * Dalton Augusto Pontes de Santis Filho 
 */
public class Empregado extends Candidato {
    private String empresaAtual;

    public Empregado(String nome, int idade, String empresaAtual) {
        super(nome, idade);
        this.empresaAtual = empresaAtual;
    }

    @Override
    public String getSituacao() {
        return "Empregado na empresa " + empresaAtual;
    }
}
