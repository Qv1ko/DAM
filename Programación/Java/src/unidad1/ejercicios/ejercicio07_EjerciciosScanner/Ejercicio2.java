package unidad1.ejercicios.ejercicio07_EjerciciosScanner;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        String password="qwerty123";
        Scanner entrada=new Scanner(System.in);

        for(int i=3;i>0;i--) {
            System.out.print("Escriba la contasena: ");
            String inputPass=entrada.next();
            if(inputPass.equals(password)) { //comparacion de diferentes objetos
                System.out.println("Enhorabuena");
                break;
            } else {
                System.out.println("Contrasena incorrecta");
            }
        }

        // boolean comparacion=false;
        // int count=0;
        // do {
        //     System.out.print("Escriba la contasena: ");
        //     String inputPass=entrada.next();
        //     if(inputPass.equals(password)) { //comparacion de diferentes objetos
        //         System.out.println("Enhorabuena");
        //         comparacion=true;
        //     } else {
        //         System.out.println("Contrasena incorrecta");
        //         count++;
        //     }
        // } while(!comparacion&&count<3);

        entrada.close();

    } //fin main
    
} //fin class