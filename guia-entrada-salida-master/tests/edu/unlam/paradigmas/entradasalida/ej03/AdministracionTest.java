package edu.unlam.paradigmas.entradasalida.ej03;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Test;

public class AdministracionTest {

	@Test
	public void RegistraLuchadoresCorrectamente() {
		Administracion ad = new Administracion();
		ad.registrarLuchadores("casos de prueba/ejercicio 3/in/sumo.in");
		
		Luchador[] real = ad.getLuchadores();
		Luchador[] esperado = {
				new Luchador(300, 1500),
				new Luchador(320, 1500),
				new Luchador(299, 1580),
				new Luchador(330, 1690),
				new Luchador(330, 1540),
				new Luchador(339, 1500),
				new Luchador(298, 1700),
				new Luchador(344, 1570),
				new Luchador(276, 1678),
				new Luchador(289, 1499),
		};

		for (int i = 0; i < real.length; i++) {
			assertTrue(real[i].equals(esperado[i]));
		}
	}

	@Test
	public void GenerarLuchadoresCorrectamente() throws IOException {
		Administracion ad = new Administracion();
		ad.registrarLuchadores("casos de prueba/ejercicio 3/in/sumo.in");

		ad.guardarDominantes("casos de prueba/ejercicio 3/out/sumo.out");

		byte[] real = Files.readAllBytes(Paths.get("casos de prueba/ejercicio 3/out/sumo.out"));
		byte[] esperado = Files.readAllBytes(Paths.get("casos de prueba/ejercicio 3/out esperado/sumo.out"));

		assertArrayEquals(esperado, real);
	}

}
