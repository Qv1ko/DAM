package unidad1.ejercicios.ejercicio9_TareaFinal;

public class Estadio {

    private String nombre;

    public Estadio() {
        this.nombre = "";
    }

    public Estadio(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return " (" + nombre + ")";
    }

}
