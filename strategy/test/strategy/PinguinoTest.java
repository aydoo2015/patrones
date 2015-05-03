package strategy;

import org.junit.Assert;
import org.junit.Test;

import strategy.contexto.Pinguino;

public class PinguinoTest {

	@Test
	public void elDesplazamientoActualDelPinguinoEsNadandoTest(){
		
		Pinguino pinguino = new Pinguino();
		pinguino.desplazarseNadando();
		
		Assert.assertEquals("El ping�ino est� nadando", pinguino.mostrarDesplazamientoActual());
	}
	
	@Test
	public void elDesplazamientoActualDelPinguinoEsCaminandoTest(){
		
		Pinguino pinguino = new Pinguino();
		pinguino.desplazarseCaminando();
		
		Assert.assertEquals("El ping�ino est� caminando", pinguino.mostrarDesplazamientoActual());
	}
}