public class CalculEnter{

	  public int calcularMaxim(int[] array) {
	    int max = array[0];
	    for (int i = 1; i < array.length; i++) {
	      if (max < array[i]) {
	        max = array[i];
	      }
	    }
	    return max;
	  }

	  public int calcularMinim(int[] array) {
	    int min = array[0];
	    for (int i = 1; i < array.length; i++) {
	      if (min > array[i]) {
	        min = array[i];
	      }
	    }
	    return min;
	  }

	  public int calcularMitjana(int[] array) {
	    int suma = 0;
	    for (int i = 0; i < array.length; i++) {
	      suma = suma + array[i];
	    }
	    return suma/array.length;
	  }
}


