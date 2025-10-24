/*
	Dalton Augusto Pontes de Santis Filho
*/


import java.util.Random;
import java.util.Scanner;
public class E32 {
		
	public static void main (String[] args) {
				
		int h, w, somaDiagonal = 0;
		Random gerar = new Random();
		Scanner leia = new Scanner(System.in);
		
		
		do{
			System.out.print("Digite a altura da matriz: ");
			h = leia.nextInt();
			
			System.out.print("Digite a alrgura da matriz: ");
			w = leia.nextInt();
		
		}while(h > 20 || w > 20);
		
		
		System.out.println();
		
		int[][] matrix = new int[h + 1][w + 1];
		
		//cria matriz
			for(int i = 0; i < (matrix.length - 1); i++){
				
				for(int j = 0; j < (matrix[i].length - 1); j++){
				
						matrix[i][j] = gerar.nextInt(11);
						if(i == j){
							somaDiagonal+= matrix[i][j];
						}
					}
		
			}
		
		//soma da diagonal principal
			
			matrix[h][w] = somaDiagonal;
		
		// soma das linhas
			
			for(int i = 0, soma = 0; i < (matrix.length - 1); i++){
				
				for(int j = 0; j < (matrix[i].length - 1); j++){
				
						soma+= matrix[i][j];

					}
				
				matrix[i][w] = soma;
				soma = 0;
			}
			
		//soma das colunas	
		
			for(int i = 0, soma = 0; i < (matrix[i].length - 1); i++){
				
				
				
				for(int j = 0; j < (matrix.length - 1); j++){
				
						soma+= matrix[j][i];

					}
				
				matrix[h][i] = soma;
				soma = 0;
			}

		//exibe

			for(int i = 0; i < matrix.length; i++){
				
				for(int j = 0; j < matrix[i].length; j++){
				
						System.out.print(matrix[i][j] + ((matrix[i][j] < 10) ? "  " : " "));
						
					}
				System.out.println();
			}


		} 
	}


