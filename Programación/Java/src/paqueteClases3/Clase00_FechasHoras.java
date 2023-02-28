package paqueteClases3;

import java.time.LocalDate;
import java.time.Month;

public class Clase00_FechasHoras {
    
    public static void main(String[] args) {
        LocalDate fecha=LocalDate.now(); //Fecha actual
        System.out.println(fecha);
        LocalDate miCumple=LocalDate.of(2000,Month.MARCH,01); //Fecha en formato entero yyyy,mm,dd
        LocalDate finEvaluacion2=LocalDate.parse("2023-03-09"); //Fecha mediante caracteres
        System.out.println(miCumple);
        System.out.println("Fin "+finEvaluacion2);
        //Añadimos a la fecha 35 dias
        LocalDate mas35=miCumple.plusDays(35);
        System.out.println(mas35);
        //Anterior o posterior a una fecha
        System.out.println((miCumple.isBefore(mas35))? "Es anterior":"Es posterior");
        //Bisiesto
        System.out.println((miCumple.isLeapYear())? "Es bisiesto":"No es bisiesto");
    }//main

}//class