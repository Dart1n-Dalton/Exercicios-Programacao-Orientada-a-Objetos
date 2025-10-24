/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */

import java.util.Scanner;
public class E3{
	
		public static void main (String[] args) {
			
			Scanner leia = new Scanner(System.in);
			int graus;
			char select;
			
			do{
				
			
				System.out.print("[c] Celsius, [f] Fahrenheit, [k] Kelvin e [s] Sair:");
				select = leia.next().charAt(0);
				
				if(select == 'f' || select == 'c' || select == 'c'){
				
					System.out.print("Entre com a temperatura: ");
					graus = leia.nextInt();
					
					System.out.println(conversor(select, graus));
				
				}else{
					
					System.out.println("\nOpcao Invalida!\n");
				}
				
				
			}while(select != 's');
			
			
			
		}
	
	
	
		static String conversor(char sel, int temp){
			
			switch(sel){
				
				case 'c':
				
					return "F: " + (((9 * (double)temp) / 5) + 32) + " e K: " + (temp + 273);

				
				case 'f':
				
					return "C: " + ((5 * ((double)temp - 32)) / 9) + " e K: " + (((5 * ((double)temp - 32)) / 9) + 273);

				
				case 'k':
				
					return "C: " + (temp - 273) + " e F: " + (((9 * ((double)temp - 273)) / 5) + 32);
					

				
			}
			
			return "erro";
		
		}
		
	
	}


