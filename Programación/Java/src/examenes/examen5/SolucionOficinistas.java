package examenes.examen5;

import java.time.LocalTime;

public class SolucionOficinistas extends SolucionEmpleados implements SolucionSueldos {

    private String departamento;

    public SolucionOficinistas() {
        super();
        this.departamento = "";
    }

    public SolucionOficinistas(String nombre, String apellidos, String dni, LocalTime hEntrada, LocalTime hSalida, String departamento) {
        super(nombre, apellidos, dni, hEntrada, hSalida);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public float getSueldos() {
        
    }

    public String toFichero() {
        return getNombre()+";"+getApellidos()+";"+getDni()+";"+getSueldos()+";"+getDepartamento()+";"+((getJornada()>=8)? "COMPLETA":"INCOMPLETA");
    }

}
