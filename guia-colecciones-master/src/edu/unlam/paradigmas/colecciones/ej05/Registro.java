package edu.unlam.paradigmas.colecciones.ej05;

import java.util.HashMap;
import java.util.Map;

public class Registro {
	HashMap<Integer, Integer> ventas = new HashMap<>();

	void agregarVenta(int mes, int cantidadVentas) {
		this.ventas.put(mes, cantidadVentas);
	}

	@Override
	public String toString() {
		String lista = null;

		for (Map.Entry<Integer, Integer> entry : ventas.entrySet()) {
			Integer mes = entry.getKey();
			Integer venta = entry.getValue();
			lista += "Mes " + mes + " Ventas: " + venta + "\n";
		}

		return lista;
	}

}
