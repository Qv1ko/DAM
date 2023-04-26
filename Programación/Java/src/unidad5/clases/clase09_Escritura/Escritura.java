package unidad5.clases.clase09_Escritura;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escritura {

    public static void main(String[] args) {
        String rutaFichero="C:\\Users\\Usuario\\Desktop\\PruebaEscritura.txt";
        FileWriter fw=null;
        BufferedWriter bw=null;
        int numero=(int)(Math.random()*11);
        try {
            fw=new FileWriter(rutaFichero);
            bw=new BufferedWriter(fw);
            bw.write("Tabla del "+numero+":");
            bw.newLine();
            for(int i=0;i<11;i++) {
                bw.write(numero+" * "+i+" = "+(numero*i));
                bw.newLine();
            }
            bw.close();
            // Libera el buffer sin cerrarlo
            // bw.flush();
        } catch (IOException exc) {
            System.out.println("\nError");
        }
    }//main

}//class
