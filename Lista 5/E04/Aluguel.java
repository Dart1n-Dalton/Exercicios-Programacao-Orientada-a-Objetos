/*
 * Dalton Augusto Pontes de Santis Filho
 */
public class Aluguel {
    private Cliente cliente;
    private Midia midia;
    private boolean pago;

    public Aluguel(Cliente cliente, Midia midia) {
        this.cliente = cliente;
        this.midia = midia;
        this.pago = false;
    }

    public void pagar() {
        this.pago = true;
    }

    public boolean isPago() {
        return pago;
    }

    public Midia getMidia() {
        return midia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValor() {
        return midia.getValor();
    }
}
