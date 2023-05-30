package edu.unlam.paradigmas.herencia.ej01.Parte5;

public class CuentaCorriente extends Cuenta {
	private double montoDescubierto;

	public CuentaCorriente(double montoDescubierto) {
		super();
		this.montoDescubierto = montoDescubierto;
	}

	public boolean retirarTodo(Cuenta cuenta, String motivo) {
		if (!this.transferir(this.saldo, cuenta, motivo))
			return false;

		return cuenta.depositar(montoDescubierto, motivo);
	}
}
