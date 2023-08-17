package aplicacion;

import interfaces.SeguridadInterface;

public class Vehiculo implements SeguridadInterface{

	protected int velocidad;

	public Vehiculo(int velocidad) {
		super();
		this.velocidad = velocidad;
	}

	public boolean esSeguro() {
		return false;
	}

}
