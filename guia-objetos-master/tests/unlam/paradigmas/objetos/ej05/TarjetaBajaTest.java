package unlam.paradigmas.objetos.ej05;

import static org.junit.Assert.*;

import org.junit.Test;

public class TarjetaBajaTest {

	@Test
	public void CrearTarjeta() {
		TarjetaBaja t = new TarjetaBaja(100);
		assertNotNull(t);
	}

	@Test
	public void ObtenerSaldo() {
		TarjetaBaja t = new TarjetaBaja(1230456789.0123);
		assertEquals(1230456789.0123, t.obtenerSaldo(), 0);
	}

	@Test
	public void CargarTarjeta() {
		TarjetaBaja t = new TarjetaBaja(-963);
		t.cargar(963);
		assertEquals(0, t.obtenerSaldo(), 0);
	}

	@Test
	public void PagarViajeEnColectivo() {
		TarjetaBaja t = new TarjetaBaja(40);
		t.pagarViajeEnColectivo();
		assertEquals(0.41, t.obtenerSaldo(), 0.0001);
	}

	
	@Test
	public void PagarMuchosViajesEnColectivo() {
		TarjetaBaja t = new TarjetaBaja(Double.MAX_VALUE);
		
		for(int i = 0 ; i<1_000_000 ; ++i) {
			t.pagarViajeEnColectivo();
		}
		
		assertEquals(Double.MAX_VALUE - 34.5*1_000_000, t.obtenerSaldo(), 0.0001);
	}

	@Test
	public void ContarViajes() {
		TarjetaBaja t = new TarjetaBaja(Double.MAX_VALUE);
		for(int i = 0 ; i<1_000_000 ; ++i) {
			t.pagarViajeEnColectivo();
			t.pagarViajeEnSubte();
		}
		assertEquals(2_000_000, t.contarViajes());
		assertEquals(1_000_000, t.contarViajesEnColectivo());
		assertEquals(1_000_000, t.contarViajesEnSubte());
	}
}
