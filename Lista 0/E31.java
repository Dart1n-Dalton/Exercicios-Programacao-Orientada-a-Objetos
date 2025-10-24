/*
	Dalton Augusto Pontes de Santis Filho
*/


import java.util.Random;
import java.util.Scanner;
public class E31 {
		
	public static void main (String[] args) {
				
		int h, w, teto, piso;
		Random gerar = new Random();
		Scanner leia = new Scanner(System.in);
		
		
		do{
			System.out.print("Digite a altura da matriz: ");
			h = leia.nextInt();
			
			System.out.print("Digite a alrgura da matriz: ");
			w = leia.nextInt();
		
		}while(h > 20 || w > 20);
		
		do{
			System.out.print("Digite o limite inferior da faixa de valores: ");
			piso = leia.nextInt();
			
			System.out.print("Digite o limite superior da faixa de valores: ");
			teto = leia.nextInt();
		
		}while(teto < piso);
		
		System.out.println();
		
		int[][] matrix = new int[h][w];
		
		
			for(int i = 0; i < matrix.length; i++){
				
				for(int j = 0; j < matrix[i].length; j++){
				
						matrix[i][j] = (gerar.nextInt((teto - piso + 1)) + piso);
						System.out.print(matrix[i][j] + " ");


					}
					
					System.out.println();
		
			}
			





		} 
	}


