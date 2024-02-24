package unidad7.ejercicios.ejercicio4_Alimentos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class LecturaAlimentos {

    public static void main(String[] args) {
        File fichero = new File("Programación\\Java\\src\\unidad7\\ejercicios\\ejercicio4_Alimentos\\alimentos.csv");
        BufferedReader br = null;
        String respuesta = "";
        String[] linea = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Quieres leer frutas o verduras: ");
            respuesta = br.readLine();
            br = new BufferedReader(new FileReader(fichero));
            bw = new BufferedWriter(new FileWriter("Programación\\Java\\src\\unidad7\\ejercicios\\ejercicio4_Alimentos\\misCompras.txt"));
            while (br.ready()) {
                linea = br.readLine().split(";");
                // try {
                //     System.out.println("Las " + linea[0].toLowerCase() + " te cuestan: " + Integer.parseInt(linea[3]) * Float.parseFloat(linea[4].replace(",", ".")));
                // } catch (NumberFormatException exc) {
                //     System.out.println("Error en los datos");
                // }
                if(respuesta.equalsIgnoreCase(linea[1])) {
                    bw.write("Las " + linea[0].toLowerCase() + " te cuestan: " + Integer.parseInt(linea[3]) * Float.parseFloat(linea[4].replace(",", ".")));
                    bw.newLine();
                }
            }
            bw.close();
            br.close();
        } catch (FileNotFoundException exc) {
            System.out.println("Fichero no encontrado");
        } catch (IOException exc) {
            System.out.println("Error de entrada o salida");
        }
    }

}
