package strategy.contexto;

import strategy.implementaciones.Caminar;
import strategy.implementaciones.Nadar;
import strategy.interfaces.Desplazamiento;

public class Pinguino {
	
	private Desplazamiento desplazamiento;
	private String desplazamientoActual;
	
	public void desplazarseNadando() {
		desplazamiento = new Nadar();
		this.desplazamientoActual = desplazamiento.desplazar();
	}
	
	public void desplazarseCaminando(){
		desplazamiento = new Caminar();
		this.desplazamientoActual = desplazamiento.desplazar();
	}

	public String mostrarDesplazamientoActual() {
		return "El pingüino está "+ desplazamientoActual;
		
	}

}
