/*
 * Dalton Augusto Pontes de Santis Filho 
 */

import java.util.Scanner;
public class E4 {
	
	public static void main (String[] args) {
			
		double a, b, c;	
			
		Scanner leia = new Scanner (System.in);
		
		System.out.print("a: ");	
		a = leia.nextDouble();
		
		System.out.print("b: ");	
		b = leia.nextDouble();
		
		System.out.print("c: ");	
		c = leia.nextDouble();
		
		
		System.out.print("\nDelta eh: " + delta(a,b,c));
		
		
	}
	
	public static double delta(double a, double b, double c){
			
		double delta = Math.pow(b, 2) - (4 * a * c);
			
		return delta;
	 
	}
	
}

