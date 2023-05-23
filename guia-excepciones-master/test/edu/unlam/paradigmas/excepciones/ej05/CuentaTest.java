package edu.unlam.paradigmas.excepciones.ej05;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {

	@Test
	public void CrearCuentaSinSaldo() {
		try {
			Cuenta c = new Cuenta(0);
			assertEquals(0, c.getDineroDisponible(), 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void CrearCuentaConSaldoPositivo() {
		try {
			Cuenta c = new Cuenta(7125);
			assertEquals(7125, c.getDineroDisponible(), 0);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void CrearCuentaConSaldoNegativo() {
		try {
			Cuenta c = new Cuenta(-1);
			assertEquals(-1, c.getDineroDisponible(), 0);
		} catch (Exception e) {
			System.out.println("imposible crear cuenta debido a que se introdujo un saldo negativo. Excepcion: " + e);
		}
	}

	@Test
	public void DepositarSaldoCero() {
		try {
			Cuenta c = new Cuenta(0);
			c.ingresarDinero(0);
			assertEquals(0, c.getDineroDisponible(), 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void DepositarSaldoPositivo() {
		try {
			Cuenta c = new Cuenta(0);
			c.ingresarDinero(19850);
			assertEquals(19850, c.getDineroDisponible(), 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void DepositarSaldoNegativo() {
		try {
			Cuenta c = new Cuenta(0);
			c.ingresarDinero(-77112);
			assertEquals(-77112, c.getDineroDisponible(), 0);
		} catch (Exception e) {
			System.out.println(
					"imposible ingresar dinero debido a que se introdujo una cantidad negativa. Excepcion: " + e);
		}
	}

	@Test
	public void RetirarDineroCero() {
		try {
			Cuenta c = new Cuenta(1980);
			c.retirarDinero(0);
			assertEquals(1980, c.getDineroDisponible(), 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void RetirarDineroPositivo() {
		try {
			Cuenta c = new Cuenta(1980);
			c.retirarDinero(980);
			assertEquals(1000, c.getDineroDisponible(), 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void RetirarDineroNegativo() {
		try {
			Cuenta c = new Cuenta(1980);
			c.retirarDinero(-1000);
			assertEquals(2980, c.getDineroDisponible(), 0);
		} catch (Exception e) {
			System.out.println(
					"imposible retirar dinero debido a que se introdujo una cantidad negativa. Excepcion: " + e);
		}
	}
}
