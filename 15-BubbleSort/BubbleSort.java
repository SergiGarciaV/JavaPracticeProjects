public class BubbleSort {
  public static void main (String[] args) {

    float[] llistaNotes = {5.5f, 9f, 2f, 10f, 4.9f};
    float suma=0;
    int numSusp=0;
    
    
    for (int i = 0; i < llistaNotes.length - 1; i++) {

      for(int j = i + 1; j < llistaNotes.length; j++) {

        if (llistaNotes[i] > llistaNotes[j]) {

          float aux = llistaNotes[i];
          llistaNotes[i] = llistaNotes[j];
          llistaNotes[j] = aux;
        }
      }
    }
    
    for (int i=0;i<llistaNotes.length;i++){
        
        if(llistaNotes[i]<5){
            
           suma=suma+llistaNotes[i];
           numSusp++;   
            
        }else{
            
            break;
         }
    }
      float mitja=suma/numSusp;
      System.out.println("La nota mitja dels suspensos es: "+mitja);
    }
}