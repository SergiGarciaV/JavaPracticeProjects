import java.util.Scanner;
public class Notes2 {

		private Scanner teclat;
	
		public static void main(String[]args) {
			
			Notes2 calcular=new Notes2();
			calcular.inici();
		}
		
		public void inici() {
			
			mostrarMenu();
			
			imprimir();
		}
		
		public void mostrarMenu() {
			
			System.out.println("\n\n -------------------------------------------\n| Benvinguda al programa de calcul de notes:|\n -------------------------------------------\n");
			}
		
		public int lecturaIndex() {
			
			teclat=new Scanner(System.in);
			
			System.out.print(" A continuacio introdueixi quantes notes voldrà introduir:");
			int i=teclat.nextInt();
			
			return i;
		}
		
		public double[] llegirDades() {
			
			int x=lecturaIndex(); 
			
			double arrayNotes[]=new double [x+1];
			
			for(int j=0;j<x;j++) {
				
				System.out.print(" Nota "+(j+1)+": ");
				
				boolean llegit=false;
				
				while(!llegit) {
					
					llegit=teclat.hasNextDouble();
					
					if(llegit) {
						
						arrayNotes[j]=teclat.nextDouble();
						
					}else if((!llegit)||(teclat.nextDouble())<0||(teclat.nextDouble())>10){ 	
						
						System.out.println("El valor introduit no es un real, torna-ho a provar: ");
						teclat.next();
					}										
				}		
			}
			
			return arrayNotes;
		}
											
		public void imprimir() {
			
			double [] arrayNotes2=llegirDades();
			
			for(int i=0;i<arrayNotes2.length-1;i++) {
				
				if(arrayNotes2[i]>=9&&(arrayNotes2[i]<=10)){
			
					System.out.println("\nLa nota [ "+arrayNotes2[i]+" ] es queda en un [ Excelent ]");
					
				}else if(arrayNotes2[i]>6.4&&(arrayNotes2[i]<9)){
			
					System.out.println("\nLa nota [ "+arrayNotes2[i]+" ] es queda en un [ Notable ]");
					
					
				}else if(arrayNotes2[i]>4.9&&(arrayNotes2[i]<6.5)){
			
					System.out.println("\nLa nota [ "+arrayNotes2[i]+" ] es queda en un [ Aprovat ]");
			
				
				}else if(arrayNotes2[i]>=0&&(arrayNotes2[i]<5)){
			
					System.out.println("\nLa nota [ "+arrayNotes2[i]+" ] es queda en un [ Suspes ]");
					
				}else {
					
					System.out.println("\nLa nota [ "+arrayNotes2[i]+" ] es una Nota NO valida");
				}
			}	
		}
		
}
