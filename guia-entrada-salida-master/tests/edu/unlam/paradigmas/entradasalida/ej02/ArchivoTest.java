package edu.unlam.paradigmas.entradasalida.ej02;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ArchivoTest {

	@Test
	public void LeerArchivo() {
		Archivo archivo = new Archivo("prueba caso 1");
		List<Integer> esperado = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++)
			esperado.add(i);

		assertEquals(esperado, archivo.leerArchivo());
	}

	@Test
	public void GenerarArchivo() throws IOException {
		Archivo archivo = new Archivo("prueba caso 2");
		List<Integer> esperado = new ArrayList<Integer>();

		for (int i = 10; i > 0; i--)
			esperado.add(i);

		archivo.generarArchivo(esperado);

		byte[] f1 = Files.readAllBytes(Paths.get("casos de prueba/ejercicio 2/out/prueba caso 2.out"));
		byte[] f2 = Files.readAllBytes(Paths.get("casos de prueba/ejercicio 2/out esperado/prueba caso 2.out"));

		assertArrayEquals(f1, f2);
	}

}
