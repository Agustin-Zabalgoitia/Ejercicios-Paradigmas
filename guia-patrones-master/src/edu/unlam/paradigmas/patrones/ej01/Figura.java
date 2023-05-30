package edu.unlam.paradigmas.patrones.ej01;

public abstract class Figura {

	protected String color;

	public Figura(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	//El área debe estar dada en centímetros cuadrados
	public abstract double getArea();
}
