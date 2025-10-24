/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */


import java.util.Scanner;
public class E14 {
	
	public static void main (String[] args) {
	
		int num;
		Scanner leia = new Scanner(System.in);
	
			
		System.out.print("entre com um numero: ");
		num = leia.nextInt();

		System.out.println("\n\t>>" + inverte(num));
		
	}
	
	static int inverte(int num){
		
		String n = num + "", s = "";
		
		for(int i = 0; i < n.length(); i++){
			
			s = n.charAt(i) + s;
			
		}
		
		return Integer.parseInt(s);
		
		
	}
}

