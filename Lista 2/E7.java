/*
 * Dalton Augusto Pontes de Santis Filho 
 */

import java.util.Scanner;
import java.util.Random;
public class E7 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		char dec;
		
		do{
			
			System.out.print("deseja jogar o dado? [s/n]:  ");
			dec = leia.next().charAt(0);
			
			if(dec == 's'){
				System.out.println("\n\tSaiu: " + dado() + "\n");
			}else{
				break;
			}
			
		}while(dec == 's');
		
		
	}
	
	static int dado(){
		Random r = new Random();
		
		return r.nextInt(7);
	}
	
	
	
	
}

