/*
	Dalton Augusot Pontes de Santis Filho
*/


import java.util.Scanner;
public class E1 {
		
	public static void main (String[] args) {
				
			
		int[][] matrix = new int[4][5];
		int exibit = 0;
		Scanner leia = new Scanner(System.in);
		
		do{
			for(int i = 0; i < matrix.length; i++){
				
				for(int j = 0; j < matrix[i].length; j++){
				
					if(exibit == 1){
						System.out.print(matrix[i][j] + " ");
					}else{
						System.out.printf("insira o valor para linha %d, coluna %d:", (i + 1), (j + 1));
						matrix[i][j] = leia.nextInt();
					}
							
				}
				
				if(i == (matrix.length - 1)){
					exibit++;
				}
				
				if(exibit == 1){
					System.out.println();
				}
			} 
		}while(exibit != 2);	
	}
}

