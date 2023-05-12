import java.util.Scanner;

public class arees_func {
  
  private Scanner teclat;
  private String fig;
  private double area,costat1,costat2,alcada;
 
  public static void main (String args[]){

	  arees_func area=new arees_func();
  	  area.inici();
  	  area.lectValors();
  	  area.exit();
	  }
  
 public void inici(){
      
      System.out.println("\n\nBenvinguda a la calculadora d'arees: \n"+"------------------------------------\n");      
  }
  
  public String lecturaFig(){
      
      teclat=new Scanner(System.in);
      System.out.println("De quina figura vols calcular l'area?\n");
      System.out.println("Tens les segÃƒÂ¼ents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.\n");
      String figura=teclat.nextLine();
      
      return figura;      
      }
  
  public void lectValors(){
      	  
	  this.fig=lecturaFig();
	  
	   
	  if (fig.equals("triangle")){
	    
		costat1=lect_costat_1();
		costat2=lect_costat_2();
	    CalcTriangle(costat1,costat2);
	  }
	
	  else if (fig.equals("quadrat")){
		  
		costat1=lect_costat_1();		 
		CalcQuadrat(costat1);      
	  }
	
	  else if (fig.equals("rectangle")){
		  
		costat1=lect_costat_1();
	    costat2=lect_costat_2();
		CalcRectangle(costat1,costat2);
	  }
	
	  else if (fig.equals("trapezi")){
		
		costat1=lect_costat_1();
		costat2=lect_costat_2();
		alcada=lect_alcada();
		CalcTrapezi(costat1,costat2,alcada);
	  }
	
	  else if (fig.equals("rombe")){
		
		costat1=lect_costat_1();
		costat2=lect_costat_2();
		CalcRombe(costat1,costat2);
	  }
	
	  else if (fig.equals("paralelogram")){
	
		costat1=lect_costat_1();
		costat2=lect_costat_2();
		CalcPara(costat1,costat2);
	  }

	  else if (fig.equals("cercle")){
		
		costat1=lect_costat_1();
		CalcCercle(costat1); 
	  }
  }
  
  public double lect_costat_1() {
	  
	  teclat=new Scanner(System.in);
	  System.out.println("Introdueixi el valor del primer costat / base en triangle / radi en cercle: ");
	  double costat1=teclat.nextDouble();
	  return costat1;
  }
  
  public double lect_costat_2() {
	  
	  teclat=new Scanner(System.in);
	  System.out.println("Introdueixi el valor del segon costat (alcada en triangle): ");
	  double costat2=teclat.nextDouble();
	  return costat2;
	  
  }
  
 public double lect_alcada() {
	  
	  teclat=new Scanner(System.in);
	  System.out.println("Introdueixi el valor de l'alcada: ");
	  double alcada=teclat.nextDouble();
	  return alcada;
	  
  }
  
  public void CalcTriangle(double cost1,double cost2){
       
	   area=(cost1*cost2)/2;
	   resultat(area);   
  }
  
  public void CalcQuadrat(double cost1) {
	   
	    area = Math.pow(cost1, 2);
	    resultat(area);
  }
  
  public void CalcRectangle(double cost1,double cost2) {
	  
	  area=cost1*cost2;
	  resultat(area);
  }
  
  public void CalcTrapezi(double cost1,double cost2,double alc) {
	  
	  area=((cost1+cost2)/2)*alc;
	  resultat(area);
  }
  
  public void CalcRombe(double cost1,double cost2) {
	  
	  area=(cost1*cost2)/2;
	  resultat(area);
  }
  
  public void CalcPara(double cost1,double cost2) {
	  
	  area=cost1*cost2;
	  resultat(area);
  }
  
  public void CalcCercle(double radi) {
	  
	  area = Math.pow(radi, 2)*Math.PI;
	  resultat(area);
  }
  
  public void resultat(double areafin){
      
      System.out.print("\n\nL'area del "+fig+" es= "+areafin);     
  }
  
  public void exit() {
	  
	  System.out.println("\n\nFins la proxima!");
	  System.exit(0);
	  
  }
  
}