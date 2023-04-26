package unidad4.ejercicios.ejercicio02_Hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean continuar=true;
        ArrayList<Habitaciones> habitaciones=new ArrayList<Habitaciones>();
        habitaciones.add(Habitaciones.HABIT);
        habitaciones.add(Habitaciones.HABI1);
        habitaciones.add(Habitaciones.HABI2);
        habitaciones.add(Habitaciones.HABMT);
        habitaciones.add(Habitaciones.HABM1);
        habitaciones.add(Habitaciones.HABM2);
        //Bucle del menu
        do {
            System.out.print("1) Listado de habitaciones | 2) Reservar una habitación | 3) Devolver una habitación | 4) Salir\nSelecciona una opción: ");
            switch(sc.nextLine()) {
                case "1" -> listado(habitaciones);
                case "2" -> reserva(habitaciones,sc);
                case "3" -> devolucion(habitaciones,sc);
                case "4" -> continuar=false;
                default -> System.out.println("\nError - Seleccione el valor de la opción correctamente\n");
            }
        } while(continuar);
        System.out.println("\nSaliendo...\n");
        sc.close();
    }//main

    //Metodo para imprimir por pantalla todas las habitaciones del hotel y su disponibilidad
    private static void listado(ArrayList<Habitaciones> habitaciones) {
        System.out.println();
        for(Habitaciones habitacion:habitaciones) {
            System.out.println(habitacion+habitacion.getDisponibilidad());
        }
    }//listado

    //Metodo para reservar las habitaciones del hotel
    private static void reserva(ArrayList<Habitaciones> habitaciones,Scanner sc) {
        int id=0;
        boolean errorId=true;
        //Bucle de impresion de las habitaciones disponibles
        System.out.println("\nHabitaciones disponibles:");
        for(Habitaciones habitacion:habitaciones) {
            if(!habitacion.isAlquilar()) {
                System.out.println(habitacion);
            }
        }
        System.out.print("Escriba el número de la habitación a reservar: ");
        id=sc.nextInt();sc.nextLine();
        //Bucle para reservar habitaciones
        for(Habitaciones habitacion:habitaciones) {
            //Condicion para obtener la habitacion seleccionada y reservarla
            if(habitacion.getId()==id&&!habitacion.isAlquilar()) {
                System.out.println("\nHabitación "+habitacion.getId()+" alquilada correctamente\n");
                habitacion.setAlquilado(true);
                errorId=false;
                break;
            }
        }
        //Condicion de error
        if(errorId) {
            System.out.println("\nLa habitación "+id+" no se encuentra disponible - Reserva rechazada\n");
        }
    }//reserva

    //Metodo para devolver las habitaciones del hotel
    private static void devolucion(ArrayList<Habitaciones> habitaciones,Scanner sc) {
        int id=0,ocupacion=(int)(Math.random()*5)+1;
        boolean errorId=true;
        //Bucle de impresion de habitaciones reservadas
        System.out.println("\nHabitaciones reservadas:");
        for(Habitaciones habitacion:habitaciones) {
            if(habitacion.isAlquilar()) {
                System.out.println(habitacion);
            }
        }
        System.out.print("Escriba el número de la habitación a devolver: ");
        id=sc.nextInt();sc.nextLine();
        //Bucle para devolver habitaciones
        for(Habitaciones habitacion:habitaciones) {
            //Condicion para devolver la habitacion seleccionada e imprimir el coste total
            if(habitacion.getId()==id&&habitacion.isAlquilar()) {
                System.out.println("\nDevolución de la habitación "+habitacion.getId()+" a "+habitacion.getPrecio()+" euros/día:\n\sEl total a pagar por la estancia de "+ocupacion+" días será de "+ocupacion*habitacion.getPrecio()+" euros\n");
                habitacion.setAlquilado(false);
                errorId=false;
                break;
            }
        }
        //Condicion de error
        if(errorId) {
            System.out.println("\nLa habitación "+id+" no se encuentra en reserva - Devolución rechazada\n");
        }
    }//devolucion

}//class