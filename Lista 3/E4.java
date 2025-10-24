/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */

import java.util.Scanner;
public class E4 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.print("Entre com o primeiro numero: ");
		num1 = leia.nextInt();
		
		System.out.print("Entre com o segundo numero: ");
		num2 = leia.nextInt();
		
		System.out.print("Entre com o terceiro numero: ");
		num3 = leia.nextInt();
		
		System.out.println("\n" + calcMedia(num1, num2, num3));
		
		
		
		
	}
	
	
	
	static String calcMedia(int n1, int n2, int n3){
		
		int[] notas = {n1, n2, n3};
		
		for(int i = 0; i < notas.length; i++){
		
			if(notas[i] < 0 || notas[i] > 10){
				notas[i] = 0;
			}
			
		}
		
		
		int maior = notas[0], menor = notas[0];
		
		for(int i = 1; i < notas.length; i++){
			
			if(notas[i] > maior){
				maior = notas[i];
			}
			
			if(notas[i] < menor){
				menor = notas[i];
			}
		}
		
		
		return  "media maiores: " + ((double)((notas[0] + notas[1] + notas[2]) - menor) / 2) +
				"\nmedia aritmetica: " + ((double)(notas[0] + notas[1] + notas[2]) / 3) + 
				"\nmaior nota: " + maior +
				"\nmenor nota: " + menor;
		
	
		
	
	}
	
}

