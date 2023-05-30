package edu.unlam.paradigmas.patrones.ej01;

import edu.unlam.paradigmas.patrones.ej01.Excepciones.ExcepcionLadoCeroOMenor;

public class Cuadrado extends Figura {

	private double lado;

	public Cuadrado(double lado, String color) throws ExcepcionLadoCeroOMenor {
		super(color);
		
		if (lado <= 0)
			throw new ExcepcionLadoCeroOMenor();

		this.lado = lado;
	}

	@Override
	public double getArea() {
		return Math.pow(lado, 2);
	}

}
