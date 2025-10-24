/*
 * Dalton Augusto Pontes de Santis Filho 
 */

import java.util.Scanner;
public class E2 {
	
	public static void main (String[] args) {
			
		double num;	
			
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Entre com um Numero: ");	
		num = leia.nextDouble();
		
		if(ezero(num)){
			System.out.printf("\n O numero %.2f eh zero", num);
		}else{
			System.out.printf("\n O numero %.2f nao eh zero", num);
		}
			
			
			
	}
	
	public static boolean ezero(double n){
			
		boolean positivo = false;	
			
		if(n == 0){
			positivo = true;
		}
			
		return positivo;
	
	}
	
	
}

