import java.util.Scanner;
public class  Àrees{
    public static void main(String args[]) {
        Scanner teclat=new Scanner(System.in);
        
        String forma;
        float val1, val2, val3;
        
        System.out.println("A continuació indicarem unes determinades figures, introdueixi una d'elles per a calcular l'àrea:");
        System.out.print("\nQuadrat  -   Rectangle  -  Triangle  -  Trapezi  -  Rombe  -  Paral.lelogram  -  Cercle");
        System.out.print("\n\n---> ");
        forma=teclat.next();
        
        
        if (forma.equalsIgnoreCase("quadrat")){
            System.out.println("introdueix ara la mida del costat:  ");
            val1=teclat.nextFloat();
            System.out.print("L'àrea del quadrat indicat es =  ");
            System.out.print(val1*val1);
            
        }else{
            if(forma.equalsIgnoreCase("Rectangle")){
               System.out.println("Introdueixi la mida de la base del rectangle:  ");
               val1=teclat.nextFloat();
               System.out.println("Introdueixi ara la mida de l'alçada del rectangle:  ");
               val2=teclat.nextFloat();
               System.out.print("L'àrea del rectangle es =  ");
               System.out.print(val1*val2);
                
            }else{
                if(forma.equalsIgnoreCase("Triangle")){
                    System.out.println("Introdueixi la mida de la base del triangle:  ");
                    val1=teclat.nextFloat();
                    System.out.println("Introdueixi la mida de l'alçada del triangle:  ");
                    val2=teclat.nextFloat();
                    System.out.print("L'àrea del triangle es =  ");
                    System.out.print((val1*val2)/2);
                    
                }else{
                    if(forma.equalsIgnoreCase("Trapezi")){
                        System.out.println("Introdueixi la mida de la base major del trapezi:  ");
                        val1=teclat.nextFloat();
                        System.out.println("Introdueixi la mida de la base menor del trapezi:  ");
                        val2=teclat.nextFloat();
                        System.out.println("Introdueixi la mida de l'alçada del trapezi:  ");
                        val3=teclat.nextFloat();
                        System.out.print("L'àrea del trapezi es =  ");
                        System.out.print(((val1+val2)*val3)/2);
                    
                    }else{
                        if(forma.equalsIgnoreCase("Rombe")){
                            System.out.println("Introdueixi la mida de la diagonal major del rombe:  ");
                            val1=teclat.nextFloat();
                            System.out.println("Introdueixi la mida de la diagonal menor del rombe:  ");
                            val2=teclat.nextFloat();
                            System.out.print("L'àrea del rombe es =  ");
                            System.out.print((val1*val2)/2);
                            
                        }else{
                            if(forma.equalsIgnoreCase("Paral.lelogram")){
                                System.out.println("Introdueixi la mida de la base del paral.lelogram:  ");
                                val1=teclat.nextFloat();
                                System.out.println("Introdueixi la mida de l'alçada del paral.lelogram:  ");
                                val2=teclat.nextFloat();
                                System.out.print("L'àrea del paral.lelogram es =  ");
                                System.out.print((val1*val2)/2);
                                    
                            }else{
                                if(forma.equalsIgnoreCase("Cercle")){
                                    System.out.println("Introdueixi la mida del radi del cercle:  ");
                                    val1=teclat.nextFloat();
                                    System.out.print("L'àrea del cercle es =  ");
                                    System.out.print((val1*val1)*3.1416);
                                    
                                }
                                    
                            }   
                            
                        }
                        
                    }
                    
                }
            
            }
            
        }
        
    }
    
}