package paqueteEjercicios3;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio00_Parking {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LocalTime entrada=LocalTime.of(0,0);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:mm");
        float importe=0.0f;
        //Input
        System.out.print("Introduce la hora de entrada: ");
        entrada=LocalTime.parse(sc.nextLine(),dtf);
        //Importe
        Duration tiempoAparcado=Duration.between(entrada,LocalTime.now());
        importe=importe(entrada,tiempoAparcado.toMinutes());
        System.out.println("\nEl importe total es de "+importe+" euros\n");
        //Cambio
        cambio(sc,importe);
        sc.close();
    }//main

    private static float importe(LocalTime entrada,long minutos) {
        LocalTime inicioDescuento=LocalTime.parse("00:00"),finDescuento=LocalTime.parse("08:00");
        float precio=0.0f;
        if(entrada.isAfter(inicioDescuento)&&entrada.isBefore(finDescuento)) {
            precio=0.10f;
        } else if(minutos<60) {
            precio=0.20f;
        } else if(minutos>=60&&minutos<(60*5)) {
            precio=0.15f;
        } else {
            precio=0.10f;
        }
        return precio*minutos;
    }//importe

    private static void cambio(Scanner sc,float importe) {
        int billete=0,numMonedas=0;
        float[] monedas={2,1,0.5f,0.2f,0.1f,0.05f,0.02f,0.01f};
        String cambio="\nDevolvemos ";
        do {
            System.out.print("Introduce el billete: ");
            billete=sc.nextInt();
        }while(billete<importe||(billete!=200&&billete!=100&&billete!=50&&billete!=20&&billete!=10&&billete!=5));
        for(float moneda:monedas) {
            numMonedas=0;
            while((numMonedas+1)*moneda<=importe) {
                numMonedas++;
            }
            if(numMonedas!=0) {
                cambio+=numMonedas+((numMonedas>1)? " monedas de "+moneda+((moneda>=1)? " euros":" centimos"):" moneda de "+moneda+((moneda>=1)? " euro":" centimos"));
                importe-=numMonedas*moneda;
                cambio+=(importe>0.01)? ", ":"";
            }
        }
        System.out.println(cambio+"\n");
    }//cambio

}//class