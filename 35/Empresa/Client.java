package Empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {

	private String nom;
	private String adreca;
	private String telefon;
	private String email;
	private int numClient=0;
	private Scanner sc=new Scanner(System.in);
	private static ArrayList<Client>LlistaClients=new ArrayList<Client>();
	
	
	public static void main(String[]args) {
		
	}
	
	
	public void crearClient(){
		
		Client client=new Client();
		
		numClient++;
		System.out.println("\nA continuació hauras d'introduïr unes dades per tal de poder crear un nou client:\n\n");
		
		client.nom=getNom();
		client.adreca=getAdreca();
		client.telefon=getTelefon();
		client.email=getEmail();
		client.numClient=numClient;
		
		
		LlistaClients.add(client);
		System.out.println("\nEl client  ha estat creat, amb les seguents dades:\n\n\t- Codi client="+numClient+"\n\t- Nom="+nom+"\n\t- Adreça="+adreca+"\n\t- Telefon="+telefon+"\n\t- Email="+email);
		System.out.println("\nHi ha un total de "+LlistaClients.size()+" clients\n\n");
		OpcioFinClients();
	}
	
	public String getNom() {
		
		System.out.println("Introdueixi un nom per al client:");
		nom=sc.nextLine();
		return nom;
	}
	
	public String getAdreca() {
		
		System.out.println("Introdueixi una adreça per al client:");
	    adreca=sc.nextLine();
		return adreca;
	}
	
	public String getTelefon() {
		
		System.out.println("Introdueixi un telèfon per al client:");
        telefon=sc.nextLine();
        return telefon;
	}
	
	public String getEmail() {
		
		System.out.println("Introdueixi un email per al client:");
		email=sc.next();
		return email;
	}
	
	public void getPrintClients(){
		
		Sucursal sucursal=new Sucursal();
		System.out.println("\nEl llistat de tots el clients registrats es:\n");
		
		for(Client client:LlistaClients) {
			
			System.out.println("\nNom= "+client.nom+"\nAdreça= "+client.adreca+"\nTelefon= "+client.telefon+"\nE-mail= "+client.email+"\nCodi client= "+client.numClient);
			
		}
		System.out.println("Prem INTRO per a tornar enrere...");
		sc.nextLine();
		sucursal.Client();
	}
	
	
	
	public int getCliEncarrec(){
	
		int codi;
		
		System.out.println("\nRevisa la llista de clients existents per a introduir el codi del comprador:\n");
		
		for(Client client:LlistaClients) {
			
			System.out.println("\nNom= "+client.nom+"\nAdreça= "+client.adreca+"\nTelefon= "+client.telefon+"\nE-mail= "+client.email+"\nCodi client= "+client.numClient);
		}
		System.out.println("\nIntrodueix el codi de client que ha fet l'encàrrec= ");
		codi=sc.nextInt();
		return codi;
		
		
	}
	
	public void OpcioFinClients() {
		
		 Sucursal sucursal=new Sucursal();
		    System.out.println("Selecciona l'opció:\n\n\tA- Introduir un altre client.\n\tB- Tornar al menú principal.");
	
			char opcio=sc.next().charAt(0);
			
			if((opcio=='A')||(opcio=='a')){
			    sc.nextLine();
			    crearClient();
			    
			}else if((opcio=='B')||(opcio=='b')){
			    
			    sucursal.inici();
			    
			}else{
			    
			    OpcioFinClients();
			}
		    
		}
		
	}