package strategy;

import org.junit.Assert;
import org.junit.Test;

import strategy.contexto.Loro;

public class LoroTest {
	
	@Test
	public void elDesplazamientoActualDelLoroEsVolandoTest(){
		
		Loro loro = new Loro();
		loro.desplazarseVolando();
		
		Assert.assertEquals("El loro está volando", loro.mostrarDesplazamientoActual());
	}
	
	@Test
	public void elDesplazamientoActualDelLoroEsCaminandoTest(){
		
		Loro loro = new Loro();
		loro.desplazarseCaminando();
		
		Assert.assertEquals("El loro está caminando", loro.mostrarDesplazamientoActual());
	}
}
