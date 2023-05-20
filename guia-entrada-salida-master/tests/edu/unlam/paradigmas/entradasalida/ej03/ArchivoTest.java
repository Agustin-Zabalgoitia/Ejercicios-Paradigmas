package edu.unlam.paradigmas.entradasalida.ej03;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Test;

public class ArchivoTest {

	@Test
	public void LeerArchivo() {
		Archivo ar = new Archivo("casos de prueba/ejercicio 3/in/prueba.in");
		int[] esperado = { 253, 456, 984, 546, 1, 0 };
		int[] real = ar.leerArchivo();

		assertArrayEquals(esperado, real);
	}

	@Test
	public void GuardarArchivo() throws IOException {
		Archivo ar = new Archivo("casos de prueba/ejercicio 3/out/prueba.out");
		int[] datos = { 253, 456, 984, 546, 1, 0 };
		ar.generarArchivo(datos);

		byte[] f1 = Files.readAllBytes(Paths.get("casos de prueba/ejercicio 3/out/prueba.out"));
		byte[] f2 = Files.readAllBytes(Paths.get("casos de prueba/ejercicio 3/out esperado/prueba.out"));
		
		assertArrayEquals(f1, f2);
	}

}