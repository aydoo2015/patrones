package strategy.implementaciones;

import strategy.interfaces.Desplazamiento;

public class Nadar implements Desplazamiento{

	@Override
	public String desplazar() {
		return "nadando";
	}

}
