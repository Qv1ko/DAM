package unidad6.ejercicios.ejercicio01_Hospital;

public class Doctores extends Empleados {

    private int licencia;

    public Doctores() {
        super();
        this.licencia = 0;
    }

    public Doctores(String nombre, String apellidos, int telefono, String dni, String especialidad, float sueldo, int licencia) {
        super(nombre, apellidos, telefono, dni, especialidad, sueldo);
        this.licencia = licencia;
    }

    public int getLicencia() {
        return licencia;
    }

    public void setLicencia(int licencia) {
        this.licencia = licencia;
    }

    public String toString() {
        return "Doctores ["+super.toString()+", licencia=" + licencia + "]";
    }

}
