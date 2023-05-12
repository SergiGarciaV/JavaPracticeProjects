import java.util.Scanner;
public class Main{
	
	char opcio;
	Scanner sc=new Scanner(System.in);
	CalculEnter calculInt=new CalculEnter();
	CalculReal calculDoub=new CalculReal();
	FabricaArrays array=new FabricaArrays();
    
    public static void main(String[]args){
        
    Main programa=new Main();
    programa.inici();   
    programa.fi();
    }
    
    public void inici(){
                    
        System.out.println("\nIndiqui sobre quin tipus de valor voldra realitzar calculs:\n\n\tA=ENTERS\tB=REALS\n");
        opcio=sc.next().charAt(0);
        
        if(opcio=='A'){       	
        	calculsEnter();       
        }else if(opcio=='B') {        	
        	calculsReal();       	
        }else{	         	         
	         System.out.println("\nNo ha introduit un valor correcte, torni-ho a intentar:");
	         inici();
	     }        
    }
    
    public void calculsEnter() {   	
    	
    	         System.out.println("Ha triat l'array d'ENTERS.\n\nQuin calcul vols realitzar?\n\nA=MAXIM\tB=MINIM\tC=MITJA");
    	         opcio=sc.next().charAt(0);
    	         
    	         if(opcio=='A') {    	        	 
    	        	 calculsEnterMAX();    	        	     	        	 
    	         }else if(opcio=='B') {
    	        	 calculsEnterMIN();
    	         }else if(opcio=='C') {
    	        	 calculsEnterMITJ();
    	         }else {
    	        	 System.out.println("\nNo ha introduit un valor correcte, torni-ho a intentar:");
    	        	 calculsEnter();
    	         }
    }    	             	             	         
    public void calculsEnterMAX() {
    	
    	int MAX=calculInt.calcularMaxim(array.arrayEnter());
    	System.out.println("El nombre més elevat que conte l'array es= "+MAX);
    }
    
    public void calculsEnterMIN() {
    	
    	int MIN=calculInt.calcularMinim(array.arrayEnter());
    	System.out.println("El nombre mes baix que conte l'array es= "+MIN);
    }
    
    public void calculsEnterMITJ() {
    	
    	int MIT=calculInt.calcularMitjana(array.arrayEnter());
    	System.out.print("El valor corresponent a la mitjana de l'array es= "+MIT);    	
    }
    
    	
    public void calculsReal() {	         
         
    	 System.out.println("Ha triat l'array de REALS.\n\nQuin calcul vols realitzar?\n\n\tA=MAXIM\tB=MINIM\tC=MITJA");
         opcio=sc.next().charAt(0);
         
         if(opcio=='A') {    	        	 
        	 calculsRealMAX();    	        	     	        	 
         }else if(opcio=='B') {
        	 calculsRealMIN();
         }else if(opcio=='C') {
        	 calculsRealMITJ();
         }else {
        	 System.out.println("\nNo ha introduit un valor correcte, torni-ho a intentar:");
        	 calculsReal();
         }
}  
    
    public void calculsRealMAX() {

		double MAX=calculDoub.calcularMaxim(array.arrayReal());
		System.out.println("El nombre més elevat que conte l'array es= "+MAX);
		}

    public void calculsRealMIN() {

		double MIN=calculDoub.calcularMinim(array.arrayReal());
		System.out.println("El nombre mes baix que conte l'array es= "+MIN);
		}

    public void calculsRealMITJ() {

		double MIT=calculDoub.calcularMitjana(array.arrayReal());
		System.out.print("El valor corresponent a la mitjana de l'array es= "+MIT);    	
		}
    
    public void fi() {
    	
    	System.out.println("Si vols tornar a comencar prem S , si vols sortir del programa prem N");
    	opcio=sc.next().charAt(0);
    	
    	if(opcio=='S') {
    		inici();
    	}else if(opcio=='N') {
    		System.exit(0);
    	}else {
    		System.out.println("No has introduit cap opcio valida, torna-ho  a provar");
    		fi();
    	}
    	
    }
        
        
}