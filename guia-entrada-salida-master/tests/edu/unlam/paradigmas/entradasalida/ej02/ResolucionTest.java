package edu.unlam.paradigmas.entradasalida.ej02;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class ResolucionTest {

	/*
	 * @Test public void CrearArchivo() { Resolucion r = new Resolucion();
	 * r.crearArhivoAleatorio("archivo numeros aleatorios"); }
	 */

	@Test
	public void NumerosDentroDelRango() {
		Archivo ar = new Archivo("archivo numeros aleatorios");
		List<Integer> datos = ar.leerArchivo();

		boolean noValido = false;

		int i = 0;

		while (i < datos.size() && datos.get(i) >= 0 && datos.get(i) <= 12000) {
			i++;
		}

		if (i < datos.size() && !(datos.get(i) >= 0 && datos.get(i) <= 12000))
			noValido = true;

		assertFalse(noValido);
	}

	@Test
	public void CantidadDeNumerosDentroDelRango() {
		Archivo ar = new Archivo("archivo numeros aleatorios");
		List<Integer> datos = ar.leerArchivo();

		assertTrue(datos.size() >= 10000 && datos.size() <= 20000);
	}
	
	@Test
	public void VerificarRespuesta() {
		Resolucion res = new Resolucion();
		
		res.leerArchivoCreadoYGenerarRespuesta("archivo numeros aleatorios", "respuesta");	
	}

}
