package edu.unlam.paradigmas.excepciones.ej03;

import static org.junit.Assert.*;

import org.junit.Test;

public class CocienteTest {

	@Test
	public void DivisorDos() {
		int a = 3;
		int b = 2;
		assertEquals(1, Cociente.cociente(a, b));
	}

	@Test(expected = ExcepcionDivisorCero.class)
	public void DivisorCero() {
		int a = 7;
		int b = 0;
		Cociente.cociente(a, b);
	}

}
