package unidad4.ejercicios.ejercicio3_hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class SolucionHotel {

    public static void main(String[] args) {
        ArrayList<SolucionHabitaciones> lista=new ArrayList<SolucionHabitaciones>();
        Scanner ent=new Scanner(System.in);
        int opcion=0,habElegida=0;
        lista.add(new SolucionHabitaciones(101,"matrimonio",true,40,true));
        lista.add(new SolucionHabitaciones(102,"matrimonio",false,30,true));
        lista.add(new SolucionHabitaciones(103,"matrimonio",false,30,true));
        lista.add(new SolucionHabitaciones(104,"individuales",true,25,true));
        lista.add(new SolucionHabitaciones(105,"individuales",false,20,true));
        lista.add(new SolucionHabitaciones(106,"individuales",false,20,true));
        do {
            System.out.println("Menú del Hotel\n1) Ver habitaciones\n2) Reservar habitación\n3) Devolver habitación\n4) Salir");
            opcion=ent.nextInt();
            switch(opcion) {
                case 1:
                    for(SolucionHabitaciones hab:lista) {
                        System.out.println(hab);
                    }  
                    break;
                case 2:
                    for(SolucionHabitaciones hab:lista) {
                        if(hab.isLibre()) {
                            System.out.println(hab);
                        }
                    }
                    System.out.println("La habitación que quiere:");
                    habElegida=ent.nextInt();
                    if(lista.get(habElegida-101).isLibre()) {
                        System.out.println(lista.get(habElegida-101).reservar());
                    } else {
                        System.out.println("Habitación no disponible");
                    }
                    break;
                case 3:
                    for(SolucionHabitaciones hab:lista) {
                        if(!hab.isLibre()) {
                            System.out.println(hab);
                        }
                    }
                    System.out.println("Que habitacion va a devolver: ");
                        habElegida=ent.nextInt();
                        if(!lista.get(habElegida-101).isLibre()) {
                            System.out.println("Se debe por la habitacion "+lista.get(habElegida-101).liberar());
                        } else {
                            System.out.println("La habitación no se puede devolver");
                        }
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        } while(opcion!=4);
        ent.close();
    }
    
}
