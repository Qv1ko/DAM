package paqueteClases2;

import java.util.Arrays;

public class Clase03_Matrices {

    public static void main(String[] args) {
        //declarando e inicializando una matriz(array de arrays)
        int[][] matrices=new int[3][3];
        int box=(-1);
        //instanciando la matriz
        for(int i=0;i<matrices.length;i++) {
            for(int j=0;j<matrices[0].length;j++) {
                matrices[i][j]=(int)(Math.random()*11);
            }
        }
        //for each
        for(int[] dato:matrices) {
            System.out.println(Arrays.toString(dato));
        }
    }//main

}//class
