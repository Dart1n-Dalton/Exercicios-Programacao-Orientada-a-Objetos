/*
 *Dalton Augusto Pontes de Santis Filho 
 */


public class ComparaData {
		
		private int diasData1, diasData2;
		private String data1, data2;
		
	public ComparaData(Data d1, Data d2){
		
		setData1(d1.mostrarData());
		setDiasData1(d1.getDia(), d1.getMes(), d1.getAno());
		
		setData2(d2.mostrarData());
		setDiasData2(d2.getDia(), d2.getMes(), d2.getAno());
			
	
	}	
	
	public void setDiasData1(int dia, int mes, int ano){
		
		this.diasData1 = dia + (mes * 30) + (ano * 365);
		
		
	}
	
	public void setDiasData2(int dia, int mes, int ano){
		
		this.diasData2 = dia + (mes * 30) + (ano * 365);
		
		
	}
	
	public void setData1(String data){
		
		this.data1 = data;
		
	}
	
	public void setData2(String data){
		
		this.data2 = data;
		
	}
	
	public int getDiasData1(){
		
		return this.diasData1;
	
	}
	
	public int getDiasData2(){
		
		return this.diasData2;
	
	}
	
	public String getData1(){
		
		return this.data1;
	
	}
	
	public String getData2(){
		
		return this.data2;
	
	}
	
	public String compara(){
		
		if(this.diasData1 == this.diasData2){
			
			return "\n\tAs datas " + getData1() + " e " + getData2() + " sao iguais";
			
		}else{
			
			if(this.diasData1 > this.diasData2){
				
				return "\n\tA data " + getData1() + " eh a maior, e a " + getData2() + " eh a menor";
			}else{
				
				return "\n\tA data " + getData2() + " eh a maior, e a " + getData1() + " eh a menor";
			}
		
		
		}
		
	}
	
	public int diferenca(){
		
		if(this.diasData1 == this.diasData2){
			
			return 0;
			
		}else{
			
			if(this.diasData1 > this.diasData2){
				
				return this.diasData1 - this.diasData2;
			}else{
				
				return this.diasData2 - this.diasData1;
			}
		
		
		}
		
	}

	public String comparar(){
		
		return compara() + "\n\tCom uma diferenca de " + diferenca() + " dias";
		
	}
}

