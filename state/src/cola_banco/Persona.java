package cola_banco;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	private String estadoActual;
	
	public Persona(String nombre,String apellido,int edad){
		
		this.setApellido(apellido);
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setEstadoActual("Haciendo nada estoy recien creado");
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEstadoActual() {
		return estadoActual;
	}

	public void setEstadoActual(String estadoActual) {
		this.estadoActual = estadoActual;
	}
	
	

}
