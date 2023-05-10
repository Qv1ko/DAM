package unidad6.ejercicios.ejercicio03_Hangar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Hangar {

    public static void main(String[] args) {
        // Variables y objetos
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)), br = null;
        BufferedWriter bw = null;
        String[] linea = new String[4];
        int opcion = 0;
        Map<String, Naves> navesHangar = new HashMap<String, Naves>();
        // Importar datos
        try {
            br = new BufferedReader(new FileReader("Programación\\Java\\src\\unidad6\\ejercicios\\ejercicio03_Hangar\\Data.csv"));
            while (br.ready()) {
                linea = br.readLine().split(";");
                navesHangar.put(linea[1], (linea[0].equals("t")) ? new Ties(linea[1], Boolean.parseBoolean(linea[2]), Float.parseFloat(linea[3])) : new Wings(linea[1], Boolean.parseBoolean(linea[2]), Integer.parseInt(linea[3])));
            }
            br.close();
        } catch (IOException exc) {
            System.out.println("\n! Error de entrada o salida\n");
        }
        // Menu de opciones
        do {
            try {
                System.out.print("\nMenu de opciones:\n1.) Añadir nave\n2.) Eliminar nave\n3.) Ver naves\n0.) Salir\nSelecciona una opción: ");
                opcion = Integer.parseInt(bf.readLine());
                switch (opcion) {
                    case 1 -> addNave(bf, navesHangar);
                    case 2 -> delNave(bf, navesHangar);
                    case 3 -> listNaves(navesHangar);
                    case 0 -> System.out.println("\n! Saliendo...\n");
                    default -> System.out.println("\n! Opción no valida\n");
                }
            } catch (IOException exc) {
                System.out.println("\n! Error de entrada o salida\n");
            } catch (NullPointerException exc) {
                System.out.println("\n! Nave no encontrada\n");
            } catch (NumberFormatException exc) {
                System.out.println("\n! Opcion no valida\n");
            }
        } while (opcion != 0);
        // Guardar naves
        try {
            bw = new BufferedWriter(new FileWriter("Programación\\Java\\src\\unidad6\\ejercicios\\ejercicio03_Hangar\\Data.csv"));
            for (String naveKey : navesHangar.keySet()) {
                bw.write(navesHangar.get(naveKey).toFile());
                bw.newLine();
            }
            bw.close();
        } catch (IOException exc) {
            System.out.println("\n! Error de entrada o salida\n");
        }
    }

    private static void addNave(BufferedReader bf, Map<String, Naves> navesHangar) {
        String[] datos = new String[3];
        boolean run = true;
        System.out.println("Introduce los datos de la nave:");
        while (run) {
            try {
                System.out.print("Matricula: ");
                datos[0] = bf.readLine();
                run = false;
            } catch (IOException exc) {
                System.out.println("\n! Error al introducir la matricula\n");
            }
        }
        run = true;
        while (run) {
            try {
                System.out.print("Pertenece al imperio (S/N): ");
                datos[1] = bf.readLine().toLowerCase();
                run = !(datos[1].charAt(0) == 's' || datos[1].charAt(0) == 'n');
            } catch (IOException exc) {
                System.out.println("\n! Error de entrada o salida\n");
            }
        }
        run = true;
        while (run) {
            try {
                System.out.print("Tipo de nave (Wing/Tie): ");
                switch (bf.readLine().toLowerCase().charAt(0)) {
                    case 't':
                        System.out.print("Numero de cilindradas: ");
                        datos[2] = bf.readLine();
                        run = false;
                        break;
                    case 'w':
                        System.out.print("Numero de motores: ");
                        datos[2] = bf.readLine();
                        run = false;
                        break;
                }
            } catch (IOException exc) {
                System.out.println("\n! Error al elegir el tipo de nave\n");
            }
        }
    }

    private static void delNave(BufferedReader bf, Map<String, Naves> navesHangar) throws IOException, NullPointerException {
        System.out.print("Introduce la matricula de la nave: ");
        navesHangar.remove(bf.readLine());
        System.out.println("\nNave eliminada\n");
    }

    private static void listNaves(Map<String, Naves> navesHangar) {
        System.out.println("\nListado de naves del hangar:\n");
        for (String naveKey : navesHangar.keySet()) {
            System.out.println(navesHangar.get(naveKey).toString());
        }
    }

}
