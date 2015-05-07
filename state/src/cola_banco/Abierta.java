package cola_banco;

public class Abierta implements EstadoVentanilla {
	
	@Override
	public void atende(Persona persona){
		System.out.println("Atendiendo a: "+ persona.getNombre());
		persona.setEstadoActual("Siendo atendido.");
	}

}
