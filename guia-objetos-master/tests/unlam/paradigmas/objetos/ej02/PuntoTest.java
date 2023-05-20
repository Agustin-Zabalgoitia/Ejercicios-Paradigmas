package unlam.paradigmas.objetos.ej02;

import static org.junit.Assert.*;

import org.junit.Test;

public class PuntoTest {

	@Test
	public void CrearPunto() {
		Punto p = new Punto(0,0);
		
		assertNotNull(p);
	}
	
	@Test
	public void ObtenerCoordenadas() {
		Punto p = new Punto(0,Double.MAX_VALUE);
		
		double esperadoX = 0;
		assertEquals(esperadoX, p.obtenerX(), 0);
		
		double esperadoY = Double.MAX_VALUE;
		assertEquals(esperadoY, p.obtenerY(), 0);
	}
	
	@Test
	public void CambiarCoordenadas() {
		Punto p = new Punto(Double.MIN_VALUE,-0.12345678456123);
		p.cambiarX(0);
		assertEquals(0, p.obtenerX(), 0);
		
		p.cambiarY(2);
		assertEquals(2, p.obtenerY(), 0);
	}
	
	@Test
	public void EstaSobreEjeX() {
		Punto p = new Punto(0,0);
		assertTrue(p.estaSobreEjeX());
	}
	
	@Test
	public void EstaSobreEjeY() {
		Punto p = new Punto(0,0);
		assertTrue(p.estaSobreEjeY());
	}
	
	@Test
	public void EsElOrigen() {
		Punto p = new Punto(0,0);
		assertTrue(p.esElOrigen());
	}
	
	@Test
	public void CalcularDistanciaAlOrigen() {
		Punto p = new Punto(25,377);
		
		double esperado = 377.828003197;
		
		assertEquals(esperado, p.distanciaAlOrigen(), 0.001);
	}
	
	@Test
	public void CalcularDistanciaAotroPunto() {
		Punto p1 = new Punto(-123,0.235468);
		Punto p2 = new Punto(1111.111,7865431);
		
		double esperado = 7865430.861;
		
		assertEquals(esperado, p1.distanciaAotroPunto(p2), 0.001);
		
	}
}
