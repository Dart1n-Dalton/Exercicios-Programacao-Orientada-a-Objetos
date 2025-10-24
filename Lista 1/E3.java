/*
 * Dalton Augusto Pontes de Santis Filho 
 */

import java.util.Scanner;
public class E3 {
	
	public static void main (String[] args) {
			
		double num;	
			
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Entre com um Numero: ");	
		num = leia.nextDouble();
		
		
			
		if(testaPositivo(num)){
			
			if(ezero(num)){
				System.out.printf("\n O numero %.2f eh zero", num);
			}else{
				System.out.printf("\n O numero %.2f eh positivo", num);
			}
		
		}else{
			System.out.printf("\n O numero %.2f eh negativo", num);
		}
			
	}
	
	public static boolean ezero(double n){
			
		boolean positivo = false;	
			
		if(n == 0){
			positivo = true;
		}
			
		return positivo;
	
	}
	
	public static boolean testaPositivo(double n){
			
		boolean positivo = true;	
			
		if(n < 0){
			positivo = false;
		}
			
		return positivo;
	
	}
	
	
}

