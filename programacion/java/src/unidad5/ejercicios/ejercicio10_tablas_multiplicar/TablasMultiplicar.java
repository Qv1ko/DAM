package unidad5.ejercicios.ejercicio10_tablas_multiplicar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class TablasMultiplicar {

    public static void main(String[] args) {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        File ruta=null,dirTablas=null;
        BufferedWriter bw=null;
        System.out.print("Introduce la ruta: ");
        try {
            ruta=new File(br.readLine());
            if(!ruta.isDirectory()) {
                throw new Exception("\n! El directorio no existe\n");
            }
            dirTablas=new File(ruta,"\\MisTablas");
            if(!dirTablas.exists()) {
                if(!dirTablas.mkdir()) {
                    throw new Exception("\n! El directorio no se pudo crear\n");
                }
                System.out.println("\nDirectorio creado\n");
            }
            for(int i=1;i<11;i++) {// Bucle para cada tabla
                bw=new BufferedWriter(new FileWriter(dirTablas+"\\Tabla_del_"+i+".txt"));
                for(int j=0;j<11;j++) {//Bucle para cada operacion
                    bw.write(i+" * "+j+" = "+i*j);
                    bw.newLine();
                }
                bw.close();
            }
        } catch(IOException exc) {
            System.out.println("\n! Error en la entrada de datos\n");
        } catch(NullPointerException exc) {
            System.out.println("\n! La ruta no puede estar vacia\n");
        } catch(SecurityException exc) {
            System.out.println("\n! Error de seguridad\n");
        } catch(Exception exc) {
            System.out.println(exc.getMessage());
        }
    }//main

}//class
