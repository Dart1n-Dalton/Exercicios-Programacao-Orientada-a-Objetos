/*
	Dalton Augusot Pontes de Santis Filho
*/


import java.util.Random;
public class E2 {
		
	public static void main (String[] args) {
				
			
		int[][] matrix = new int[6][3];
		Random gerar = new Random();
		

			for(int i = 0; i < matrix.length; i++){
				
				for(int j = 0; j < matrix[i].length; j++){
				
						matrix[i][j] = gerar.nextInt(100);
				
						System.out.print(matrix[i][j] + ((matrix[i][j] < 10) ? "  " : " "));


					}
					
					System.out.println();
		
			}
			
			//INVERSA
			
			System.out.println("\n");
			
			for(int i = matrix.length - 1; i >= 0; i--){
				
				for(int j = matrix[i].length - 1; j >= 0; j--){
				
						System.out.print(matrix[i][j] + ((matrix[i][j] < 10) ? "  " : " "));


					}
					
					System.out.println();
		
			}



			} 
	}


