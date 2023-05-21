package edu.unlam.paradigmas.colecciones.ej02;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.LinkedList;

import org.junit.Test;

public class VentaTest {

	@Test
	public void crearRegistroVacio() {
		Registro r = new Registro();

		assertNotNull(r);
	}

	@Test
	public void agregarUnaVenta() {
		Registro r = new Registro();
		Venta v1 = new Venta(1, 2, 3, "Fulano", 4.5);

		r.agregarVenta(v1);

		LinkedList<Venta> esperado = new LinkedList<Venta>();
		esperado.add(v1);

		assertEquals(esperado, r.getVentas());
	}

	@Test
	public void agregarVariasVentas() {
		Registro r = new Registro();
		LinkedList<Venta> esperado = new LinkedList<Venta>();

		for (int i = 0; i < 123_456; i++) {
			Venta v = new Venta(i, i, i, "Persona " + i, i / 2);
			r.agregarVenta(v);
			esperado.add(v);
		}

		assertEquals(esperado, r.getVentas());
	}

	@Test
	public void buscarVentaEnUnRegistroVacio() {
		Registro r = new Registro();

		assertNull(r.buscarVenta(9854123));
	}

	@Test
	public void buscarVentaEnUnRegistro() {
		Registro r = new Registro();

		for (int i = 0; i < 90; i++) {
			Venta v = new Venta(i + 1, i + 2, i + 3, "Persona " + i, i / 2);
			r.agregarVenta(v);
		}

		Venta esperado = new Venta(90, 91, 92, "Persona 89", 89 / 2);

		assertEquals(esperado, r.buscarVenta(90));
	}

	@Test
	public void mostrarValoresNoExistentes() {
		Registro r = new Registro();

		for (int i = 0; i < 90; i++) {
			Venta v = new Venta(i - 1, i + 2, i - 3, "Persona " + i, i / 0.2);
			r.agregarVenta(v);
		}

		assertNull(r.mostrarVentas(1803));
	}

	@Test
	public void mostrarValoresExistentes() {
		Registro r = new Registro();

		Venta v1 = new Venta(1, 12, 3, "Persona 6", 1 / 0.2);
		Venta v2 = new Venta(1, 1, 8, "Persona 1", 1 / 0.2);
		Venta v3 = new Venta(2, 1, 9, "Persona 2", 1 / 0.2);
		Venta v4 = new Venta(3, 1, 35, "Persona 3", 1 / 0.2);
		Venta v5 = new Venta(1, 12, 3, "Persona 15", 1 / 0.2);
		r.agregarVenta(v1);
		r.agregarVenta(v2);
		r.agregarVenta(v3);
		r.agregarVenta(v4);
		r.agregarVenta(v5);

		String esperado = v2.toString() + v3.toString() + v4.toString();
		assertEquals(esperado, r.mostrarVentas(1));
	}

}
