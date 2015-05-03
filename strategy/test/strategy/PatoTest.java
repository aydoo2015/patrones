package strategy;

import org.junit.Assert;
import org.junit.Test;

import strategy.contexto.Pato;

public class PatoTest {

	@Test
	public void elDesplazamientoActualDelPatoEsVolandoTest(){
		
		Pato pato = new Pato();
		pato.desplazarseVolando();
		
		Assert.assertEquals("El pato está volando", pato.mostrarDesplazamientoActual());
	}
	
	@Test
	public void elDesplazamientoActualDelPatoEsCaminandoTest(){
		
		Pato pato = new Pato();
		pato.desplazarseCaminando();
		
		Assert.assertEquals("El pato está caminando", pato.mostrarDesplazamientoActual());
	}
	
	@Test
	public void elDesplazamientoActualDelPatoEsNadandoTest(){
		
		Pato pato = new Pato();
		pato.desplazarseNadando();;
		
		Assert.assertEquals("El pato está nadando", pato.mostrarDesplazamientoActual());
	}

}
