/*
 *Dalton Augusto Pontes de Santis Filho 
 */


public class Carnivora extends Planta {
	
	private boolean venenosa;
	
	public Carnivora(){}
	
	public Carnivora(String nome, String especie, boolean veneno){
	
		super(nome, especie);
		this.venenosa = veneno;
		
		
	}

	public void setVenenosa(boolean veneno){
		
		this.venenosa = veneno;
		
	}
	
	public boolean isVenenosa(){
		
		return this.venenosa;
		
	}

	@Override
	public String toString(){
		
		return "Nome: " + getNome() + "| Carnivora da Especie: " + getEspecie() + "| " + (this.venenosa ? "Eh " : "Nao eh ") + "venenosa";
		
	}
	

}

