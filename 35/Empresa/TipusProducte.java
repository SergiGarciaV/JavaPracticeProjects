package Empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class TipusProducte {
	
	private String nom;
	private static int codiIdentificador;
	private int estoc;
	private double preu;
	private boolean aLaVenda;
	private Scanner sc=new Scanner(System.in);
	private static ArrayList<TipusProducte>LlistaProductes=new ArrayList<TipusProducte>();
	
	
	public static void main(String[]arags) {
		
	}
	
	
	public void crearProducte() {
		Encarrec e=new Encarrec();
		TipusProducte p=new TipusProducte();
		
		p.nom=getNom();
		p.preu=getPreu();
		p.estoc=getStoc();
		estoc=p.estoc;//perque no falli el return de Venda.
		p.aLaVenda=getVenda();
		
		
		codiIdentificador++;
		
		LlistaProductes.add(p);
		
		System.out.println("\nProducte creat amb exit:\ncodiId= "+codiIdentificador+"\nNom= "+nom+"\nPreu= "+preu+"\nEstoc= "+estoc+"\nA la venda= "+aLaVenda);
		System.out.println("\n\n\tA- Crear un altre producte\n\n\tB- Tornar enrere");
		char opcio=sc.next().charAt(0);
		sc.nextLine();
		if((opcio=='A')||(opcio=='a')){
			crearProducte();
		}else if((opcio=='B')||(opcio=='b')) {
			e.GestioProducte();
		}
	}
		
	public String getNom(){
		
		System.out.println("\nIntrodueix el nom del producte:");
		nom=sc.nextLine();
		return nom;
		
	}
	
	public int getStoc(){
		
		System.out.println("\nIntrodueixi l'estoc (Si encara no en tenim intro 0):");
		estoc=sc.nextInt();
		return estoc;
	}
	
	public double getPreu(){
		
		System.out.println("\nIntrodueix el preu del producte (euros):");
		preu=sc.nextInt();
		return preu;
	}
	
	public boolean getVenda() {
		
		if(estoc>0) {
			aLaVenda=true;
		}else{
			aLaVenda=false;
		}
		
		return aLaVenda;
	}
	
	
	
	public boolean getEstocSioNo(int IdprodConsulta,int quantitat) {
		
		boolean estoc=true;
		int Id=IdprodConsulta;
		int unitats=quantitat;
		
		for(TipusProducte p:LlistaProductes) {
			
			if((p.estoc>=unitats)&&(p.codiIdentificador==Id)) {
				
				estoc=true;
			}else {
				estoc=false;
			}
		}
		return estoc;
	}
}	