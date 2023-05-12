//package UF2.Examen_v2;

import java.util.Arrays;
import java.util.Scanner;

public class Examen2
{


    public static double[] notes = new double[50];
    public int MARCA_NOTES = -1;
    public int NUM_NOTES = 0;
    public String MARCA_FI = "fi";
    private boolean fi = false;
    public double max = 0;
    public double min = 0;
    public double mitj = 0;


    private final CalculArrays calculador = new CalculArrays();
    private final CercaDicotomica cerca = new CercaDicotomica();
    private final NotaAText transformar = new NotaAText();


    public static void main(String[] args) {
        Examen2 programa = new Examen2();
        programa.inici();
       
    }

    public void inici(){
    	
    	System.out.println("\nBenvinguda al programa d'emmagatzematge i calcul de notes:");
    	
    	PreguntarNotes();
    }


    private void PreguntarNotes() {

        System.out.println("Abans de començar, escriu tantes notes ENTERES com vulguis.");
        System.out.println("\nQuan hagis acabat d'escriure les notes, escriu un -1.");
        System .out.println("--------------------------------------");
        Scanner sc=new Scanner(System.in);
     
        	for(int i =0;i<notes.length;i++) {
        		notes[i]=sc.nextDouble();
        		NUM_NOTES=NUM_NOTES+1;
        		if(notes[i]==-1) { 
        			NUM_NOTES=NUM_NOTES-1;
            		ImprimirArrayNotes();
            	}else if(sc.hasNextDouble()==false){ 
        			NUM_NOTES=0;
            		System.out.print("Alguna de les dades entrades no es un ENTER, torna a començar:\n\n");  
        			PreguntarNotes();																		
        		}
        	}
    }
 
    private void ImprimirArrayNotes() {
    	
    	if(NUM_NOTES==0) {
    		System.out.print("No has introduit cap nota, torna-ho a intentar.\n\n");
    		PreguntarNotes();
    	}
    	System.out.print("L'array de notes avaluat es: [");
    	for(int i=0;i<NUM_NOTES;i++) {
    		System.out.print(notes[i]+", ");
    	}
    	System.out.print("]\n\n");
    	
    	MostrarMenu();
    }


    private void MostrarMenu() {
        System.out.println("\nBenvinguda al calcul de notes de classe.");
        System.out.println("-------------------------------------");
        System.out.println("[MAX] Saber la nota mÃ xima de classe");
        System.out.println("[MIN] Saber la nota mÃ­nima de classe");
        System.out.println("[MIT] Saber la nota mitjana de classe");
        System.out.println("[FI] Sortir.");
        System.out.print("OpciÃ³: ");
        
        TractarOpcio();
    }

    private void TractarOpcio() {
    	
    	Scanner sc=new Scanner(System.in);
        String opcio=sc.next();
        
        
        double []nouArrayNotes=new double[NUM_NOTES];
        
        for(int i=0;i<NUM_NOTES;i++) {
        	
        	nouArrayNotes[i]=notes[i];
        }
        
        double notaPostCalc=0;
        
        
       if(opcio.equalsIgnoreCase("MAX")) {
        	notaPostCalc=calculador.calcularMaxim(nouArrayNotes);
        	
        	
        	
        }else if(opcio.equalsIgnoreCase("MIN")) {
        	notaPostCalc=calculador.calcularMinim(nouArrayNotes);
        	
        	
        }else if(opcio.equalsIgnoreCase("MIT")) {
        	notaPostCalc=calculador.calcularMitjana(nouArrayNotes,NUM_NOTES);
        	
        }else if(opcio.equalsIgnoreCase("FI")){
            
        	sc.close();
            System.out.print("Fins la pròxima!");
        	System.exit(0);
        	
        }else{
             System.out.print("L'opció introduïda es incorrecte, torna-ho a provar\n");
        	MostrarMenu();    
        }  
       
       
       String NotaAcaracter=PrepararSortida(notaPostCalc);
       
       
       ImprimirResultat(notaPostCalc,NotaAcaracter,opcio);
       
    }
    	

    private String PrepararSortida(double valor) {
        
    	String notaAlletres=transformar.notaAText(valor);
    	return notaAlletres;
    }

  
    private boolean MirarSiAlgu8() {
        
    	 double []ArrayOrdenat=new double[NUM_NOTES];
    	 for(int i=0;i<NUM_NOTES;i++) {
         	
         	ArrayOrdenat[i]=notes[i];
         }
    	 Arrays.sort(ArrayOrdenat);
    	 
    	 int Algu8=cerca.cercaDicotomica(ArrayOrdenat, 0, NUM_NOTES-1, 8);
    	
    	boolean trobat=true;
    		
    	if(Algu8!=-1) {
    		
    		trobat=true;
    	}else {
    		
    		trobat=false;
    	}
    	
    	return trobat;
    }

   
    private void ImprimirResultat(double valornota, String text, String opcio) {
    	
    			
        String opcioescollida = "";
        if (opcio.equalsIgnoreCase("MAX")){
            opcioescollida = "màxim";
        }
        else if (opcio.equalsIgnoreCase("MIN")){
            opcioescollida = "mínim";
        }
        else {
            opcioescollida = "mitja ";
        }
        System.out.print("\nEl valor " + opcioescollida +" de l'array que has escrit Ã©s " + valornota);
        System.out.println(" que equival a un " + text + ".\n");
        
       boolean Troba=MirarSiAlgu8();
        
        if(Troba==true) {
        	System.out.println("A més el número 8 es troba dins les notes! Felicitats! ");
        }else {
        	
        	System.out.println("El numero 8 no es troba dins les notes.\n\n");
        }
      
       Examen2 reinici=new Examen2();
       reinici.inici(); 
    }

}


