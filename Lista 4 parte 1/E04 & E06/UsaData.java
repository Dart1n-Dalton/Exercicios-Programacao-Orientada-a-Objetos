/*
 *Dalton Augusto Pontes de Santis Filho 
 */

import java.util.Scanner;
public class UsaData {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Data hoje = new Data();
		
		System.out.print("Dia: ");
		hoje.setDia(leia.nextInt());
		
		System.out.print("Mes: ");
		hoje.setMes(leia.nextInt());
		
		System.out.print("Ano: ");
		hoje.setAno(leia.nextInt());
		
		
		System.out.println("\n\tData Inserida: " + hoje.mostrarData());
		
		System.out.println("\n\tA data inserida eh: " + ((hoje.isValida())?"Valida":"Invalida"));
		
		
	}
}

