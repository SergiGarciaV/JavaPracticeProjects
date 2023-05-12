 
package HerenciaSimple;

public class Estudiant extends Persona{

	private int curs;
	private String assignatures;
	private String escola;
	private int notes;

	public Estudiant() {
	}

	public Estudiant(int curs,String assignatures, String escola, int notes, int id, int edat, String nom, String cognom, String adreça) {

		this.curs=curs;
		this.assignatures=assignatures;
		this.escola=escola;
		this.notes=notes;
		this.id=id;
		this.edat=edat;
		this.nom=nom;
		this.cognom=cognom;
		this.adreça=adreça;



	}

	public int getCurs() {
		return curs;
	}
	public void setCurs(int curs) {
		this.curs = curs;
	}


	public String getAssignatures() {
		return assignatures;
	}
	public void setAssignatures(String assignatures) {
		this.assignatures = assignatures;
	}


	public String getEscola() {
		return escola;
	}
	public void setEscola(String escola) {
		this.escola = escola;
	}


	public int getNotes() {
		return notes;
	}
	public void setNotes(int notes) {
		this.notes = notes;
	}


}
