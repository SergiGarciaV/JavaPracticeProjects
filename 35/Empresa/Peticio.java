package Empresa;
import java.util.Scanner;

public class Peticio {
	private int quantitat;
	private Scanner sc=new Scanner(System.in);
	
	private final TipusProducte tp=new TipusProducte();
	
	public static void main(String[]args) {
		
	}
	
	public int getProdEnc(){
		
		System.out.println("Introdueixi l'ID del producte a encarregar, un tipus de producte per encàrrec:\n"); //de moment un a modificar per varies entrades.
		int prodEnc=sc.nextInt();
		System.out.println("Introdueixi ara la quantitat:\n");
		quantitat=sc.nextInt();
		boolean estoc=tp.getEstocSioNo(prodEnc,quantitat);
		
		if(estoc==false) {
			prodEnc=00;
		}
		
		return prodEnc;
	}
	
	public int getQuantitat() {
		
		return quantitat;
	}
	
	
	
}
