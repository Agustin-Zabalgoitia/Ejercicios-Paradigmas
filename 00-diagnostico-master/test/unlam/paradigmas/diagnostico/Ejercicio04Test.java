package unlam.paradigmas.diagnostico;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ejercicio04Test {

	@Test
	public void matrizTresPorCuatro() {
		int [][] m = {
			{1,2,3,4},
			{5,-6,-6,20},
			{1,1,10,10},
		};
		
		int [] esperado = {4,-6,10};
		
		int [] real = Ejercicio04.resolver(m);
		
		assertArrayEquals(esperado, real);
	}
	
	@Test
	public void matrizFila() {
		int [][] m = {
			{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,0,-1},
		};
		
		int [] esperado = {20};
		
		int [] real = Ejercicio04.resolver(m);
		
		assertArrayEquals(esperado, real);
	}
	
	@Test
	public void matrizColumna() {
		int [][] m = {
			{1},
			{-8},
			{0},
			{89},
			{-1},
		};
		
		int [] esperado = {1,-8,0,89,-1};
		
		int [] real = Ejercicio04.resolver(m);
		
		assertArrayEquals(esperado, real);
	}
	
	@Test
	public void matrizVacia() {
		int [][] m = {};
		
		int [] esperado = {};
		
		int [] real = Ejercicio04.resolver(m);
		
		assertArrayEquals(esperado, real);
	}

}
