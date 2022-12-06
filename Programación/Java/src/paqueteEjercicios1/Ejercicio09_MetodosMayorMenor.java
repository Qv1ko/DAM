package paqueteEjercicios1;

import java.util.Scanner;

public class Ejercicio09_MetodosMayorMenor {

    public static void main(String[] args) {
        
        Scanner ent=new Scanner(System.in);
        int num1=0,num2=0;

        System.out.print("Escribe un numero: ");
        num1=ent.nextInt();
        System.out.print("Escribe otro numero: ");
        num2=ent.nextInt();

        mayorQue(num1,num2);

        if(num1!=num2){
            System.out.println("El numero "+menorQue(num1, num2)+" es el menor");
        } else {
            System.out.println("Los numeros son iguales");
        }

        ent.close();

    } //fin main
    
    public static void mayorQue(int numero1, int numero2) {

        if(numero1>numero2) {
            System.out.println("El numero "+numero1+" es el mayor");
        } else if(numero1<numero2) {
            System.out.println("El numero "+numero2+" es el mayor");
        }

    } //fin mayorQue

    public static int menorQue(int numero1,int numero2) {

        int menor=0;

        if(numero1<numero2) {
            menor=numero1;
        } else {
            menor=numero2;
        }

        return menor;

    } //fin menor

} //fin class