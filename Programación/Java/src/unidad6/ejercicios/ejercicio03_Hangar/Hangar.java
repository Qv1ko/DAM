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
        int opcion = 0;
        Map<String, Naves> navesHangar = new HashMap<String, Naves>();
        // Menu de opciones
        do {
            try {
                System.out.println("\nMenu de opciones:\n1.) Añadir nave\n2.) Eliminar nave\n3.) Ver naves\n4.) Salir");
                opcion = Integer.parseInt(bf.readLine());
                switch (opcion) {
                    case 1 -> addNave(bf, navesHangar);
                    case 2 -> delNave(bf, navesHangar);
                    case 3 -> listNaves(navesHangar);
                    case 4 -> System.out.println("\n! Saliendo...\n");
                    default -> System.out.println("\n! Opción no valida\n");
                }
            } catch (IOException exc) {
                System.out.println("\n! Error de entrada o salida\n");
            } catch (NullPointerException exc) {
                System.out.println("\n! Nave no encontrada\n");
            } catch (NumberFormatException exc) {
                System.out.println("\n! Opcion no valida\n");
            }
        } while (opcion!=4);
    }

    private static void addNave(BufferedReader bf, Map<String, Naves> navesHangar) {
        String tipoNave = "", opcion = "", bando = "";
        int pasos = 0;
        Ties tie = null;
        Wings wing = null;
        do {
            try {
                if(pasos<1) {
                    System.out.print("Escribe el nombre del tipo de nave ha añadir: ");
                    tipoNave = bf.readLine();
                    pasos++;
                }
                if(tipoNave.equalsIgnoreCase("tie")) {
                    tie = new Ties();
                    System.out.println("Introduce los datos del TIE:");
                    if(pasos<2) {
                        System.out.print("Matricula: ");
                        tie.setMatricula(bf.readLine());
                        pasos++;
                    }
                    if(pasos<3) {
                        System.out.print("Bando: ");
                        bando = bf.readLine();
                        tie.setImperio((bando.equalsIgnoreCase("IMP") || bando.equalsIgnoreCase("IMPERIO"))? true : false);
                        pasos++;
                    }
                    if(pasos<4) {
                        System.out.print("Cilindradas: ");
                        tie.setCilindrada(Integer.parseInt(bf.readLine()));
                        pasos++;
                    }
                    navesHangar.put(tie.getMatricula(), tie);
                } else if(tipoNave.equalsIgnoreCase("wing")) {
                    wing = new Wings();
                    System.out.println("Introduce los datos del WING:");
                    if(pasos<2) {
                        System.out.print("Matricula: ");
                        wing.setMatricula(bf.readLine());
                        pasos++;
                    }
                    if(pasos<3) {
                        System.out.print("Bando: ");
                        bando = bf.readLine();
                        wing.setImperio((bando.equalsIgnoreCase("IMP") || bando.equalsIgnoreCase("IMPERIO"))? true : false);
                        pasos++;
                    }
                    if(pasos<4) {
                        System.out.print("Número de motores: ");
                        wing.setMotores(Integer.parseInt(bf.readLine()));
                        pasos++;
                    }
                    navesHangar.put(wing.getMatricula(), wing);
                } else {
                    System.out.println("\n! Tipo de nave invalido\n");
                    pasos=0;
                    System.out.print("Quieres salir? (S/N): ");
                    opcion= bf.readLine();
                    if(opcion.equalsIgnoreCase("S") || opcion.equalsIgnoreCase("SI")) {
                        break;
                    }
                }
            } catch (IOException exc) {
                System.out.println("\n! Error de entrada o salida\n");
            }
        } while (pasos<4);
    }

    private static void delNave(BufferedReader bf, Map<String, Naves> navesHangar) throws IOException, NullPointerException {
        System.out.print("Introduce la matricula de la nave: ");
        navesHangar.remove(bf.readLine());
    }

    private static void listNaves(Map<String, Naves> navesHangar) {
        System.out.println("\nListado de naves del hangar:\n");
        for(String naveKey:navesHangar.keySet()) {
            System.out.println(navesHangar.get(naveKey).toString());
        }
    }

}
