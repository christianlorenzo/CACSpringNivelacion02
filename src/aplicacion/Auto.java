package aplicacion;

import interfaces.SeguridadInterface;

public class Auto extends Vehiculo implements SeguridadInterface {

	private boolean ruedaDeAuxilio;

	public Auto(int velocidad, boolean ruedaDeAuxilio) {
		super(velocidad + 100);
		this.ruedaDeAuxilio = ruedaDeAuxilio;

	}

	@Override
	public boolean esSeguro() {
		if(ruedaDeAuxilio && velocidad < 141) {
			return true;
		} else {
			return false;
		}
	}

}
