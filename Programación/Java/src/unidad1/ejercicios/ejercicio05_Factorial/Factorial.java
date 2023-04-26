package unidad1.ejercicios.ejercicio05_Factorial;

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
