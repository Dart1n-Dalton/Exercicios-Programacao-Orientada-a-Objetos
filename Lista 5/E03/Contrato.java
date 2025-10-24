/*
 * Dalton Augusto Pontes de Santis Filho 
 */
public class Contrato extends Vaga {
    private boolean temporario;

    public Contrato(String descricao, double salario, boolean temporario) {
        super(descricao, salario);
        this.temporario = temporario;
    }

    @Override
    public String getTipo() {
        return temporario ? "Contrato Temporário" : "Contrato Permanente";
    }
}
