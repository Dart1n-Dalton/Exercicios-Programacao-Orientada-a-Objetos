/*
 *Dalton Augusto Pontes de Santis Filho 
 * 
 */


public class Conta {
	
	private double valorBase, valorGarcom, valorFinal, valorFinalDividido;
	private int qtdPessoas;
	private boolean garcom;
	
	public Conta(double valor, int pessoas, boolean garcom){
		
		setValorBase(valor);
		setQtdPessoas(pessoas);
		setGarcom(garcom);
		setValorGarcom();
		setValorFinal();
		setValorFinalDividido();
		
	}
	
	public void setValorBase(double valor){
		
		this.valorBase = valor;
		
	}
	
	public void setQtdPessoas(int qtd){
		
		this.qtdPessoas = qtd;
		
	}
	
	public void setGarcom(boolean garcom){
		
		this.garcom = garcom;
		
	}
	
	public void setValorGarcom(){
		
		if(this.garcom){
			
			this.valorGarcom = this.valorBase * 0.01;
		}else{
			
			this.valorGarcom = 0;
		}
		
	}
	
	public void setValorFinal(){
		
		this.valorFinal = this.valorBase + this.valorGarcom;
		
	}
	
	public void setValorFinalDividido(){
		
		this.valorFinalDividido = this.valorFinal / this.qtdPessoas;
		
	}
	
	
	
	
	public double getValorBase(){
		
		return this.valorBase;
		
	}
	
	public int getQtdPessoas(){
		
		return this.qtdPessoas;
		
	}
	
	public boolean isGarcom(){
		
		return this.garcom;
		
	}
	
	public double getValorGarcom(){
		
		return this.valorGarcom;
		
	}
	
	public double getValorFinal(){
		
		return this.valorFinal;
		
	}
	
	public double getValorFinalDividido(){
		
		return this.valorFinalDividido;
		
	} 
	
	@Override
	public String toString(){
		
		return "\n\t Valor da conta: RS " + String.format("%.2f", getValorBase()) +
				"\n\t 10% do garcom?: " +  (isGarcom()?"sim":"nao") +
				"\n\t Valor + 10% do gracom: RS " + String.format("%.2f", getValorFinal()) +
				"\n\t Valor dividido entre " +  getQtdPessoas() + " pessoas: RS " + String.format("%.2f", getValorFinalDividido());
	}
}

