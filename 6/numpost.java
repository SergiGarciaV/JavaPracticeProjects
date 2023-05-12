import java.util.Scanner;

public class numpost{
    
    public static void main(String[]args){
        
        Scanner teclat=new Scanner(System.in);
        
        int cont,val;
        
        System.out.print("Introdueix un valor i et mostraré els 10 posteriors: ");
            val=teclat.nextInt();
            
        for(cont=0;cont<10;cont++){
            
            val++;
            
            System.out.print("\n\n"+val);
            
            
            
            
        }
        
    }
}