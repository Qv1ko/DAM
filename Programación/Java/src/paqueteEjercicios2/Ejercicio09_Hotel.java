package paqueteEjercicios2;

import java.util.ArrayList;

public class Ejercicio09_Hotel {
    
    public static void main(String[] args) {
        ArrayList<Ejercicio09_Habitaciones> habitaciones=new ArrayList<Ejercicio09_Habitaciones>();
        habitaciones.add(new Ejercicio09_Habitaciones("Individual",true));
        habitaciones.add(new Ejercicio09_Habitaciones("Individual",false));
        habitaciones.add(new Ejercicio09_Habitaciones("Individual",false));
        habitaciones.add(new Ejercicio09_Habitaciones("Matrimonio",true));
        habitaciones.add(new Ejercicio09_Habitaciones("Matrimonio",false));
        habitaciones.add(new Ejercicio09_Habitaciones("Matrimonio",false));
        for(Ejercicio09_Habitaciones habitacion:habitaciones) {
            System.out.println(habitacion);
        }
    }//main

}//class
