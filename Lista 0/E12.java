/*
	Dalton Augusot Pontes de Santis Filho
*/


import java.util.Random;
import java.util.Scanner;
public class E12 {
		
	public static void main (String[] args) {
				
		int size, exibit = 0;
		String lista = "";
		Random gerar = new Random();
		Scanner leia = new Scanner(System.in);
		
		
		do{
			System.out.print("Digite o valor do tamanho da matriz: ");
			size = leia.nextInt();
		
		}while(size > 20);
		
		System.out.println();
		
		int[][] matrix = new int[size][size];
			
			do{
			for(int i = 0; i < matrix.length; i++){
				
				for(int j = 0; j < matrix[i].length; j++){
				
					if(exibit == 1){
						if(j < (matrix[i].length - 1)){
							if(i == j){
								lista+= matrix[i][j + 1] + " ";
							}
						}
					}else{
						matrix[i][j] = gerar.nextInt(100);
						System.out.print(matrix[i][j] + ((matrix[i][j] < 10) ? "  " : " "));
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
			

		System.out.print("\n\nOs numeros da linha diagonal sao: " + lista);



		} 
	}


