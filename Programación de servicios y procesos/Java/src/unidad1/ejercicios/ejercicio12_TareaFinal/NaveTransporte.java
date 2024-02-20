package unidad1.ejercicios.ejercicio12_TareaFinal;

public class NaveTransporte extends Nave {

	private int cargaMaxima;
    private int cargaMercancia;

	public NaveTransporte() {
		super();
		this.cargaMaxima = 0;
		this.cargaMercancia = 0;
	}

    public NaveTransporte(int codigo, String nombre, int capacidad, boolean estado, int cargaMaxima) {
        super(codigo, nombre, capacidad, estado);
        this.cargaMaxima = cargaMaxima;
        this.cargaMercancia = cargaMaxima;
    }
	
	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public void cargarMercancia() {
		cargaMercancia = cargaMaxima;
	}

	public void descargarMercancia() {
		cargaMercancia = 0;
	}

	@Override
	public String despegar() {
		return "La nave de transporte "+super.nombre+" está despegando.";
	}

	@Override
	public String aterrizar() {
		return "La nave de transporte "+super.nombre+" está aterrizando.";
	}

    @Override
    public String solicitarAterrizar() {
        String mensaje="Nave de transporte "+super.nombre+" solicitando permiso para aterrizar...";
		return mensaje;
    }

    @Override
    public String solicitarDespegar() {
       String mensaje="Nave de transporte "+super.nombre+" solicitando permiso para despegar...";
		return mensaje;
    }

	public int getCargaMercancia() {
		return cargaMercancia;
	}

}
