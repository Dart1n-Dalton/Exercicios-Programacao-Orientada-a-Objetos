/*
	Dalton Augusot Pontes de Santis Filho
*/


import java.util.Random;
import java.util.Scanner;
public class E6 {
		
	public static void main (String[] args) {
				
			
		int exibit = 0, l, c, valor, ocorrencias = 0;
		Random gerar = new Random();
		Scanner leia = new Scanner(System.in);
		
		do{
			System.out.print("Digite a quantidade de linhas nas matrizes: ");
			l = leia.nextInt();
			System.out.println();
			
			System.out.print("Digite a quantidade de colunas nas matrizes: ");
			c = leia.nextInt();
			System.out.println();
			
			System.out.print("Digite o valor a ser procurado na matriz: ");
			valor = leia.nextInt();
			System.out.println();
		
		}while(l < 1 || c < 1);

		int[][] matrix = new int[l][c];
		
			
			do{
			for(int i = 0; i < matrix.length; i++){
				
				for(int j = 0; j < matrix[i].length; j++){
				
					if(exibit == 0){
						matrix[i][j] = gerar.nextInt(25);
						System.out.print(((matrix[i][j] < 10) ? " " : "") + matrix[i][j] + " ");
					}else{
						if(matrix[i][j] == valor){
							System.out.printf("\n\nvalor %d encontrado na linha %d, coluna %d.", valor, (i + 1), (j + 1));
							ocorrencias++;
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
			
		System.out.printf("\n\nHouve um total de %d ocorrencias.", ocorrencias);



	} 
}


