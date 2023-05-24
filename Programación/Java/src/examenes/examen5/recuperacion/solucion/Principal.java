package examenes.examen5.recuperacion.solucion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        BufferedReader br = null;
        String[] linea = null;
        ArrayList<Productos> lista = new ArrayList<Productos>();
        try {
            br = new BufferedReader(new FileReader("Programación\\Java\\src\\examenes\\examen5\\recuperacion\\solucion\\productos.csv"));
            while (br.ready()) {
                linea = br.readLine().split(";");
                try {
                    if (linea[0].equalsIgnoreCase("C")) {
                        lista.add(new Comidas(linea[1], linea[2], Integer.parseInt(linea[3]), Float.parseFloat(linea[4])));
                    } else if (linea[0].equalsIgnoreCase("U")) {
                        lista.add(new Utensilios(linea[1], linea[2], Integer.parseInt(linea[3]), Float.parseFloat(linea[4])));
                    }
                } catch (NumberFormatException exc) {
                    System.out.println(exc.getMessage());
                }
            }
            for (Productos producto : lista) {
                System.out.println(producto.toString());
            }
        } catch (FileNotFoundException exc) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Error de entrada o salida");
        }
    }

}
