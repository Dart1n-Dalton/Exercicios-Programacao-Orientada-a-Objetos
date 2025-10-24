/*
 * Dalton Augusto Pontes de Santis Filho
 */
public class Locadora {
    private static Aluguel[] alugueis = new Aluguel[100];
    private static int contador = 0;
    private static double totalRecebido = 0.0;

    public static void alugarMidia(Cliente cliente, Midia midia, boolean pagarNaHora) {
        Aluguel aluguel = new Aluguel(cliente, midia);
        if (pagarNaHora) {
            aluguel.pagar();
            totalRecebido += aluguel.getValor();
        }
        alugueis[contador++] = aluguel;
        System.out.println("Mídia alugada por " + cliente.getNome());
    }

    public static void devolverMidia(Midia midia, boolean pagarAgora) {
        for (int i = 0; i < contador; i++) {
            if (alugueis[i] != null && alugueis[i].getMidia() == midia) {
                if (!alugueis[i].isPago() && pagarAgora) {
                    alugueis[i].pagar();
                    totalRecebido += alugueis[i].getValor();
                    System.out.println("Pagamento realizado na devolução.");
                }
                System.out.println("Mídia devolvida: " + midia.getTitulo());
                alugueis[i] = null;
                break;
            }
        }
    }

    public static void mostrarTotalRecebido() {
        System.out.println("Total recebido: R$" + totalRecebido);
    }

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "João", 30);
        Filme filme1 = new Filme(101, "Matrix", "DVD", "Ficção", 5.0, "16 anos", 136);
        Livro livro1 = new Livro(102, "Dom Casmurro", "Brochura", "Romance", 3.5, "Machado de Assis", "Ática", 2);
        Jogo jogo1 = new Jogo(103, "FIFA 21", "Digital", "Esporte", 7.0, "PS4");

        alugarMidia(cliente1, filme1, true);
        alugarMidia(cliente1, livro1, false);
        alugarMidia(cliente1, jogo1, false);

        devolverMidia(livro1, true);
        devolverMidia(jogo1, true);

        mostrarTotalRecebido();
    }
}
