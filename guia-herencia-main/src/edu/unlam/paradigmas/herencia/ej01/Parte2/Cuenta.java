package edu.unlam.paradigmas.herencia.ej01.Parte2;

public class Cuenta {
	private double saldo;

	public void extraer(double monto) {
		if (monto >= 0 && monto <= this.saldo)
			this.saldo -= monto;
	}

	public void depositar(double monto) {
		if (monto >= 0)
			this.saldo += monto;
	}

	/*
	 * -----------------------------------------------------------------------------
	 * Preguntas Parte 2
	 * -----------------------------------------------------------------------------
	 * •¿Qué ventaja representó la incorporación del Encapsulamiento en el problema?
	 * 
	 * Como ventaja fuimos capaces de añadirle condiciones a la modificación del
	 * saldo de la cuenta, ademas de que ahora solo el mismo objeto cuenta será
	 * capaz de cambiar el sueldo, por lo que no nos encontraremos cambios
	 * innesperados en el valor del sueldo más adelante.
	 * 
	 * •¿Qué desventaja podríamos encontrar?
	 * 
	 * Es necesario crear un método nuevo para acceder al valor del sueldo, y
	 * también se debe crear un método para modificarlo.
	 * 
	 * •¿Es realmente Programación Orientada a Objetos? ¿Cómo puedo saberlo?
	 * 
	 * Sí, ya que es necesario la creación de un objeto antes de poder utilizar
	 * todos los valores, variables y métodos que definimos acá. Si todo esto
	 * estuviera definido dentro del main, o de un archivo de funciones, bastaría
	 * con solo llamar a los métodos y a las variables para poder acceder a ellas,
	 * sin embargo, es necesario crear un objeto antes de poder usarlas.
	 * 
	 * •¿Qué acciones se utilizaron para prevenir la realización de operaciones no
	 * válidas?
	 * 
	 * Se crearon dos métodos para modificar los valores del sueldo, dentro de esos
	 * métodos se impidió la realización de operaciones no deseadas mediante un
	 * condicional if.
	 * -----------------------------------------------------------------------------
	 */
}
