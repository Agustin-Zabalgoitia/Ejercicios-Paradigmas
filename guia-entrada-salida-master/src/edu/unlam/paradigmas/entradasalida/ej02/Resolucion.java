package edu.unlam.paradigmas.entradasalida.ej02;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Resolucion {

	/*
	 * 1. Escribir un archivo de entre 10 mil y 20 mil números enteros aleatorios,
	 * en el rango de 0 a 12000. (La cantidad de números debe ser aleatoria)
	 */
	public void crearArchivoAleatorio(String nombreArchivo) {
		List<Integer> datos = new ArrayList<Integer>();

		int tam = (int) (Math.random() * 10000) + 10000;

		for (int i = 0; i < tam; i++) {
			datos.add((int) (Math.random() * 12000));
		}

		Archivo archivo = new Archivo(nombreArchivo);
		archivo.generarArchivo(datos);
	}

	/*
	 * 2. Leer dicho archivo, buscando (a) máximo, (b) mínimo, (c) promedio.
	 * 3. Escribr un segundo archivo con una tabla de resultados. Ejemplo:
	 * +----------+-------+
	 * | Máximo   | 11978 |
	 * +----------+-------+
	 * | Mínimo   |     3 |
	 * +----------+-------+
	 * | Promedio |  7201 |
	 * +----------+-------+
	 * ¡El formato de la última salida es parte del desafío!
	 */
	public void leerArchivoCreadoYGenerarRespuesta(String nombreArchivoEntrada, String nombreArchivoSalida) {
		Archivo in = new Archivo(nombreArchivoEntrada);
		List<Integer> datosIn = in.leerArchivo();
		
		List<String> datosOut = new ArrayList<String>();
		
		int suma = 0;
		
		for(Integer numero: datosIn) {
			suma += numero;
		}
		
		datosOut.add("+----------+-------+");
		datosOut.add("| Máximo   |"+String.format("%6d",Collections.max(datosIn))+" |");
		datosOut.add("+----------+-------+");
		datosOut.add("| Mínimo   |"+String.format("%6d",Collections.min(datosIn))+" |");
		datosOut.add("+----------+-------+");
		datosOut.add("| Promedio |"+String.format("%6d", (suma/datosIn.size()))+" |");
		datosOut.add("+----------+-------+");
		
		Archivo out = new Archivo(nombreArchivoSalida);
		out.generarArchivoString(datosOut);
	}

}
