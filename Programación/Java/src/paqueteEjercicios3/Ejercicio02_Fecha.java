package paqueteEjercicios3;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02_Fecha {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        int dia=0,mes=0,ano=0;
        LocalDate fecha=null;
        while(flag) {
            try {
                System.out.print("Introduce el dia: ");
                dia=sc.nextInt();
                System.out.print("Introduce el mes: ");
                mes=sc.nextInt();
                System.out.print("Introduce el año: ");
                ano=sc.nextInt();
                fecha=LocalDate.of(ano,mes,dia);
                flag=false;
            } catch(InputMismatchException exc) {
                System.out.println("\nIntroduce la fecha correctamente\n");
            } catch(DateTimeException exc) {
                System.out.println("\nEl formato de la fecha es incorrecto - Formato (aaaa-mm-dd)\n");
            }
        }
        System.out.println("La fecha es "+fecha);
        sc.close();
    }//main

}//class