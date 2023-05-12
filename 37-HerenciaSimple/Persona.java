 
package HerenciaSimple;

public class Persona {

	protected int id;
	protected int edat;
	protected String nom;
	protected String cognom;
	protected String adreça;

	public Persona() {

	}

	public Persona(int id,int edat,String nom,String cognom, String adreça) {

		this.id=id;
		this.edat=edat;
		this.nom=nom;
		this.cognom=cognom;
		this.adreça=adreça;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public int getEdat() {
		return edat;
	}
	public void setEdat(int edat) {
		this.edat = edat;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getCognom() {
		return cognom;
	}
	public void setCognom(String cognom) {
		this.cognom = cognom;
	}


	public String getAdreça() {
		return adreça;
	}
	public void setAdreça(String adreça) {
		this.adreça = adreça;
	}



}
