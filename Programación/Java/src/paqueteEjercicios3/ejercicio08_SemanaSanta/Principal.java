package paqueteEjercicios3.ejercicio08_SemanaSanta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * @author Victor
 * @version 0.2
 */

public class Principal {

    public static void main(String[] args) {
        int opcion=-1;
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader buffer=new BufferedReader(in);
    
        //  Menú para la gestión de los vehículos de la empresa:
            // o Añadir un nuevo vehículo a la empresa de alquiler.
            // o Listar todos los vehículos. Se debe mostrar si esta alquilado o no junto con todos los datos.
            // o Buscar un vehículo (el campo a buscar será la matricula).
            // o Actualizar un vehículo (se podrá reutilizar la búsqueda del apartado anterior).
            // o Eliminar un vehículo.
        //  Realizar una reserva.
        //  Devolver un vehículo. Se debe controlar que la devolución se pueda realizar, la fecha y hora de devolución será la automática del sistema y se calculara el importe a pagar.

        while(opcion!=0) {
            System.out.print("Alquiler de vehículos:\n\s1) Gestión de vehículos\n\s2) Reservar un vehículo\n\s3) Devolver un vehículo\n\s0) Salir\n\nSeleccione una opción: ");
            try {
                opcion=Integer.parseInt(buffer.readLine());
                switch(opcion) {
                    case 0 -> System.out.println("\n- Saliendo...\n");
                    case 1 -> menuVehiculos(buffer);
                    case 2 -> reserva();
                    case 3 -> devolucion();
                    default -> System.out.println("\n+ Seleccione una opción valida\n");
                }
            } catch(IOException exc) {
                System.out.println("\n! Error al introducir la opción\n");
            } catch(NumberFormatException  exc) {
                System.out.println("\n! Opción no valida\n");
            }
        }
    }//main

    private static void menuVehiculos(BufferedReader buffer) {
        int opcion=0;
        ArrayList<Vehiculos> vehiculos=new ArrayList<Vehiculos>();
        while(opcion!=0) {
            System.out.print("Gestión de vehículos:\n\s1) Añadir un nuevo vehículo\n\s2) Listar todos los vehículos\n\s3) Buscar un vehículo\n\s4) Actualizar un vehículo\n\s5) Eliminar un vehículo\n\s0) Salir\n\nSeleccione una opción: ");
            try {
                opcion=Integer.parseInt(buffer.readLine());
                switch(opcion) {
                    case 0 -> System.out.println("\n- Saliendo...\n");
                    // case 1 -> 
                    case 2 -> listarVehiculos(vehiculos);
                    // case 3 -> 
                    // case 4 ->
                    // case 5 ->
                    default -> System.out.println("\n+ Seleccione una opción valida\n");
                }
            } catch(IOException exc) {
                System.out.println("\n! Error al introducir la opción\n");
            } catch(NumberFormatException  exc) {
                System.out.println("\n! Opción no valida\n");
            }
        }
    }

    private static void listarVehiculos(ArrayList<Vehiculos> vehiculos) {
        System.out.println("Lista de vehiculos de la empresa:");
        for(Vehiculos vehiculo:vehiculos) {
            System.out.println("| "+vehiculo);
        }
    }

    private static void reserva() {

    }

    private static void devolucion() {

    }

}//class
