package unidad2.clases.clase1_metodos;

import java.util.Scanner;

public class Metodos4 {
 
    public static void main(String[] aux) {
        
        Scanner ent=new Scanner(System.in);
        int num1=0,num2=0;

        System.out.print("Introduce un numero: ");
        num1=ent.nextInt();
        System.out.print("Introduce otro numero: ");
        num2=ent.nextInt();
        System.out.print("El resultado de "+num1+"+"+num2+" es -> "+sumar(num1, num2));

        ent.close();

    } //fin main

    public static int sumar(int a,int b) {

        // int total=a+b;

        // return total;

        return a+b;

    } //fin sumar

} //fin class