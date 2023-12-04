package unidad5.ejercicios.ejercicio04_Biblioteca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Biblioteca {
    
    public static void main(String[] args) {
        LocalDate fechaDevolucion=fechaInput();
        float precio=1.5f;
        if(fechaDevolucion.isBefore(LocalDate.now())) {
            System.out.println("\nEl importe de recargo es de "+ChronoUnit.DAYS.between(fechaDevolucion,LocalDate.now())*precio+" euros\n");
        } else if(fechaDevolucion.isEqual(LocalDate.now())) {
            System.out.println("Libro devuelto");
        } else {
            System.out.println("Libro devuelto con antelación");
        }
        //Corrección
        // if(fechaDevolucion.compareTo(LocalDate.now())<0) {
        //     System.out.println("Debe "+ChronoUnit.DAYS.between(fechaDevolucion,LocalDate.now())*1.5f);
        // } else if(fechaDevolucion.compareTo(LocalDate.now())>0) {
        //     System.out.println("Te quedan "+ChronoUnit.DAYS.between(LocalDate.now(),fechaDevolucion));
        // } else {
        //     System.out.println("Gracias por su alquiler");
        // }
    }//main

    private static LocalDate fechaInput() {
        Scanner sc=new Scanner(System.in);
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaDevolucion=null;
        boolean flag=false;
        do {
            System.out.print("Escriba la fecha de devolución del libro: ");
            try {
                fechaDevolucion=LocalDate.parse(sc.nextLine(),df);
                flag=false;
            } catch(DateTimeParseException exc) {
                System.out.println("\nFormato de fecha incorreto, introduca la fecha en formato dd/mm/yyyy\n");
                flag=true;
            }
        } while(flag);
        sc.close();
        return fechaDevolucion;
    }//fechaInput

}//class