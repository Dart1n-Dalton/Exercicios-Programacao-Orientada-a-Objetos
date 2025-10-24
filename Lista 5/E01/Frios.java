/*
 *Dalton Augusto Pontes de Santis Filho 
 */



public class Frios extends Produto {
	
	private String tipoFrio;
	
	public Frios(String tipo, double preco, int quantidade){
		
		super(preco, quantidade);
		
		this.tipoFrio = tipo;
			
	}
	
	public void setTipoFrio(String tipo){
		
		this.tipoFrio = tipo;
		
	}
	
	public String getTipoFrio(){
		
		return this.tipoFrio;
	
	}
	
	@Override
	public String toString(){
	
		return "Frio do tipo: " + getTipoFrio() + "| qtd: " + getQuantidade() + "| preco: " + getPreco();
		
	}
	
}

