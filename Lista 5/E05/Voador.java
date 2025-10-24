/*
 * Dalton Augusto Pontes de Santis Filho 
 */
public class Voador extends Animal {
    private String corPena;

    public Voador(String nome, String especie, Habitat habitat, String corPena) {
        super(nome, especie, habitat);
        this.corPena = corPena;
    }

    @Override
    public String getTipo() {
        return "Voador";
    }
}
