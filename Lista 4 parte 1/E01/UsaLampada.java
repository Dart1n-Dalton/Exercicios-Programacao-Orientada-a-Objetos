/*
 *Dalton Augusto Pontes de Santis Filho 
 */

import java.util.Scanner;
public class UsaLampada {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String decisao;
		Lampada sala = new Lampada();
		
		do{
			System.out.println(sala.toString());
			
			
			System.out.print("\n Deseja usar o interruptor? [s/n]: ");
			decisao = leia.nextLine();
			
			if(decisao.equalsIgnoreCase("s")){
				sala.interruptor();
			}else{
				if(decisao.equalsIgnoreCase("n")){
					break;
				}
				
			}
			
		}while(!decisao.isEmpty());
		
		
	}
}

