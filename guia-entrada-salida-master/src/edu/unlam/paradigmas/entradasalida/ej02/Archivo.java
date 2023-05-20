package edu.unlam.paradigmas.entradasalida.ej02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo {
	// Atributos
	private String nombre;

	// Contructor
	public Archivo(String nombre) {
		this.nombre = nombre;
	}

	// Métodos
	public String getNombre() {
		return nombre;
	}

	public List<Integer> leerArchivo() {

		List<Integer> datos = null;
		Scanner scanner = null;

		try {
			File file = new File("casos de prueba/ejercicio 2/in/" + this.nombre + ".in");
			scanner = new Scanner(file);

			datos = new ArrayList<Integer>();

			while (scanner.hasNextInt()) {
				datos.add(scanner.nextInt());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}

		return datos;
	}

	public void generarArchivo(List<Integer> datos) {

		FileWriter file = null;
		PrintWriter printWriter = null;

		try {
			file = new FileWriter("casos de prueba/ejercicio 2/out/" + this.nombre + ".out");
			printWriter = new PrintWriter(file);

			for (Integer numero : datos) {
				printWriter.println(numero);
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

	//TODO: arreglar esto para que solo haya un método generarArchivo(List<> datos)
	public void generarArchivoString(List<String> datos) {
		FileWriter file = null;
		PrintWriter printWriter = null;

		try {
			file = new FileWriter("casos de prueba/ejercicio 2/out/" + this.nombre + ".out");
			printWriter = new PrintWriter(file);

			for (String linea : datos) {
				printWriter.println(linea);
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

}
