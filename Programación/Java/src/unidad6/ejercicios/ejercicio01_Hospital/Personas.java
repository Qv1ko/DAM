package unidad6.ejercicios.ejercicio01_Hospital;

public class Personas {

    private String nombre, apellidos, dni;
    private int tel;

    public Personas() {
        this.nombre = "No identificado";
        this.apellidos = "No identificado";
        this.tel = 0;
        this.dni = "No identificado";
    }

    public Personas(String nombre, String apellidos, int telefono, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tel = telefono;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String toString() {
        return "Personas [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", tel=" + tel + "]";
    }

}
