/*
	Dalton Augusot Pontes de Santis Filho
*/


import java.util.Random;
import java.util.Scanner;
public class E4 {
		
	public static void main (String[] args) {
				
		int l, c, maxRandom;
		Random gerar = new Random();
		Scanner leia = new Scanner(System.in);
		
		
		do{
			System.out.print("Digite a quantidade de linhas na matriz: ");
			l = leia.nextInt();
			System.out.println();
			
			System.out.print("Digite a quantidade de colunas na matriz: ");
			c = leia.nextInt();
			System.out.println();
			
			System.out.print("Digite o valor maximo para os numeros gerados: ");
			maxRandom = leia.nextInt() + 1;
		
		}while(l < 1 || c < 1);
		
		System.out.println();
		
		int[][] matrix = new int[l][c];
		
		
			for(int i = 0; i < matrix.length; i++){
				
				for(int j = 0; j < matrix[i].length; j++){
				
						matrix[i][j] = gerar.nextInt(maxRandom);
						System.out.print(matrix[i][j] + " ");


					}
					
					System.out.println();
		
			}
			





		} 
	}


