package unidad1.ejercicios.tareaFinal;

public class Equipo extends Estadio {

	// Atributos del equipo

	private String nombre;
	private Jugador[] convocatoria;

	// Constructores (Overloading)

	public Equipo() {
		super();
		this.nombre = "";
		this.convocatoria = null;
	}

	public Equipo(String nombre, String estadio, Jugador[] convocatoria) {
		super(estadio);
		this.nombre = nombre;
		this.convocatoria = convocatoria;
	}

	// Getters

	public String getNombre() {
		return nombre;
	}

	public Jugador[] getConvocatoria() {
		return convocatoria;
	}

	// Metodo para obtener el jugador con mejor parada (portero)

	public Jugador getPortero() {

		Jugador portero = convocatoria[0];

		for (Jugador jugador : convocatoria) {
			if (jugador.getPosicion().equalsIgnoreCase("POR")) {
				portero = jugador;
			}
		}

		return portero;

	}

	// Setters

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setConvocatoria(Jugador[] convocatoria) {
		this.convocatoria = convocatoria;
	}

	// toString (Overriding)

	@Override
	public String toString() {

		String listaJugadores = "";

		for (Jugador jugador : convocatoria) {
			listaJugadores += "\n" + jugador.toString();
		}

		return "\n" + getNombre() + super.toString() + listaJugadores;

	}

}
