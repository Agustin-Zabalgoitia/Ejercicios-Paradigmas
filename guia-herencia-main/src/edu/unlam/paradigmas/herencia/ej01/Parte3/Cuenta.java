package edu.unlam.paradigmas.herencia.ej01.Parte3;

public class Cuenta {
	private double saldo;

	public boolean extraer(double monto) {
		if (monto <= 0 && monto > this.saldo)
			return false;

		this.saldo -= monto;
		return true;
	}

	public boolean depositar(double monto) {
		if (monto < 0)
			return false;

		this.saldo += monto;
		return true;
	}

	public boolean transferir(double monto, Cuenta destino) {
		if (!this.extraer(monto))
			return false;

		return destino.depositar(monto);
	}

	public double consultarSaldo() {
		return this.saldo;
	}

	/*
	 * •Al interactuar con objetos del mismo tipo, es importante distinguir entre
	 * parámetros y atributos. ¿Cómo puede hacerse para evitar confusiones?
	 * 
	 * Es importante distinguirlos ya que los atributos son propios del objeto y
	 * perdurarán una vez que termine la función, mientras que los parámetros
	 * dejarán de existir fuera de la función. Se puede distinguir entre ambos
	 * utilizando la palabra reservada "this", esto hace referncia al objeto creado.
	 * 
	 * •¿Es correcto el orden de los parámetros para el método transferir? ¿Qué
	 * cambiarías?
	 * 
	 * El orden de los parámetros es correcto para el código dado.
	 * 
	 * •Dentro del código de transferir, ¿utilizaste los métodos preexistentes o
	 * repetiste lógica que ya existía? ¿Cuál es la ventaja de cada una de las
	 * aproximaciones?
	 * 
	 * Utilicé los métodos existentes, es innecesario repetir lógica. La primera
	 * evita repetir código, lo que hace que el mantenimiento o futuros cambios sean
	 * más fáciles, y la segunda permite modificar el comportamiento deseado
	 * dependiendo del caso.
	 * 
	 * •¿Qué pasaría si la operación de transferir se ve interrumpida a la mitad de
	 * su ejecución? ¿Cómo se podría prevenir esto?
	 * 
	 * Se perdería plata del "sistema", y se podría evitar con excepciones que se
	 * verán más adelante en la cursada.
	 * 
	 */

}
