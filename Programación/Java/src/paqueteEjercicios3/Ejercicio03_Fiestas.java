package paqueteEjercicios3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ejercicio03_Fiestas {

    private String nombre,localidad;
    private LocalDate fechaInicio,fechaFinal;
    private LocalDate inicioVerando=LocalDate.of(LocalDate.now().getYear(),07,01),finVerano=LocalDate.of(LocalDate.now().getYear(),9,01);

    public Ejercicio03_Fiestas(String nombre,String localidad,LocalDate fechaInicio,LocalDate fechaFinal) {
        this.nombre=nombre;
        this.localidad=localidad;
        this.fechaInicio=fechaInicio;
        this.fechaFinal=fechaFinal;
    }//Ejercicio03_Fiestas

    public String getNombre() {
        return nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public String duracion() {
        return "\s"+getNombre()+" dura "+ChronoUnit.DAYS.between(getFechaInicio(),getFechaFinal())+" días";
    }//duracion

    public String isVeraniega() {
        String mensaje="";
        if(getFechaInicio().isAfter(inicioVerando)&&getFechaFinal().isBefore(finVerano)) {
            mensaje=". Se celebra en verano";
        }
        return mensaje;
    }//isVeraniega

    public String diasSemana() {
        return " e inicia un "+diaTraducido(getFechaInicio().getDayOfWeek())+" y finaliza un "+diaTraducido(getFechaFinal().getDayOfWeek());
    }//diasSemana

    private String diaTraducido(DayOfWeek dia) {
        return switch(dia.getValue()) {
            case 1 -> "lunes";
            case 2 -> "martes";
            case 3 -> "miercoles";
            case 4 -> "jueves";
            case 5 -> "viernes";
            case 6 -> "sabado";
            case 7 -> "domingo";
            default -> "error";
        };
    }

    public String toString() {
        return "La fiesta "+getNombre()+" de la localidad de "+getLocalidad()+" dura "+ChronoUnit.DAYS.between(getFechaInicio(),getFechaFinal())+" días"+isVeraniega()+diasSemana();
    }

}//class