package edu.unlam.paradigmas.excepciones.ej06;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.io.File;

public class Lector {
	public static ArrayList<String> leer(String nombreArchivo) {
		Scanner scanner = null;
		ArrayList<String> datos = new ArrayList<>();

		try {
			File file = new File("archivos/in/" + nombreArchivo);
			scanner = new Scanner(file);
			// Especifica la configuración regional que se va a utilizar
			scanner.useLocale(Locale.ENGLISH);

			while (scanner.hasNext()) {
				datos.add(scanner.nextLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Cerrar el archivo, eso es mucho muy importante
			scanner.close();
		}
		return datos;
	}

	public static ArrayList<String> leerDosArchivos(String nombreArchivo) {
		Scanner scanner = null;
		ArrayList<String> datos = new ArrayList<>();
		String nuevoNombre = null;

		try {
			File file = new File("archivos/in/" + nombreArchivo);
			scanner = new Scanner(file);
			// Especifica la configuración regional que se va a utilizar
			scanner.useLocale(Locale.ENGLISH);

			nuevoNombre = scanner.nextLine();

			scanner.close();

			try {
				file = new File("archivos/in/" + nuevoNombre);
				scanner = new Scanner(file);

				while (scanner.hasNext()) {
					datos.add(scanner.nextLine());
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		return datos;
	}
}
