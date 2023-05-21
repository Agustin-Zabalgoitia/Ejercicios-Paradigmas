package edu.unlam.paradigmas.colecciones.ej01;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PaqueteTest {

	@Test
	public void CrearPaqueteVacio() {
		Paquete p = new Paquete();
		assertNotNull(p);
	}

	@Test
	public void CrearRegistroVacio() {
		Registro r = new Registro();
		assertNotNull(r);
	}

	@Test
	public void AgregarUnPaquete() {
		Registro r = new Registro();
		Paquete p = new Paquete();

		r.agregarPaquete(p);

		ArrayList<Paquete> esperado = new ArrayList<>();
		esperado.add(p);

		assertEquals(esperado, r.getPaquetes());
	}

	@Test
	public void AgregarCienMillonesDePaquetes() {
		Registro r = new Registro();
		Paquete p = new Paquete();
		ArrayList<Paquete> esperado = new ArrayList<>();

		for (int i = 0; i < 100_000_000; i++) {
			r.agregarPaquete(p);
			esperado.add(p);
		}

		assertEquals(esperado, r.getPaquetes());
	}

	@Test
	public void BuscarPaqueteEnUnRegistro() {
		Registro r = new Registro();

		r.agregarPaquete(new Paquete(4, 33, 44, 74));
		r.agregarPaquete(new Paquete(8, 7, 2, 114));
		r.agregarPaquete(new Paquete(1, 654, 71, 198.02));
		r.agregarPaquete(new Paquete(23, 123, 456, 53.2));
		r.agregarPaquete(new Paquete(98, 2, 68, 0.12));
		r.agregarPaquete(new Paquete(100, 123, 654, 8.91));

		Paquete esperado = new Paquete(23, 123, 456, 53.2);

		assertEquals(esperado, r.buscarPaquete(23));
	}

	@Test
	public void BuscarPaqueteEnUnRegistroVacio() {
		Registro r = new Registro();
		Paquete esperado = null;

		assertEquals(esperado, r.buscarPaquete(23));
	}

	@Test
	public void BuscarPaqueteNoExistenteEnUnRegistro() {
		Registro r = new Registro();

		r.agregarPaquete(new Paquete(23, 123, 456, 53.2));
		r.agregarPaquete(new Paquete(98, 2, 68, 0.12));
		r.agregarPaquete(new Paquete(100, 123, 654, 8.91));

		Paquete esperado = null;

		assertEquals(esperado, r.buscarPaquete(999));
	}

	@Test
	public void MostrarPaquetesQueSuperanUnPeso() {
		Registro r = new Registro();

		r.agregarPaquete(new Paquete(4, 33, 44, 74));
		r.agregarPaquete(new Paquete(23, 123, 456, 53.2));
		r.agregarPaquete(new Paquete(98, 2, 68, 0.12));
		r.agregarPaquete(new Paquete(100, 123, 654, 8.91));

		r.mostrarPaquetes(10);
		
		assert(true);
	}

}
