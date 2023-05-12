public class EscriureEstrelles {
	
	int estrellar=0;
	
	public void inici() {
		
		estrellar(4);
		estrellar(10);
		estrellar(20);
		estrellar(10);
		estrellar(20);
		estrellar(10);
		estrellar(20);
		estrellar(10);
		estrellar(20);
		estrellar(10);
		estrellar(20);
		
	}
	
	
	public int estrellar(int x) {
		
		System.out.println("");
		
		for (estrellar=0;estrellar<x;estrellar++) {
			
			System.out.print("*");
			
		}
		
		return estrellar;
		
	}

	public static void main(String[]args) {
		
		EscriureEstrelles estrelles=new EscriureEstrelles();
		estrelles.inici();
		
	}
	
}
