package unlam.paradigmas.diagnostico;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ejercicio05Test {

	@Test
	public void MatrizUnoPorUno() {
		int [][] m = {
				{1},
		};
		
		int [][] esperado = {
				{1},
		};
		
		int [][] real = Ejercicio05.resolver(m);
		
		assertArrayEquals(esperado, real);
	}
	
	@Test
	public void matrizDosPorDos() {
		int [][] m = {
				{1,2},
				{3,4},
		};
		
		int [][] esperado = {
				{3},
				{1,4},
				{2},
		};
		
		int [][] real = Ejercicio05.resolver(m);
		
		assertArrayEquals(esperado, real);
	}
	
	@Test
	public void matrizTresPorTres() {
		int [][] m = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		
		int [][] esperado = {
				{7},
				{4,8},
				{1,5,9},
				{2,6},
				{3},
		};
		
		int [][] real = Ejercicio05.resolver(m);
		
		assertArrayEquals(esperado, real);
	}
	
	@Test
	public void MatrizCuatroPorCuatro() {
		int [][] m = {
				{1 ,2 ,3 ,10},
				{4 ,5 ,6 ,11},
				{7 ,8 ,9 ,12},
				{13,14,15,16},
		};
		
		int [][] esperado = {
				{13},
				{7,14},
				{4,8,15},
				{1,5,9,16},
				{2,6,12},
				{3,11},
				{10},
		};
		
		int [][] real = Ejercicio05.resolver(m);
		
		assertArrayEquals(esperado, real);
	}
	
	@Test
	public void MatrizCincoPorCinco() {
		int [][] m = {
				{1 ,2 ,3 ,10,17},
				{4 ,5 ,6 ,11,18},
				{7 ,8 ,9 ,12,19},
				{13,14,15,16,20},
				{21,22,23,24,25},
		};
		
		int [][] esperado = {
				{21},
				{13,22},
				{7,14,23},
				{4,8,15,24},
				{1,5,9,16,25},
				{2,6,12,20},
				{3,11,19},
				{10,18},
				{17},
		};
		
		int [][] real = Ejercicio05.resolver(m);
		
		assertArrayEquals(esperado, real);
	}

}
