package paqueteClases3;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Clase08_Ficheros {
    
    public static void main(String[] args) {
        //Ruta del directorio actual
        File dir=new File(".");
        System.out.println(Arrays.toString(dir.listFiles()));
        //Listar directorios
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(in);
        System.out.print("Introduce el directorio: ");
        try {
            File directory=new File(bf.readLine());
            leerDir(directory);
        } catch(IOException exc) {
            System.out.println("Entrada incorrecta - "+exc.getMessage());
        }
    }//main
    
    private static void leerDir(File directory) {
        for(File fichero:directory.listFiles()) {
            if(fichero.isDirectory()) {
                if(fichero.list()!=null) {
                    System.out.println("\nSe puede escanear el contenido en "+fichero.getName());
                    leerDir(fichero);
                }
            } else {
                System.out.println(fichero.getName()+ " archivo de "+String.format("%.2f",fichero.length()/1024.00f)+" kb");
            }
        }
    }//leerDir

}//class