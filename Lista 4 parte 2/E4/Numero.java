/*
 * Dalton Augusto Pontes de Santis Filho
 */


public class Numero {
	
	private int numero;
	
	public Numero(){
		
		
	}
	
	public void setNumero(int numero){
	
		this.numero = numero;
		
	}
	
	public int getNumero(){
		
		return this.numero;
		
	}
	
	public int inverte(){
		
		
		String swap = "", num = Integer.toString(this.numero);
		
		
		for(int i = (num.length() - 1); i >= 0; i--){
			
			swap+= num.charAt(i);
			
		}
		
		return Integer.parseInt(swap);
		
	}
	
}

