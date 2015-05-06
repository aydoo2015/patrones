import org.junit.Assert;
import org.junit.Test;

public class TestCommmand {

	@Test
	public void testProbarLampara() {
		Lampara lampara = new Lampara();

		CommandEncenderLampara commandEncenderLuz = new CommandEncenderLampara(
				lampara);
		CommandApagarLampara commandApagarLuz = new CommandApagarLampara(lampara);

		Assert.assertFalse(commandEncenderLuz.devolverEstado());
		Assert.assertFalse(commandApagarLuz.devolverEstado());

		Interruptor interruptorLampara = new Interruptor(commandEncenderLuz,
				commandApagarLuz);

		interruptorLampara.encender();
		Assert.assertTrue(commandEncenderLuz.devolverEstado());

		interruptorLampara.apagar();
		Assert.assertTrue(commandApagarLuz.devolverEstado());
	}

}
