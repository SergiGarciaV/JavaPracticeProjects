 
package HerenciaSimple;

public class Programa {



	public static void main(String[]args) {

		Persona persona1=new Persona(0001,35,"Sergi","Garcia","C/ Ample, 13"); //Amb constructor.
		Persona persona2=new Persona();

		Estudiant estudiant1=new Estudiant(2023,"Programacio","Prat",8,0003,39,"Pere","Miró","C/ Perpendicular, 22"); //Amb constructor.
		Estudiant estudiant2=new Estudiant();

		persona2.setId(0002);
		persona2.setEdat(33);              //Amb Setters
		persona2.setNom("Josep");
		persona2.setCognom("Sales");
		persona2.setAdreça("C/ Estret, 9");


		estudiant2.setId(0004);
		estudiant2.setEdat(36);
		estudiant2.setNom("Amelia");
		estudiant2.setCognom("Berenguer");		//Amb Setters
		estudiant2.setAdreça("C/ Lineal, 88");
		estudiant2.setCurs(2022);
		estudiant2.setAssignatures("BBDD");
		estudiant2.setEscola("Escola Industrial");
		estudiant2.setNotes(9);




		System.out.println("Persona1:\n----------");
		System.out.println("id= "+persona1.getId());
		System.out.println("Edat= "+persona1.getEdat());
		System.out.println("Nom= "+persona1.getNom());
		System.out.println("Cognom= "+persona1.getCognom());
		System.out.println("Adreça= "+persona1.getAdreça());

		System.out.println("\nPersona2:\n----------");
		System.out.println("id= "+persona2.getId());
		System.out.println("Edat= "+persona2.getEdat());
		System.out.println("Nom= "+persona2.getNom());
		System.out.println("Cognom= "+persona2.getCognom());
		System.out.println("Adreça= "+persona2.getAdreça());

		System.out.println("\nEstudiant1:\n----------");
		System.out.println("id= "+estudiant1.getId());
		System.out.println("Edat= "+estudiant1.getEdat());
		System.out.println("Nom= "+estudiant1.getNom());
		System.out.println("Cognom= "+estudiant1.getCognom());
		System.out.println("Adreça= "+estudiant1.getAdreça());
		System.out.println("Curs= "+estudiant1.getCurs());
		System.out.println("Assignatura= "+estudiant1.getAssignatures());
		System.out.println("Escola= "+estudiant1.getEscola());
		System.out.println("Nota= "+estudiant1.getNotes());

		System.out.println("\nEstudiant2:\n----------");
		System.out.println("id= "+estudiant2.getId());
		System.out.println("Edat= "+estudiant2.getEdat());
		System.out.println("Nom= "+estudiant2.getNom());
		System.out.println("Cognom= "+estudiant2.getCognom());
		System.out.println("Adreça= "+estudiant2.getAdreça());
		System.out.println("Curs= "+estudiant2.getCurs());
		System.out.println("Assignatura= "+estudiant2.getAssignatures());
		System.out.println("Escola= "+estudiant2.getEscola());
		System.out.println("Nota= "+estudiant2.getNotes());
	}


}
