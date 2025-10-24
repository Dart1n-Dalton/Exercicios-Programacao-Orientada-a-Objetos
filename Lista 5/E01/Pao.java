/*
 *Dalton Augusto Pontes de Santis Filho 
 */



public class Pao extends Produto {
	
	private String tipo;
	
	public Pao(String tipo, double preco, int quantidade){
		
		super(preco, quantidade);
		
		this.tipo = tipo;
			
	}
	
	public void setTipo(String tipo){
		
		this.tipo = tipo;
		
	}
	
	public String getTipo(){
		
		return this.tipo;
	
	}
	
	@Override
	public String toString(){
	
		return "Pao do tipo: " + getTipo() + "| qtd: " + getQuantidade() + "| preco: " + getPreco();
		
	}
	
}

