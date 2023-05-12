package Empresa;

import java.util.Scanner;

public class Sucursal {

private String nom;
private String adreca;
private String telefon;
private String email;
	
	private Scanner sc=new Scanner(System.in);
	
	private final Client client=new Client();
	private final Transportista transportista=new Transportista();
	private final Encarrec enc=new Encarrec();
	public static void main(String[]args) {
		
		Sucursal programa=new Sucursal();
		
		programa.inici();
			
	}
	
	public void inici() {
		
		System.out.println("\nBenvinguda al programa, selecciona l'Area sobre la que vols interaccionar:\n\n\tA- Transportista\n\n\tB- Client\n\n\tC- Encarrec\n\n\tD- Productes\n\n\tE- SORTIR\n");
		char opcio=sc.next().charAt(0);
		
		
		if((opcio=='A')||(opcio=='a')) {
			Transportista();
		}else if((opcio=='B')||(opcio=='b')) {
			Client();
		}else if((opcio=='C')||(opcio=='c')) {
			Encarrec();
		}else if((opcio=='D')||(opcio=='d')) {
			Producte();
		}else if((opcio=='E')||(opcio=='e')){
			System.out.print("Fins aviat!");
			System.exit(0);
		}else{
			System.out.print("No has introduÃ¯t un valor correcte per a triar l'opciÃ³, torna-ho a intentar.");
			inici();
		}
	}
	
	public void Transportista() {
	
		System.out.println("Benvinguda a la GestiÃ³ de Transportistes:\n\n\tA- Descans transportista\n\n\tB- Treballa transportista\n\n\tC- Intro nou transportista\n\n\tD- Llistat de tots els transportistes\n\n\tE- Llistat de transportistes treballant\n\n\tF- *****Tornar enrere*****");
		char opcio=sc.next().charAt(0);
		
		if((opcio=='A')||(opcio=='a')) {
			transportista.descans();
		}else if((opcio=='B')||(opcio=='b')) {
			Client();
		}else if((opcio=='C')||(opcio=='c')) {
			transportista.crearTransportista();
		}else if((opcio=='D')||(opcio=='d')) {
			transportista.printTransportistes();
		}else if((opcio=='E')||(opcio=='e')) {
			transportista.printTransTrebActiu();
		}else if((opcio=='F'||opcio=='f')){
		    inici();
		}else{
		    System.out.print("No has introduÃ¯t un valor correcte per a triar l'opciÃ³, torna-ho a intentar.");
			Transportista();
		}
		
		
	}
	
	public void Client() {
		
		System.out.print("Benvinguda a la GestiÃ³ de clients/es:\n\n\tA- Alta client\n\tB- Baixa client\n\tC- Veure llistat de tots els clients\n\tD- *****Tornar enrere*****\n");
		char opcio=sc.next().charAt(0);
		
		if((opcio=='A')||(opcio=='a')) {
			client.crearClient();
		}else if((opcio=='B')||(opcio=='b')) {
			Client();
		}else if((opcio=='C')||(opcio=='c')){
			client.getPrintClients();
		}else if((opcio=='D')||(opcio=='d')){
			inici();
		}else {
			System.out.print("No has introduit un valor correcte per a triar l'opció, torna-ho a intentar.");
			inici();
		}
		
		
	}
	
	public void Encarrec() {
		
		System.out.println("Benvinguda a la Gestio d'Encarrecs:\n\n\tA- Alta Encarrec\n\tB- Anular Encarrec");
		char opcio=sc.next().charAt(0);
		
		if((opcio=='A')||(opcio=='a')){
		    setDadesEncarrec();
		    
		    
		}else if((opcio=='B')||(opcio=='b')) {
			
			System.out.println("Introdueixiel num d'encàrrec a eliminar:\n"); //FALTA CODI*************************************************************************
		
		}
		
	}
	
	
	public void Producte() {
		
		
		enc.GestioProducte();
		
	}
	
	public void setDadesEncarrec() {
		
		System.out.println("\n\n----------Benvinguda al programa d'alta per a encàrrecs----------");
	 
		System.out.println("\nDades ENCARREC:\n\nCodi client= "+setCliEnc()+"\nNum Encarrec= "+setNumAltaEnc()+" Efectuat el "+enc.getDia()+"/"+enc.getMes()+"/2023 a les"+enc.getHora()+
				":"+enc.getMin()+"\nID transportista asignat= "+setTranspEnc()+"\nCodi producte= "+enc.getIdProducteEnc()+"\nQuantitat= "+enc.getQuantitatProdEnc());
		
		int valorNul=enc.IdprodEnc;
		if(valorNul==00) {
			
			System.out.print("Atencio L'encàrrec no es podrà efectuar per a falta d'estoc, contacti amb el client");
		}
	}
	
	public int setCliEnc() {
		
		int codiClient=client.getCliEncarrec();
		
		return codiClient;
	}
	
	public int setNumAltaEnc() {
		
		int AutoNumEnc=enc.getNumAltaEnc();
		
		return AutoNumEnc;
	}
	
	public int setTranspEnc() {
		
		int IdTranspDisp=transportista.getAutoTranspEnc();
		
		return IdTranspDisp;
	}
	
}
		
		
	
	
	
