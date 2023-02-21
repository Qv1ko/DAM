package paqueteEjercicios2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio09_Hotel {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean continuar=true;
        ArrayList<Ejercicio09_Habitaciones> habitaciones=new ArrayList<Ejercicio09_Habitaciones>();
        habitaciones.add(Ejercicio09_Habitaciones.HABIT);
        habitaciones.add(Ejercicio09_Habitaciones.HABI1);
        habitaciones.add(Ejercicio09_Habitaciones.HABI2);
        habitaciones.add(Ejercicio09_Habitaciones.HABMT);
        habitaciones.add(Ejercicio09_Habitaciones.HABM1);
        habitaciones.add(Ejercicio09_Habitaciones.HABM2);
        do {
            System.out.print("1) Listado de habitaciones | 2) Reservar una habitación | 3) Devolver una habitación | 4) Salir\nSelecciona una opcion: ");
            switch(sc.nextInt()) {
                case 1 -> listado(habitaciones);
                case 2 -> reserva(habitaciones,sc);
                case 3 -> devolucion(habitaciones,sc);
                case 4 -> continuar=false;
                default -> System.out.println("\nError - Seleccione el valor de la opcion correctamente\n");
            }
        } while(continuar);
        System.out.println("\nSaliendo...\n");
        sc.close();
    }//main

    private static void listado(ArrayList<Ejercicio09_Habitaciones> habitaciones) {
        for(Ejercicio09_Habitaciones habitacion:habitaciones) {
            System.out.println(habitacion+habitacion.getDisposicion());
        }
    }//listado

    private static void reserva(ArrayList<Ejercicio09_Habitaciones> habitaciones,Scanner sc) {
        int id=0;
        boolean errorId=true;
        System.out.println("\nHabitaciones disponibles:");
        for(Ejercicio09_Habitaciones habitacion:habitaciones) {
            if(!habitacion.isAlquilar()) {
                System.out.println(habitacion);
            }
        }
        System.out.print("Escriba el numero de la habitacion ha reservar: ");
        id=sc.nextInt();
        for(Ejercicio09_Habitaciones habitacion:habitaciones) {
            if(habitacion.getId()==id&&!habitacion.isAlquilar()) {
                System.out.println("\nHabitacion "+habitacion.getId()+" alquilada correctamente\n");
                habitacion.setAlquilado(true);
                errorId=false;
                break;
            }
        }
        if(errorId) {
            System.out.println("\nLa habitacion "+id+" no se encuenta disponible - Reserva rechazada\n");
        }
    }//reserva

    private static void devolucion(ArrayList<Ejercicio09_Habitaciones> habitaciones,Scanner sc) {
        int id=0,ocupacion=(int)(Math.random()*5)+1;
        boolean errorId=true;
        System.out.println("\nHabitaciones reservadas:");
        for(Ejercicio09_Habitaciones habitacion:habitaciones) {
            if(habitacion.isAlquilar()) {
                System.out.println(habitacion);
            }
        }
        System.out.print("Escriba el numero de la habitacion a devolver: ");
        id=sc.nextInt();
        for(Ejercicio09_Habitaciones habitacion:habitaciones) {
            if(habitacion.getId()==id&&habitacion.isAlquilar()) {
                System.out.println("\nDevolucion de la habitacion "+habitacion.getId()+" a "+habitacion.getPrecio()+" euros/dia:\n\sEl total a pagar por la estancia de "+ocupacion+" dias sera de "+ocupacion*habitacion.getPrecio()+" euros\n");
                habitacion.setAlquilado(false);
                errorId=false;
                break;
            }
        }
        if(errorId) {
            System.out.println("\nLa habitacion "+id+" no se encuenta en reserva - Devolucion rechazada\n");
        }
    }//devolucion

}//class