package edu.unlam.paradigmas.excepciones.ej05;

public class Cuenta {
	private double dineroDisponible;

	// ---Constructor---
	public Cuenta(int dineroDisponible) throws ExcepcionCrearCuentaConSaldoNegativo {
		if (dineroDisponible < 0)
			throw new ExcepcionCrearCuentaConSaldoNegativo();

		this.dineroDisponible = dineroDisponible;
	}

	// ---Getters---
	public double getDineroDisponible() {
		return this.dineroDisponible;
	}

	// ---Métodos---
	public void ingresarDinero(double cantidad) throws ExcepcionOperacionesConMontosNegativos {
		if (cantidad < 0)
			throw new ExcepcionOperacionesConMontosNegativos();

		this.dineroDisponible += cantidad;
	}

	public void retirarDinero(double cantidad) throws ExcepcionOperacionesConMontosNegativos {
		if (cantidad < 0 || cantidad > dineroDisponible)
			throw new ExcepcionOperacionesConMontosNegativos();

		this.dineroDisponible -= cantidad;
	}

}
