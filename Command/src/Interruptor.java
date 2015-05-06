public class Interruptor {
	private Command commandEncender;
	private Command commandApagar;

	public Interruptor(Command commandEncender, Command commandApagar) {
		this.commandEncender = commandEncender;
		this.commandApagar = commandApagar;
	}

	public void encender() {
		commandEncender.ejecutar();
	}

	public void apagar() {
		commandApagar.ejecutar();
	}
}
