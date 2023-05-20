package unlam.paradigmas.diagnostico;

public class Ejercicio01 {

	/*Ejercicio 01
	 * Escribir un método en Java que permita comprobar si la diagonal 
	 * principal de una matriz cuadrada de enteros tiene en cada posición 
	 * un valor igual a la suma de todos los valores de las posiciones 
	 * anteriores de dicha diagonal.  
	*/
	public static boolean resolver(int[][] m) {
		
		int sumatoria = 0;
		boolean todoBien = true;
		
		for(int i = 0 ; i < m.length && todoBien ; i++) {
			
			if(i > 0)
				todoBien = (m[i][i] == sumatoria);
			
			sumatoria += m[i][i]; 
		}
		
		return todoBien;
	}
}
