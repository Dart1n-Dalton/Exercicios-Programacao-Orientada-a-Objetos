/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */


import java.util.Scanner;
public class E11 {
	
	public static void main (String[] args) {
	
		int num;
		Scanner leia = new Scanner(System.in);
		
		do{	
			
			System.out.print("entre com um numero: ");
			num = leia.nextInt();
			
			if(num <= 0){
				
				System.out.println("Erro! Valor invalido.");
			}
		
		}while(num <= 0);
	
		System.out.println("\n\t>>O numero " + num + ((isPerfeito(num))? " eh perfeito!" : " nao eh perfeito!"));
		
	}
	
	static boolean isPerfeito(int num){
		
		int mult = 0;
		
		for(int i = 1; i < num; i++){
			
			if(num % i == 0){
				mult+= i;	
			}
			
		}
		
		if(mult == num){
			return true;
		}else{
			return false;
		}
		
		
	}
}

