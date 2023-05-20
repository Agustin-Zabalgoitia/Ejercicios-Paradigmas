package edu.unlam.paradigmas.entradasalida.ej01;

import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo {

	/*
	 * Escribir un programa en Java, con todas las clases que considere necesarias,
	 * para la lectura y procesamiento de un archivo, de la siguiente manera: Se
	 * recibe un archivo en el cual la primera línea representa la cantidad de
	 * enteros que vendrán a continuación, y luego esa cantidad de enteros
	 * positivos, entre 0 y 9. Se pide escribir un archivo de salida que contenga en
	 * su primera línea un contador de números leídos (sin repetidos) y luego los
	 * números ordenados.
	 */

	private String nombre;

	public Archivo(String nombre) {
		this.nombre = nombre;
	}

	private int[] LeerArchivo() {

		Scanner scanner = null;
		int datos[] = null;

		try {
			File file = new File("casos de prueba/ejercicio 1/in/" + this.nombre + ".in");
			scanner = new Scanner(file);

			scanner.useLocale(Locale.ENGLISH);

			int cant = scanner.nextInt();
			datos = new int[cant];

			for (int i = 0; i < cant; i++) {
				datos[i] = scanner.nextInt();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}

		return datos;
	}

	private void GuardarArchivo(Integer[] datos) {

		FileWriter file = null;
		PrintWriter printWriter = null;

		try {
			file = new FileWriter("casos de prueba/ejercicio 1/out/" + this.nombre + ".out");
			printWriter = new PrintWriter(file);

			if (datos != null) {
				printWriter.print(datos.length);
				for (int i = 0; i < datos.length; i++) {
					printWriter.print("\n" + datos[i]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void GenerarSalida() {

		// Lee el archivo
		int[] datos = this.LeerArchivo();

		// Crea un treeset para que guarde y ordene los datos
		TreeSet<Integer> tDatos = new TreeSet<Integer>();

		// Se añaden los datos al treeset
		for (Integer numero : datos) {
			tDatos.add(numero);
		}

		Integer[] nuevosDatos = new Integer[tDatos.size()];
		nuevosDatos = tDatos.toArray(nuevosDatos);
		
		// Guarda los datos en un archivo nuevo
		this.GuardarArchivo(nuevosDatos);
	}

}
