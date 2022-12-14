package paqueteEjercicios2;

import java.util.Arrays;

public class Ejercicio03_ArraysPares {

    public static void main(String[] args) {
        // int[] numeros=new int[15],numPares,numImpares;
        // int par=0,contPar=0,contImpar=0;
        // for(int i=0;i<numeros.length;i++) {
        //     numeros[i]=(int)(Math.random()*101);
        //     if(numeros[i]%2==0) {
        //         par++;
        //     }
        // }
        // numPares=new int[par];
        // numImpares=new int[numeros.length-par];
        // for(int i:numeros) {
        //     if(i%2==0) {
        //         numPares[contPar]=i;
        //         contPar++;
        //     } else {
        //         numImpares[contImpar]=i;
        //         contImpar++;
        //     }
        // }
        // System.out.println("Numeros pares -> "+Arrays.toString(numPares)+"\nNumeros impares -> "+Arrays.toString(numImpares));
    
        int[] lista=new int[15],listaPares=new int[0],listaImpares=new int[0];
        for(int i=0;i<lista.length;i++) {
            lista[i]=(int)(Math.random()*101);
            if(lista[i]%2==0) {
                listaPares=Arrays.copyOf(listaPares, listaPares.length+1);
                listaPares[listaPares.length-1]=lista[i];
            } else {
                listaImpares=Arrays.copyOf(listaImpares, listaImpares.length+1);
                listaImpares[listaImpares.length-1]=lista[i];
            }
        }
        System.out.println("Numeros pares -> "+Arrays.toString(listaPares)+"\nNumeros impares -> "+Arrays.toString(listaImpares));
    }//main

}//class