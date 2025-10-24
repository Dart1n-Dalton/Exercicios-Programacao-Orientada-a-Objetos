/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */


import java.util.Scanner;
import java.util.Arrays;
public class E6 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int num1, num2;
		
		System.out.print("Entre com um valor: ");
		num1 = leia.nextInt();
		
		System.out.print("Entre com outro valor: ");
		num2 = leia.nextInt();
		
		
		System.out.print("\n\t>>" + Arrays.toString(arrayPrimos( num1, num2) ) );
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
	
	static int[] arrayPrimos(int n1, int n2) {
		
		int qtd = 0, lsup = n2, linf = n1;

		
		if(n1 > n2){
			
			lsup = n1;
			linf = n2;
		}
		
		//for para contar
		
		for(int i = linf; i <= lsup; i++){		
				
			if(primo(i)){
				qtd++;
			}
					
		}
			
		int[] retorno = new int[qtd + 1];
		retorno[0] = 1;
			
		//for para armazenar
		
		for(int c = 1, i = linf; i <= lsup; i++){		
				
			if(primo(i)){
				
				retorno[c] = i;
				c++;
			}
					
		}
		
		
		
	return retorno;
		
	}
}

