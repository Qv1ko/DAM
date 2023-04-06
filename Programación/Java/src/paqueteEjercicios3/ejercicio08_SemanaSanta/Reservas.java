package paqueteEjercicios3.ejercicio08_SemanaSanta;

import java.time.LocalDateTime;

public class Reservas {
    
    private String dni;
    private Vehiculos vehiculo;
    private LocalDateTime fecha;

    public Reservas() {

    }

    public Reservas(String dni,Vehiculos vehiculo,LocalDateTime fecha) {
        
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Vehiculos getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculos vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    

}