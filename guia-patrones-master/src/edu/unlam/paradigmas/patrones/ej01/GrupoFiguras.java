package edu.unlam.paradigmas.patrones.ej01;

import java.util.ArrayList;

import edu.unlam.paradigmas.patrones.ej01.Excepciones.ExcepcionColorDistinto;

public class GrupoFiguras extends Figura {

	private ArrayList<Figura> figuras;

	public GrupoFiguras(ArrayList<Figura> figuras, String color) throws ExcepcionColorDistinto {
		super(color);

		//Por condición del enunciado, los grupos de figuras tendrán figuras del mismo color.
		for (Figura figura : figuras) {
			if (figura.getColor() != this.color)
				throw new ExcepcionColorDistinto();
		}

		this.figuras = figuras;
	}

	@Override
	public double getArea() {
		double areaTotal = 0;
		for (Figura figura : this.figuras) {
			areaTotal += figura.getArea();
		}

		return areaTotal;
	}

	public ArrayList<Figura> getFiguras() {
		return figuras;
	}

}