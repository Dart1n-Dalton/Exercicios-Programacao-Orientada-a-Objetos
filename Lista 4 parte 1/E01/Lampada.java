/*
 *Dalton Augusto Pontes de Santis Filho 
 * 
 */


public class Lampada {
	
	private String marca, tipo;
	private boolean acesa;
	
	public Lampada(){
		
		this.marca = "our-lux";
		this.tipo = "led";
		this.acesa = true;
		
	}
	
	//setters 
	
	public void setMarca(String marca){
		
		this.marca = marca;
		
	}
	
	public void setTipo(String tipo){
		
		this.tipo = tipo;
		
	}
	
	public void setAcesa(boolean estado){
		
		if(estado == !this.acesa){
		
			this.acesa = estado;
			
		}else{
			
			System.out.println("Erro, a lampada ja esta acesa, ou ja esta apagada");
			
		}
	 
	
	}
	
	
	//getters
	
	public String getMarca(){
		
		return this.marca;
	
	}
	
	public String getTipo(){
		
		return this.tipo;
	
	}
	
	public boolean isAcesa(){
		
		return this.acesa;
		
	}
	
	//metodos
	
	public void interruptor(){
		
		setAcesa(!isAcesa());
	
	}
	
	@Override
	public String toString(){
		
		return "\n\t Marca:" + getMarca() +
				"\n\t Tipo:" +  getTipo() +
				"\n\t A lampada esta " + (isAcesa()? "Acesa" : "Apagada") ;
	}
}

