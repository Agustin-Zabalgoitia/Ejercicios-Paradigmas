package edu.unlam.paradigmas.colecciones.ej01;

import java.util.Objects;

public class Paquete {
	// Cada paquete tiene un número de seguimiento, dirección de origen, dirección
	// de destino y peso.
	int numSeguimiento;
	int dirOrigen, dirDestino;
	double peso;

	public Paquete() {
		super();
	}
	
	public Paquete(int numSeguimiento, int dirOrigen, int dirDestino, double peso) {
		super();
		this.numSeguimiento = numSeguimiento;
		this.dirOrigen = dirOrigen;
		this.dirDestino = dirDestino;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Paquete [numSeguimiento=" + numSeguimiento + ", dirOrigen=" + dirOrigen + ", dirDestino=" + dirDestino
				+ ", peso=" + peso + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dirDestino, dirOrigen, numSeguimiento, peso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paquete other = (Paquete) obj;
		return dirDestino == other.dirDestino && dirOrigen == other.dirOrigen && numSeguimiento == other.numSeguimiento
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso);
	}
	
	
}