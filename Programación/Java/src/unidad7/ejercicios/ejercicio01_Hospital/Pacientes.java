package unidad7.ejercicios.ejercicio01_Hospital;

import java.time.LocalDate;

public class Pacientes extends Personas implements Citas {

    private LocalDate cita;

    public Pacientes() {
        super();
        this.cita = LocalDate.now();
    }

    public Pacientes(String nombre, String apellidos, int telefono, String dni, LocalDate cita) {
        super(nombre, apellidos, telefono, dni);
        this.cita = cita;
    }

    public LocalDate getCita() {
        return cita;
    }

    public void setCita(LocalDate cita) {
        this.cita = cita;
    }

    public String toString() {
        return "Pacientes ["+super.toString()+", cita=" + cita + "]";
    }

    public void mostrarCitas() {
        System.out.println("Tienes cita el dia " + getCita().getDayOfMonth() + " del " + getCita().getMonthValue() + " del " + getCita().getYear());
    }

}
