package pack01_Exercises;

import java.util.Scanner;

public class Exercise00_EjerciciosScanner1 {

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in); //declaracion e instanciacion del input con Scanner
        int ventas=0,productos=0,suma=0;

        System.out.print("Escriba el numero de ventas: ");
        ventas=entrada.nextInt();
        for(int i=ventas;i>0;i--) {
            System.out.print("Escriba el numero de productos comprados: ");
            productos=entrada.nextInt();
            suma+=productos;
        }
        System.out.println("Total de productos vendidos -> "+suma);

    } //fin main

} //fin class