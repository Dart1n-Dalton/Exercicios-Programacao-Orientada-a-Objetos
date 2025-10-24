/*
 *Dalton Augusto Pontes de Santis Filho 
 */


public class ModeloDeComputador {
	
	
	private String processador, memoria, disco, monitor;
	private int processadorPreco, memoriaPreco, discoPreco, monitorPreco;
	
	public ModeloDeComputador(int tp, int tme, int td, int tmo){
		
		setProcessador(tp);
		setMemoria(tme);
		setDisco(td);
		setMonitor(tmo);
		
		
	}
	
	
	public void setProcessador(int tipo){
		
		if(tipo == 0 || tipo == 1 || tipo == 2){
			
			switch(tipo){
				
				case 0:
					
					this.processador = "1600Mhz";
					this.processadorPreco = 700;
					
				break;
				
				case 1:
				
					this.processador = "1800Mhz";
					this.processadorPreco = 830;
				
				break;
				
				case 2:
				
					this.processador = "1900Mhz";
					this.processadorPreco = 910;
				
				break;
				
				
			}
			
		}
	
	}
	
	public void setMemoria(int tipo){
		
		if(tipo == 0 || tipo == 1 || tipo == 2 || tipo == 3 || tipo == 4){
			
			switch(tipo){
				
				case 0:
					
					this.memoria = "1GB";
					this.memoriaPreco = 350;
					
				break;
				
				case 1:
				
					this.memoria = "2GB";
					this.memoriaPreco = 350 * 2;
				
				break;
				
				case 2:
				
					this.memoria = "4GB";
					this.memoriaPreco = 350 * 4;
				
				break;
				
				case 3:
				
					this.memoria = "6GB";
					this.memoriaPreco = 350 * 6;
				
				break;
				
				case 4:
				
					this.memoria = "8GB";
					this.memoriaPreco = 350 * 8;
				
				break;
				
				
			}
			
		}
	
	}
	
	public void setDisco(int tipo){
		
		if(tipo == 0 || tipo == 1 || tipo == 2){
			
			switch(tipo){
				
				case 0:
					
					this.disco = "500GB";
					this.discoPreco = 300;
					
				break;
				
				case 1:
				
					this.disco = "1TB";
					this.discoPreco = 420;
				
				break;
				
				case 2:
				
					this.disco = "2TB";
					this.discoPreco = 500;
				
				break;
				
				
			}
			
		}
	
	}
	
	public void setMonitor(int tipo){
		
		if(tipo == 0 || tipo == 1){
			
			switch(tipo){
				
				case 0:
					
					this.monitor = "15 Polegadas";
					this.monitorPreco = 320;
					
				break;
				
				case 1:
				
					this.monitor = "17 Polegadas";
					this.monitorPreco = 520;
				
				break;

				
				
			}
			
		}
	
	}
	
	public String getProcessador(){
		
		return this.processador;
		
	}
	
	public String getMemoria(){
		
		return this.memoria;
		
	}
	
	public String getDisco(){
		
		return this.disco;
		
	}
	
	public String getMonitor(){
		
		return this.monitor;
		
	}
	
	public String calcularPreco(){
		
		return "\n\tPlaca Mae | R$ 800" +
				"\n\tprocessador " + this.processador + " | R$ " + this.processadorPreco +
				"\n\tMemoria " + this.memoria + " | R$ " + this.memoriaPreco +
				"\n\tDisco Rigido " + this.disco + " | R$ " + this.discoPreco +
				"\n\tMonitor " + this.monitor + " | R$ " + this.monitorPreco +
				"\n\n\tValor Total: " + (this.processadorPreco + this.memoriaPreco + this.discoPreco + this.monitorPreco + 800);
	}
	
	
}

