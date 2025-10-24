/*
 *Dalton Augusto Pontes de Santis Filho 
 */

import java.util.Scanner;
public class Floresta {
	
	
	public static void main (String[] args) {
		
		Planta[] floresta = new Planta[100];
		
		int opcao, qtdPlantas = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			
			System.out.println("\n================");
			System.out.println("=== Floresta ===");
			System.out.println("1) Nova planta");
			System.out.println("2) Listar Plantas");
			System.out.println("3) Quantidade de Plantas");
			System.out.println("4) Sair");
			System.out.println("================");
			System.out.print(">>> Opcao: ");
			opcao = leia.nextInt();
			
			switch ( opcao ) {
				
				case 1:
				
					int opcaoP;
					do {
			
							System.out.println("\nQual o tipo da planta?");
							System.out.println("1) Arvore");
							System.out.println("2) Flor");
							System.out.println("3) Carnivora");
							System.out.print(">>> Opcao: ");
							opcaoP = leia.nextInt();
			
						switch ( opcaoP ) {
				
							case 1:
								
								floresta[qtdPlantas] = new Arvore();
								
								leia.nextLine();
								
								System.out.println("Entre com o nome da planta");
								floresta[qtdPlantas].setNome(leia.nextLine());
								
								System.out.println("Entre com a especie da planta");
								floresta[qtdPlantas].setEspecie(leia.nextLine());
								
								System.out.print("A arvore eh frutifera? [S/N]: ");
								((Arvore)floresta[qtdPlantas]).setFrutifera(leia.nextLine().equalsIgnoreCase("s"));
									
								qtdPlantas++;
										
							break;
							
							case 2:
								
								floresta[qtdPlantas] = new Flor();
								
								leia.nextLine();
								
								System.out.println("Entre com o nome da planta");
								floresta[qtdPlantas].setNome(leia.nextLine());
								
								System.out.println("Entre com a especie da planta");
								floresta[qtdPlantas].setEspecie(leia.nextLine());
								
								System.out.print("A qual a cor da flor? ");
								((Flor)floresta[qtdPlantas]).setCor(leia.nextLine());
									
								qtdPlantas++;
									
							break;
							
							case 3:
								
								floresta[qtdPlantas] = new Carnivora();
								
								leia.nextLine();
								
								System.out.println("Entre com o nome da planta");
								floresta[qtdPlantas].setNome(leia.nextLine());
								
								System.out.println("Entre com a especie da planta");
								floresta[qtdPlantas].setEspecie(leia.nextLine());
								
								System.out.print("A carnivora tem veneno? [S/N]: ");
								((Carnivora)floresta[qtdPlantas]).setVenenosa(leia.nextLine().equalsIgnoreCase("s"));
								
								qtdPlantas++;	
										
							break;
							
							default:
					
							System.out.println("\n\tOpcao invalida!\n");
				
						}
						
						break;
						
							
					} while ( opcaoP != -1 );
				
				
				break;
				
				case 2:
				
				
					if(qtdPlantas > 0){
				
						System.out.println("\n");
						
						for(Planta p : floresta){
							
							if(p != null){
							
								System.out.println("\t" + p);
							
							}
						
						}
					
					}else{
					
						System.out.println("\tTem planta nenhuma aq nao, dps o esquizofrenico aq sou eu");
						
					}
				
				
				break;
				
				case 3:
					
					int arvores = 0, flores = 0, carnivoras = 0;
					
					
					for(Planta p : floresta){
						
						if(p != null){
						
							if(p instanceof Arvore){
								
								arvores++;
							
							}
							
							if(p instanceof Flor){
								
								flores++;
							
							}
							
							if(p instanceof Carnivora){
								
								carnivoras++;
							
							}
							
							
							
						
						}
					
					}
				
				System.out.println("Existem um total de " + qtdPlantas + " na floresta" +
									"\n existem um total de " + arvores + " arvores na floresta" +
									"\n existem um total de " + flores + " flores na floresta" +
									"\n existem um total de " + carnivoras + " carnivoras na floresta");

				
				
				break;
				
				
				default:
					
					System.out.println("\n\tOpcao invalida!\n");
				
			}
			
		} while ( opcao != 4 );
		
		
	}
}

