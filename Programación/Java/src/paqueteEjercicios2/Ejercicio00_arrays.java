package paqueteEjercicios2;

import java.util.Arrays;

public class Ejercicio00_arrays {

    public static void main(String[] args) {
        
        //Definir dos arrays y crear un tercero con el multiplo guardado en otro array
        int[] primeraColumna=new int[4];
        int[] segundaColumna=new int[4];
        int[] terceraColuma=new int[4];

        for(int i=0;i<terceraColuma.length;i++) {
            primeraColumna[i]=(int)((Math.random())*11);
            segundaColumna[i]=(int)((Math.random())*11);
            terceraColuma[i]=primeraColumna[i]*segundaColumna[(segundaColumna.length-1)-i];
        }
        System.out.println(Arrays.toString(primeraColumna));
        System.out.println(Arrays.toString(segundaColumna));
        System.out.println(Arrays.toString(terceraColuma));

    }
    
}
