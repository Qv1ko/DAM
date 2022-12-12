package paqueteClases2;

import java.util.Arrays;

public class Clase01_Referencias {

    public static void main(String[] args) {
        int[] numeros={1,2,3,4,5};
        int numero=10;
        String cadena="Hola";
        miMetodo(numeros,numero,cadena);
        System.out.println(Arrays.toString(numeros));
        System.out.println(numero+" "+cadena);
    }//main

    public static void miMetodo(int[] lista,int x,String texto) {
        /*
         * Por referencia(objeto)
         * Crea una segunda referecia al objeto inicial
         */
        lista[2]=12;
        /*
         * Por valor(variable tipo primitivo)
         * Copia en x el valor de numero 
         */
        x=15;
        texto+=" Mundo";
    }//miMetodo
    
}//class
