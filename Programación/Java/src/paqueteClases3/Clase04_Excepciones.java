package paqueteClases3;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Clase04_Excepciones {
    
    public static void main(String[] args) {
        // NumberFormatException exc=new NumberFormatException();
        int num=15,num2=0;
        if(num2%2!=0) {
            System.out.println(num/num2);
        } else {
            try {
                throw new NumberFormatException("\nNumero par\n");
            } catch(NumberFormatException exc) {
                System.out.println("\nNumero par\n");
            }
        }
        //Throw sirve para añadir manualmente excepciones
        try {
            if(num<0) {
                throw new Exception("\nNumero negativo\n");
            } else if(num>=0&&num<10) {
                throw new Exception("\nNumero entre 0 y 9\n");
            } else {
                throw new Exception("\nNumero mayor que 10\n");
            }
        } catch(Exception exc) {
            System.out.println(exc.getMessage());
        }
        excepcionPersonal();
    }//main

    //Ejercicio de personal con throw
    private static void excepcionPersonal() {
        Scanner sc=new Scanner(System.in);
        String nombre="";
        int telefono=0;
        LocalDate cumple=null;
        boolean error=true;
        while(error) {
            try {
                nombre=altaNombre(sc);
                System.out.print("Escriba su telefono: ");
                telefono=Integer.parseInt(sc.nextLine());
                System.out.print("Escriba la fecha de tu cumpleaños: ");
                cumple=LocalDate.parse(sc.nextLine());
                error=false;
            } catch(NumberFormatException exc) {
                System.out.println("\nError - Telefono incorrecto\n");
            } catch(DateTimeParseException exc) {
                System.out.println("\nError - Fecha incorrecta\n");
            } catch(Exception exc) {
                System.out.println(exc.getMessage());
            } finally { //El finally siempre se ejecutará, haya o no excepción
                System.out.println((!error)? "\n\tFin de bucle\n":"");
            }
        }
        System.out.println("\n"+nombre+" nacio un "+cumple.getDayOfWeek()+"\nSu telefono es "+telefono+"\n");
        sc.close();
    }//excepcionPersonal

    //Metodo con throws (lanza la excepcion al try del metodo excepcionPersonal)
    private static String altaNombre(Scanner sc) throws Exception{ //Se pueden separar con comas las diferentes excepciones
        String nombre="";
        System.out.print("Escriba su nombre: ");
        nombre=sc.nextLine();
        if(nombre.isBlank()) {
            throw new Exception("\nNombre no puede ser en blanco\n");
        }
        return nombre;
    }//altaNombre

}//class