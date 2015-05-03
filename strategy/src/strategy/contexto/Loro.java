package strategy.contexto;

import strategy.implementaciones.Caminar;
import strategy.implementaciones.Volar;
import strategy.interfaces.Desplazamiento;

public class Loro {
	
	private Desplazamiento desplazamiento;
	private String desplazamientoActual;
	
	public void desplazarseVolando() {
		desplazamiento = new Volar();
		this.desplazamientoActual = desplazamiento.desplazar();
	}
	
	public void desplazarseCaminando(){
		desplazamiento = new Caminar();
		this.desplazamientoActual = desplazamiento.desplazar();
	}

	public String mostrarDesplazamientoActual() {
		return "El loro está "+ desplazamientoActual;
		
	}

}
