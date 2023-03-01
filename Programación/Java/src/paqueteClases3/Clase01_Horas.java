package paqueteClases3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Clase01_Horas {
 
    public static void main(String[] args) {
        LocalTime ahora=LocalTime.now(); //Hora actual
        System.out.println(ahora);
        //Declaracion de un patron de formato
        DateTimeFormatter df=DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(ahora.format(df));
        LocalTime horaSalida=LocalTime.parse("14:00"); //Declaracion con parse
        LocalTime horaEntrada=LocalTime.of(8,10,30); //Declaracion con of
        System.out.println(horaSalida.plusHours(10)+" hora Zulú");
        System.out.println(horaEntrada);
        //Comparacion entre dos horas
        System.out.println(horaSalida.compareTo(horaEntrada));
    }//main

}//class