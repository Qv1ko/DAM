package unidad6.ejercicios.ejercicio01_Hospital;

public class Empleados extends Personas {

    private String especialidad;
    private float sueldo;

    public Empleados() {
        super();
        this.especialidad = "No identificado";
        this.sueldo = 1080;
    }

    public Empleados(String nombre, String apellidos, int telefono, String dni, String especialidad, float sueldo) {
        super(nombre, apellidos, telefono, dni);
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
    public float getSueldo() {
        return sueldo;
    }
    
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String toString() {
        return "Empleados ["+super.toString()+", especialidad=" + especialidad + ", sueldo=" + sueldo + "]";
    }

}