package cola_banco;

import org.junit.Test;
import org.junit.Assert;

public class BancoTest {
	
	@Test
	public void cola_bancoTest() {
		
		Persona persona1 = new Persona("Mateo","Perez",33);
		Persona persona2 = new Persona("Marcos","Garcia",77);
		Persona persona3 = new Persona("Lucas","Gomez",88);
		Persona persona4 = new Persona("Juan","Sanchez",25);
	
		Banco banco = new Banco();
		banco.atende(persona1);
	
		banco.suspendeVentanilla();
		
		banco.atende(persona2);
		banco.atende(persona3);
		
		banco.cerraVentanilla();
		banco.atende(persona4);
		
		Assert.assertEquals("Siendo atendido.",persona1.getEstadoActual());
		Assert.assertEquals("Siendo atendido por ser mayor de 65 anios.", persona2.getEstadoActual());
		Assert.assertEquals("Siendo atendido por ser mayor de 65 anios.", persona3.getEstadoActual());
		Assert.assertEquals("Esperando que abra la ventanilla.", persona4.getEstadoActual());
	
	}

}
