/*
 * Dalton Augusto Pontes de Santis Filho 
 */
public class Zoologico {
    private Animal[] animais = new Animal[200];
    private int qtd = 0;

    public void adicionarAnimal(Animal a) {
        if (qtd < animais.length) {
            animais[qtd++] = a;
        }
    }

    public void listarAnimais() {
        for (int i = 0; i < qtd; i++) {
            System.out.println(animais[i]);
        }
    }

    public int getTotalAnimais() {
        return qtd;
    }

    public int contarTipo(String tipo) {
        int count = 0;
        for (int i = 0; i < qtd; i++) {
            if (animais[i].getTipo().equalsIgnoreCase(tipo)) {
                count++;
            }
        }
        return count;
    }

    public int contarHabitat(String tipoHabitat) {
        int count = 0;
        for (int i = 0; i < qtd; i++) {
            if (animais[i].getHabitatTipo().equalsIgnoreCase(tipoHabitat)) {
                count++;
            }
        }
        return count;
    }

    public double calcularAreaTotal() {
        double total = 0;
        for (int i = 0; i < qtd; i++) {
            total += animais[i].getArea();
        }
        return total;
    }
}
