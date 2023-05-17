package examenes.examen5;

import java.time.LocalTime;

public class SolucionOperadores extends SolucionEmpleados implements SolucionSueldos {

    private int numTaller;

    public SolucionOperadores() {
        super();
        this.numTaller = 0;
    }

    public SolucionOperadores(String nombre, String apellidos, String dni, LocalTime hEntrada, LocalTime hSalida, int numTaller) {
        super(nombre, apellidos, dni, hEntrada, hSalida);
        this.numTaller = numTaller;
    }

    public int getNumTaller() {
        return numTaller;
    }

    public float getSueldos() {
        
    }

    public String toFichero() {
        return getNombre()+";"+getApellidos()+";"+getDni()+";"+getSueldos()+";"+getNumTaller()+";"+((getJornada()>=8)? "COMPLETA":"INCOMPLETA");
    }

}
