package unlam.paradigmas.objetos.ej06;

class Cerradura {
	
	private int clave, cantFallosConsecutivos, fallosConsecutivos, aperturasFallidas, aperturasExitosas;
	private boolean estaAbierta, estaBloqueada;
	
	/*post: Guarda la clave de apertura de la cerradura y la cantidad de 
	 * fallos consecutivos que la bloquean que debe ser mayor a 0. La apertura empieza estando cerrada*/
    public Cerradura(int claveDeApertura,
                     int cantidadDeFallosConsecutivosQueLaBloquean) {
		this.clave = claveDeApertura;
		this.cantFallosConsecutivos = cantidadDeFallosConsecutivosQueLaBloquean > 0
				? cantidadDeFallosConsecutivosQueLaBloquean
				: 1;
		this.estaAbierta = false;
		this.estaBloqueada = false;
	}

	/**
	 * pre: Cerradura cerrada no bloqueada post: intenta abrir la cerradura de
	 * acuerdo a la clave ingresada, en caso de lograrlo suma la cantidad de
	 * aperturas exitosas, en caso de no hacerlo suma las aperturas fallidas y los
	 * fallos consecutivos necesarios para que se bloquee la cerradura, una vez que
	 * llegue a esa cantidad la cerradura quedará bloqueada y no podrá ser abierta
	 */
	public boolean abrir(int clave) {
		if (this.estaAbierta || this.estaBloqueada)
			return this.estaAbierta;

		if (clave == this.clave) {
			this.estaAbierta = true;
			this.aperturasExitosas++;
			this.fallosConsecutivos = 0;
		} else {
			this.aperturasFallidas++;
			this.fallosConsecutivos++;
			if (this.fallosConsecutivos == this.cantFallosConsecutivos)
				this.estaBloqueada = true;
		}

		return this.estaAbierta;
	}

	/**
	 * pre: Cerradura abierta post: cierra la cerradura
	 */
	public void cerrar() {
		if (this.estaAbierta)
			this.estaAbierta = false;
	}

	/**
	 * post: devuelve si la cerradura está abierta
	 */
	public boolean estaAbierta() {
		return this.estaAbierta;
	}

	/**
	 * post: devuelve si la cerradura está cerrada
	 */
	public boolean estaCerrada() {
		return !this.estaAbierta();
	}

	/**
	 * post: devuelve si la cerradura fue bloqueada
	 */
	public boolean fueBloqueada() {
		return this.estaBloqueada;
	}

	/**
	 * post: devuelve la cantidad de aperturas exitosas
	 */
	public int contarAperturasExitosas() {
		return this.aperturasExitosas;
	}

	/**
	 * post: devuelve la cantidad de aperturas fallidas
	 */
	public int contarAperturasFallidas() {
		return this.aperturasFallidas;
	}
}