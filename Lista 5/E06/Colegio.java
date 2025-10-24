/*
 * Dalton Augusto Pontes de Santis Filho 
 */
public class Colegio {
    private Sala[] salas = new Sala[10];
    private int qtdSalas = 0;

    public void adicionarSala(Sala s) {
        if (qtdSalas < salas.length) {
            salas[qtdSalas++] = s;
        }
    }

    public void listarSalas() {
        for (int i = 0; i < qtdSalas; i++) {
            System.out.println(salas[i]);
        }
    }

    public double lucroTotal() {
        double total = 0;
        for (int i = 0; i < qtdSalas; i++) {
            total += salas[i].calcularLucro();
        }
        return total;
    }
}
