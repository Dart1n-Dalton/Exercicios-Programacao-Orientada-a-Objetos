/*
 *Dalton Augusto Pontes de Santis Filho 
 */


public class Produto {
	
	private double preco;
	private int quantidade;
	
	public Produto(double preco, int quantidade){
		
		this.preco = preco;
		this.quantidade = quantidade;
	
	}
	
	
	//getter e setters
	
	public void setPreco(double preco){
	
		this.preco = preco;
		
	}
	
	public void setQuantidade(int qtd){
		
		this.quantidade = qtd;
	
	}
	
	public double getPreco(){
	
		return this.preco;
		
	}
	
	public int getQuantidade(){
		
		return this.quantidade;
	
	}
	
	
	
	
}

