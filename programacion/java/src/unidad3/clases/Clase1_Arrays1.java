package unidad3.clases;

import java.util.Arrays;
import java.util.Scanner;

public class Clase1_Arrays1 {

    public static void main(String[] args) {
        
        //declaracion de un array
        int[] numeros; //utilizado en C#
        // int lista[]; //lo comun
        Scanner ent=new Scanner(System.in);

        //los arrays son de tamano fijo y estatico
        numeros=new int[5];

        // numeros[3]=10000;
        // System.out.println("La posicion 3 contiene "+numeros[3]);

        for(int i=0;i<numeros.length;i++) {
            System.out.print("Escriba el valor de la celda "+i+": ");
            numeros[i]=ent.nextInt();            
        }

        //for each
        for(int valor:numeros) {
            System.out.println("**"+valor+"**");
        }

        System.out.println(Arrays.toString(numeros));

        ent.close();

    } //fin main

} //fin class