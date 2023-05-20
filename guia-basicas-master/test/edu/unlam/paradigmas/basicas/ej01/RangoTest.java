package edu.unlam.paradigmas.basicas.ej01;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class RangoTest {

	@Test
	public void CrearRangoCerrado() {
		Rango ran = Rango.CrearRangoCerrado(1, 2);

		assertTrue(ran.estaDentroDelRango(1));
		assertTrue(ran.estaDentroDelRango(2));

		System.out.println(ran);
	}

	@Test
	public void CrearRangoAbierto() {
		Rango ran = Rango.CrearRangoAbierto(1, 2);

		assertFalse(ran.estaDentroDelRango(1));
		assertFalse(ran.estaDentroDelRango(2));

		System.out.println(ran);
	}

	@Test
	public void CrearRangoAbiertoInferior() {
		Rango ran = Rango.CrearSemiAbiertoInferior(1, 2);

		assertFalse(ran.estaDentroDelRango(1));
		assertTrue(ran.estaDentroDelRango(2));

		System.out.println(ran);
	}

	@Test
	public void CrearRangoAbiertoSuperior() {
		Rango ran = Rango.CrearSemiAbiertoSuperior(1, 2);

		assertTrue(ran.estaDentroDelRango(1));
		assertFalse(ran.estaDentroDelRango(2));

		System.out.println(ran);
	}

	@Test
	public void AbiertoEstaDentroDeCerrado() {
		Rango ran1 = Rango.CrearRangoAbierto(1, 2);
		Rango ran2 = Rango.CrearRangoCerrado(1, 2);

		assertTrue(ran2.estaDentroDelRango(ran1));
	}

	@Test
	public void CerradoNoEstaDentroDeAbierto() {
		Rango ran1 = Rango.CrearRangoAbierto(1, 2);
		Rango ran2 = Rango.CrearRangoCerrado(1, 2);

		assertFalse(ran1.estaDentroDelRango(ran2));
	}

	@Test
	public void HayInterseccionEntreRangosIguales() {
		Rango ran1 = Rango.CrearRangoAbierto(1, 2);
		Rango ran2 = Rango.CrearRangoAbierto(1, 2);

		Rango esperado = Rango.CrearRangoAbierto(1, 2);

		assertTrue(ran1.hayInterseccion(ran2));
		assertEquals(esperado, ran1.obtenerInterseccion(ran2));
	}

	@Test
	public void NoHayInterseccionEntreRangosDistintos() {
		Rango ran1 = Rango.CrearRangoAbierto(1, 2);
		Rango ran2 = Rango.CrearRangoCerrado(-1, 0);

		Rango esperado = Rango.CrearRangoAbierto(0, 0);

		assertFalse(ran1.hayInterseccion(ran2));
		assertEquals(esperado, ran1.obtenerInterseccion(ran2));
	}

	@Test
	public void HayInterseccionEntreRangosDistintos() {
		Rango ran1 = Rango.CrearRangoAbierto(1, 2);
		Rango ran2 = Rango.CrearRangoCerrado(1, 5);

		Rango esperado = Rango.CrearSemiAbiertoSuperior(1, 2);

		assertTrue(ran1.hayInterseccion(ran2));
		assertEquals(esperado, ran1.obtenerInterseccion(ran2));
	}

	@Test
	public void CompararRangosPorIgualdad() {
		Rango ran1 = Rango.CrearRangoAbierto(1, 2);
		Rango ran2 = Rango.CrearRangoAbierto(1, 2);

		assertTrue(ran1.equals(ran2));

		ran2 = Rango.CrearRangoCerrado(1, 2);

		assertFalse(ran1.equals(ran2));
	}

	@Test
	public void DesplazarIntervaloConCero() {
		Rango real = Rango.CrearRangoAbierto(1, 2);
		Rango esperado = Rango.CrearRangoAbierto(1, 2);

		real.desplazarRango(0);

		assertEquals(esperado, real);
	}

	@Test
	public void DesplazarIntervaloConNegativo() {
		Rango real = (Rango.CrearRangoAbierto(1, 2)).desplazarRango(-5);
		Rango esperado = Rango.CrearRangoAbierto(-4, -3);

		assertEquals(esperado, real);
	}

	@Test
	public void DesplazarIntervaloConPositivo() {
		Rango real = (Rango.CrearRangoAbierto(1, 2)).desplazarRango(5);
		Rango esperado = Rango.CrearRangoAbierto(6, 7);

		assertEquals(esperado, real);
	}

	@Test
	public void SumarIntervalosConCero() {
		Rango r1 = Rango.CrearRangoAbierto(1, 2);
		Rango r2 = Rango.CrearRangoAbierto(0, 0);
		Rango esperado = Rango.CrearRangoAbierto(1, 0);

		Rango real = r1.sumarRangos(r2);

		assertEquals(esperado, real);
	}

	@Test
	public void SumarIntervalosSinInterseccion() {
		Rango r1 = Rango.CrearRangoAbierto(1, 2);
		Rango r2 = Rango.CrearRangoCerrado(3, 10);
		Rango esperado = Rango.CrearSemiAbiertoInferior(1, 10);

		Rango real = r1.sumarRangos(r2);

		assertEquals(esperado, real);
	}
	
	@Test
	public void OrdenarArrayDeRangos() {
		Rango[] rangos = {
				Rango.CrearRangoAbierto(72, -98),
				Rango.CrearRangoCerrado(99, 0),
				Rango.CrearSemiAbiertoInferior(1, 10),
				Rango.CrearSemiAbiertoSuperior(2, -9),
				Rango.CrearRangoCerrado(72, -98),
				Rango.CrearSemiAbiertoInferior(72, -98),
				Rango.CrearSemiAbiertoSuperior(72, -98),
		};
		
		Rango[] esperado = { 
				Rango.CrearSemiAbiertoInferior(1, 10), 
				Rango.CrearSemiAbiertoSuperior(2, -9),
				Rango.CrearSemiAbiertoSuperior(72, -98),
				Rango.CrearSemiAbiertoInferior(72, -98),
				Rango.CrearRangoAbierto(72, -98), 
				Rango.CrearRangoCerrado(72, -98),
				Rango.CrearRangoCerrado(99, 0),
		};
		
		Arrays.sort(rangos);
		
		assertArrayEquals(esperado, rangos);

	}

}
