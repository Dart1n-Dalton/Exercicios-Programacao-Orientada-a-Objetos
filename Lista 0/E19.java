/*
	Dalton Augusto Pontes de Santis Filho
*/


import java.util.Random;
import java.util.Scanner;
public class E19 {
		
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
		int teto = matrix.length, piso = 0;
		boolean metade = false;
		
		for(int i = 0; i < matrix.length; i++){
				
				for(int j = 0; j < matrix[i].length; j++){
		
						matrix[i][j] = gerar.nextInt(100);
						System.out.print(matrix[i][j] + ((matrix[i][j] < 10) ? "  " : " "));
						
				}
				
			System.out.println();
							
		}
				
				
				
		for(int i = 0, j = 0; j < matrix.length;){

			if(i >= piso && i < teto){
				lista+= matrix[i][j] + " ";	
			}
			
			
			if(i == (matrix.length - 1)){
				i = 0;
				j++;
				lista+= "	";
				if(j > ((matrix.length - 1) / 2)){
					
					if(matrix.length % 2 == 0 && j == (matrix.length / 2)){
						
					}else{
						piso--;
						teto++;
					}
					
				}else{
					piso++;
					teto--;
				}
				
				
				
			}else{
				i++;
			}
		
		}	
		

		System.out.print("\n\nOs numeros da asa da borboleta sao :" + lista);



		} 
	}


