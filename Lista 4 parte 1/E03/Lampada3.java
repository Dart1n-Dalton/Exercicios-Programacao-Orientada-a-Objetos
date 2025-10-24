/*
 *Dalton Augusto Pontes de Santis Filho 
 * 
 */


public class Lampada3 {
	
	private String marca, tipo;
	private int acesa;
	
	public Lampada3(){
		
		this.marca = "our-lux";
		this.tipo = "led";
		this.acesa = 0;
		
	}
	
	//setters 
	
	public void setMarca(String marca){
		
		this.marca = marca;
		
	}
	
	public void setTipo(String tipo){
		
		this.tipo = tipo;
		
	}
	
	public void setAcesa(int estado){
		
		if(estado == 0 || estado == 1 || estado == 2){
		
			if(estado != this.acesa){
			
				this.acesa = estado;
				
			}else{
				
				System.out.println("Erro, a lampada ja esta acesa, ja esta apagada, ou ja esta meia luz");
				
			}
		}else{
			
			System.out.println("Erro, o estado inserido nao eh valido");
		}
	
	}
	
	
	//getters
	
	public String getMarca(){
		
		return this.marca;
	
	}
	
	public String getTipo(){
		
		return this.tipo;
	
	}
	
	public int isAcesa(){
		
		return this.acesa;
		
	}
	
	//metodos
	
	public void interruptor(){
		int estado = isAcesa();
		
		if(estado == 2){
			
			setAcesa(0);
		}else{
			
			setAcesa(++estado);
		}
	
	
	}
	
	public String checaEstado(){
		int estado = isAcesa();
		String retorno;
		
		switch(estado){
			
			case 0:
				retorno = "Apagada";
			break;
			
			case 1:
				retorno = "Meia-luz";
			break;
			
			case 2:
				retorno = "Acesa";
			break;
			
			default:
				retorno = "estado invalido";
			break;
				
		}
		
		return retorno;
	}
	
	@Override
	public String toString(){
		
		return "\n\t Marca:" + getMarca() +
				"\n\t Tipo:" +  getTipo() +
				"\n\t A lampada esta " + checaEstado();
	}
}

