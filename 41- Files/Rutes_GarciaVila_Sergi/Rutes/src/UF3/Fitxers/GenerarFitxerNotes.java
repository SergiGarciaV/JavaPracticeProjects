package UF3.Fitxers;
import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class GenerarFitxerNotes {
	//la paraula fi serveix com a marca de final de fitxer
	public static final String MARCA_FI = "fi";
	public static void main (String[] args) {
	GenerarFitxerNotes programa = new GenerarFitxerNotes();
	programa.inici();
	}
	public void inici() {
		try {
			File f=new File("Notes.txt"); //Fitxer d'on llegirem les dades
			File f2 = new File("NotaMitja.txt"); //Fitxer on escriurem les dades un cop processades. 
			Scanner lector = new Scanner(f);
			PrintStream escriptor=new PrintStream(f2);
			
			boolean llegir = true;
			while (llegir) {
				String nom = lector.next();
				escriptor.print(nom+" ");
				if (MARCA_FI.equals(nom)) {
					llegir = false;
				}
				else {
					escriptor.print(lector.next()+" "); //No cal crear variable cognón ja que usem un sol cop el salt de caràcter ".next" 
					//Noteu com un scanner es pot passar com paràmetre
					double mitjana = llegirNotes(lector);
					escriptor.println("La mitja es="+mitjana);
					escriptor.println();
				}
			}
			//Cal tancar el fitxer
			escriptor.close();
		}
		catch(Exception e) {
			//Excepció!
			System.out.println("Error llegint estudiants: " + e);
		}
	}

	/** Donat un Scanner en un fitxer quan l’apuntador es troba sobre l’inici
	* de les notes, s’extreuen i es calcula la mitjana.
	*
	* @param lector Scanner a processar
	* @return Mitjana de notes
	*/
	public double llegirNotes(Scanner lector) {
		double res = 0;
		int numNotes=0;
		boolean numFi=true;
		
		try {
			while(numFi) {
				double nota=lector.nextDouble();
				if(nota==-1) {	
				numFi=false;
				}else{			
					res = res + nota;
					numNotes++;
				 }
			}
		}catch (Exception e) {
			//Excepció!
			System.out.println("Error llegint notes: " + e);
			}
		res = res/numNotes;
		return res;
	}
}
