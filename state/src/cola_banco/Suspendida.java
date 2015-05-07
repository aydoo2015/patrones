package cola_banco;

public class Suspendida implements EstadoVentanilla {
	@Override
	public void atende(Persona persona){
		
		// si viene una persona mayor, el cajero, 
		//aunque esté ocupado la atenderá igual
		
		if (persona.getEdad()>65){
			System.out.println("Atendiendo a:"+persona.getNombre());
			persona.setEstadoActual("Siendo atendido por ser mayor de 65 anios.");
		}else{
			System.out.println("Espere 5 minutos por favor...");
			persona.setEstadoActual("Esperando por caja suspendida.");
		}
		
	}
}
