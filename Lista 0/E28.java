/*
	Dalton Augusto Pontes de Santis Filho
*/


import java.util.Random;
import java.util.Scanner;
public class E28 {
		
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


		System.out.println("matriz desordenada: \n");
		
			for(int i = 0; i < matrix.length; i++){
				
				for(int j = 0; j < matrix[i].length; j++){
						
						matrix[i][j] = gerar.nextInt(100);
						System.out.print(matrix[i][j] + ((matrix[i][j] < 10) ? "  " : " "));


					}
					
					System.out.println();
		
			}
			
			System.out.println("\n");
			System.out.println("matriz ordenada: \n");
			
			for(int i = 0; i < matrix[0].length; i++){
						
				for(int j = 0; j < matrix.length; j++){
				
						for (int k = 0; k < j; k++) {
							
							if (matrix[j][i] < matrix[k][i]) {
								int temp = matrix[j][i];
								 matrix[j][i] =  matrix[k][i];
								 matrix[k][i] = temp;
							}
						}	

					}
			}
			

			
			
			for(int i = 0; i < matrix.length; i++){
				
				for(int j = 0; j < matrix[i].length; j++){

						System.out.print(matrix[i][j] + ((matrix[i][j] < 10) ? "  " : " "));


					}
					
					System.out.println();
		
			}


		} 
	}


