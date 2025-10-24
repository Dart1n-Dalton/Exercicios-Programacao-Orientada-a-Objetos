/*
	Dalton Augusot Pontes de Santis Filho
*/


import java.util.Random;
import java.util.Scanner;
public class E8 {
		
	public static void main (String[] args) {
				
			
		int l, c, qPares = 0, qImpares = 0;
		Random gerar = new Random();
		Scanner leia = new Scanner(System.in);
		
		do{
			System.out.print("Digite a quantidade de linhas nas matrizes: ");
			l = leia.nextInt();
			System.out.println();
			
			System.out.print("Digite a quantidade de colunas nas matrizes: ");
			c = leia.nextInt();
			System.out.println();
		
		}while(l < 1 || c < 1);

		int[][] matrix = new int[l][c];
		int pares[] = new int[c*l], impares[] = new int[c*l];
						
			for(int i = 0, kp = 0, ki = 0; i < matrix.length; i++){
				
				for(int j = 0; j < matrix[i].length; j++){

						matrix[i][j] = gerar.nextInt(100);
						System.out.print(((matrix[i][j] < 10) ? " " : "") + matrix[i][j] + " ");
						
						if(matrix[i][j] % 2 == 0){
							qPares++;
							pares[kp++] = matrix[i][j];
						}else{
							qImpares++;
							impares[ki++] = matrix[i][j];
						}
							
				}
					System.out.println();
			}
			
			System.out.println();	
			
			//pares
			
			
			if(qPares > 0){
			
			System.out.printf("houveram %d par(es), sendo eles: ", qPares);
			
			for(int i = 0; i < qPares; i++){
					
					System.out.print(pares[i] + " " );
					
			}
				
				System.out.println("\n");
			
			
			}else{
					System.out.println("nao houve nenhum numero par encontrado\n");
			}
			
			
			
			//impares
			
			if(qImpares > 0){
			
			System.out.printf("houveram %d impar(es), sendo eles: ", qImpares);
			
			for(int i = 0; i < qImpares; i++){
					
					System.out.print(impares[i] + " " );
					
			}
				
				System.out.println("\n");
			
			
			}else{
					System.out.println("nao houve nenhum numero impar encontrado\n");
			}
			
			

	


	} 
}


