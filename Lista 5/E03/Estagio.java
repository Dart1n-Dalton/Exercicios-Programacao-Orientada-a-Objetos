/*
 * Dalton Augusto Pontes de Santis Filho 
 */
public class Estagio extends Vaga {
    private int duracaoMeses;

    public Estagio(String descricao, double salario, int duracaoMeses) {
        super(descricao, salario);
        this.duracaoMeses = duracaoMeses;
    }

    @Override
    public String getTipo() {
        return "Estágio (" + duracaoMeses + " meses)";
    }
}
