package paqueteEjercicios3;

import java.time.LocalDate;
import java.util.InputMismatchException;
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
                telefono=sc.nextInt();
                System.out.print("Escriba la fecha de tu cumpleaños: ");
                cumple=LocalDate.parse(sc.nextLine());
                System.out.println();
            } catch(InputMismatchException exc) {
                
            }
        }
    }//excepcionPersonal

}//class