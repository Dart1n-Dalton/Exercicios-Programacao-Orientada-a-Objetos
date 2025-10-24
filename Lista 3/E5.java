/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */



public class E5 {
	
	public static void main (String[] args) {
		
		
		for(int i = 1; i <= 1000; i++){
		
			if(primo(i)){
				System.out.print(i + " ");
			}
			
		}
		
		
		
		
	}
	
	static boolean primo(int num){
		
		int cont = 0;
		
		for(int i = 1; i <= num; i++){
			
			if(num % i == 0){
				cont++;	
			}
			
		}
		
		if(cont == 2){
			return true;
		}else{
			return false;
		}
		
		
	}
}

