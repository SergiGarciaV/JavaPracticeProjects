 
package Societat;
import Persona.Persona;

public class Societat {

	public static void main(String[]args) {

		Persona p1=new Persona("33333876V","Marina",26);
		p1.visualitzar();

		Persona p2=new Persona("44444444E","Sergi");
		p2.setEdat(37);
		p2.visualitzar();

		Persona p3=new Persona("12121212Q");
		p3.setEdat(66);
		p3.setNom("Joel");
		p3.visualitzar();

		Persona p4=new Persona();
		p4.setEdat(19);
		p4.setNom("Ana");
		p4.setDni("55444444Y");
		p4.visualitzar();

	}


}
