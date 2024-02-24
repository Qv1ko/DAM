package unidad1.ejercicios.ejercicio9_TareaFinal;

public class Jugador {

	// Atributos del jugador

	private String nombre;
	private int dorsal;
	private String posicion;
	private int tiro;
	private int parada;

	// Constructores (Overloading)

	public Jugador() {
		this.nombre = "";
		this.dorsal = 0;
		this.tiro = 0;
		this.parada = 0;
	}

	public Jugador(String nombre, int dorsal, String posicion, int tiro, int parada) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.posicion = posicion;
		this.tiro = tiro;
		this.parada = parada;
	}

	// Getters

	public String getNombre() {
		return nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public int getDorsal() {
		return dorsal;
	}

	public int getTiro() {
		return tiro;
	}

	public int getParada() {
		return parada;
	}

	// Setters

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public void setTiro(int tiro) {
		this.tiro = tiro;
	}

	public void setParada(int parada) {
		this.parada = parada;
	}

	// toString

	public String toString() {
		return getPosicion() + " - " + getNombre() + " (" + getDorsal() + ")";
	}

}
