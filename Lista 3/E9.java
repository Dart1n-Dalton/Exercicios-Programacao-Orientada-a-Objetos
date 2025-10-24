/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */


import java.util.Scanner;
import java.util.Arrays;
public class E9 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int num1, num2;
		
		System.out.print("Entre com um valor: ");
		num1 = leia.nextInt();
		
		System.out.print("Entre com outro valor: ");
		num2 = leia.nextInt();
		
		
		System.out.print("\n\tMdc: " + mmc(num1, num2));
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
	
	static int[] arrayPrimos(int lsup) {
		
		int qtd = 0;

		
		
		//for para contar
		
		for(int i = 1; i <= lsup; i++){		
				
			if(primo(i)){
				qtd++;
			}
					
		}
			
		int[] retorno = new int[qtd];
	
			
		//for para armazenar
		
		for(int c = 0, i = 1; i <= lsup; i++){		
				
			if(primo(i)){
				
				retorno[c] = i;
				c++;
			}
					
		}
		
		
		
	return retorno;
		
	}
	
	
	
	
	static int mmc(int n1, int n2){
		
		int[] nums = {n1, n2};
		int mmc = 1;
		int[] primos = arrayPrimos(Arrays.stream(nums).max().getAsInt());

		
		System.out.println("\n");
		for(int termo: nums){
			System.out.print(" " + termo);
		}	
		System.out.println();
		
		for(int p = 0; ;){
			
			int cont = 0;
			
			//conta os divisores
			for(int i = 0; i < nums.length; i++){
			
				if(nums[i] % primos[p] == 0){
					cont++;
				}
			
			}
			
			//rersolve o que fazer no caso de ser divisor comum ou não

			if(cont == nums.length){
					
				for(int i = 0; i < nums.length; i++){
						
					nums[i] = nums[i] / primos[p];
					
				}
					
				mmc*= primos[p];	
				
			}else{
				
				if(cont != 0){
					
					for(int i = 0; i < nums.length; i++){
				
						if(nums[i] % primos[p] == 0){
							nums[i] = nums[i] / primos[p];
						}
				
					}
					
					mmc*= primos[p];
				}else{
					
					p++;
				}	
					
			}
			
			//verifica se é o fim
				
			int  fimC = 0;	
			for(int termo: nums){
				System.out.print(" " + termo);
				if(termo == 1){
					fimC++;
				}
			}	
			System.out.println();
			if(fimC == nums.length){
			
				break;
				
			}
			
		}
			
		return mmc;	
	}
		
		
	
	
}	
	


