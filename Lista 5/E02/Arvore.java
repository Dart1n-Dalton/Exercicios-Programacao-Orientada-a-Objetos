/*
 *Dalton Augusto Pontes de Santis Filho 
 */


public class Arvore extends Planta {

	private boolean frutifera;
	
	public Arvore(){}
	
	public Arvore(String nome, String especie, boolean fruit){
	
		super(nome, especie);
		this.frutifera = fruit;
		
		
	}
	


	public void setFrutifera(boolean fruit){
		
		this.frutifera = fruit;
		
	}
	
	public boolean isFruitifera(){
		
		return this.frutifera;
		
	}

	@Override
	public String toString(){
		
		return "Nome: " + getNome() + "| Arvore da Especie: " + getEspecie() + "| " + (this.frutifera ? "Eh " : "Nao eh ") + "frutifera";
		
		
	}
	
}

