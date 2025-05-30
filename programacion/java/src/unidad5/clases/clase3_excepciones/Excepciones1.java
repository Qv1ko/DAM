package unidad5.clases.clase3_excepciones;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Excepciones1 {
    
    public static void main(String[] args) {
        double[] miArray=new double[5];
        Scanner ent=new Scanner(System.in);
        try {
            System.out.println(miArray[14]);
        } catch(ArrayIndexOutOfBoundsException ex) { //Seleccinamos la excepcion a capturar
            System.out.println(ex.getMessage());
        }
        try {
            LocalDate fecha=LocalDate.parse("9-9-22");
            System.out.println(fecha);
        } catch(DateTimeParseException ex) { //Seleccinamos la excepcion a capturar
            System.out.println(ex.getMessage());
        }
        //Seleccion de la primer excepcion que coincida
        //Si no hay ninguna excepcion salta los catch
        try {
            miArray[0]=ent.nextDouble();
            miArray[14]=4;
            LocalDate fecha=LocalDate.parse("9-9-22");
            System.out.println(fecha);
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        } catch(DateTimeParseException ex) {
            System.out.println(ex.getMessage());
        } catch(Exception ex) {
            System.out.println("Error grave, llame a Oriol");
        }
        System.out.println("Fin del programa");
        ent.close();
    }//main

}//class