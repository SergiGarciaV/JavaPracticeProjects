package Empresa;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Encarrec {
	
	private Scanner sc=new Scanner(System.in);
	private int mes, dia, hora, minuts;
	private static int numEncarrec=0;
	LocalDateTime dataActual= LocalDateTime.now();
	public static int IdprodEnc;
	
	private final Peticio pet=new Peticio();
	
	public static void main(String[]Args) {
		
		
	}
		
	public int getNumAltaEnc(){
	    
	    numEncarrec++;
	    
	    return numEncarrec;
	}
	
	
	public int getMes() {
		
		mes=dataActual.getMonthValue();
		
		return mes;
	}
	
	public int getDia() {
		
		dia=dataActual.getDayOfMonth();
		
		return dia;
	}

	public int getHora() {
	
		hora=dataActual.getHour();
		
		return hora;
}

	public int getMin() {
	
		minuts=dataActual.getMinute();
		
		return minuts;
}
	
	public void GestioProducte() {
		
		Sucursal suc=new Sucursal();
		TipusProducte t=new TipusProducte();
		System.out.print("Benvinguda a la gestio de Productes\n\n\tA- Alta producte nou\n\n\tB- Afegir producte a un encarrec\n\n\tC- Eliminar producte d'un encarrec\n\n\tD: Tornar al Menu Principal");
		char opcio=sc.next().charAt(0);
		
		if((opcio=='A')||(opcio=='a')) {
			t.crearProducte();
		}else if((opcio=='B')||(opcio=='b')) {
			getIdProducteEnc();
				
			}else if((opcio=='D')||(opcio=='d')){
				suc.inici();
				
		/*}else if((opcio=='C')||(opcio=='c')) {//Acabar Opcio******************************************************************************
			
	}
	*/
		}
	}
		
	public int getIdProducteEnc(){
		
		IdprodEnc=pet.getProdEnc();
		
		return IdprodEnc;
	}
	
	public int getQuantitatProdEnc() {
		
		int quants=pet.getQuantitat();
		
		return quants;
	}

		
}
