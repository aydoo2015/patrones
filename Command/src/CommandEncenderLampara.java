public class CommandEncenderLampara implements Command {

	private Lampara lampara;
	private boolean estado;

	public CommandEncenderLampara(Lampara lampara) {
		this.lampara = lampara;
		this.estado=false;

	}

	@Override
	public void ejecutar() {
		this.estado=true;	
		this.lampara.encenderLampara();
	}

	public boolean devolverEstado(){

	return this.estado;

	}

	public void obtenerEstado(boolean estado){

	 this.estado=estado;;

	}


}
