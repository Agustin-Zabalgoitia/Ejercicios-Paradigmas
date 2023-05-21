package edu.unlam.paradigmas.colecciones.ej02;

import java.util.LinkedList;

public class Registro {
	private LinkedList<Venta> ventas = new LinkedList<Venta>();

	public void agregarVenta(Venta v) {
		this.ventas.add(v);
	}

	public Venta buscarVenta(int numVenta) {
		if (this.ventas.size() == 0)
			return null;

		int i = 0;
		while (i < this.ventas.size() && this.ventas.get(i).numVenta != numVenta) {
			i++;
		}

		return i < this.ventas.size() && this.ventas.get(i).numVenta == numVenta ? this.ventas.get(i) : null;
	}

	public String mostrarVentas(int dia) {
		String total = null;
		for (Venta venta : ventas) {
			if (venta.fecha == dia) {
				if (total == null)
					total = venta.toString();
				else
					total += venta.toString();
			}
		}
		return total;
	}

	public LinkedList<Venta> getVentas() {
		return ventas;
	}

}
