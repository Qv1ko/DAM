package unidad1.ejercicios.ejercicio8_EjerciciosScanner;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        int num1,num2;
        do {
            System.out.println("Escriba dos numeros diferentes:");
            System.out.print("Primer numero -> ");
            num1=entrada.nextInt();
            System.out.print("Segundo numero -> ");
            num2=entrada.nextInt();
        } while(num1==num2);
        int min=Math.min(num1, num2), max=Math.max(num1, num2);
        
        for(int i=10;i>0;i--) {
            int numRandom=(int)(Math.random()*(max+1));
            if(numRandom<min) {
                do {
                    numRandom=(int)(Math.random()*(max+1));
                } while(numRandom<min);
            }
            System.out.println(numRandom);
        }

        entrada.close();

    } //fin main
    
} //fin class