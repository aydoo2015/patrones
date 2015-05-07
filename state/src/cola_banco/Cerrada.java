package cola_banco;

public class Cerrada implements EstadoVentanilla {

	@Override
	public void atende(Persona persona){
		System.out.println("Ventanilla Cerrada!");
		persona.setEstadoActual("Esperando que abra la ventanilla.");
	}
}
