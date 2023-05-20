package edu.unlam.paradigmas.entradasalida.ej03;

import static org.junit.Assert.*;

import org.junit.Test;

public class RingTest {

	@Test
	public void PrimerLuchadorSiempreDominaConPeso() {
		for (int i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE - 1; i++) {
			Luchador l1 = new Luchador(i + 1, i);
			Luchador l2 = new Luchador(i, i);
			assertEquals(1, Ring.luchar(l1, l2));
		}
	}
	
	@Test
	public void PrimerLuchadorSiempreDominaConAltura() {
		for (int i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE - 1; i++) {
			Luchador l1 = new Luchador(i, i+1);
			Luchador l2 = new Luchador(i, i);
			assertEquals(1, Ring.luchar(l1, l2));
		}
	}
	
	@Test
	public void PrimerLuchadorSiempreDominaConPesoYAltura() {
		for (int i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE - 1; i++) {
			Luchador l1 = new Luchador(i + 1, i+1);
			Luchador l2 = new Luchador(i, i);
			assertEquals(1, Ring.luchar(l1, l2));
		}
	}

	@Test
	public void SegundoLuchadorSiempreDominaConPeso() {
		for (int i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE - 1; i++) {
			Luchador l1 = new Luchador(i,i);
			Luchador l2 = new Luchador(i+1,i);
			assertEquals(-1, Ring.luchar(l1, l2));
		}
	}
	
	@Test
	public void SegundoLuchadorSiempreDominaConAltura() {
		for (int i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE - 1; i++) {
			Luchador l1 = new Luchador(i,i);
			Luchador l2 = new Luchador(i,i+1);
			assertEquals(-1, Ring.luchar(l1, l2));
		}
	}
	
	@Test
	public void SegundoLuchadorSiempreDominaConPesoYAltura() {
		for (int i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE - 1; i++) {
			Luchador l1 = new Luchador(i,i);
			Luchador l2 = new Luchador(i+1,i+1);
			assertEquals(-1, Ring.luchar(l1, l2));
		}
	}

	@Test
	public void NingunLuchadorIgualDomina() {
		for (int i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE - 1; i++) {
			Luchador l1 = new Luchador(i,i);
			Luchador l2 = new Luchador(i,i);
			assertEquals(0, Ring.luchar(l1, l2));
		}
	}

	@Test
	public void NingunLuchadorDistintoDomina() {
		for (int i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE - 1; i++) {
			Luchador l1 = new Luchador(i+1,i);
			Luchador l2 = new Luchador(i,i+1);
			assertEquals(0, Ring.luchar(l1, l2));
		}
	}
	
}