package unidad1.clases;

class Clase06_Polimorfismo {

    public static void main(String[] args) {

        Alumno a = new AlumnoPrimero();

        AlumnoPrimero ap1 = new AlumnoPrimero("Ivan", "636161616", 20, "Calle Vargas, 5, 6D", false);
        AlumnoSegundo as1 = new AlumnoSegundo("Laura", "638828282", 19, "Avenida Von, 5, 2A", true);

        ap1.mostrar();
        as1.mostrar();

        a = as1;
        a.mostrar();

    }

}

abstract class Alumno {

    private String nombre, telefono, direccion;
    private int edad;

    public Alumno() {
        this.nombre = "";
        this.telefono = "";
        this.edad = 0;
        this.direccion = "";
    }

    public Alumno(String nombre, String telefono, int edad, String direccion) {
        this.nombre = nombre;
        this. telefono = telefono;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString() {
        return "\n" + nombre + " (" + telefono + ")\n  Dirección: " + direccion + "\n  Edad: " + edad;
    }

    public abstract void mostrar();

}

class AlumnoPrimero extends Alumno {

    private boolean conocimientoPrevio;

    public AlumnoPrimero() {
        super();
        this.conocimientoPrevio = false;
    }

    public AlumnoPrimero(String nombre, String telefono, int edad, String direccion, boolean conocimientoPrevio) {
        super(nombre, telefono, edad, direccion);
        this.conocimientoPrevio = conocimientoPrevio;
    }

    public boolean isConocimientoPrevio() {
        return conocimientoPrevio;
    }

    public void setConocimientoPrevio(boolean conocimientoPrevio) {
        this.conocimientoPrevio = conocimientoPrevio;
    }

    public String toString() {
        return conocimientoPrevio ? "\n  Tiene conocimientos previos" : "\n  No tiene conocimientos previos";
    }

    public void mostrar() {
        System.out.println(super.toString() + this.toString());
    }

}

class AlumnoSegundo extends Alumno {

    private boolean practicas;
    
    public AlumnoSegundo() {
        super();
        this.practicas = false;
    }

    public AlumnoSegundo(String nombre, String telefono, int edad, String direccion, boolean practicas) {
        super(nombre, telefono, edad, direccion);
        this.practicas = practicas;
    }

    public boolean isPracticas() {
        return practicas;
    }

    public void setPracticas(boolean practicas) {
        this.practicas = practicas;
    }

    public String toString() {
        return practicas ? "\n  Va de practicas" : "\n  No va de practicas";
    }

    public void mostrar() {
        System.out.println(super.toString() + this.toString());
    }
    
}
