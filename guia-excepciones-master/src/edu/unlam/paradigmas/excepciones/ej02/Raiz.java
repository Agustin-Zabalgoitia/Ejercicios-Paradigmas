package edu.unlam.paradigmas.excepciones.ej02;

public class Raiz {
	public static double cuadrada(double a) throws ExcepcionPropia {
		if (a < 0)
			throw new ExcepcionPropia();

		return Math.sqrt(a);
	}
}
