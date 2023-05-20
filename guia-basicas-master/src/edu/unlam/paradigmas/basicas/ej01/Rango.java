package edu.unlam.paradigmas.basicas.ej01;

import java.util.Objects;

public class Rango implements Comparable<Rango> {
	private final double extremoInferior;
	private final double extremoSuperior;
	private final boolean esAbiertoInferior;
	private final boolean esAbiertoSuperior;

	// Constructor
	private Rango(double extremoInferior, double extremoSuperior, boolean esAbiertoInferior,
			boolean esAbiertoSuperior) {
		this.extremoInferior = extremoInferior;
		this.extremoSuperior = extremoSuperior;
		this.esAbiertoInferior = esAbiertoInferior;
		this.esAbiertoSuperior = esAbiertoSuperior;
	}

	// "Constructores"
	public static Rango CrearRangoCerrado(double extremoInferior, double extremoSuperior) {
		return new Rango(extremoInferior, extremoSuperior, false, false);
	}

	public static Rango CrearRangoAbierto(double extremoInferior, double extremoSuperior) {
		return new Rango(extremoInferior, extremoSuperior, true, true);
	}

	public static Rango CrearSemiAbiertoInferior(double extremoInferior, double extremoSuperior) {
		return new Rango(extremoInferior, extremoSuperior, true, false);
	}

	public static Rango CrearSemiAbiertoSuperior(double extremoInferior, double extremoSuperior) {
		return new Rango(extremoInferior, extremoSuperior, false, true);
	}

	// Métodos
	public boolean estaDentroDelRango(double numero) {
		// Abierto
		if (this.esAbiertoInferior && this.esAbiertoSuperior)
			return numero > this.extremoInferior && numero < this.extremoSuperior;

		// Cerrado
		if (!this.esAbiertoInferior && !this.esAbiertoSuperior)
			return numero >= this.extremoInferior && numero <= this.extremoSuperior;

		// Semi Abierto Inferior
		if (this.esAbiertoInferior && !this.esAbiertoSuperior)
			return numero > this.extremoInferior && numero <= this.extremoSuperior;

		// Semi Abierto Superior
		if (!this.esAbiertoInferior && this.esAbiertoSuperior)
			return numero >= this.extremoInferior && numero < this.extremoSuperior;

		return false;
	}

	public boolean estaDentroDelRango(Rango rango) {
		return this.estaDentroDelRango(rango.extremoInferior) && this.estaDentroDelRango(rango.extremoSuperior);
	}

	public boolean hayInterseccion(Rango rango) {
		return this.extremoSuperior > rango.extremoInferior && this.extremoInferior < rango.extremoSuperior;
	}

	public Rango obtenerInterseccion(Rango rango) {

		if (!this.hayInterseccion(rango))
			return Rango.CrearRangoAbierto(0, 0);

		double min;
		double max;
		boolean esAbiertoInferior;
		boolean esAbiertoSuperior;

		if (this.extremoInferior > rango.extremoInferior) {
			min = this.extremoInferior;
			esAbiertoInferior = this.esAbiertoInferior;
		} else {
			min = rango.extremoInferior;
			if (this.extremoInferior < rango.extremoInferior)
				esAbiertoInferior = rango.esAbiertoInferior;
			else
				esAbiertoInferior = this.esAbiertoInferior && rango.esAbiertoInferior;
		}

		if (this.extremoSuperior < rango.extremoSuperior) {
			max = this.extremoSuperior;
			esAbiertoSuperior = this.esAbiertoSuperior;
		} else {
			max = rango.extremoSuperior;
			if (this.extremoSuperior > rango.extremoSuperior)
				esAbiertoSuperior = rango.esAbiertoSuperior;
			else
				esAbiertoSuperior = this.esAbiertoSuperior && rango.esAbiertoSuperior;
		}

		return new Rango(min, max, esAbiertoInferior, esAbiertoSuperior);
	}

	public Rango sumarRangos(Rango rango) {
		return new Rango(this.extremoInferior, rango.extremoSuperior, this.esAbiertoInferior, rango.esAbiertoSuperior);
	}

	public Rango desplazarRango(double numero) {
		return new Rango(this.extremoInferior + numero, this.extremoSuperior + numero, this.esAbiertoInferior,
				this.esAbiertoSuperior);
	}

	@Override
	public String toString() {
		String inicio = "[";
		String fin = "]";

		if (this.esAbiertoInferior)
			inicio = "(";

		if (this.esAbiertoSuperior)
			fin = ")";

		return inicio + this.extremoInferior + ", " + this.extremoSuperior + fin;
	}

	@Override
	public int hashCode() {
		return Objects.hash(esAbiertoInferior, esAbiertoSuperior, extremoInferior, extremoSuperior);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rango other = (Rango) obj;
		return esAbiertoInferior == other.esAbiertoInferior && esAbiertoSuperior == other.esAbiertoSuperior
				&& Double.doubleToLongBits(extremoInferior) == Double.doubleToLongBits(other.extremoInferior)
				&& Double.doubleToLongBits(extremoSuperior) == Double.doubleToLongBits(other.extremoSuperior);
	}

	@Override
	public int compareTo(Rango rango) {
		int comparacion = (int) (this.extremoInferior - rango.extremoInferior);

		if (comparacion == 0)
			comparacion = (int) (this.extremoSuperior - rango.extremoSuperior);

		if (comparacion == 0) {
			if (this.esAbiertoInferior || this.esAbiertoSuperior)
				comparacion = -1;
			else
				comparacion = 0;
		}

		return comparacion;
	}

}
