import java.util.Scanner;

public class LlegirReals {

	public static void main(String[]args) {
		LlegirReals programa=new LlegirReals();
	
		programa.inici();
	}
	public void inici() {
		System.out.print("Llegiu un nombre real pel teclat:");
		double a=llegirRealTeclat();
		System.out.println("El nombre real ha estat "+a+".");
		System.out.println("Llegiu un altre nombre real per teclat:");
		a=llegirRealTeclat();
		System.out.println("L'altre nombre real ha estat "+a+".");
	}
	
	public double llegirRealTeclat() {
		
		Scanner lector=new Scanner(System.in);
		double realLlegit=0.0;
		boolean llegit=false;
	
		while(!llegit) {
			llegit=lector.hasNextDouble();
			if(llegit) {
				realLlegit=lector.nextDouble();
			}
			else {
				System.out.println("Aixo no es un nombre real.");
				lector.next();
			}
		}
		lector.nextLine();
		return realLlegit;
	}
}