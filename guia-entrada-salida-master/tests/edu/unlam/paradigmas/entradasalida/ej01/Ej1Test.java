package edu.unlam.paradigmas.entradasalida.ej01;

import static org.junit.Assert.assertArrayEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Test;

public class Ej1Test {

	@Test
	public void VerificarPrimerCaso() {
		Archivo ar = new Archivo("caso01");

		ar.GenerarSalida();

		try {
			byte[] f1 = Files.readAllBytes(Paths.get("casos de prueba/ejercicio 1/out/caso01.out"));
			byte[] f2 = Files.readAllBytes(Paths.get("casos de prueba/ejercicio 1/out esperado/caso01.out"));
			assertArrayEquals(f1, f2);
		} catch (IOException e) {
			Assert.fail();
		}
	}

	@Test
	public void VerificarSegundoCaso() {
		Archivo ar = new Archivo("caso02");

		ar.GenerarSalida();

		try {
			byte[] f1 = Files.readAllBytes(Paths.get("casos de prueba/ejercicio 1/out/caso02.out"));
			byte[] f2 = Files.readAllBytes(Paths.get("casos de prueba/ejercicio 1/out esperado/caso02.out"));
			assertArrayEquals(f1, f2);
		} catch (IOException e) {
			Assert.fail();
		}
	}

	@Test
	public void VerificarTercerCaso() {
		Archivo ar = new Archivo("caso03");

		ar.GenerarSalida();

		try {
			byte[] f1 = Files.readAllBytes(Paths.get("casos de prueba/ejercicio 1/out/caso03.out"));
			byte[] f2 = Files.readAllBytes(Paths.get("casos de prueba/ejercicio 1/out esperado/caso03.out"));
			assertArrayEquals(f1, f2);
		} catch (IOException e) {
			Assert.fail();
		}
	}

	@Test
	public void VerificarCuartoCaso() {
		Archivo ar = new Archivo("caso04");

		ar.GenerarSalida();

		try {
			byte[] f1 = Files.readAllBytes(Paths.get("casos de prueba/ejercicio 1/out/caso04.out"));
			byte[] f2 = Files.readAllBytes(Paths.get("casos de prueba/ejercicio 1/out esperado/caso04.out"));
			assertArrayEquals(f1, f2);
		} catch (IOException e) {
			Assert.fail();
		}
	}

}
