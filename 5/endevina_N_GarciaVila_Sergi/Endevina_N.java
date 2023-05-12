
//Valor correcte --> 7


import java.util.Scanner;

public class Endevina_N{
    
    public static void main(String[]args){
        
        Scanner teclat=new Scanner(System.in);
        
        int n=0, contInt=0;
        
       System.out.print("Comencem el joc.\nEndevina el valor entre 0 i 10 en tres intents.");
        
        
        
        while(n!=7){
            
             System.out.print("\nIntrodueix un valor entre 0 i 10: ");
             n=teclat.nextInt();
            
            contInt++;
                
              if(n==7){
                    
                System.out.print("Correcte!!! Has Guanyat!!");
                
                break;
                
              }else{
                  
                    if(contInt==3){
                
                    System.out.print("S'han acabat els intents..."); 
                
                     break;
                  
                    }else{
                    
                      System.out.print("Intent nº "+contInt+" incorrecte!");
                   }
                
                
               }
            
        }
        
        
    }
        
        
}
    