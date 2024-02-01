package unidad2.clases;

import java.io.IOException;

public class Clase02_RunTime {
    
    public static void main(String[] args) {
        
        String[] a = new String[2];
        
        a[0] = "notepad.exe";
        a[1] = "C:\\Users\\Usuario\\Desktop\\ejemplo.txt";
    
        Runtime r = Runtime.getRuntime();
        Process p;
    
        try {
    
            p = r.exec(a);
    
            try {

                p.waitFor();
                System.out.println("Fin del proceso");
                p.destroy();
                
            } catch (InterruptedException e) {
                System.out.println("Error al interrumpir el proceso");
            }
    
        } catch (IOException e) {
            System.out.println("Error al lanzar el proceso");
        }

    }

}
