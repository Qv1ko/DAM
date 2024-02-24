package unidad3.clases;

import java.util.Arrays;

public class Clase6_MatricesOrdenadas {
    
    public static void main(String[] args) {
        ordenadas1();
        System.out.println();
        ordenadas2();
        System.out.println();
        ordenadas3();
    }//main

    public static void ordenadas1() {
        int[][] matrices=new int[3][3];
        int num=0;
        for(int i=0;i<matrices.length;i++) {
            for(int j=0;j<matrices[0].length;j++) {
                do {
                    num=(int)(Math.random()*10);
                }while(validar(matrices,num));
                matrices[i][j]=num;
            }
        }
        for(int[] dato:matrices) {
            System.out.println(Arrays.toString(dato));
        }
    }//ordenadas1

    public static boolean validar(int[][] matriz,int numAleatorio) {
        boolean resultado=false;
        for(int i=0;i<matriz.length;i++) {
            for(int j=0;j<matriz[0].length;j++) {
                if(matriz[i][j]==numAleatorio) {
                    resultado=true;
                    break;
                }
            }
        }
        return resultado;
    }//validar

    public static void ordenadas2() {
        int fil=3,col=3,numAleatorio=0;
        int[][] matrices=new int[fil][col];
        int[] numGenerados=new int[fil*col];
        for(int i=0;i<matrices.length;i++) {
            for(int j=0;j<matrices[0].length;j++) {
                Arrays.sort(numGenerados);
                do {
                    numAleatorio=(int)(Math.random()*10);
                }while(Arrays.binarySearch(numGenerados, numAleatorio)>0);
                numGenerados[0]=numAleatorio;
                matrices[i][j]=numAleatorio;
            }
        }
        for(int[] matriz:matrices) {
            System.out.println(Arrays.toString(matriz));
        }
    }//ordenadas2

    public static void ordenadas3() {
        int fil=3,col=3,aleatorio=0;
        int[][] matrices=new int[fil][col];
        String listaNum="";
        for(int i=0;i<matrices.length;i++) {
            for(int j=0;j<matrices[0].length;j++) {
                do {
                    aleatorio=(int)((Math.random()*21)+10);
                }while((listaNum.contains("\""+aleatorio+"\"")));
                matrices[i][j]=aleatorio;
                listaNum+="\""+aleatorio+"\"";
            }
        }
        for(int[] matriz:matrices) {
            System.out.println(Arrays.toString(matriz));
        }
    }//ordenadas3

}//class
