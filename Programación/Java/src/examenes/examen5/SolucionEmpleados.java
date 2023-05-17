package examenes.examen5;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public abstract class SolucionEmpleados {

    private String nombre;
    private String apellidos;
    private String dni;
    private LocalTime hEntrada;
    private LocalTime hSalida;

    public final int HORAS = 8;

    protected SolucionEmpleados() {
        nombre = "";
        apellidos = "";
        dni = "";
        hEntrada = null;
        hSalida = null;
    }

    protected SolucionEmpleados(String nombre, String apellidos, String dni, LocalTime hEntrada, LocalTime hSalida) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.hEntrada = hEntrada;
        this.hSalida = hSalida;
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

    protected int getJornada() {
        return (int)ChronoUnit.HOURS.between(gethEntrada(), gethSalida());
    }

    protected abstract String toFichero();

}