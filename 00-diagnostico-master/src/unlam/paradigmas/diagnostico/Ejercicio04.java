package unlam.paradigmas.diagnostico;

import java.util.Map;
import java.util.HashMap;

public class Ejercicio04 {

	/*
	 * Escribir un método en Java que de una matriz 
	 * numérica dada, devuelva un vector con n elementos, 
	 * donde cada elemento es la moda de una fila. 
	 * Si hubiese más de una moda, se deberá utilizar la de mayor valor
	 */
	public static int[] resolver(int[][] m) {
		
		int [] modas = new int [m.length];
		
		for(int i = 0 ; i<m.length ; i++) {
			HashMap<Integer, Integer> elementos = new HashMap<Integer, Integer>();
			
			for(int j = 0 ; j<m[i].length ; j++) {	
				if(elementos.containsKey(m[i][j]))
					elementos.put(m[i][j], elementos.get(m[i][j])+1);
				else elementos.put(m[i][j], 1);
			}
			
			int cantidadAnterior = 0;
			for(Map.Entry<Integer, Integer> entry : elementos.entrySet()) {
			    Integer key = entry.getKey();
			    Integer value = entry.getValue();
			    
			    if(cantidadAnterior == 0 || value > cantidadAnterior || (value == cantidadAnterior && key>modas[i]))
			    	modas[i] = key;
			    
			    //System.out.println("Key: " + key + " " + "Value: " + value);
			}
			//System.out.println();
		}
		
		return modas;
	}
}
