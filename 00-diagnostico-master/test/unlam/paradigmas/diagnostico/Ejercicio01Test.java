package unlam.paradigmas.diagnostico;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ejercicio01Test {

	@Test
	public void matrizDeTresPorTresBien() {
		int m[][] = {
				{1,2,3},
				{4,1,6},
				{7,8,2},
		};
		
		boolean esperado = true;
		boolean real = Ejercicio01.resolver(m);
		
		assertEquals(esperado, real);
	}
	
	@Test
	public void matrizDeTresPorTresMal() {
		int m[][] = {
				{1,2,3},
				{4,2,6},
				{7,8,2},
		};
		
		boolean esperado = false;
		boolean real = Ejercicio01.resolver(m);
		
		assertEquals(esperado, real);
	}
	
	@Test
	public void matrizDeTresPorTresConCeros() {
		int m[][] = {
				{0,2,3},
				{4,0,6},
				{7,8,0},
		};
		
		boolean esperado = true;
		boolean real = Ejercicio01.resolver(m);
		
		assertEquals(esperado, real);
	}
	
	@Test
	public void matrizDeCuatroPorCuatroConNegativo() {
		int m[][] = {
				{-1,2,3,4},
				{4,1,6,7},
				{7,8,0,9},
				{10,11,12,1},
		};
		
		boolean esperado = false;
		boolean real = Ejercicio01.resolver(m);
		
		assertEquals(esperado, real);
	}
	
	@Test
	public void matrizDeTresPorTresConNegativos() {
		int m[][] = {
				{-9,2,3},
				{4,-9,6},
				{7,8,-18},
		};
		
		boolean esperado = true;
		boolean real = Ejercicio01.resolver(m);
		
		assertEquals(esperado, real);
	}

}
