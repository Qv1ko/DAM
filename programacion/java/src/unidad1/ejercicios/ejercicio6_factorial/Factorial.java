package unidad1.ejercicios.ejercicio6_factorial;

public class Factorial {

    public static void main(String[] args) {
        
        long numY=7, Resultado=1;

        while(numY>1) {
            Resultado*=numY;
            numY--;
        }
        System.out.println("El resultado es "+Resultado);        

    }//fin main
    
}//fin class
