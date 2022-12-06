package paqueteEjercicios1;

public class Ejercicio00_EjerciciosInicialesJava4 {
    
    public static void main(String[] args) {
        
        //declaracion y inizializacion de variables
        int A=8, B=4, C=9, D=7;
        int box;//variable auxiliar

        //instrucciones
        box = B;//guardo el valor de B
        B = C;//B toma el valor de C
        C = A;//C toma el valor de A
        A = D;//A toma el valor de D
        D = box;//D toma el valor de box (B)

        //resultado por pantalla
        System.out.println("El valor de A es " + A + "\nEl valor de B es " + B + "\nEl valor de C es " + C + "\nEl valor de D es " + D);

    }//fin main
    
}//fin class
