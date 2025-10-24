/*
	Dalton Augusto Pontes de Santis Filho
*/


import java.util.Random;
import java.util.Scanner;
public class E23 {
		
	public static void main (String[] args) {
				
		int h, w;
		Random gerar = new Random();
		Scanner leia = new Scanner(System.in);
		
		
		do{
			System.out.print("Digite a altura das matrizes: ");
			h = leia.nextInt();
		
		}while(h > 20);
		
		do{
			
			System.out.print("Digite a largura da primeira matriz: ");
			w = leia.nextInt();
		
		}while(w > 20);
		
		System.out.println();
		
		int[][] matrix = new int[h][w];
		int lista[] = new int[h * w];
		
		//primos
		
		for(int i = 0, n = 2; i < (h * w); n++){
			
			for(int x = 1, cont = 0; x <= n; x++){
				
				if(n % x == 0){
					cont++;	
				}
					
				if(x == n && cont == 2){
					lista[i] = n;
					i++;
				}	
					
			}
			
		}
		
		
		
		//matriz
		
		System.out.println("matriz: \n\n");
		
			for(int i = 0, p = 0; i < matrix.length; i++){
				
				for(int j = 0; j < matrix[i].length; j++){
						
						matrix[i][j] = lista[p];
						System.out.print(matrix[i][j] + ((matrix[i][j] < 10) ? "  " : " "));
						p++;


					}
					
					System.out.println();
		
			}
			
			System.out.println("\n");
			





		} 
	}


