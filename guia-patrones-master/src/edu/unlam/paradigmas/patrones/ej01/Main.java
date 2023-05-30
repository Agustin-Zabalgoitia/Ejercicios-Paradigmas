package edu.unlam.paradigmas.patrones.ej01;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Figura> arrayFiguras = new ArrayList<>();

		for (int i = 1; i < 11; i++)
			arrayFiguras.add(new Circulo(i * 2, "azul"));

		for (int i = 1; i < 6; i++)
			arrayFiguras.add(new Cuadrado(i, "azul"));

		for (int i = 1; i < 3; i++)
			arrayFiguras.add(new Triangulo(i, i * 3, "azul"));

		GrupoFiguras gp = new GrupoFiguras(arrayFiguras, "azul");		
		GrupoFiguras gp2 = new GrupoFiguras(arrayFiguras, gp.getColor());		
		GrupoFiguras gp3 = new GrupoFiguras(arrayFiguras, gp2.getColor());
		
		System.out.println(gp.getArea());
		System.out.println(gp2.getArea());
		System.out.println(gp3.getArea());
		
		int cantPomos = (int) Math.ceil(gp.getArea() / 100);
		System.out.println("La cantidad de pomos serán: " + cantPomos);
	}
}
