package unidad5.ejercicios.ejercicio7_ticajes;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Ticajes {
    
    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);
        boolean error=false;
        LocalTime hEntrada=null,hSalida=null;
        final int JORNADACOMPLETA=480;
        do {
            try {
                System.out.println("\nConfiguracion de la hora de entrada:");
                hEntrada=LocalTime.of(getHora(ent), getMinutos(ent));
                System.out.println("\nConfiguracion de la hora de salida:");
                hSalida=LocalTime.of(getHora(ent), getMinutos(ent));
                if(hSalida.isBefore(hEntrada)) {
                    throw new Exception("La hora de salida debeser anterior a la de entrada");
                }
                error=false;
                Duration jornada=Duration.between(hEntrada, hSalida);
                System.out.println((jornada.toHours()>=8)? "\nJornada completada":"\nFaltan "+(JORNADACOMPLETA-jornada.toMinutes())+" minutos");
            } catch(DateTimeException exc) {
                System.out.println(exc.getMessage());
                error=true;
            } catch(ArithmeticException exc) {
                System.out.println("Error - Escriba la hora correctamente");
            } catch(Exception exc) {
                System.out.println(exc.getMessage());
            }
        } while(error);
        ent.close();
    }//main
    
    private static int getHora(Scanner ent) {
        int hora=0;
        boolean run=true;
        while(run) {
            try {
                System.out.print("Introduce la hora: ");
                hora=Integer.parseInt(ent.nextLine());
                run=false;
            } catch(NumberFormatException exc) {
                System.out.println("\nError - Hora incorrecta\n");
            }
        }
        return hora;
    }//getHora

    private static int getMinutos(Scanner ent) {
        int minutos=0;
        boolean run=true;
        while(run) {
            try {
                System.out.print("Introduce los minutos: ");
                minutos=Integer.parseInt(ent.nextLine());
                run=false;
            } catch(NumberFormatException exc) {
                System.out.println("\nError - Minutos incorrectos\n");
            }
        }
        return minutos;
    }//getMinutos

}//class
