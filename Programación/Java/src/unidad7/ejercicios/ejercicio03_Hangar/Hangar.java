package unidad7.ejercicios.ejercicio03_Hangar;

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
            System.out.println("\nDatos importados");
        } catch (IOException exc) {
            System.out.println("\n! Error de entrada o salida");
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
                    case 0 -> System.out.println("\n! Saliendo...");
                    default -> System.out.println("\n! Opción no valida");
                }
            } catch (IOException exc) {
                System.out.println("\n! Error de entrada o salida");
            } catch (NullPointerException exc) {
                System.out.println("\n! Nave no encontrada");
            } catch (NumberFormatException exc) {
                System.out.println("\n! Opcion no valida");
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
            System.out.println("\nBackup finalizado");
        } catch (IOException exc) {
            System.out.println("\n! Error de entrada o salida");
        }
    }

    private static void addNave(BufferedReader bf, Map<String, Naves> navesHangar) {
        String[] datos = new String[3];
        boolean run = true, isWing = true;
        System.out.println("\nIntroduce los datos de la nave:");
        while (run) {
            try {
                System.out.print("Matricula: ");
                datos[0] = Validaciones.Matricula(bf.readLine());
                run = false;
            } catch (IOException exc) {
                System.out.println("\n! Error al introducir la matricula");
            } catch (Exception exc) {
                exc.getMessage();
            }
        }
        run = true;
        while (run) {
            try {
                System.out.print("Pertenece al imperio (S/N): ");
                datos[1] = Validaciones.Bando(bf.readLine().toLowerCase());
                run = false;
            } catch (IOException exc) {
                System.out.println("\n! Error de entrada o salida");
            } catch (Exception exc) {
                exc.getMessage();
            }
        }
        run = true;
        while (run) {
            try {
                System.out.print("Tipo de nave (Wing/Tie): ");
                switch (bf.readLine().toLowerCase().charAt(0)) {
                    case 'w':
                        System.out.print("Numero de motores: ");
                        datos[2] = Validaciones.Motores(bf.readLine());
                        isWing = true;
                        run = false;
                        break;
                    case 't':
                        System.out.print("Numero de cilindradas: ");
                        datos[2] = Validaciones.Cilindradas(bf.readLine());
                        isWing = false;
                        run = false;
                        break;
                }
            } catch (IOException exc) {
                System.out.println("\n! Error al elegir el tipo de nave\n");
            } catch (NumberFormatException exc) {
                System.out.println("\n! Error numerico\n");
            }
        }
        try {
            if (isWing) {
                navesHangar.put(datos[0], new Wings(datos[0], Boolean.parseBoolean(datos[1]), Integer.parseInt(datos[2])));
            } else {
                navesHangar.put(datos[0], new Ties(datos[0], Boolean.parseBoolean(datos[1]), Float.parseFloat(datos[2])));
            }
            System.out.println("\nNave añadida");
        } catch (NumberFormatException exc) {
            System.out.println("\n! Error numerico");
        }
    }

    private static void delNave(BufferedReader bf, Map<String, Naves> navesHangar) {
        String matricula = "";
        listNaves(navesHangar);
        System.out.print("\nIntroduce la matricula de la nave: ");
        try {
            matricula = bf.readLine();
            if (navesHangar.containsKey(matricula)) {
                navesHangar.remove(matricula);
                System.out.println("\nNave eliminada");
            } else {
                System.out.println("\n! La matricula no existe");
            }
        } catch (IOException exc) {
            System.out.println("\n! Error en la E/S");
        }
    }

    private static void listNaves(Map<String, Naves> navesHangar) {
        System.out.println("\nListado de naves del hangar:");
        for (String naveKey : navesHangar.keySet()) {
            System.out.println(navesHangar.get(naveKey));
        }
    }

}
