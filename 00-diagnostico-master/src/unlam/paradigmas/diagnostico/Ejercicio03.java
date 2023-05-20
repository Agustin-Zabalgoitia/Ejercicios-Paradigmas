package unlam.paradigmas.diagnostico;

public class Ejercicio03 {

	/*Ejercicio 03
	 *Escribir un método en Java que de una matriz numérica dada, 
	 *devuelva una matriz con la misma cantidad de elementos, pero 
	 *donde cada valor es la suma de sus adyacentes originales 
	 *(arriba, abajo, izquierda, y derecha; si existen)
	 */
	public static int[][] resolver(int[][] m) {
		//Esto no funciona porque Java no crea un copia de m en matriz.
		//Por lo que la matriz m siempre se está modificando.
		int [][] matriz = m;
		
		for(int i = 0 ; i<matriz.length ; i++) {
			int suma = 0;
			for(int j = 0 ; j<matriz[i].length ; j++) {	
				if(i>0)
					suma += m[i-1][j];
				
				if(j>0)
					suma += m[i][j-1];
				
				if(i<(matriz.length-1))
					suma += m[i+1][j];
				
				if(j<(matriz[i].length-1))
					suma += m[i][j+1];
				
				matriz[i][j] += suma;
			}
		}
		
		return matriz;
	}
}
