package unidad3.ejercicios;

import java.util.Scanner;

public class Ejercicio6_Arbol {

    public static void main(String[] args) {
        int altura=0;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.print("Define la altura del arbol: ");
            altura=sc.nextInt();
        } while(altura<1);
        if(altura==1) {
            arbolUno(altura);
        } else if(altura==2) {
            arbolDos(altura);
        } else {
            arbol(altura);
        }
        sc.close();
    }//main

    public static void arbolUno(int altura) {
        System.out.println("\n*\nI\n");
    }//arbolUno

    public static void arbolDos(int altura) {
        System.out.println("\n *\n***\n I\n");
    }//arbolDos

    public static void arbol(int altura) {
        System.out.println();
        String asteriscos="*";
        for(int i=0;i<altura;i++) {
            System.out.println(String.format(("%"+Integer.toString(altura+i)+"s"),asteriscos));
            asteriscos+="**";
        }
        System.out.println(String.format(("%"+Integer.toString(altura+2)+"s"), "|_|\n"));
    }//arbol

}//class