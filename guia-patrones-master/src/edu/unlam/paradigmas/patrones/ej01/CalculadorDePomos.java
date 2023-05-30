package edu.unlam.paradigmas.patrones.ej01;

public class CalculadorDePomos {
	public static int obtenerPomos(Figura figura) {
		return (int) Math.ceil(figura.getArea() / 100);
	}
}
