package strategy.contexto;

import strategy.implementaciones.Caminar;
import strategy.implementaciones.Nadar;
import strategy.implementaciones.Volar;
import strategy.interfaces.Desplazamiento;

public class Pato {
	
	private Desplazamiento desplazamiento;
	private String desplazamientoActual;
	
	public void desplazareNadando() {
		desplazamiento = new Nadar();
		this.desplazamientoActual = desplazamiento.desplazar();
	}
	
	public void desplazarseCaminando(){
		desplazamiento = new Caminar();
		this.desplazamientoActual = desplazamiento.desplazar();
	}
	
	public void desplazarseVolando() {
		desplazamiento = new Volar();
		this.desplazamientoActual = desplazamiento.desplazar();
	}
	

	public String mostrarDesplazamientoActual() {
		return "El pato está "+ desplazamientoActual;
		
	}
}
