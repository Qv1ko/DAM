package paqueteEjercicios3;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio00_Parking {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DateTimeFormatter df=DateTimeFormatter.ofPattern("HH:mm");
        LocalTime entrada=LocalTime.of(0,0);

        System.out.print("Introduce la hora de entrada: ");
        entrada=LocalTime.parse(sc.nextLine(),df);
        Duration tiempoAparcado=Duration.between(entrada,LocalTime.now());
        float importe=importe(tiempoAparcado.toMinutes());
        System.out.println(importe);
        sc.close();
    }//main

    private static float importe(LocalTime entrada,long minutos) {
        double precio=0.0;
        if() {

        } else if(minutos<60) {
            precio=0.20;
        } else if(minutos>=60&&minutos) {
            precio=0.15
        }
        // precio=()? 0.20:(minutos<(60*5))? 0.15:0.10;
        return (float)precio*minutos;
    }//importe

}//class