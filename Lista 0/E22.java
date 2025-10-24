/*
	Dalton Augusto Pontes de Santis Filho
*/


import java.util.Random;
import java.util.Scanner;
public class E22 {
		
	public static void main (String[] args) {
				
		int h, w1, w2;
		Random gerar = new Random();
		Scanner leia = new Scanner(System.in);
		
		
		do{
			System.out.print("Digite a altura das matrizes: ");
			h = leia.nextInt();
		
		}while(h > 20);
		
		do{
			
			System.out.print("Digite a largura da primeira matriz: ");
			w1 = leia.nextInt();
			
			System.out.print("Digite a largura da segunda matriz: ");
			w2 = leia.nextInt();
		
		
		}while(w1 > 20 || w2 > 20);
		
		System.out.println();
		
		int[][] matrix1 = new int[h][w1];
		int[][] matrix2 = new int[h][w2];
		int[][] matrixR = new int[h][w1 + w2];
		
		//criação matriz 1
		
		System.out.println("primeira matriz: \n\n");
		
			for(int i = 0; i < matrix1.length; i++){
				
				for(int j = 0; j < matrix1[i].length; j++){
						
						matrix1[i][j] = gerar.nextInt(100);
						System.out.print(matrix1[i][j] + ((matrix1[i][j] < 10) ? "  " : " "));


					}
					
					System.out.println();
		
			}
			
			System.out.println("\n");
			
		//criação matriz 2
		
		System.out.println("segunda matriz: \n\n");

			for(int i = 0; i < matrix2.length; i++){
				
				for(int j = 0; j < matrix2[i].length; j++){
				
						matrix2[i][j] = gerar.nextInt(100);
						System.out.print(matrix2[i][j] + ((matrix2[i][j] < 10) ? "  " : " "));


					}
					
					System.out.println();
		
			}
			
			System.out.println("\n");
			
			
		//terceira matriz
		
		System.out.println("terceira matriz: \n\n");
		
		
		for(int i = 0; i < matrixR.length; i++){
				
				boolean tick = false;
				
				for(int j = 0, j1 = 0, j2 = 0; j < matrixR[i].length; j++){
					
						if(!tick){
							
							if(j1 < matrix1[i].length){
								matrixR[i][j] = matrix1[i][j1];
								j1++;
							}else{
								matrixR[i][j] = matrix2[i][j2];
								j2++;
							}
							
							tick = !tick;

						}else{
							
							if(j2 < matrix2[i].length){
								matrixR[i][j] = matrix2[i][j2];
								j2++;
							}else{
								matrixR[i][j] = matrix1[i][j1];
								j1++;
							}
							
							tick = !tick;
							
						}
						
						
						System.out.print(matrixR[i][j] + ((matrixR[i][j] < 10) ? "  " : " "));


					}
					
					System.out.println();
		
			}



		} 
	}


