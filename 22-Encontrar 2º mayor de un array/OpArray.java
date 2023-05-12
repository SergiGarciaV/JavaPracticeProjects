import java.util.Scanner;
import java.util.Arrays;

public class OpArray {
	    
	    private Scanner teclat;
	    private int vecLength=0;
	    
	    
	    public static void main(String[]args){
	        
	        OpArray cerca2nMajor=new OpArray();
	        cerca2nMajor.introArrayLength();
	        cerca2nMajor.lec2nGran();
	    }
	    
	    public void introArrayLength(){
	        
	        teclat=new Scanner(System.in);
	        System.out.println("Introdueixi el nombre de valors que voldra introduir a l'array: ");
	        vecLength=teclat.nextInt();
	        }
	       
	    
	    public int[] valorsIni(){
	        
	        int arrayIni[]=new int [vecLength];
	        
	        System.out.println("A continuacio hauras d'introduir els diferents valors per a l'array, no repeteixis valors: ");
	        
	        for(int j=0;j<arrayIni.length;j++){
	            
	            System.out.print("Introdueixi el valor nº "+(j+1)+" =");
	            arrayIni[j]=teclat.nextInt();
	        }
	        
	        System.out.print("L'array creat es: [");
	        
	        for(int t=0;t<arrayIni.length;t++){
	            
	            System.out.print(" "+arrayIni[t]+" ,");
	        }
	        
	        System.out.print("]\n");
	        
	        return arrayIni;
	    }
	    
	    
	    public void lec2nGran(){	        
	      
	      int arrayIni1[]=valorsIni();
	      
	      int x=0;
	      
	      Arrays.sort(arrayIni1);	      	     
	      	      	    	  	      	      	      	     	      
	      System.out.print("L'array ordenat queda aixi: [ ");
	      
	      for(int i=0;i<arrayIni1.length;i++){
	          
	            System.out.print(arrayIni1[i]+" , ");
	      }	      
	     System.out.print(" ]\n");
	 	     	  	     	    	   
	    	   for (int i=arrayIni1.length-1;i>0;i--) {
			    	  
		 		    if(arrayIni1[i]!=arrayIni1[i-1]) {		 		    	 
		 		    			 		    	
		 		    	x=arrayIni1[i-1];
		 		    	System.out.print("Per tant el 2n valor mes gran que conte l'array es= "+x);
		 		    	break;
		 		    	
		 		    }else {
		 		    	System.out.println("Valor a posicio "+i+" es igual que el posterior");	 		    		 		    	 		 		    		
		 		    }
		    	 }		      	    	   	    	   
	       }	    	 	    	 	     	    	 
	    	 	    	 
}
	     