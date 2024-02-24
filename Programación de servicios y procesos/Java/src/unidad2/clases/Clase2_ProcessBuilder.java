package unidad2.clases;

import java.io.IOException;

public class Clase2_ProcessBuilder {
    
    public static void main(String[] args) {

        String[] a = new String[2];
        
        a[0] = "notepad.exe";
        a[1] = "C:\\Users\\Usuario\\Desktop\\ejemplo.txt";
    
        Process p;
        ProcessBuilder pb = new ProcessBuilder(a);
    
        try {
    
            p = pb.start();
    
            try {
                p.waitFor();
            } catch (InterruptedException e) {
                System.out.println("Error al interrumpir el proceso");
            }
    
        } catch (IOException e) {
            System.out.println("Error al lanzar el proceso");
        } finally {
            System.out.println("Fin del proceso");
        }

    }

}
