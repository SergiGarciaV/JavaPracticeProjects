package Empresa;

import java.util.ArrayList;
import java.util.Scanner;


public class Transportista {
	

	private String nom;
	private String telefon;
	private String numLlicencia;
	private int idTrans=0;
	private boolean transpEncActiu;
	private String jornada;
	private Scanner sc=new Scanner(System.in);
	private static ArrayList<Transportista>LlistaTransportistes=new ArrayList<Transportista>();
	
	public static void main(String[]args) {
		
	}
	
	public void crearTransportista() {		
		
		    Transportista transportista=new Transportista();
			
			System.out.println("\nA continuació hauras d'introduïr unes dades per tal de poder crear un nou Transportista:\n\n");
		
			transportista.nom=getNom();
			transportista.numLlicencia=getnumLlicencia();
			transportista.telefon=getTelefon();
			transportista.jornada=getJornada();
			transportista.transpEncActiu=false;
			idTrans++;
			
			LlistaTransportistes.add(transportista);
			
			System.out.println("\nEl Transportista  ha estat creat, amb les seguents dades:\n\n\t- ID= "+idTrans+"\n\t- NumLlicencia="+numLlicencia+"\n\t- Nom="+nom+"\n\t- Telefon="+telefon+"\n\t- Jornada de treball="+jornada);
			System.out.println("\nHi ha un total de "+LlistaTransportistes.size()+" transportistes\n\n");
			
			OpcioFiMenuTransp();
		}

		public String getNom() {
			
			System.out.println("Introdueixi un nom per al transportista:");
			nom=sc.nextLine();
			return nom;
		}
		
		public String getTelefon() {
			
			System.out.println("Introdueixi un telèfon per al transportista:");
	        telefon=sc.next();
	       
	        return telefon;
		}
		
		public String getnumLlicencia() {
			
			System.out.println("Introdueixi un num.Llicencia per al transportista:");
	        numLlicencia=sc.next();
	        
	        
	        return numLlicencia;
		}
	
		public String getJornada() {
		sc.nextLine();
		System.out.println("Introdueixi el torn de treball del transportista:  0=Matí   1=Tarda");
		int torn;
		
		do {
			
			String teclat=sc.nextLine();
			
			if (teclat.equals("0")) {
				
				torn=0;
				jornada="Mati";
				
			}else if(teclat.equals("1")){
				
				torn=1;
				jornada="Tarda";
				
			}else {
				
				System.out.print("No has introduit un valor valid, torna-ho a provar:");
				torn=-1;
				
			}
			
		}while((torn!=0)&&(torn!=1));
				
			return jornada;
		}
		
		
		public void descans(){
		    
		    System.out.println("Llistat de transportistes disponibles:\n introdueixi l'ID del transportista al que vol donar descans:\n\n");
		    for(Transportista transportista: LlistaTransportistes) {
		    	
		    	//FALTA CODI *****************************************************************************
		    	
		    }
		    
		}
		
		public void printTransportistes(){
		    
			Sucursal sucursal=new Sucursal();
			
		    System.out.println("Llistat de tots els transportistes registrats:\n\n");
		    
		    for(Transportista transportista: LlistaTransportistes){
		    
		    System.out.println("\t- Nom= "+transportista.nom+"\n\t- Num Llicencia= "+transportista.numLlicencia+"\n\t- Telefon= "+transportista.telefon+"\n\t- Id Transportista= "+idTrans++);
		    }		
		    System.out.println("Prem INTRO per a tornar enrere...");
			sc.nextLine();
			sucursal.Transportista();
		    
		}
		
		public void printTransTrebActiu(){
		    
			Sucursal sucursal=new Sucursal();
			 System.out.println("Llistat de transportistes amb encarrec ACTIU\n ");
			 
			 
		    		
				 for(Transportista transportista: LlistaTransportistes) {
				    		
					 if (transportista.transpEncActiu=true) {
						 
						 System.out.print(transportista.nom+"\nID= "+transportista.idTrans+"ENCARREC ACTIU"); 
				    }
		    	
				}   

				System.out.println("Prem INTRO per a tornar enrere...");
				sc.nextLine();
				sucursal.Transportista();
		}
		
		
		public void printTransTrebEspera(){
			Sucursal sucursal=new Sucursal();
			
			 System.out.println("Llistat de transportistes amb encarrec PENDENT\n ");
		    		
				 for(Transportista transportista: LlistaTransportistes) {
				    		
					 if (transportista.transpEncActiu=false) {
						 
						 System.out.print(transportista.nom+"\nID= "+transportista.idTrans+"ENCARREC PENDENT"); 
				    }
		    	}
				System.out.println("Prem INTRO per a tornar enrere...");
				sc.nextLine();
				sucursal.Transportista();
		}
		
		
		public int getAutoTranspEnc(){
			
			Sucursal suc=new Sucursal();
			int transpLliure=0;
			boolean trobat=false;
			
			do {
			for(Transportista transportista: LlistaTransportistes ) {
				if (transportista.transpEncActiu==false) {
					transpLliure=transportista.idTrans; 
					transportista.transpEncActiu=true; //el transportista que estaba en espera pasa a estar en actiu. 
					trobat=true;
				}else {
					System.out.println("No hi ha transportistes lliures, contacti amb el gerent perquè en contracti mes!!!!!!!\n");
					suc.inici();
				}
			}
			}while(trobat!=true);
			
			return transpLliure;
		}
		
		public void OpcioFiMenuTransp(){
		    
		    Sucursal sucursal=new Sucursal();
		    System.out.println("Selecciona l'opció:\n\n\tA- Introduir un altre transportista.\n\tB- Tornar al menú principal.");
	
			char opcio=sc.next().charAt(0);
			
			if((opcio=='A')||(opcio=='a')){
			    sc.nextLine();
			    crearTransportista();
			    
			}else if((opcio=='B')||(opcio=='b')){
			    
			    sucursal.inici();
			    
			}else{
			    
			    OpcioFiMenuTransp();
			}
		    
		}
		
		
}