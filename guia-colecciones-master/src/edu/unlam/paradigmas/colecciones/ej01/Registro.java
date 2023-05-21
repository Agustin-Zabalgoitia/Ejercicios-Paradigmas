package edu.unlam.paradigmas.colecciones.ej01;

import java.util.ArrayList;
import java.util.Objects;

public class Registro {
	private ArrayList<Paquete> paquetes = new ArrayList<Paquete>();

	public void agregarPaquete(Paquete p) {
		this.paquetes.add(p);
	}

	public Paquete buscarPaquete(int numSeguimiento) {
		if (this.paquetes.size() == 0)
			return null;

		int i = 0;
		while (i < this.paquetes.size() && this.paquetes.get(i).numSeguimiento != numSeguimiento) {
			i++;
		}

		return i < this.paquetes.size() && this.paquetes.get(i).numSeguimiento == numSeguimiento ? this.paquetes.get(i)
				: null;
	}

	public void mostrarPaquetes(double peso) {
		for (Paquete paquete : this.paquetes) {
			if (paquete.peso > peso)
				System.out.println(paquete);
		}
	}

	public ArrayList<Paquete> getPaquetes() {
		return paquetes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(paquetes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Registro other = (Registro) obj;
		return Objects.equals(paquetes, other.paquetes);
	}

}
