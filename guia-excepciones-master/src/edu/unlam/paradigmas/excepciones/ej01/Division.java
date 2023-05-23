package edu.unlam.paradigmas.excepciones.ej01;

public class Division {
	public static double dividir(int a, int b) throws Exception {
		if (b == 0)
			throw new ArithmeticException();
		
		return a / b;
	}
}
