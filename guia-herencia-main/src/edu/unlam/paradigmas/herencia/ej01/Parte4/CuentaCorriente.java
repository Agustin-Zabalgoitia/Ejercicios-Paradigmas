package edu.unlam.paradigmas.herencia.ej01.Parte4;

public class CuentaCorriente extends Cuenta {
	private double montoDescubierto;

	public CuentaCorriente(double montoDescubierto) {
		super();
		this.montoDescubierto = montoDescubierto;
	}

	public boolean retirarTodo(Cuenta cuenta) {
		if (!this.transferir(this.saldo, cuenta))
			return false;

		return cuenta.depositar(montoDescubierto);
	}

}
