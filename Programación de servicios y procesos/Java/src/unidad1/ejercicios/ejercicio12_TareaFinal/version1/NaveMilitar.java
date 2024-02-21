package unidad1.ejercicios.ejercicio12_TareaFinal.version1;

public class NaveMilitar extends Nave {

	private int armamento;

	public NaveMilitar() {
		super();
		this.armamento=0;
	}
	
	public NaveMilitar(int codigo, String nombre,int capacidad, boolean estado, int armamento) {	
		super(codigo, nombre,capacidad, estado);
		this.armamento=armamento;
	}

	public int getArmamento() {
		return armamento;
	}
	 
	@Override
	public String despegar() {
		return "La nave militar "+super.nombre+" está despegando.";
	}

	@Override
	public String aterrizar() {
		return "La nave militar "+super.nombre+" está aterrizando.";
	}

    @Override
    public String solicitarAterrizar() {
        String mensaje="Nave militar "+super.nombre+ " solicitando permiso para aterrizar...";
		return mensaje;
    }

    @Override
    public String solicitarDespegar() {
		String mensaje="Nave militar "+super.nombre+" solicitando permiso para despegar...";
		return mensaje;
    }

}
