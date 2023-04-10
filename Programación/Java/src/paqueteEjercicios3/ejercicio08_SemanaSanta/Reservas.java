package paqueteEjercicios3.ejercicio08_SemanaSanta;

import java.time.LocalDateTime;

/**
 * @author Victor
 * @version 0.4
 */

public class Reservas {
    
    private String dni;
    private Vehiculos vehiculo;
    private LocalDateTime fecha;

    public Reservas() {
        this.dni="99999999R";
        this.vehiculo=null;
        this.fecha=LocalDateTime.now();
    }

    public Reservas(String dni,Vehiculos vehiculo,LocalDateTime fecha) {
        this.dni=dni;
        this.vehiculo=vehiculo;
        this.fecha=fecha;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni=dni;
    }

    public Vehiculos getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculos vehiculo) {
        this.vehiculo=vehiculo;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) throws Exception {
        this.fecha=fecha;
    }

}//class
