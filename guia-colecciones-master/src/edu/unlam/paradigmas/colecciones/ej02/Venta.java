package edu.unlam.paradigmas.colecciones.ej02;

import java.util.Objects;

public class Venta {
	// Cada venta tiene un número de venta, fecha, hora, nombre del cliente y monto
	// de la venta.
	protected int numVenta;
	protected int fecha;
	protected double hora;
	protected String nombreCliente;
	protected double monto;

	public Venta(int numVenta, int fecha, double hora, String nombreCliente, double monto) {
		super();
		this.numVenta = numVenta;
		this.fecha = fecha;
		this.hora = hora;
		this.nombreCliente = nombreCliente;
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Venta [numVenta=" + numVenta + ", fecha=" + fecha + ", hora=" + hora + ", nombreCliente="
				+ nombreCliente + ", monto=" + monto + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(fecha, hora, monto, nombreCliente, numVenta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venta other = (Venta) obj;
		return fecha == other.fecha && Double.doubleToLongBits(hora) == Double.doubleToLongBits(other.hora)
				&& Double.doubleToLongBits(monto) == Double.doubleToLongBits(other.monto)
				&& Objects.equals(nombreCliente, other.nombreCliente) && numVenta == other.numVenta;
	}

}
