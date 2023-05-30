package edu.unlam.paradigmas.herencia.ej01.Parte5;

import java.util.HashMap;

public class Cuenta {
	protected double saldo;
	protected HashMap<String, Double> registro = new HashMap<>();

	public boolean extraer(double monto, String motivo) {
		if (monto <= 0 && monto > this.saldo)
			return false;

		this.saldo -= monto;
		this.registro.put(motivo, -monto);
		return true;
	}

	public boolean depositar(double monto, String motivo) {
		if (monto < 0)
			return false;

		this.saldo += monto;
		this.registro.put(motivo, monto);
		return true;
	}

	public boolean transferir(double monto, Cuenta destino, String motivo) {
		if (!this.extraer(monto, motivo))
			return false;

		return destino.depositar(monto, motivo);
	}

	public double consultarSaldo() {
		return this.saldo;
	}

}
