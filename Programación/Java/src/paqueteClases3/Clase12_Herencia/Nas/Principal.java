package paqueteClases3.Clase12_Herencia.Nas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        // Peliculas peli = new Peliculas("Peter pan", "Infantil", 90);
        // Series serie = new Series("Naruto", "Anime", 17);
        // Libros libro = new Libros("El cid Campeador", "Acción", "Cervantes");
        // ArrayList<Multimedia> lista = new ArrayList<Multimedia>();
        // lista.add(peli);
        // lista.add(serie);
        // lista.add(libro);
        // for(Multimedia m:lista) {
        //     System.out.println(m);
        // }
        BufferedReader br = null;
        BufferedWriter bw = null;
        ArrayList<Multimedia> lista = new ArrayList<Multimedia>();
        String[] linea = null;
        try {
            br = new BufferedReader(new FileReader("Programación\\Java\\src\\paqueteClases3\\Clase12_Herencia\\Nas\\media.csv"));
            while (br.ready()) {
                linea = br.readLine().split(";");
                try {
                    if (linea[0].equalsIgnoreCase("P")) {
                        lista.add(new Peliculas(linea[1], linea[2], Integer.parseInt(linea[3])));
                    } else if (linea[0].equalsIgnoreCase("S")) {
                        lista.add(new Series(linea[1], linea[2], Integer.parseInt(linea[3])));
                    } else if (linea[0].equalsIgnoreCase("L")) {
                        lista.add(new Libros(linea[1], linea[2], linea[3]));
                    }
                } catch (NumberFormatException exc) {
                    System.out.println("\n! Dato no númerico "+linea[3]+" en "+linea[1]+"\n");
                }
            }
        } catch (FileNotFoundException exc) {
            System.out.println("\n! Fichero no existe\n");
        } catch (IOException exc) {
            System.out.println("\n! Error E/S\n");
        }
        for(Multimedia m:lista) {
            System.out.println(m.toString());
        }
        lista.add(new Peliculas("Peter pan", "Infantil", 90));
        lista.add(new Series("Naruto", "Anime", 17));
        lista.add(new Libros("El cid Campeador", "Acción", "Cervantes"));
        try {
            bw = new BufferedWriter(new FileWriter("Programación\\Java\\src\\paqueteClases3\\Clase12_Herencia\\Nas\\media.csv"));
            for(Multimedia m:lista) {
                bw.write(m.toFile());
                bw.newLine();
            }
            bw.close();
        } catch (IOException exc) {
            System.out.println("\n! Error E/S\n");
        }
    }

}
