public class Figures1 {

	
	private int costat1,costat2,costat3;
	private double radi;
	private String color;
	
	public static void main(String[]args) {
		
		//Creem objectes
		Figures1 Quadrat1=new Figures1();
		Figures1 Quadrat2=new Figures1();
		Figures1 Triangle1=new Figures1();
		Figures1 Triangle2=new Figures1();
		Figures1 Cercle1=new Figures1();
		Figures1 Cercle2=new Figures1();
		
		//declarem els paràmetres de cada objecte en el Main
		Quadrat1.color="Vermell";
		Quadrat1.costat1=3;
		Triangle1.color="Verd";
		Triangle1.costat1=4;
		Triangle1.costat2=4;
		Triangle1.costat3=3;
		Cercle1.radi=2.5;
		Cercle1.color="blau";
		
		//llegim valors dels paràmetres per a cada objecte
		System.out.println("Des del Main:  Quadrat1-->Costat="+Quadrat1.costat1+"  Color="+Quadrat1.color);
		System.out.println("Des del Main:  Triangle1-->Costat1="+Triangle1.costat1+"  Costat2="+Triangle1.costat2+"  Costat3="+Triangle1.costat3+"  Color="+Triangle1.color);
		System.out.println("Des del Main:  Cercle1-->radi="+Cercle1.radi+"  Color="+Cercle1.color);
		
		
		
		
		
		Quadrat2.valorsQuad(3,"vermell");
		Triangle2.valorsTri(4,4,3,"verd");
		Cercle2.valorsCercle(2.5,"blau");
		
	}
	
	public void valorsQuad(int costat,String color) {
		
		this.costat1=costat;
		this.color=color;
		
		System.out.println("\nDes d'un métode:  quadrat2-->Costat="+costat+"  Color="+color);
		
	}
	
	public void valorsTri(int costat1, int costat2,int costat3,String color){
	    
	    this.costat1=costat1;
	    this.costat2=costat2;
	    this.costat3=costat3;
	    this.color=color;
	    
	    System.out.println("Des d'un métode:  triangle2-->Costat1="+costat1+"  Costat2="+costat2+"  Costat3="+  costat3+"  Color="+color);
	}
	
	public void valorsCercle(double radi,String color) {
		
		this.radi=radi;
		this.color=color;
	
		System.out.println("Des d'un métode:  cercle2-->radi="+radi+"  Color="+color);
	}
	
	
}