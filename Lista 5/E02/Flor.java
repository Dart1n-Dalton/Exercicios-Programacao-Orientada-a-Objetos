/*
 *Dalton Augusto Pontes de Santis Filho 
 */



public class Flor extends Planta {
	
	private String cor;
	
	public Flor(){}
	
	public Flor(String nome, String especie, String cor){
	
		super(nome, especie);
		this.cor = cor;
		
		
	}

	public void setCor(String cor){
		
		this.cor = cor;
		
	}
	
	public String getCor(){
		
		return this.cor;
		
	}

	@Override
	public String toString(){
		
		return "Nome: " + getNome() + "| Flor da Especie: " + getEspecie() + "| Cor: " + getCor();
		
	}
	
}

