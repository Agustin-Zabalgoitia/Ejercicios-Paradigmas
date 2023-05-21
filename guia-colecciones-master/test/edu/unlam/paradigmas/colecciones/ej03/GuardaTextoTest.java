package edu.unlam.paradigmas.colecciones.ej03;

import static org.junit.Assert.*;

import org.junit.Test;

public class GuardaTextoTest {

	@Test
	public void GuardarUnaPalabra() {
		GuardaTexto g = new GuardaTexto();
		String esperado = "hola";
		g.guardarPalabras(
				"hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola hola ");
		assertEquals(esperado, g.toString());
	}

	@Test
	public void GuardarNingunaPalabra() {
		GuardaTexto g = new GuardaTexto();
		String esperado = "";
		g.guardarPalabras("");
		assertEquals(esperado, g.toString());
	}

}
