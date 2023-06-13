package unidad9.clases.web.src.main.java;

public class Persona {

	private String nombre;
	private String apellidos;
	
	public Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String toString() {
		return this.nombre + " " + this.apellidos;
	}
	
}
