package unidad3.clases;

import java.util.Arrays;

public class Clase4_Matrices {

    public static void main(String[] args) {
        //declarando e inicializando una matriz(array de arrays)
        int[][] matrices=new int[3][3];
        //instanciando la matriz
        for(int i=0;i<matrices.length;i++) {
            for(int j=0;j<matrices[0].length;j++) {
                matrices[i][j]=(int)(Math.random()*10);
            }
        }
        //for each
        for(int[] dato:matrices) {
            System.out.println(Arrays.toString(dato));
        }
    }//main

}//class
