package paqueteEjercicios2;

import java.util.Scanner;

public class Ejercicio01_Frases {
    
    public static void main(String[] args) {
        int numFrases=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Escriba el numero de frases que vas a introducir: ");
        numFrases=sc.nextInt();
        String[] frases=new String[numFrases];
        sc.nextLine();
        for(int i=0;i<frases.length;i++) {
            System.out.print("Escriba la frase numero "+i+": ");
            frases[i]=sc.nextLine();
        }
        imprimir(frases);
        sc.close();
    }//main

    public static void imprimir(String[] misFrases) {
        for(String cadena:misFrases) {
            System.out.println(cadena);
        }
    }//imprimir

}//class
