/*
 * Dalton Augusto Pontes de Santis Filho 
 */

import java.util.Scanner;
public class E2 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int n1, n2;
		
		
		System.out.print("insira o primeiro numero: ");
		n1 = leia.nextInt();
		
		System.out.print("insira o Segundo numero: ");
		n2 = leia.nextInt();
		
		if(n1 != n2){
			System.out.println("\nO menor numero eh o " + verificaM(n1, n2));
		}else{
			System.out.println("\nOs numeros sao iguais");
		}
		
		
	}
	
	static int verificaM(int n1, int n2){
		
		if(n1 < n2){
			return n1;
		}else{
			return n2;
		}
	
		
	}
	
	
	
	
}

