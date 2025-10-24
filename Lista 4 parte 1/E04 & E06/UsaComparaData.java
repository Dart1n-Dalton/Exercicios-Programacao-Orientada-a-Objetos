/*
 *Dalton Augusto Pontes de Santis Filho 
 */

import java.util.Scanner;
public class UsaComparaData {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Data aniversario1 = new Data(16, 05, 2006);
		Data aniversario2 = new Data(16, 05, 2006);
		
		ComparaData teste = new ComparaData(aniversario1, aniversario2);
		
		System.out.println("\n\tO primeiro aniversario Inserida: " + aniversario1.mostrarData());
		System.out.println("\n\tO primeiro aniversario Inserida: " + aniversario1.mostrarData());
		
		System.out.println(teste.comparar());
		
		
	}
}
