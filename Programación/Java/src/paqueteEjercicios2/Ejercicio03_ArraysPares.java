package paqueteEjercicios2;

import java.util.Arrays;

public class Ejercicio03_ArraysPares {

    public static void main(String[] args) {
        int[] numeros=new int[15],numPares=new int[15],numImpares=new int[15];
        int contPares=0,contImpares=0;
        for(int i=0;i<numeros.length;i++) {
            numeros[i]=(int)(Math.random()*101);
            if(numeros[i]%2==0) {
                numPares[contPares]=numeros[i];
                contPares++;
            } else {
                numImpares[contImpares]=numeros[i];
                contImpares++;
            }
        }
        System.out.println("Numeros pares -> "+Arrays.toString(numPares)+"\nNumeros impares -> "+Arrays.toString(numImpares));
    }

}