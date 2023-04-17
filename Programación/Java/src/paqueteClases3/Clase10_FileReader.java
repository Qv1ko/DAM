package paqueteClases3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Clase10_FileReader {
    
    public static void main(String[] args) {
        String rutaFichero="C:\\Users\\Usuario\\Desktop\\loremipsum.txt";
        int numLinea=1;
        BufferedReader br=null;
        try {
            FileReader fichero=new FileReader(rutaFichero);
            br=new BufferedReader(fichero);
            if(!br.ready()) {
                throw new Exception("\nError - El fichero esta vacio");
            }
            // El metodo ready devuelve un boleano que indica si el archivo esta listo para leer
            while(br.ready()) {
                System.out.println("Linea "+numLinea+": "+br.readLine());
                numLinea++;
            }
        } catch(FileNotFoundException exc) {
            System.out.println("\nError - Fichero no encontrado");
        } catch(IOException exc) {
            System.out.println("\nError - La entrada fallo");
        } catch(Exception exc) {
            System.out.println(exc.getMessage());
        } finally {
            try {
                br.close();
            } catch (IOException exc) {
                System.out.println("\nError - Hubo un error al cerrar");
            }
        }
    }//main

}//class
