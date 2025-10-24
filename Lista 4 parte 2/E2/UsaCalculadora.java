/*
 *Dalton Augusto Pontes de Santis Filho 
 */


public class UsaCalculadora {
	
	public static void main (String[] args) {
		
		Calculadora calc = new Calculadora(2, 3);
		
		System.out.println("soma: " + calc.somar());
		System.out.println("subtracaoo: " + calc.subtrair());
		System.out.println("multiplicacao: " + calc.multiplicar());
		System.out.println("divisao: " + calc.dividir());
		
		
	}
}

