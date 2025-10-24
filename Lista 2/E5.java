/*
 * Dalton Augusto Pontes de Santis Filho 
 */

import java.util.Scanner;
public class E5 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int n1, n2, n3;
		
		
		System.out.print("insira o primeiro numero: ");
		n1 = leia.nextInt();
		
		System.out.print("insira o Segundo numero: ");
		n2 = leia.nextInt();
		
		System.out.print("insira o terceiro numero: ");
		n3 = leia.nextInt();
		
		if(n1 != n2 && n1 != n3){
			System.out.println("\nO maior numero eh o " + verificaM(n1, n2, n3));
		}else{
			System.out.println("\nOs numeros sao iguais");
		}
		
		
	}
	
	static int verificaM(int n1, int n2){
		return Math.max(n1, n2);
	}
	
	static int verificaM(int n1, int n2, int n3){
		 return Math.max(Math.max(n1, n2), n3);
	}
	
	
	
	
}

