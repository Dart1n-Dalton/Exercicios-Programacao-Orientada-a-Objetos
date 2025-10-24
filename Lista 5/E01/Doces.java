/*
 *Dalton Augusto Pontes de Santis Filho 
 */



public class Doces extends Produto {
	
	private String tipoDoce;
	
	public Doces(String tipo, double preco, int quantidade){
		
		super(preco, quantidade);
		
		this.tipoDoce = tipo;
			
	}
		
	public void setTipoDoce(String tipo){
		
		this.tipoDoce = tipo;
		
	}
	
	public String getTipoDoce(){
		
		return this.tipoDoce;
	
	}
	
	@Override
	public String toString(){
	
		return "Doce do tipo: " + getTipoDoce() + "| qtd: " + getQuantidade() + "| preco: " + getPreco();
		
	}
	
}

