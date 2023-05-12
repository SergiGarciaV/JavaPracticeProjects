public class Figures {
	
	private int costat1,costat2,costat3;
	private double radi;
	private String color;
		
		public Figures(int costat1, int costat2,int costat3, double radi, String color) {
			
			this.costat1=costat1;
			this.costat2=costat2;
			this.costat3=costat3;
			this.radi=radi;
			this.color=color;
		}	
			
			public static void main(String[]args) {
				
				Figures Quadrat1=new Figures(3,0,0,0,"vermell");
				Figures Triangle1=new Figures(4,4,3,0,"verd");
				Figures Cercle1=new Figures(0,0,0,2.5,"blau");
				
				System.out.println("Els parametres del Quadrat1 son:\nColor= "+Quadrat1.color+"\tCostat="+Quadrat1.costat1+"\n");
				System.out.println("Els parametres del Triangle1 son:\nColor= "+Triangle1.color+"\tCostat1="+Triangle1.costat1+"  Costat2="+Triangle1.costat2+"  Costat3="+Triangle1.costat3+"\n");
				System.out.println("Els parametres del Cercle1 son:\nColor= "+Cercle1.color+"\tRadi="+Cercle1.radi+"\n");
				
				
			}
}
