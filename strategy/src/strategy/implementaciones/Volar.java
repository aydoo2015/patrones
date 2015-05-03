package strategy.implementaciones;

import strategy.interfaces.Desplazamiento;

public class Volar implements Desplazamiento{

	@Override
	public String desplazar() {
		return "volando";
	}
	
}
