/*
 * Dalton Augusto Pontes de Santis Filho 
 */

import java.util.Scanner;
public class E6 {
	
	static int n1, n2;
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);

		char dec;
		
		System.out.print("insira um numero: ");
		n1 = leia.nextInt();
		

		
		do{
			
			System.out.print("insira um outro numero: ");
			n2 = leia.nextInt();
			
			verificaM(n1, n2);
			
			System.out.print("inserir outro numero? [s/n]:  ");
			dec = leia.next().charAt(0);
			
			
			
		}while(dec == 's');
		
			System.out.println("\nO menor numero eh o " + verificaM(n1, n2));	
		
	}
	
	static int verificaM(int num1, int num2){
		n1 = Math.min(num1, num2);
		return Math.min(num1, num2);
	}
	
	
	
	
}

