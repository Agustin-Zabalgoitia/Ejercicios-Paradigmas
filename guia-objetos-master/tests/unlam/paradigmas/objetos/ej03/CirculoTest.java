package unlam.paradigmas.objetos.ej03;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {

	@Test
	public void CrearCirculo() {
		Circulo c = new Circulo(1);
		assertNotNull(c);
	}
	
	@Test
	public void ObtenerRadio() {
		Circulo c = new Circulo(1);
		double esperado = 1;
		assertEquals(esperado, c.getRadio(),0);
	}
	
	@Test
	public void ObtenerDiametro() {
		Circulo c = new Circulo(1);
		double esperado = 2;
		assertEquals(esperado, c.getDiametro(),0);
	}
	
	@Test
	public void ObtenerPerimetro() {
		Circulo c = new Circulo(253);
		double esperado = 1589.645;
		assertEquals(esperado, c.getPerimetro(),0.001);
	}
	
	@Test
	public void ObtenerArea() {
		Circulo c = new Circulo(488);
		double esperado = 748151.441;
		assertEquals(esperado, c.getArea(),0.001);
	}
	
	@Test
	public void CambiarRadio() {
		Circulo c = new Circulo(3210.21654);
		double esperado = 3210.21654;
		assertEquals(esperado, c.getRadio(),0);
		
		c.setRadio(Double.MIN_VALUE);
		esperado = Double.MIN_VALUE;
		assertEquals(esperado, c.getRadio(),0);
	}
}
