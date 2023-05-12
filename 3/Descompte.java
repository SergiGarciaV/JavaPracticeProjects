import java.util.Scanner;
public class Descompte {
  public static void main(String[]args){
      Scanner teclat=new Scanner(System.in);
      
      float val,val_tot_desc,val_desc;
      int comp_min=100, desc_max=10;
      
      
      System.out.print("Introdueixi el preu del producte: ");
      System.out.print("\n\n---> ");
      val=teclat.nextFloat();
      
      val_desc=((val*8)/100);
      val_tot_desc=(val-val_desc);
      
    
     if(val<0){
         
         System.out.print("El valor introduït no pot ser negatiu");

        }else{
            if(val<comp_min){
                
                System.out.print("\nEl preu del producte serà = " +val);
                
            }else{
                if((val>=comp_min)&&(val_desc<=10)){
                    
                    System.out.print("El valor total amb descompte es = " + (val_tot_desc));
            
                }else{
                    if(val_desc>10){
                        
                      
                        
                        System.out.print("El valor total amb descompte es = " + (val-desc_max));
                        
                    }
                    
                }
                        
                
            }
            
        }
     
    }
}
