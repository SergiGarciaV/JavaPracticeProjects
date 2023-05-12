//He seguit els passos amb els valors que indiques i em surt la bandera així
//com una mica, "desproporcionada"... Segur que en alguna cosa hauré errat.

public class bandera_USA {
	
	public static void main(String[]args) {
		
		
		for(int fila=0;fila<29;fila++) {
			
			for(int columna=0;columna<47;columna++) {
				
				
				if((columna>16||fila>18)&&(fila%2==0)){
					
					System.out.print("");
					
				}else {
				
					if(columna>16||fila>18){
						
						System.out.print("=");
					
						}else {
					
							if((columna<16||fila<18)&&(fila%2==1&&columna%2==1)) {
								
								System.out.print("*");
								
							}else {
								
								if(columna%2==0) {
									
									System.out.print(" ");
									
								}
									
							}
					
						}
				
					}
					
					
				}
		
				System.out.println("");
		
			}

	}

}