package unidad3.ejercicios;

import java.util.Scanner;

public class Ejercicio02_Vocales {

    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);
        String[] palabras;
        System.out.print("Escriba una frase: ");
        palabras=ent.nextLine().toLowerCase().split(" ");
        for(String palabra:palabras) {
            vocales(palabra);
        }
        ent.close();
    }//main

    public static void vocales(String palabra) {
        int countA=0,countE=0,countI=0,countO=0,countU=0;
        for(int i=0;i<palabra.length();i++) {
            switch(palabra.charAt(i)) {
                case 'a':
                    countA++;break;
                case 'e':
                    countE++;break;
                case 'i':
                    countI++;break;
                case 'o':
                    countO++;break;
                case 'u':
                    countU++;break;
            }//switch
        }
        System.out.println("Las vocales de la palabra \""+palabra+"\" son:");
        if(countA!=0) {System.out.println("A -> "+countA);}
        if(countE!=0) {System.out.println("E -> "+countE);}
        if(countI!=0) {System.out.println("I -> "+countI);}
        if(countO!=0) {System.out.println("O -> "+countO);}
        if(countU!=0) {System.out.println("U -> "+countU);}
    }//vocales

}//class
