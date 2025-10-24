/*
 * Dalton Augusto Pontes de Santis Filho
 */


public class Ano {
	
	private int ano;
	
	public Ano(){
		
		
	}
	
	public void setAno(int ano){
		
		this.ano = ano;
		
	}
	
	public int getAno(){
		
		return this.ano;
		
	}
	
	public boolean ehBissexto(){
		
		if(ano % 4 == 0 && ano % 100 != 0){
			
			return true;	
		
		}else{
			
			if(ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0){
				
				return true;
				
			}else{
					
				return false;	
					
			}
		
		}
		
	}
	
}

