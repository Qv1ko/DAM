package packExercises;

public class Exercise03_Repaso1Weekend {

    public static void main(String[] args) {
        
        int planta1=200,planta2=150,planta3=100;
        int pesoVehiculo=200;

        if(pesoVehiculo<500&&planta1>=planta2) {

            System.out.println("Debe aparcar en la primera planta");
            planta1--;

        }
        else if(pesoVehiculo<500&&planta1<planta2) {

            System.out.println("Debe aparcar en la segunda planta");
            planta2--;

        }
        else if(planta3>0) {

            System.out.println("Debe aparcar en la tercera planta");
            planta3--;

        }
        else {

            System.out.println("No hay plazas para aparcar");

        }

    }//fin main

}//fin class