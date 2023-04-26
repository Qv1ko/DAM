package unidad3.clases.clase00_Arrays;

import java.util.Arrays;

public class Arrays2 {

    public static void main(String[] args) {
        
        char[] lista=new char[10];
        String frases[]=new String[5];
        // float[] precios=new float[5];

        lista[0]='~';
        frases[frases.length-1]="Elemento";

        System.out.println("Caracter -> "+lista[0]+"\nCadena -> "+frases[frases.length-1]+"\nNulo -> "+frases[2]);
        System.out.println("*"+Arrays.toString(frases)+"*");

    }//main
    
}//class
