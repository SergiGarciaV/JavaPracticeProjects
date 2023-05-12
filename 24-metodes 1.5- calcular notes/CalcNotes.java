
import java.util.Scanner;
public class CalcNotes {

		private Scanner teclat;
		private double arrayNotes[]=new double[5];
		
		public static void main(String[]args) {
			
			CalcNotes calcular=new CalcNotes();
			calcular.inici();
		}
		
		public void inici() {
			
			mostrarMenu();
			llegirDades();
			calculaMax();
			calculaMin();
			calculaMitja();
			imprimir();
		}
		
		public void mostrarMenu() {
			
			System.out.println(" -------------------------------------------\n| Benvinguda al programa de calcul de notes:|\n -------------------------------------------\n");
			}
		
		public void llegirDades() {
			
			teclat=new Scanner(System.in);
			
			System.out.println(" A continuacio introdueixi les 5 notes:");
			
			for(int i=0;i<arrayNotes.length;i++) {
				
				System.out.print(" Nota "+(i+1)+": ");
				
				boolean llegit=false;
				
				while(!llegit) {
					
					llegit=teclat.hasNextDouble();
					
					if(llegit) {
						
						arrayNotes[i]=teclat.nextDouble();
						
					}else{ 	
						
						System.out.println("El valor introduit no es un real, torna-ho a provar: "+"\n Nota "+(i+1)+": ");
						teclat.next();
					}										
				}		
			}					
		}
		
		public double calculaMax() {
			
			double MAX=arrayNotes[0];
			
			for(int i=1;i<arrayNotes.length;i++){
				
					
					if(arrayNotes[i]>MAX) {
						
						MAX=arrayNotes[i];
					}								
				}	
			return MAX;
			}
		
		
		public double calculaMin() {
			
			double MIN=arrayNotes[0];
			
			for(int i=1;i<arrayNotes.length;i++) {
				
				if(arrayNotes[i]<MIN) {
					
					MIN=arrayNotes[i];
				}
			}
			return MIN;
		}
		
		public double calculaMitja() {
			
			double suma=0;
			for(int i=0;i<arrayNotes.length;i++) {
				
				 suma+=arrayNotes[i];
			}
			double mitja=suma/arrayNotes.length;
			
			return mitja;
		}
				
		public void imprimir() {
			
			double max=calculaMax();
			double min=calculaMin();
			double Mitja=calculaMitja();
						
			System.out.print("La nota maxima es= "+max+"\nLa nota minima es= "+min+"\nLa nota mitja es= "+Mitja);			
		}				
	}
