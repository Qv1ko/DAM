package examenes.examen5;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Empleados {

    private String nombre, apellidos, dni;
    private LocalTime hEntrada, hSalida;

    protected Empleados() {
        this.nombre="sin definir";
        this.apellidos="sin definir";
        this.dni="sin definir";
        this.hEntrada=LocalTime.now();
        this.hSalida=LocalTime.now().plusHours(8);
    }

    protected Empleados(String nombre, String apellidos, String dni, LocalTime hEntrada, LocalTime hSalida) {
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.dni=dni;
        this.hEntrada=hEntrada;
        this.hSalida=hSalida;
    }

    protected String getNombre() {
        return nombre;
    }

    protected String getApellidos() {
        return apellidos;
    }

    protected String getDni() {
        return dni;
    }

    protected LocalTime gethEntrada() {
        return hEntrada;
    }

    protected LocalTime gethSalida() {
        return hSalida;
    }

    protected String getJornada() {
        return (ChronoUnit.HOURS.between(gethEntrada(), gethSalida())>=8)? "COMPLETA":"INCOMPLETA";
    }

    protected String toNominas() {
        return getNombre()+";"+getApellidos()+";"+getDni();
    }

}