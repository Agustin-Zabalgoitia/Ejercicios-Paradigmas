package edu.unlam.paradigmas.excepciones.ej02;

import static org.junit.Assert.*;

import org.junit.Test;

public class RaizTest {

	@Test
	public void RaizNumeroPositivo() throws ExcepcionPropia {
		double a = 4;
		assertEquals(2, Raiz.cuadrada(a), 0);
	}

	@Test
	public void RaizCero() throws ExcepcionPropia {
		double a = 0;
		assertEquals(0, Raiz.cuadrada(a), 0);
	}

	@Test(expected = ExcepcionPropia.class)
	public void RaizNegativa() throws ExcepcionPropia {
		double a = -1;
		Raiz.cuadrada(a);
	}

}
