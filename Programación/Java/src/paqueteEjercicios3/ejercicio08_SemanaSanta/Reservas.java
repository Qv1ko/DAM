package paqueteEjercicios3.ejercicio08_SemanaSanta;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/*
 * @author Victor
 * @version 0.3
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

    public void setDni(String dni) throws Exception {
        if(!dniValidador(dni.toUpperCase())) {
            throw new Exception("Dni invalido");
        }
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
        if(fecha.isAfter(LocalDateTime.now())) {
            throw new Exception("Fecha invalida");
        }
        this.fecha=fecha;
    }

    private boolean dniValidador(String dni) {
        boolean valido=true;
        String nif="";
        char letter=' ';
        if(dni.length()==9) {
            for(int i=0;i<dni.length()-1;i++) {
                nif+=dni.charAt(i);
            }
            switch(Integer.parseInt(nif)%23) {
                case 0 -> letter='T';
                case 1 -> letter='R';
                case 2 -> letter='W';
                case 3 -> letter='A';
                case 4 -> letter='G';
                case 5 -> letter='M';
                case 6 -> letter='Y';
                case 7 -> letter='F';
                case 8 -> letter='P';
                case 9 -> letter='D';
                case 10 -> letter='X';
                case 11 -> letter='B';
                case 12 -> letter='N';
                case 13 -> letter='J';
                case 14 -> letter='Z';
                case 15 -> letter='S';
                case 16 -> letter='Q';
                case 17 -> letter='V';
                case 18 -> letter='H';
                case 19 -> letter='L';
                case 20 -> letter='C';
                case 21 -> letter='K';
                case 22 -> letter='E';
            }
            if(letter!=dni.charAt(dni.length()-1)) {
                valido=false;
            }
        } else {
            valido=false;
        }
        return valido;
    }

    public float importe() {
        return getVehiculo().getPrecio()*ChronoUnit.DAYS.between(getFecha(),LocalDateTime.now());
    }

}//class
