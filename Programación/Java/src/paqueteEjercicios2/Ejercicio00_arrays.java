package paqueteEjercicios2;

import java.util.Arrays;

public class Ejercicio00_Arrays {

    public static void main(String[] args) {
        
        int[] primeraColumna=new int[4], segundaColumna=new int[4], terceraColumna=new int[4];

        for(int i=0;i<terceraColumna.length;i++) {
            primeraColumna[i]=(int)((Math.random())*11);
            segundaColumna[(segundaColumna.length-1)-i]=(int)((Math.random())*11);
            terceraColumna[i]=primeraColumna[i]*segundaColumna[(segundaColumna.length-1)-i];
        }

        System.out.println(Arrays.toString(terceraColumna));

    }//main
    
}//class
