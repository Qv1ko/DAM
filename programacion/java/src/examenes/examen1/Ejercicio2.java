package examenes.examen1;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        double gradosKel=0,gradosFah=0;

        for(double i=gradosKel;i<=500;i+=50) {
            gradosFah=((((i-273.15)*9)/5)+32);
            System.out.println(i+" grados Kelvin es igual a "+gradosFah+" grados Fahrenheit");
        }

    } //fin main
    
} //fin class