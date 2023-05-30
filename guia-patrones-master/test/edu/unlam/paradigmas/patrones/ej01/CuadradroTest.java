package edu.unlam.paradigmas.patrones.ej01;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuadradroTest {
	
	@Test
	public void ProbarColor() {
		Cuadrado c = new Cuadrado(213, "rojo");
		assertNull(c.getColor());
	}

}
