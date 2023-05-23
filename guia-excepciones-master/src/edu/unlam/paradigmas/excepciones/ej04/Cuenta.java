package edu.unlam.paradigmas.excepciones.ej04;

public class Cuenta {
	private double dineroDisponible;

	public Cuenta(int dineroDisponible) {
		this.dineroDisponible = dineroDisponible;
	}

	public void retirarDinero(double cantidad) {
		if (cantidad > dineroDisponible)
			throw new RuntimeException();

		this.dineroDisponible -= cantidad;
	}

	public double getDineroDisponible() {
		return this.dineroDisponible;
	}

}
