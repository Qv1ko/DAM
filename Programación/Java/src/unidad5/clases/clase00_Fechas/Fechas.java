package unidad5.clases.clase00_Fechas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Fechas {
    
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
        LocalDate otraFecha=LocalDate.parse("20230301",DateTimeFormatter.BASIC_ISO_DATE); //Fecha con formateador BASIC_ISO_DATE
        System.out.println(otraFecha);
        otraFecha=LocalDate.parse("02-03-2023",DateTimeFormatter.ofPattern("dd-MM-yyyy")); // Fecha con formateador propio
        System.out.println(otraFecha.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))); //Output con formateador propio
        Scanner ent=new Scanner(System.in);
        //Introduccion de fechas por consola
        inputDate(ent);
        //Mayor de edad
        mayorEdad(ent);
        //Dia laborables
        laboral(ent);
        ent.close();
        //Diferencia entre fechas
        LocalDate badDay=LocalDate.of(2001,11,11);
        Period periodo=Period.between(badDay, fecha); //Devuelve la diferencia de fechas por bloques
        System.out.println(periodo);
        System.out.println(periodo.getDays()+"/"+periodo.getMonths()+"/"+periodo.getYears());
        System.out.println(ChronoUnit.DAYS.between(badDay, fecha));//Devuelve la diferencia de duracion de dos fechas
        System.out.println(LocalDate.now().getDayOfYear()-otraFecha.getDayOfYear());
    }//main

    private static void inputDate(Scanner ent) {
        System.out.print("Introduce una fecha: ");
        LocalDate fechaDeEntrada=LocalDate.parse(ent.nextLine(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(fechaDeEntrada);
    }//inputDate

    private static void mayorEdad(Scanner ent) {
        System.out.print("Introduce tu dia de nacimiento: ");
        LocalDate fechaNacimiento=LocalDate.parse(ent.nextLine(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate fechaMayoria=LocalDate.now().minusYears(18);
        System.out.println((fechaNacimiento.isAfter(fechaMayoria))? "Menor de edad":"Mayor de edad");
    }//mayorEdad

    private static void laboral(Scanner ent) {
        System.out.print("Introduce una fecha: ");
        LocalDate fechaLaboral=LocalDate.parse(ent.nextLine(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println((fechaLaboral.getDayOfWeek().getValue()<=5&&fechaLaboral.getDayOfWeek().getValue()>=1)? "Dia laboral - "+fechaLaboral.getDayOfWeek():"Dia festivo - "+fechaLaboral.getDayOfWeek());
    }//laboral

}//class