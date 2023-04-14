package paqueteEjercicios3.ejercicio08_SemanaSanta;

import java.time.LocalDateTime;

/**
 * @author Víctor
 * @version 0.6
 */

public class Reservas {
    
    private String dni;
    private Vehiculos vehiculo;
    private LocalDateTime fecha;

    public Reservas() {
        this.dni="99999999R";
        this.vehiculo=new Vehiculos();
        this.fecha=LocalDateTime.now();
    }//Reservas - Constructor vacío

    public Reservas(String dni,Vehiculos vehiculo,LocalDateTime fecha) {
        this.dni=dni;
        this.vehiculo=vehiculo;
        this.fecha=fecha;
    }//Reservas

    public String getDni() {
        return dni;
    }//getDni

    public void setDni(String dni) {
        this.dni=dni;
    }//setDni

    public Vehiculos getVehiculo() {
        return vehiculo;
    }//getVehiculo

    public void setVehiculo(Vehiculos vehiculo) {
        this.vehiculo=vehiculo;
    }//setVehiculo

    public LocalDateTime getFecha() {
        return fecha;
    }//getFecha

    public void setFecha(LocalDateTime fecha) throws Exception {
        this.fecha=fecha;
    }//setFecha

}//class
