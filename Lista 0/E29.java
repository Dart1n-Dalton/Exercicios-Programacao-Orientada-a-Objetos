/*
	Dalton Augusto Pontes de Santis Filho
*/


import java.util.Random;
import java.util.Scanner;
public class E29 {
		
	public static void main (String[] args) {
				
		int valor;
		Random gerar = new Random();
		Scanner leia = new Scanner(System.in);
		
		
		do{
			System.out.print("Digite a quantidade de valores do vetor: ");
			valor = leia.nextInt();
		
		}while(valor > 20);
		
		System.out.println();
		
		int lista[] = new int[valor];
		
		System.out.print("vetor gerado: ");	
		
		for(int i = 0; i < lista.length; i++){
				
			lista[i] = gerar.nextInt(10);
			System.out.print(lista[i] + " ");	
					
		}
		
		int matrix[][] = new int[valor][];
		
		System.out.println("\n\nmatriz gerada: \n");	
		
		for(int i = 0; i < lista.length; i++) {
			
			matrix[i] = new int[lista[i] + 1];
			
			matrix[i][0] = lista[i];
			System.out.print(matrix[i][0] + ((matrix[i][0] < 10) ? "  " : " "));
			
			for(int x = 1, p = 1; x <= lista[i]; p++){
				
				for(int y = 1, c = 0; y <= p; y++){
					
					if(p % y == 0){
						c++;
					}
					
					if(y == p && c <= 2){	
						matrix[i][x] = p;
						System.out.print(matrix[i][x] + ((matrix[i][x] < 10) ? "  " : " "));
						x++;
					}
						
					
				}
			
			
			}
				
				
				
			System.out.println();	
				
		}
			
			


		
	
			





		} 
	}


