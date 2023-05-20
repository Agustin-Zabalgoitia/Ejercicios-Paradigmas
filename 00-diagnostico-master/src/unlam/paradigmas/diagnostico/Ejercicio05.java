package unlam.paradigmas.diagnostico;

public class Ejercicio05 {

	/*
	 * Ejercicio 05
	 * Escribir un método en Java que de una matriz 
	 * cuadrada dada de dimensión nxn, devuelva una 
	 * matriz con 2n-1 filas, donde cada una tendrá 
	 * los datos de una de las diagonales (de abajo 
	 * a la izquierda hacia arriba a la derecha)
	 */
	
	public static int[][] resolver(int[][] m) {

		//Se declara una nueva matriz con las condiciones dadas
		int [][] n = new int [2*m.length-1][];
		
		for(int i = 0 ; i<n.length/2 ; i++) {
			n[i] = new int[i+1];
			n[n.length-1-i] = new int[i+1];
		}
		
		//Añade la fila del medio
		if(n.length % 2 != 0)
			n[m.length-1] = new int [m.length];
		
		//Asigna los valores de la matriz original cuadrada a la matriz nueva triangular
		for(int i = m.length-1 ; i>=0 ; i--) {
			for(int j = 0 ; i+j<m.length ; j++) {
				n[m.length-1-i][j] = m[i+j][j];
				n[m.length-1+i][j] = m[j][i+j];
			}
		}
		
		return n;
	}
}
