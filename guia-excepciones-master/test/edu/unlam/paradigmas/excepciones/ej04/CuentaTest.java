package edu.unlam.paradigmas.excepciones.ej04;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {

	@Test
	public void RetirarCantidadDisponible() {
		Cuenta c = new Cuenta(1250);
		c.retirarDinero(250);
		assertEquals(1000, c.getDineroDisponible(), 0);
	}

	@Test(expected = RuntimeException.class)
	public void RetirarCantidadNoDisponible() {
		Cuenta c = new Cuenta(1250);
		c.retirarDinero(25000);
		//assertEquals(-23750, c.getDineroDisponible(), 0);
	}

}
