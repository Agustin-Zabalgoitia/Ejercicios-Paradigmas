package unlam.paradigmas.objetos.ej03;

public class Circulo {
	/*
	 * Implementar una clase que modele un círculo, del que se desea manipular
	 * (obtener y cambiar): radio diámetro perímetro área Realizar todas las pruebas
	 * que considere convenientes. Se pueden agregar métodos privados.
	 */
	
	//Atributos
	private double radio;
	
	//Constructor
	public Circulo(double radio) {
		this.radio = radio;
	}

	//Métodos
	public double getRadio() {
		return this.radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getDiametro() {
		return 2*this.radio;
	}
	
	public double getPerimetro() {
		return 2*Math.PI*this.radio;
	}

	public double getArea() {
		return Math.PI*this.radio*this.radio;
	}
	
}
