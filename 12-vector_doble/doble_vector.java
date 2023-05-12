import java.util.Scanner;

public class doble_vector {
	
	public static void main(String[]args) {
		
		Scanner teclat=new Scanner(System.in);
	
		String[] vectorprimer= {"Hola","bon","dia","professora","Marina"};
		String[]vectorsegon=new String[5];	
		
		for(int i=0;i<vectorsegon.length;i++) {
			
			System.out.print("Introdueixi la paraula de la posicio "+i+" per teclat: ");
			vectorsegon[i]=teclat.next();
		}
		
		System.out.println("Les paraules dels vector son:");
		
		for(int i=0;i<vectorprimer.length;i++) {
			
			System.out.println("Vector 1: "+vectorprimer[i]+" - Vector 2: "+vectorsegon[i]);
		}
	}
}
