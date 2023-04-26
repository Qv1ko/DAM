package unidad5.ejercicios.ejercicio03_Fiestas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Fiestas {

    private String nombre,localidad;
    private LocalDate fechaInicio,fechaFinal;
    private LocalDate inicioVerando=LocalDate.of(LocalDate.now().getYear(),07,01),finVerano=LocalDate.of(LocalDate.now().getYear(),9,01);

    public Fiestas() {
        this.nombre="Alguna fiesta";
        this.localidad="no definida";
        this.fechaInicio=LocalDate.now();
        this.fechaFinal=LocalDate.now().plusDays(7);
    }//Ejercicio03_Fiestas

    public Fiestas(String nombre,String localidad,LocalDate fechaInicio,LocalDate fechaFinal) {
        this.nombre=nombre;
        this.localidad=localidad;
        this.fechaInicio=fechaInicio;
        this.fechaFinal=fechaFinal;
    }//Ejercicio03_Fiestas

    public String getNombre() {
        return nombre;
    }//getNombre

    public String getLocalidad() {
        return localidad;
    }//getLocalidad

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }//getFechaInicio

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }//getFechaFinal

    public long duracion() {
        return ChronoUnit.DAYS.between(getFechaInicio(),getFechaFinal());
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
        String[] dias={"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
        return dias[dia.ordinal()];
        // return switch(dia.getValue()) {
        //     case 1 -> "lunes";
        //     case 2 -> "martes";
        //     case 3 -> "miercoles";
        //     case 4 -> "jueves";
        //     case 5 -> "viernes";
        //     case 6 -> "sabado";
        //     case 7 -> "domingo";
        //     default -> "error";
        // };
    }//diaTraducido

    public String toString() {
        return "\nLa fiesta "+getNombre()+" de la localidad de "+getLocalidad()+" dura "+duracion()+" días"+isVeraniega()+diasSemana();
    }//toString

}//class