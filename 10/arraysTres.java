

public class arraysTres {
	
		
	public static void main(String[]args) {
			
		float arrayseg[]={2f,5.5f,9f,10f,4.9f,8f,8.5f,7f,6.6f,5f,9f,7f};
			
		float num_major=arrayseg[0];
			
		for(int i=0;i<arrayseg.length;i++) {
				
			if(arrayseg[i]>num_major) {
					
				num_major=arrayseg[i];	
			}	
		}

			System.out.print("La nota més alta es: "+num_major);

		}
		
}



