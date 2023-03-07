package paqueteEjercicios3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ejercicio01_Excepciones {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        excepcionFecha(sc);
        excepcionPersonal(sc);
        sc.close();
    }//main

    private static void excepcionFecha(Scanner sc) {
        LocalDate fecha=null;
        boolean error=true;
        while(error) {
            System.out.print("Escriba una fecha: ");
            try {
                fecha=LocalDate.parse(sc.nextLine());
                System.out.println("La fecha cae en "+fecha.getDayOfWeek());
                error=false;
            } catch(Exception exc) {
                System.out.println("\nFecha incorrecta - Intentelo de nuevo\n");
            }
        }
    }//excepcionFecha

    private static void excepcionPersonal(Scanner sc) {
        String nombre="";
        int telefono=0;
        LocalDate cumple=null;
        boolean error=true;
        while(error) {
            try {
                System.out.print("Escriba su nombre: ");
                nombre=sc.nextLine();
                System.out.print("Escriba su telefono: ");
                telefono=sc.nextInt();sc.nextLine();
                System.out.print("Escriba la fecha de tu cumpleaños: ");
                cumple=LocalDate.parse(sc.nextLine());
                error=false;
                System.out.println("\n"+nombre+" nacio el "+cumple.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))+"\nSu telefono es "+telefono+"\n");
            } catch(InputMismatchException exc) {
                sc.nextLine();
                System.out.println("\nError - Telefono incorrecto\n");
            } catch(NoSuchElementException exc) {
                sc.nextLine();
                System.out.println("\nError - Telefono incorrecto\n");
            } catch(DateTimeParseException exc) {
                System.out.println("\nError - Fecha incorrecta\n");
            }
        }
    }//excepcionPersonal

}//class