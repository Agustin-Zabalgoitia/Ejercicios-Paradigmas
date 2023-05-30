package edu.unlam.paradigmas.herencia.ej01.Parte4;

public class CuentaDeAhorros extends Cuenta {
	public boolean reservarSaldo(double monto, Cuenta origen) {
		return origen.transferir(monto, this);
	}

	public boolean reintegrar(Cuenta cuenta) {
		return cuenta.transferir(this.saldo, cuenta);
	}

}
