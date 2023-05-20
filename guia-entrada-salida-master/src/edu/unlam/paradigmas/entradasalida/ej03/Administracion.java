package edu.unlam.paradigmas.entradasalida.ej03;

public class Administracion {

	private Luchador[] luchadores = null;

	public Luchador[] getLuchadores() {
		return this.luchadores;
	}

	public void registrarLuchadores(String path) {

		Archivo archivo = new Archivo(path);
		int[] datos = archivo.leerArchivo();

		luchadores = new Luchador[datos.length / 2];

		for (int i = 0; i < datos.length / 2; i++) {
			luchadores[i] = new Luchador(datos[i * 2], datos[i * 2 + 1]);
		}

	}

	public void guardarDominantes(String path) {

		int[] datosOut = new int[luchadores.length];

		for (int i = 0; i < luchadores.length - 1; i++) {
			for (int j = i + 1; j < luchadores.length; j++) {
				int dominante = Ring.luchar(luchadores[i], luchadores[j]);

				if (dominante > 0)
					datosOut[i]++;
				else if (dominante < 0)
					datosOut[j]++;
			}
		}

		Archivo archivo = new Archivo(path);

		archivo.generarArchivo(datosOut);
	}

}
