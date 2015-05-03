package strategy.implementaciones;

import strategy.interfaces.Desplazamiento;

public class Caminar implements Desplazamiento{

	@Override
	public String desplazar() {

		return "caminando";
	}

}
