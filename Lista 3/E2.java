/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */

import java.util.Scanner;
public class E2{
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int graus;
		char select;
		
		do{
			
		
			System.out.print("[c] Celsius, [f] Fahrenheit e [s] Sair:");
			select = leia.next().charAt(0);
			
			if(select == 'f' || select == 'c'){
			
				System.out.print("Entre com a temperatura: ");
				graus = leia.nextInt();
				
				System.out.printf("\nSaida: %.2f\n", conversor(select, graus));
			
			}else{
				
				System.out.println("\nOpcao Invalida!\n");
			}
			
			
		}while(select != 's');
		
		
		
	}
	
	
	
	static double conversor(char sel, int temp){
		
		if(sel == 'c'){
			
			return ((9 * (double)temp) / 5) + 32;
			
		}else{
			
			return ((5 * ((double)temp - 32)) / 9);
			
		}
		
		
	
	}
}

