package edu.unlam.paradigmas.entradasalida.ej03;

import java.util.Objects;

public class Luchador {
	private int peso;
	private int altura;
	
	public Luchador(int peso, int altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	public int getPeso() {
		return peso;
	}
	public int getAltura() {
		return altura;
	}

	@Override
	public int hashCode() {
		return Objects.hash(altura, peso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Luchador other = (Luchador) obj;
		return altura == other.altura && peso == other.peso;
	}

	@Override
	public String toString() {
		return "Luchador [peso=" + peso + ", altura=" + altura + "]";
	}
	
}