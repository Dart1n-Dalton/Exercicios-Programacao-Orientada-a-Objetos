/*
	Dalton Augusot Pontes de Santis Filho
*/


import java.util.Random;
import java.util.Scanner;
public class E9 {
		
	public static void main (String[] args) {
				
		int size;
		String lista = "";
		Random gerar = new Random();
		Scanner leia = new Scanner(System.in);
		
		
		do{
			System.out.print("Digite o valor do tamanho da matriz: ");
			size = leia.nextInt();
		
		}while(size > 20);
		
		System.out.println();
		
		int[][] matrix = new int[size][size];
		
		
			for(int i = 0; i < matrix.length; i++){
				
				for(int j = 0; j < matrix[i].length; j++){
				
						matrix[i][j] = gerar.nextInt(100);
						System.out.print(matrix[i][j] + ((matrix[i][j] < 10) ? "  " : " "));
						
						if(i == j){
							lista+= matrix[i][j] + " ";
						}

					}
					
					System.out.println();
		
			}
			

		System.out.print("\nOs numeros da linha diagonal sao: " + lista);



		} 
	}


