package aplicacion;

import interfaces.SeguridadInterface;

public class Conductor implements SeguridadInterface {
	
	private Vehiculo vehiculo;
	private boolean registro;
	
	public Conductor(Vehiculo vehiculo, boolean registro) {
		this.vehiculo = vehiculo;
		this.registro = registro;
	}

	public boolean esSeguro() {
		if(vehiculo.esSeguro() && registro) {
			return true;
		} else {
			return false;
		}
	}
	

}
