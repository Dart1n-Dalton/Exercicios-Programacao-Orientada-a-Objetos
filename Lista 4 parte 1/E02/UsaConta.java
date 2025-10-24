/*
 *Dalton Augusto Pontes de Santis Filho 
 * 
 */


import java.util.Scanner;
public class UsaConta {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String decisao;
		boolean garcom10 = false;
		
		do{
					
			System.out.print("\n Deseja pagar os 10% do garcom? [s/n]: ");
			decisao = leia.nextLine();
			
			if(decisao.equalsIgnoreCase("s")){
				garcom10 = true;
				break;
			}else{
				if(decisao.equalsIgnoreCase("n")){
					garcom10 = false;
					break;
				}
				
			}
			
		}while(!decisao.isEmpty());
		
		
		Conta aPagar = new Conta(845, 4, true);
		
		System.out.println(aPagar.toString());
	}
}

