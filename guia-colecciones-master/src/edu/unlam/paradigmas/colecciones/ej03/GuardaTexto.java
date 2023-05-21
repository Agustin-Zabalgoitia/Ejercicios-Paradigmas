package edu.unlam.paradigmas.colecciones.ej03;

import java.util.HashSet;

public class GuardaTexto {
	private HashSet<String> palabras = new HashSet<>();

	public void guardarPalabras(String texto) {

		String[] split = texto.split("\\W+");

		for (String string : split) {
			this.palabras.add(string);
		}

	}

	public HashSet<String> getPalabras() {
		return this.palabras;
	}

	@Override
	public String toString() {
		String lista = "";
		for (String palabra : palabras) {
			lista += palabra + " ";
		}
		if (lista.endsWith(" "))
			lista = lista.substring(0, lista.length() - 1);
		return lista;
	}

}
