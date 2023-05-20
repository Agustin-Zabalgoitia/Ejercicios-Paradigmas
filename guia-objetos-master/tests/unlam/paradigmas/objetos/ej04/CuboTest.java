package unlam.paradigmas.objetos.ej04;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuboTest {

	@Test
	public void ObtenerLado() {
		Cubo c = new Cubo(123);
		assertEquals(123, c.obtenerLado(), 0);
	}
	
	@Test
	public void CambiarLado() {
		Cubo c = new Cubo(321);
		c.cambiarLado(753.023156489);
		assertEquals(753.023156489, c.obtenerLado(), 0);
	}
	
	@Test
	public void ObtenerAreaCara() {
		Cubo c = new Cubo(222);
		assertEquals(49284, c.obtenerAreaCara(), 0);
	}
	
	@Test
	public void CambiarAreaCara() {
		Cubo c = new Cubo(321456);
		c.cambiarAreaCara(1);
		assertEquals(1, c.obtenerAreaCara(), 0);
	}

	@Test
	public void ObtenerVolumen() {
		Cubo c = new Cubo(2);
		assertEquals(8, c.obtenerVolumen(), 0);
	}
	
	@Test
	public void CambiarVolumen() {
		Cubo c = new Cubo(2);
		assertEquals(8, c.obtenerVolumen(), 0);
		
		c.cambiarVolumen(100);
		assertEquals(100, c.obtenerVolumen(), 0.0001);
	}
}
