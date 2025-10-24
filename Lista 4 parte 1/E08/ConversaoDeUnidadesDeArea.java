/*
 *Dalton Augusto Pontes de Santis Filho 
 */


public class ConversaoDeUnidadesDeArea {
	
	private double valor;
	
	
	public void setValor(int valor){
		
		this.valor = valor;
		
	}
	
	public double getValor(){
		
		return this.valor;
	
	}
	
	public double metroParaPes(){
		
		return valor * 10.76;
	
	}
	
	public double pesParaCentimetros(){
		
		return valor * 929;
	
	}
	
	public double milhasParaAcres(){
		
		return valor * 640;
	
	}
	
	public double acreParaPes(){
		
		return valor * 43.560;
	
	}
	
}

