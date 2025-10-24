/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */

import java.util.Scanner;
public class E1 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int graus;
		
		System.out.print("Entre com a temperatura em Celsius: ");
		graus = leia.nextInt();
		
		System.out.printf("a teperatura em Fahrenheit eh: %.2f", conversor(graus));
		
		
		
		
	}
	
	
	
	static double conversor(int temp){
		
		return ((9 * (double)temp) / 5) + 32;
	
	}
}

