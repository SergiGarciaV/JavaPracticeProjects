//package UF2.Examen_v2;

public class NotaAText {

    public String notaAText(double nota) {
        
    	String notaLletres="";
    	
    	if(nota>=9) {
    		notaLletres="Excelent";
    	}else if((nota<9)&&(nota>=8)){
    		notaLletres="Notable";
    	}else if((nota<8)&&(nota>=6.5)) {
    		notaLletres="Be";
    	}else if((nota<6.5)&&(nota>=5)) {
    		notaLletres="Suficient";
    	}else if(nota<5){
    		notaLletres="Insuficient";
    	}
    
    	return notaLletres;	
    }
}