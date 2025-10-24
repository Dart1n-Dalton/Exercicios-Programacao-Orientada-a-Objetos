/*
 *Dalton Augusto Pontes de Santis Filho 
 */


public class Data {
	
	private int dia, mes, ano;
	
	public Data(int dia, int mes, int ano){
		
		setDia(dia);
		setMes(mes);
		setAno(ano);
		
		
	}
	
	public void setDia(int dia){
		
		this.dia = dia;
		
	}
	
	public void setMes(int mes){
		
		this.mes = mes;
		
	}
	
	public void setAno(int ano){
		
		this.ano = ano;
		
	}
	 
	 
	 
	public int getDia(){
		
		return this.dia;
		
	} 
	
	public int getMes(){
		
		return this.mes;
		
	} 
	
	public int getAno(){
		
		return this.ano;
		
	} 
	
	public boolean isValida(){
		
		if(this.dia < 1 || this.dia > 31 ||
			this.mes < 1 || this.mes > 12 ||
			this.ano < 1){
				
				
			
			return false;
			
		}else{
			
			return true;
		}
		
		
	}
	
	public String mostrarData(){
		
		return  getDia() + "/" + getMes() + "/" + getAno();
	
	
	}
	
	
}

