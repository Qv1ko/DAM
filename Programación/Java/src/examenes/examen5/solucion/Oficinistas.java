package examenes.examen5.solucion;

import java.time.LocalTime;

public class Oficinistas extends Empleados implements Sueldos {

    private String departamento;

    public Oficinistas() {
        super();
        this.departamento = "";
    }

    public Oficinistas(String nombre, String apellidos, String dni, LocalTime hEntrada, LocalTime hSalida, String departamento) {
        super(nombre, apellidos, dni, hEntrada, hSalida);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public float getSueldos() {
        return 0.0f;
    }

    public String toFichero() {
        return getNombre()+";"+getApellidos()+";"+getDni()+";"+getSueldos()+";"+getDepartamento()+";"+((getJornada()>=8)? "COMPLETA":"INCOMPLETA");
    }

}
