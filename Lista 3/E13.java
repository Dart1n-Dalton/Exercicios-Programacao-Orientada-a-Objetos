/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */


import java.util.Scanner;
import java.util.Arrays;
public class E13 {
	
	public static void main (String[] args) {
	
		int qtd;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("entre com a quantidade de termos: ");
		qtd = leia.nextInt();
		
		int[] nums = new int[qtd];
		
		for(int i = 0; i < qtd; i++){

			do{	
			
			System.out.print("\nentre com o "+ i +" numero: ");
			nums[i] = leia.nextInt();
			
			if(nums[i] <= 0){
				
				System.out.println("Erro! Valor invalido.");
			}
		
			}while(nums[i] <= 0);

		}
		
		
	
		System.out.println("\n\t>>" + Arrays.toString(seqPerfeitos(nums)));
		
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
	
	static int[] seqPerfeitos(int[] nums){
		
		int qtd = 0;
		
		for(int i = 0; i < nums.length; i++){
			
			
			if(isPerfeito(nums[i])){
				qtd++;
			}
		}
		
		int[] seq = new int[qtd];
		
		for(int i = 0, c = 0; i < nums.length; i++){
			
			
			if(isPerfeito(nums[i])){
				seq[c] = nums[i];
				c++;
			}
		}
		
		return seq;
		
	}
}

