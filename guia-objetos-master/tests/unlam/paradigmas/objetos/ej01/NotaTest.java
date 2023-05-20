package unlam.paradigmas.objetos.ej01;

import static org.junit.Assert.*;

import org.junit.Test;

public class NotaTest {

	@Test
	public void CrearNota() {
		Nota nota = new Nota(1);
		
		assertNotNull(nota);
	}
	
	@Test
	public void CrearNotaYObtenerValor() {
		Nota nota = new Nota(5);
		
		assertEquals(5, nota.obtenerValor());
	}

	@Test
	public void CrearNotaYVerSiEstaAprobado() {
		Nota nota = new Nota(8);
		
		assertTrue(nota.aprobado());
	}
	
	@Test
	public void CrearNotaYVerSiEstaDesaprobado() {
		Nota nota = new Nota(2);
		
		assertTrue(nota.desaprobado());
	}
	
	@Test
	public void Recuperar() {
		Nota nota = new Nota(2);
		
		assertFalse(nota.aprobado());
		
		nota.recuperar(7);
		
		assertTrue(nota.aprobado());
		
	}
	
}
