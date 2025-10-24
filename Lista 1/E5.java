/*
 * Dalton Augusto Pontes de Santis Filho 
 */

import java.util.Scanner;
import java.util.Arrays;
public class E5 {
	
	public static void main (String[] args) {
			
		double a, b, c, delta;	
			
		Scanner leia = new Scanner (System.in);
		
		System.out.print("a: ");	
		a = leia.nextDouble();
		
		System.out.print("b: ");	
		b = leia.nextDouble();
		
		System.out.print("c: ");	
		c = leia.nextDouble();
		
		
		System.out.println("\nDelta eh: " + delta(a,b,c));
		delta = delta(a,b,c);
		if(delta < 0){
			System.out.println("\nA equacao nao admite uma solucao real");
		}else{
			System.out.println("\nAs respectivas solucoes sao: " + Arrays.toString(bhaskara(delta, a, b)));
		}
		
		
	}
	
	public static double delta(double a, double b, double c){
			
		double delta = Math.pow(b, 2) - (4 * a * c);
			
		return delta;
	 
	}
	
	public static double[] bhaskara(double d, double a, double b){
		
		double[] result = {((b * - 1) + Math.sqrt(d))/(2 * a), ((b * - 1) - Math.sqrt(d))/(2 * a)};
	
	return result;
	
	}
	
	
}

