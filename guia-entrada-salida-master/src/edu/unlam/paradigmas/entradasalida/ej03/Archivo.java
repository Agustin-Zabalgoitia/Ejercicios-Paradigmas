package edu.unlam.paradigmas.entradasalida.ej03;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo {

	private String path;

	public Archivo(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public int[] leerArchivo() {
		int[] datos = null;
		Scanner scanner = null;

		try {

			File file = new File(this.path);
			scanner = new Scanner(file);

			int cant = scanner.nextInt() * 2;
			datos = new int[cant];

			for (int i = 0; i < cant; i++)
				datos[i] = scanner.nextInt();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}

		return datos;
	}

	public void generarArchivo(int[] datos) {

		FileWriter file = null;
		PrintWriter printWriter = null;

		try {

			file = new FileWriter(this.path);
			printWriter = new PrintWriter(file);

			for (int dato : datos) {
				printWriter.println(dato);
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
