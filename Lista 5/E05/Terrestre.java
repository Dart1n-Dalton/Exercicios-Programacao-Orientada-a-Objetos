/*
 * Dalton Augusto Pontes de Santis Filho 
 */
public class Terrestre extends Animal {
    private int patas;

    public Terrestre(String nome, String especie, Habitat habitat, int patas) {
        super(nome, especie, habitat);
        this.patas = patas;
    }

    @Override
    public String getTipo() {
        return "Terrestre";
    }
}
