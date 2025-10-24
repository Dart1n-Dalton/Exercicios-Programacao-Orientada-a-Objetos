/*
 * Dalton Augusto Pontes de Santis Filho 
 */
public class Aquatico extends Animal {
    private boolean respiraForaAgua;

    public Aquatico(String nome, String especie, Habitat habitat, boolean respiraForaAgua) {
        super(nome, especie, habitat);
        this.respiraForaAgua = respiraForaAgua;
    }

    @Override
    public String getTipo() {
        return "Aquático";
    }
}
