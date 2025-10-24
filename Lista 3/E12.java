/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */


import java.util.Scanner;
import java.util.Arrays;
public class E12 {
	
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
	
		System.out.println("\n\t>>" + Arrays.toString(seqPerfeitos(num)));
		
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
	
	static int[] seqPerfeitos(int num){
		
		int qtd = 0;
		
		for(int i = 5; i <= num; i++){
			
			
			if(isPerfeito(i)){
				qtd++;
			}
		}
		
		int[] seq = new int[qtd];
		
		for(int i = 5, c = 0; i <= num; i++){
			
			
			if(isPerfeito(i)){
				seq[c] = i;
				c++;
			}
		}
		
		return seq;
		
	}
}

