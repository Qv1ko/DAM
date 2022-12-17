package paqueteClases2;

import java.util.Arrays;

public class Clase03_Matrices {

    public static void main(String[] args) {
        //declarando e inicializando una matriz(array de arrays)
        int[][] matrices=new int[3][3];
        //instanciando la matriz
        for(int i=0;i<matrices.length;i++) {
            for(int j=0;j<matrices[0].length;j++) {
                do {
                    matrices[i][j]=(int)(Math.random()*11);
                } while(test(matrices));
            }
        }
        //for each
        for(int[] dato:matrices) {
            System.out.println(Arrays.toString(dato));
        }
    }//main

    public static boolean test(int[][] matriz) {
        boolean validar=true;
        for(int i=0;i<matriz.length;i++) {
            for(int j=0;j<matriz[0].length-1;j++) {
                if(matriz[i][j]!=matriz[i][j+1]) {
                    validar=false;
                }
            }
        }
        return validar;
    }//test

}//class
