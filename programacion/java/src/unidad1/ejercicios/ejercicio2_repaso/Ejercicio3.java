package unidad1.ejercicios.ejercicio2_repaso;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        /*formulas de calculo de areas:
         *cuadrado -> lado*lado
         *rectangulo -> base*lado
         *triangulo -> (base*alto)/2
         */

        //declaracion y inicializacion
        double lado=6.3;
        double base=9.1;
        double alto=3.7;

        //resultado por pantalla
        System.out.println("Area de un cuadrado -> "+(lado*lado)+"\nArea de un rectangulo -> "+(base*alto)+"\nArea de un triangulo -> "+((base*alto)/2));

    }//fin main

}//fin class