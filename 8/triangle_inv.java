import java.util.Scanner;

public class triangle_inv {

	public static void main(String[]args) {
		
		Scanner teclat=new Scanner(System.in);
		
		
		
		System.out.print("Introdueix la base/alçada del triangle: ");
		int x=teclat.nextInt();
		
		
		
		for(int fila=0;fila<x;fila++) {
			
			for(int columna=0;columna<x;columna++) {
				
				if(columna>=fila) {
					
					System.out.print("*");
					
				}else {
					
					
					System.out.print(" ");						
				}
					
			}
			
			System.out.println("");
					
		}

	}
						
}


