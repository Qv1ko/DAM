package packExercises;

public class Exercise00_EjerciciosInicialesJava5 {

    public static void main(String[] args) {
        
        //declaracion y inicializacion de variables
        int num1=63, num2=24;

        int auxSum;//variable auxiliar de suma
        int auxRes;//variable auxiliar de resta
        int auxMul;//variable auxiliar de multiplicacion
        int auxDiv;//variable auxiliar de division
        
        //operaciones en variables auxiliares
        auxSum = num1+num2;
        auxRes = num1-num2;
        auxMul = num1*num2;
        auxDiv = num1/num2;

        //resultado por pantalla
        System.out.println("El valor de la variable auxiliar de suma es " + auxSum + "\nEl valor de la variable auxiliar de resta es " + auxRes + "\nEl valor de la variable auxiliar de multiplicacion es " + auxMul + "\nEl valor de la variable auxiliar de division es " + auxDiv);

    }//fin main

}//fin class
