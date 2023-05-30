package edu.unlam.paradigmas.herencia.ej01.Parte5;

public class CuentaDeAhorros extends Cuenta {
	public boolean reservarSaldo(double monto, Cuenta origen, String motivo) {
		return origen.transferir(monto, this, motivo);
	}

	public boolean reintegrar(Cuenta cuenta, String motivo) {
		return cuenta.transferir(this.saldo, cuenta, motivo);
	}

}
