package edu.unlam.paradigmas.entradasalida.ej03;

public class Ring {
	/*
	 * Compara dos luchadores 
	 * devuelve  1 si l1 es dominante
	 * devuelve -1 si l2 es dominante
	 * devuelve  0 si ninguno es dominante
	 */
	public static int luchar(Luchador l1, Luchador l2) {

		int altura = l1.getAltura() - l2.getAltura();
		int peso = l1.getPeso() - l2.getPeso();

		if ((altura > 0 && peso >= 0) || (altura >= 0 && peso > 0))
			return 1;
		if ((altura < 0 && peso <= 0) || (altura <= 0 && peso < 0))
			return -1;

		return 0;
	}
}
