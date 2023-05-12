public class cerca{

	public static void main(String[]args){
				
		float [] arrayuno={3f,5.5f,7f,10f,4.9f,8f,8.5f,7f,6.6f,5f,9f,7f};
		int i=0;
		boolean susp=false;

		while(i<arrayuno.length){
			
			if(arrayuno[i]<5){

				susp=true;
				break;
			}
			
			i=i+1;
		}
		
		if(susp) {
			
			System.out.print("Hi ha suspesos");

		}else {
			
			System.out.print("No hay suspesos");
		}
	}
}