/*
 *Dalton Augusto Pontes de Santis Filho 
 */

import java.util.Scanner;
import java.util.Arrays;
public class UsaEquacao {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Equacao mat = new Equacao();
		
		System.out.print("A: ");
		
		if (!mat.setA(leia.nextInt())) {
            System.out.println("O coeficiente 'a' deve ser diferente de zero!");
            return;
        }

		System.out.print("B: ");
		mat.setB(leia.nextInt());
		
		System.out.print("C: ");
		mat.setC(leia.nextInt());
		
		

        if (mat.temRaizesReais()) {
            double[] r = mat.raizes();
            System.out.println("Raizes reais: x1 = " + r[0] + ", x2 = " + r[1]);
        } else {
            System.out.println("Não existem raízes reais.");
        }
		
		
	}
}

