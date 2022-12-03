package pack01_Exam;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner ent=new Scanner(System.in);
        int num=0;

        while(true) {
            
            System.out.print("Escribe un numero: ");
            num=ent.nextInt();
            System.out.println("El numero "+num+" es igual a \'"+asc(num)+"\' en ascii");

            System.out.print("Desea continuar? (S/N) --> ");
            char rsp=ent.next().toUpperCase().charAt(0);
            if(rsp=='S'){
                continue;
            } else {
                break;
            }

        }

        ent.close();

    } //fin main

    public static char asc(int num) {

        return (char)num;

    } //fin asc
    
} //fin class