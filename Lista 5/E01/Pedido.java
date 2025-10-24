/*
 *Dalton Augusto Pontes de Santis Filho 
 */


public class Pedido {
	
	private static Produto[] produtos = new Produto[100];
	
	
	public static void main (String[] args) {
		
		produtos[0] = new Frios("presunto", 10, 2);
		produtos[1] = new Pao("pao frances", 0.50, 5);
		produtos[2] = new Doces("brigadairo", 2, 10);
		produtos[3] = new Doces("beijinho", 2, 10);
		
		double valorF = 0;
		
		System.out.println("\n");
		
		for(Produto p : produtos){
		
			if(p != null){
				
				valorF+= p.getPreco() * p.getQuantidade();
				System.out.println("\t" + p);
				
			}
			
		}
		
		System.out.println("\n\tValor total: " + valorF );
		
		
	}
}

