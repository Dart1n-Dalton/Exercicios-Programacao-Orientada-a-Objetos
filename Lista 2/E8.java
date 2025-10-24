/*
 * Dalton Augusto Pontes de Santis Filho 
 */

import java.util.Random;
public class E8 {
	
	public static void main (String[] args) {
		
		int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0, d6 = 0;
		
			for(int i = 0; i <= 1000000; i++){
				
					switch(dado()){
						
						case 1:
							d1++;
						break;
						
						case 2:
							d2++;
						break;
						
						case 3:
							d3++;
						break;

						case 4:
							d4++;
						break;
						
						case 5:
							d5++;		
						break;

						case 6:
							d6++;
						break;
						
					}
			
			}
			
			System.out.printf("1: %d - %.2f%%\n", d1, (double)(( (double)d1 / 1000000) * 100));
			System.out.printf("2: %d - %.2f%%\n", d2, (double)(( (double)d2 / 1000000) * 100));
			System.out.printf("3: %d - %.2f%%\n", d3, (double)(( (double)d3 / 1000000) * 100));
			System.out.printf("4: %d - %.2f%%\n", d4, (double)(( (double)d4 / 1000000) * 100));
			System.out.printf("5: %d - %.2f%%\n", d5, (double)(( (double)d5 / 1000000) * 100));
			System.out.printf("6: %d - %.2f%%\n", d6, (double)(( (double)d6 / 1000000) * 100));

	}
	
	static int dado(){
		Random r = new Random();
		
		return r.nextInt(7);
	}
	
	
	
	
}

