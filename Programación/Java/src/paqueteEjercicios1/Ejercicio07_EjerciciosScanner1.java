package paqueteEjercicios1;

import java.util.Scanner;

public class Ejercicio07_EjerciciosScanner1 {

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in); //declaracion e instanciacion del input con Scanner
        int ventas=0;
        float total=0.0f;

        System.out.print("Escriba el numero de ventas: ");
        ventas=entrada.nextInt();
        for(int i=ventas;i>0;i--) {
            System.out.print("Escriba el importe de la "+i+"venta : ");
            total+=entrada.nextFloat();
        }
        System.out.println("Total de productos vendidos -> "+total);

        entrada.close();

    } //fin main

} //fin class