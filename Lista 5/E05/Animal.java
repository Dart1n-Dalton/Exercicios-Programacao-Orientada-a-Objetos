/*
 * Dalton Augusto Pontes de Santis Filho 
 */
public class Animal {
    protected String nome;
    protected String especie;
    protected Habitat habitat;

    public Animal(String nome, String especie, Habitat habitat) {
        this.nome = nome;
        this.especie = especie;
        this.habitat = habitat;
    }

    public String getTipo() {
        return "Indefinido";
    }

    public double getArea() {
        return habitat.getArea();
    }

    public String getHabitatTipo() {
        return habitat.getTipo();
    }

    public String toString() {
        return nome + " (" + especie + ") - Tipo: " + getTipo() + " - Habitat: " + habitat;
    }
}
