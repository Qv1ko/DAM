package unidad1.ejercicios.ejercicio8_scanner;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        int num=0;
        int mayor=0,menor=Integer.MAX_VALUE /*valor maximo de un entero, con la clase Integer */,sumTotal=0,sumPos=0,sumNeg=0,count=0;
        float mediaSum=0;

        while(num!=-1) {
            System.out.print("Escriba un numero: ");
            num=entrada.nextInt();
            if(num!=-1) {
                if(num>mayor) {
                    mayor=num;
                }
                if(num<menor) {
                    menor=num;
                }
                if(num>=0) {
                    sumTotal+=num;
                    count++;
                    sumPos+=num;
                } else {
                    sumTotal+=num;
                    count++;
                    sumNeg+=num;
                }
                mediaSum=(float)sumTotal/count;
            }
        }

        // do {
        //     System.out.print("Escriba un numero: ");
        //     num=entrada.nextInt();

        //     if (num!=-1) {
        //         if(num>mayor) {
        //             mayor=num;
        //         }
        //         if(num<menor) {
        //             menor=num;
        //         }
        //         if(num>=0) {
        //             sumTotal+=num;
        //             count++;
        //             sumPos+=num;
        //         } else {
        //             sumTotal+=num;
        //             count++;
        //             sumNeg+=num;
        //         }
        //         mediaSum=(float)sumTotal/count;
        //     }
        // } while(num!=-1);

        System.out.println("\nMayor numero introducido -> "+mayor+"\nMenor numero introducido -> "+menor);
        System.out.println("Suma de todos los numeros -> "+sumTotal+"\nSuma de los numeros positivos -> "+sumPos+"\nSuma de los numeros negativos -> "+sumNeg);
        System.out.println("Media de la suma total -> "+mediaSum);

        entrada.close();

    } //fin main
    
} //fin class