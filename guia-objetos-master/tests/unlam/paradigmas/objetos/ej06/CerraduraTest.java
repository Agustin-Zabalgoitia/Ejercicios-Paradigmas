package unlam.paradigmas.objetos.ej06;

import static org.junit.Assert.*;

import org.junit.Test;

public class CerraduraTest {

	@Test
	public void CrearCerradura() {
		Cerradura c = new Cerradura(123, 3);
		assertNotNull(c);
	}

	@Test
	public void AbrirCerradura() {
		Cerradura c = new Cerradura(123, 3);
		c.abrir(123);
		assertTrue(c.estaAbierta());
	}

	@Test
	public void AbrirYCerrarCerradura() {
		Cerradura c = new Cerradura(123, 3);
		c.abrir(123);
		assertTrue(c.estaAbierta());
		c.cerrar();
		assertTrue(c.estaCerrada());
	}

	@Test
	public void BloquearCerradura() {
		Cerradura c = new Cerradura(45312, 2);
		c.abrir(123);
		assertTrue(c.estaCerrada());
		c.abrir(357);
		assertTrue(c.estaCerrada());
		assertTrue(c.fueBloqueada());
	}

	@Test
	public void AbrirCerraduraConUnaClaveEquivocada() {
		Cerradura c = new Cerradura(-12305, 10);
		c.abrir(987);
		assertTrue(c.estaCerrada());
		c.abrir(-12305);
		assertTrue(c.estaAbierta());
		assertFalse(c.fueBloqueada());
	}

	public void AbrirCerraduraConUnMillonDeClavesEquivocadas() {
		Cerradura c = new Cerradura(-78998, 1_000_001);
		for (int i = 0; i < 1_000_001; ++i) {
			c.abrir(i * 2);
			assertTrue(c.estaCerrada());
		}
		c.abrir(-78998);
		assertTrue(c.estaAbierta());
		assertFalse(c.fueBloqueada());
	}

}
