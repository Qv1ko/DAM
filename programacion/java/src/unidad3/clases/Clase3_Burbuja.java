package unidad3.clases;

import java.util.Arrays;

public class Clase3_Burbuja {

    public static void main(String[] args) {
        int[] numeros={3,5,1,9,10,2,4,7,8,6};
        int aux=0;
        System.out.println(Arrays.toString(numeros));
        for(int i=0;i<numeros.length-1;i++) {
            for(int j=i+1;j<numeros.length;j++){
                if(numeros[i]>numeros[j]) {
                    aux=numeros[i];
                    numeros[i]=numeros[j];
                    numeros[j]=aux;
                }
            }
        }
        // Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        
        //busqueda en una lista
        System.out.println(Arrays.binarySearch(args, 6));
    }//main

}//class
