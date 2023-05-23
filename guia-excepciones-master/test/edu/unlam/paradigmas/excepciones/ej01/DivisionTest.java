package edu.unlam.paradigmas.excepciones.ej01;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTest {

	@Test
	public void DivisionNormal() throws Exception {
		int a = 15;
		int b = -7;
		assertEquals(a / b, Division.dividir(a, b), 0);
	}

	@Test(expected = Exception.class)
	public void DivisionPorCero() throws Exception {
		int a = 1;
		int b = 0;
		Division.dividir(a, b);
	}

}
