
import java.util.Scanner;

public class arrays1 {
	
	public static void main(String[]args) {
		
		Scanner teclado=new Scanner(System.in);
		
		
		int[]array_parells=new int[100];
		
		array_parells[0]=0;

		
		for(int i=1;i<array_parells.length;i++) {
		
			array_parells[i]=array_parells[i-1]+2;

		
			
		}
		
		for(int x=0; x<array_parells.length;x++) {
			
			
			
			
			if((x==30)||(x==57)||(x==79)) {
				
				System.out.println("");
				
				
			}else {
				
				System.out.print("-"+array_parells[x]);
				
			}
			
			
			
		}		
		
	
	}
	
}