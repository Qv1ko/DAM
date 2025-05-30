package examenes.examen5.solucion;

import java.time.LocalTime;

public class Operadores extends Empleados implements Sueldos {

    private int numTaller;

    public Operadores() {
        super();
        this.numTaller = 0;
    }

    public Operadores(String nombre, String apellidos, String dni, LocalTime hEntrada, LocalTime hSalida, int numTaller) {
        super(nombre, apellidos, dni, hEntrada, hSalida);
        this.numTaller = numTaller;
    }

    public int getNumTaller() {
        return numTaller;
    }

    public float getSueldos() {
        return 0.0f;
    }

    public String toFichero() {
        return getNombre()+";"+getApellidos()+";"+getDni()+";"+getSueldos()+";"+getNumTaller()+";"+((getJornada()>=8)? "COMPLETA":"INCOMPLETA");
    }

}
