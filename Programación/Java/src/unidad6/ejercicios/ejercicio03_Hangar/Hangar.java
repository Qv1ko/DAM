package unidad6.ejercicios.ejercicio03_Hangar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Hangar {

    public static void main(String[] args) {
        // Variables y objetos
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String opcion = "";
        Map<String, Naves> navesHangar = new HashMap<String, Naves>();
        // Menu de opciones
        do {
            try {
                System.out.println("\nMenu de opciones:\n1.) Añadir nave\n2.) Eliminar nave\n3.) Ver naves\n4.) Salir");
                opcion = bf.readLine();
                switch (opcion) {
                    case "1": addNave(bf, navesHangar);
                    case "2": delNave(bf, navesHangar);
                    case "3": listNaves(navesHangar);
                    case "4": System.out.println("\n! Saliendo...\n");
                    default: System.out.println("\n! Opción no valida\n");
                }
            } catch (IOException exc) {
                System.out.println("\n! Error de entrada o salida\n");
            } catch (NullPointerException exc) {
                System.out.println("\n! Nave no encontrada\n");
            }
        } while (!opcion.equals("4"));
    }

    private static void addNave(BufferedReader bf, Map<String, Naves> navesHangar) {
        System.out.println("\nIntroduce los datos de la nave:");
        System.out.println("Matricula");
    }

    private static void delNave(BufferedReader bf, Map<String, Naves> navesHangar) throws IOException, NullPointerException {
        System.out.print("\nIntroduce la matricula de la nave: ");
        navesHangar.remove(bf.readLine());
    }

    private static void listNaves(Map<String, Naves> navesHangar) {
        for(String naveKey:navesHangar.keySet()) {
            System.out.println(navesHangar.get(naveKey).toString());
        }
    }

}
