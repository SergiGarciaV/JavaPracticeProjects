public class Cerca {

	public static void main(String[]args) {
		
		float[]arrayNotes={2f, 5.5f, 9f, 4.9f, 8f, 8.5f, 7f, 6.6f, 5f, 9f, 7f};
	
		float minim=arrayNotes[0];//creamos la variable "minim" y le damos el valor de la 1ª posicion del array.
			
		for(int i=1;i<arrayNotes.length;i++) { //Decimos que "i" empieza con el valor de la 2ª posición del array.
				
			if(arrayNotes[i]<minim) { //Comparámos la 2ª posición "i" con la 1ª"minim" , si la 2ª es mas pequeña que la primera
				
				minim=arrayNotes[i]; //se la guardamos a minim, y si es <5 break, de lo contrario sigue el loop y pasa a comparar
				
				if(minim<5) {       //La posición 3ª con ese valor minimo que va guardando, así cada vez si encuentra un numero
									//menor lo va guardando en mínim y va mirando si es inferior a 5. 
					break;
				}	
			}
		}
		if (minim<5) {
				
			System.out.print("Hi ha suspesos");
				
		}else{
				
				System.out.print("No hi ha suspesos");
				
			}
	}
}