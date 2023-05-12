import java.util.Scanner;

public class multiples{
    
    public static void main(String[]args){
        
        Scanner teclat=new Scanner(System.in);
        
        
        int x,y=0,suma=0; 
        
        
        System.out.print("Fins a quin valor vols sumar múltiples de 3?  ");
        x=teclat.nextInt();
        
        while(y<=x){
            
            System.out.println("Afegim "+y+"...");
            
            suma=suma+y;
            y=y+3;
            
        }
        
        System.out.print("El resultat final es "+suma+".");
    }
    
}