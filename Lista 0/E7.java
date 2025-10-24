/*
	Dalton Augusot Pontes de Santis Filho
*/


import java.util.Random;
import java.util.Scanner;
public class E7 {
		
	public static void main (String[] args) {
				
			
		int exibit = 0, l, c, maior, menor, maiorP[] = new int[2], menorP[] = new int[2];
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
		
			
		do{
			maior = matrix[0][0];
			menor = matrix[0][0];
				
			for(int i = 0; i < matrix.length; i++){
				
				for(int j = 0; j < matrix[i].length; j++){
				
					if(exibit == 0){
						matrix[i][j] = gerar.nextInt(100);
						System.out.print(((matrix[i][j] < 10) ? " " : "") + matrix[i][j] + " ");
					}else{
						if(matrix[i][j] > maior){
							maior = matrix[i][j];
							maiorP[0] = i + 1;
							maiorP[1] = j + 1;
						}
						
						if(matrix[i][j] < menor){
							menor = matrix[i][j];
							menorP[0] = i + 1;
							menorP[1] = j + 1;
						}
						
					}
							
				}
				
				if(i == (matrix.length - 1)){
					exibit++;
				}
				
				if(exibit == 0){
					System.out.println();
				}
			} 
		}while(exibit != 2);
			
		System.out.printf("\n\no maior elemento foi o %d, prensente na linha %d, coluna %d", maior, maiorP[0], maiorP[1]);
		System.out.printf("\n\no maior elemento foi o %d, prensente na linha %d, coluna %d", menor, menorP[0], menorP[1]);


	} 
}


