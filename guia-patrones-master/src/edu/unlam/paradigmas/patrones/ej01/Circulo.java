package edu.unlam.paradigmas.patrones.ej01;

import edu.unlam.paradigmas.patrones.ej01.Excepciones.ExcepcionRadioCeroOMenor;

public class Circulo extends Figura {

	private double radio;

	public Circulo(double radio, String color) throws ExcepcionRadioCeroOMenor {
		super(color);

		if (radio <= 0)
			throw new ExcepcionRadioCeroOMenor();

		this.radio = radio;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radio, 2);
	}

}
