package unlam.paradigmas.objetos.ej02;

public class Punto {
	// completar
	//Implementar la clase Punto. Un Punto en el plano posee coordenada 
	//X y coordenada Y. Proporcionar métodos para:
	
	//Atributos
	private double x,y;
	
	//Constructor
	public Punto(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	//Métodos
	public double obtenerX() {
		return this.x;
	}
	
	public double obtenerY() {
		return this.y;
	}
	
	public void cambiarX(double nuevoX) {
		this.x = nuevoX;
	}
	
	public void cambiarY(double nuevoY) {
		this.y = nuevoY;
	}

	public boolean estaSobreEjeX() {
		return this.x == 0;
	}

	public boolean estaSobreEjeY() {
		return this.y == 0;
	}

	public boolean esElOrigen() {
		return this.estaSobreEjeX() && this.estaSobreEjeY();
	}
	
	public double distanciaAotroPunto(Punto otro) {
		return Math.sqrt((Math.pow(this.x - otro.x, 2)+Math.pow(this.y - otro.y, 2)));
	}
	
	public double distanciaAlOrigen() { 
		return this.distanciaAotroPunto(new Punto(0,0));
	}
	
}
