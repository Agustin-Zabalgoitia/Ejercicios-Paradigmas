package edu.unlam.paradigmas.excepciones.ej03;

public class Cociente {
	public static int cociente(int a, int b) throws ExcepcionDivisorCero {
		if (b == 0)
			throw new ExcepcionDivisorCero();

		return a / b;
	}
}
