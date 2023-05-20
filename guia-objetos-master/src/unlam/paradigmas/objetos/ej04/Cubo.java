package unlam.paradigmas.objetos.ej04;

public class Cubo {
	
	//Atributos
	private double longitudLado;
	
    /**
     * pre : longitudLado es un valor mayor a 0.
     * post: inicializa el cubo a partir de la longitud de lado dada
     */
    public Cubo (double longitudLado) {
    	this.longitudLado = longitudLado;
    }

    /**
     * post: devuelve la longitud de todos los lados del cubo
     */
    public double obtenerLado() {
    	return this.longitudLado;
    }
    
    /**
     * pre : longitudLado es un valor mayor a 0.
     * post: cambia la longitud de todos los lados del cubo
     */
    public void cambiarLado(double longitudLado) {
    	this.longitudLado = longitudLado;
    }
    
    /**
     * post: devuelve el área de la superficie de las caras del cubo
     */
    public double obtenerAreaCara() {
    	return this.longitudLado*this.longitudLado;
    }
    
    /**
     * pre: areaCara es un valor mayor a 0.
     * post: cambia el área de las caras del cubo
     */
    public void cambiarAreaCara(double areaCara) {
    	//Cambiar el área de una cara significa cambiar la longitud del lado
    	//El área de una cara será el área de un cuadrado
    	//Área = Lado^2
    	//Solo guardo el lado para evitar trabajar con muchas variables
    	//por lo que solo tengo que obtener el lado, osea que quedaría:
    	//Lado = sqrt(Área)
    	this.longitudLado = Math.sqrt(areaCara);
    }

    /**
     * post: devuelve el volumen que encierra el cubo
     */
    public double obtenerVolumen() {
    	return Math.pow(this.longitudLado, 3);
    }

    /**
     * pre: volumen es un valor mayor a 0.
     * post: cambia el volumen del cubo
     */
    public void cambiarVolumen(double volumen) {
    	//Mismo razonamiento que en cambiar area cara
    	//Volumen = Lado^3
    	//Lado = Volumen^(1/3)
    	this.longitudLado = Math.cbrt(volumen);
    }
}
