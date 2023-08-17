package aplicacion;

import interfaces.SeguridadInterface;

public class Moto extends Vehiculo implements SeguridadInterface {

	private int espejosRetrovisores;

	public Moto(int velocidad, int espejosRetrovisores) {
		super(velocidad);
		this.espejosRetrovisores = espejosRetrovisores;
	}

	@Override
	public boolean esSeguro() {
		if (velocidad < 161 && espejosRetrovisores > 1) {
			return true;
		} else {
			return false;
		}
	}

}
