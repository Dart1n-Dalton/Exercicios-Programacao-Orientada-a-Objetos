/*
	Dalton Augusto Pontes de Santis Filho
*/


import java.util.Random;
import java.util.Scanner;
public class E25 {
		
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
		int[][] matrixO = new int[h][w];
		int lista[] = new int[h * w];


		System.out.println("matriz desordenada: \n");
		
			for(int i = 0, l = 0; i < matrix.length; i++){
				
				for(int j = 0; j < matrix[i].length; j++){
						
						matrix[i][j] = gerar.nextInt(100);
						lista[l] = matrix[i][j];
						l++;
						System.out.print(matrix[i][j] + ((matrix[i][j] < 10) ? "  " : " "));


					}
					
					System.out.println();
		
			}
			
			System.out.println("\n");
			System.out.println("matriz ordenada: \n");
			
			for (int i = 1; i < lista.length; i++) {
				
				for (int j = 0; j < i; j++) {
					
					if (lista[i] < lista[j]) {
						int temp = lista[i];
						lista[i] = lista[j];
						lista[j] = temp;
					}
				}
			}
			
			
			for(int i = 0, l = 0; i < matrix.length; i++){
				
				for(int j = 0; j < matrix[i].length; j++){
						
						matrixO[i][j] = lista[l];
						l++;
						System.out.print(matrixO[i][j] + ((matrixO[i][j] < 10) ? "  " : " "));


					}
					
					System.out.println();
		
			}


		} 
	}


