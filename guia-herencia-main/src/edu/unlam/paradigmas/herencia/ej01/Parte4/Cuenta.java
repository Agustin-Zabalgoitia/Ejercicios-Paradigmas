package edu.unlam.paradigmas.herencia.ej01.Parte4;

public class Cuenta {
	protected double saldo;

	public boolean extraer(double monto) {
		if (monto <= 0 && monto > this.saldo)
			return false;

		this.saldo -= monto;
		return true;
	}

	public boolean depositar(double monto) {
		if (monto < 0)
			return false;

		this.saldo += monto;
		return true;
	}

	public boolean transferir(double monto, Cuenta destino) {
		if (!this.extraer(monto))
			return false;

		return destino.depositar(monto);
	}

	public double consultarSaldo() {
		return this.saldo;
	}

	/*
	 * •¿Hubo alguna funcionalidad que pudiera reutilizarse?
	 * 
	 * El método transferir y depositar se puedieron reutilizar
	 * 
	 * •¿Qué método tuvo que rehacerse?
	 * 
	 * Gracias a la magia de la herencia, ninguno.
	 * 
	 * •¿Cómo se manejan transferencias entre tipos de cuenta diferentes?
	 * 
	 * Los dos son cuentas por lo que ambas se transfieren de la misma manera
	 * 
	 */

}
