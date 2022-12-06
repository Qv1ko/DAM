package paqueteEjercicios1;

public class Ejercicio03_Repaso1Weekend {

    public static void main(String[] args) {
        
        int planta1=200,planta2=150,planta3=100; //plazas disponibles en cada planta
        int pesoVehiculo=300; //peso del vehiculo

        // pesoVehiculo=(int)Math.random(); //peso del vehiculo aleatorio
        // pesoVehiculo=(int)(Math.random()*1000); //peso del vehiculo por mil
        // pesoVehiculo=(int)(Math.random()*700)+300; //peso del vehiculo minimo 300

        if(pesoVehiculo<500&&planta1>0) {
            System.out.println("Su vehiculo de "+pesoVehiculo+"Kg debe aparcar en la primera planta");
        } else if(pesoVehiculo<500&&planta2>0) {
            System.out.println("Su vehiculo de "+pesoVehiculo+"Kg debe aparcar en la segunda planta");
        } else if(pesoVehiculo>=500&&planta3>0) {
            System.out.println("Su vehiculo de "+pesoVehiculo+"Kg debe aparcar en la tercera planta");
        } else {
            System.out.println("No hay plazas para aparcar");
        }

    }//fin main

}//fin class