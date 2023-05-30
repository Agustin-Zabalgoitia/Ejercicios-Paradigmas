package edu.unlam.paradigmas.patrones.ej01;

import edu.unlam.paradigmas.patrones.ej01.Excepciones.ExcepcionAlturaCeroOMenor;
import edu.unlam.paradigmas.patrones.ej01.Excepciones.ExcepcionBaseCeroOMenor;

public class Triangulo extends Figura {

	private double base;
	private double altura;

	public Triangulo(double base, double altura, String color)
			throws ExcepcionBaseCeroOMenor, ExcepcionAlturaCeroOMenor {
		super(color);

		if (base <= 0)
			throw new ExcepcionBaseCeroOMenor();
		if (altura <= 0)
			throw new ExcepcionAlturaCeroOMenor();

		this.base = base;
		this.altura = altura;
	}

	@Override
	public double getArea() {
		return (this.base * this.altura) / 2;
	}

}
