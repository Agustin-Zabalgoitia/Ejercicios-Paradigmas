package edu.unlam.paradigmas.excepciones.ej06;

import static org.junit.Assert.*;

import org.junit.Test;

public class LectorTest {

	@Test
	public void LeerPrimerArchivo() {
		System.out.println(Lector.leer("archivo.txt"));
	}

	@Test
	public void LeerDosArchivos() {
		System.out.println(Lector.leerDosArchivos("archivo.txt"));
	}

}
