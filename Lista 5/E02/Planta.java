/*
 *Dalton Augusto Pontes de Santis Filho 
 */



public class Planta {
	
	private String nome, especie;
	
	public Planta(String nome, String especie){
		
		this.nome = nome;
		this.especie = especie;
		
	}
	public Planta(){}
	
	public void setNome(String nome){
		
		this.nome = nome;
	
	} 
	
	
	public void setEspecie(String especie){
		
		this.especie = especie;	
		
	}
	
	public String getNome(){
		
		return this.nome;
		
	}
	
	public String getEspecie(){
		
		return this.especie;
		
	}
	
	
	
	
}

