package unidad6.ejercicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
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
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = null;
        BufferedWriter bw = null;
        ArrayList<Multimedia> lista = new ArrayList<Multimedia>();
        String[] linea = null;
        int opcion = -1;
        try {
            br = new BufferedReader(new FileReader("Programación\\Java\\src\\unidad6\\ejercicio\\media.csv"));
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
                    System.out.println("\n! Dato no númerico " + linea[3] + " en " + linea[1] + "\n");
                }
            }
        } catch (FileNotFoundException exc) {
            System.out.println("\n! Fichero no existe\n");
        } catch (IOException exc) {
            System.out.println("\n! Error E/S\n");
        }
        for (Multimedia m : lista) {
            System.out.println(m.toString());
        }
        // lista.add(new Peliculas("Peter pan", "Infantil", 90));
        // lista.add(new Series("Naruto", "Anime", 17));
        // lista.add(new Libros("El cid Campeador", "Acción", "Cervantes"));
        br = new BufferedReader(in);
        try {
            while (opcion != 0) {
                System.out.print("\nMenu de opciones:\n\s1) Añadir pelicula\n\s2) Añadir serie\n\s3) Añadir libro\n\s0) Salir\n\nSeleccione una opcion: ");
                opcion = Integer.parseInt(br.readLine());
                switch (opcion) {
                    case 0 -> System.out.println("\nSaliendo...\n");
                    case 1 -> addPelicula(lista, br);
                    case 2 -> addSerie(lista, br);
                    case 3 -> addLibro(lista, br);
                    default -> System.out.println("\n! Opcion invalida\n");
                }
            }
        } catch (IOException exc) {
            System.out.println("\n! Error E/S\n");
        } catch (NumberFormatException exc) {
            System.out.println("\n! Dato no númerico\n");
        }
        try {
            bw = new BufferedWriter(new FileWriter("Programación\\Java\\src\\unidad6\\ejercicio\\media.csv"));
            for (Multimedia m : lista) {
                bw.write(m.toFile());
                bw.newLine();
            }
            bw.close();
        } catch (IOException exc) {
            System.out.println("\n! Error E/S\n");
        }
    }

    private static void addPelicula(ArrayList<Multimedia> lista,BufferedReader br) {
        String titulo="",genero="";
        int duracion=0;
        try {
            System.out.print("Titulo de la pelicula: ");
            titulo = br.readLine();
            System.out.print("Genero de la pelicula: ");
            genero = br.readLine();
            System.out.print("Minutos de duración de la pelicula: ");
            duracion = Integer.parseInt(br.readLine());
            lista.add(new Peliculas(titulo,genero,duracion));
        } catch (IOException exc) {
            System.out.println("\n! Error E/S\n");
        } catch (NumberFormatException exc) {
            System.out.println("\n! Dato no númerico\n");
        }
    }

    private static void addSerie(ArrayList<Multimedia> lista,BufferedReader br) {
        String titulo="",genero="";
        int temporadas=0;
        try {
            System.out.print("Titulo de la serie: ");
            titulo = br.readLine();
            System.out.print("Genero de la serie: ");
            genero = br.readLine();
            System.out.print("Temporadas de la serie: ");
            temporadas = Integer.parseInt(br.readLine());
            lista.add(new Series(titulo,genero,temporadas));
        } catch (IOException exc) {
            System.out.println("\n! Error E/S\n");
        } catch (NumberFormatException exc) {
            System.out.println("\n! Dato no númerico\n");
        }
    }

    private static void addLibro(ArrayList<Multimedia> lista,BufferedReader br) {
        String titulo="",genero="",autor="";
        try {
            System.out.print("Titulo de la serie: ");
            titulo = br.readLine();
            System.out.print("Genero de la serie: ");
            genero = br.readLine();
            System.out.print("Temporadas de la serie: ");
            autor = br.readLine();
            lista.add(new Libros(titulo,genero,autor));
        } catch (IOException exc) {
            System.out.println("\n! Error E/S\n");
        }
    }

}
