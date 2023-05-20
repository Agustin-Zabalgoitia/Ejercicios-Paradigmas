package edu.unlam.paradigmas.entradasalida.ej03;

import static org.junit.Assert.*;

import org.junit.Test;

public class LuchadorTest {

	@Test
	public void ProbarGetters() {
		Luchador l = new Luchador(2, 1);
		assertEquals(1, l.getAltura());
		assertEquals(2, l.getPeso());
	}

}
