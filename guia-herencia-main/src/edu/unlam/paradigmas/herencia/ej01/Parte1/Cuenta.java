package edu.unlam.paradigmas.herencia.ej01.Parte1;

public class Cuenta {
	// -----------------------------------------------------------------------------
	// Preguntas Parte 1
	// -----------------------------------------------------------------------------
	// •¿Qué tipo de dato se utilizó para el saldo? ¿Es el más apropiado?
	// Se utilizó el tipo double, ya que si bien en esta parte no se utilizaron
	// decimales
	// es posible que más adelante se dé la ocasión, por lo que es necesario tener
	// un tipo
	// de dato que lo soporte.

	// •¿Qué visibilidad tiene el atributo saldo de la Cuenta? ¿Es correcto?
	// Tiene visibilidad protected para que otros elementos del paquete puedan verlo
	// y modificarlo.
	// Es correcto porque permite ejecutar el código dado, pero no es recomendable,
	// ya que cualquier
	// elemento del paquete lo puede modificar o asignar valores que no sean
	// adecuados para esta clase

	// •Si extraigo más dinero del disponible en saldo, seguramente pueda hacerlo.
	// ¿Está bien que así sea?
	// Depende si esto es una cuenta de crédito o una caja de ahorros, en el primer
	// caso estaría bien ya que
	// es posible contraer deuda con el banco, en el segundo no porque estás sacando
	// tu plata, no la del banco.
	// -----------------------------------------------------------------------------
	
	protected double saldo;
}
