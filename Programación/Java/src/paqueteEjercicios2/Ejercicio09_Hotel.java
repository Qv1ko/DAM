package paqueteEjercicios2;

import java.util.ArrayList;

public class Ejercicio09_Hotel {
    
    public static void main(String[] args) {
        ArrayList<Ejercicio09_Habitaciones> habitaciones=new ArrayList<Ejercicio09_Habitaciones>();
        habitaciones.add(Ejercicio09_Habitaciones.HABIT);
        habitaciones.add(Ejercicio09_Habitaciones.HABI1);
        habitaciones.add(Ejercicio09_Habitaciones.HABI2);
        habitaciones.add(Ejercicio09_Habitaciones.HABMT);
        habitaciones.add(Ejercicio09_Habitaciones.HABM1);
        habitaciones.add(Ejercicio09_Habitaciones.HABM2);
        for(Ejercicio09_Habitaciones habitacion:habitaciones) {
            System.out.println(habitacion+habitacion.getDisposicion());
        }
    }//main

}//class
