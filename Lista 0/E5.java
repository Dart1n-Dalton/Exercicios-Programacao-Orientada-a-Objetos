/*
	Dalton Augusot Pontes de Santis Filho
*/


import java.util.Scanner;
public class E5 {
		
	public static void main (String[] args) {
		
		int l, c, exibit = 0;
		Scanner leia = new Scanner(System.in);
		
		
		do{
			System.out.print("Digite a quantidade de linhas nas matrizes: ");
			l = leia.nextInt();
			System.out.println();
			
			System.out.print("Digite a quantidade de colunas nas matrizes: ");
			c = leia.nextInt();
			System.out.println();
		
		}while(l < 1 || c < 1);
		
		System.out.println();
		int[][] matrix1 = new int[l][c], 
				matrix2 = new int[l][c], 
				matrixR = new int[l][c];
		
		do{
			
			if(exibit == 0){
				System.out.println("==== MATRIZ 1 =================================\n");

			}
			if(exibit == 2){
				System.out.println("\n==== MATRIZ 2 =================================\n");

			}
			if(exibit == 4){
				System.out.println("\n==== MATRIZ RESULTADO =========================\n");	
			}
			
			
			for(int i = 0; i < matrix1.length; i++){
				
				for(int j = 0; j < matrix1[i].length; j++){
			
					switch(exibit){
						case 0:
							System.out.printf("insira o valor para linha %d, coluna %d:", (i + 1), (j + 1));
							matrix1[i][j] = leia.nextInt();
						break;
						
						case 1:
							System.out.print(matrix1[i][j] + " ");
						break;
						
						case 2:
							System.out.printf("insira o valor para linha %d, coluna %d:", (i + 1), (j + 1));
							matrix2[i][j] = leia.nextInt();
						break;
						
						case 3:
							System.out.print(matrix2[i][j] + " ");
						break;
						
						case 4:
							matrixR[i][j] = (matrix1[i][j] + matrix2[i][j]);
							System.out.print(matrixR[i][j] + " ");
						break;
					}
					
								
				}
				
				if(i == (matrix1.length - 1)){
					exibit++;
				}
				
				if(exibit == 1 || exibit == 3 || exibit == 4){
					System.out.println();
				}
			} 
			System.out.println();
			
		}while(exibit < 5);	
	}
}

