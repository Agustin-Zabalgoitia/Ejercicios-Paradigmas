package unlam.paradigmas.objetos.ej05;

public class TarjetaBaja {

	// completar
	private double saldo;
	private int viajesEnSubte, viajesEnColectivo;
	

	/**
	 * post: saldo de la Tarjeta en saldoInicial.
	 */
	public TarjetaBaja(double saldoInicial) {
		this.saldo = saldoInicial;
	}

	/**
	 * post: devuelve el saldo actual de la Tarjeta
	 */
	public double obtenerSaldo() {
		return this.saldo;
	}

	/**
	 * post: agrega el monto al saldo de la Tarjeta.
	 */
	public void cargar(double monto) {
		this.saldo += monto;
	}

	/**
	 * pre : saldo suficiente. post: utiliza 39.59 del saldo para un viaje en
	 * colectivo.
	 */
	public void pagarViajeEnColectivo() {
		if (this.saldo > 39.59) {
			this.saldo -= 39.59;
			this.viajesEnColectivo++;
		}
	}

	/**
	 * pre : saldo suficiente. post: utiliza 34.50 del saldo para un viaje en subte.
	 */
	public void pagarViajeEnSubte() {
		if (this.saldo > 34.50) {
			this.saldo -= 34.50;
			this.viajesEnSubte++;
		}
	}

	/**
	 * post: devuelve la cantidad de viajes realizados.
	 */
	public int contarViajes() {
		return this.viajesEnSubte + this.viajesEnColectivo;
	}

	/**
	 * post: devuelve la cantidad de viajes en colectivo.
	 */
	public int contarViajesEnColectivo() {
		return this.viajesEnColectivo;
	}

	/**
	 * post: devuelve la cantidad de viajes en subte.
	 */
	public int contarViajesEnSubte() {
		return this.viajesEnSubte;
	}

}
