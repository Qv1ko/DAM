package packExercises;

public class Exercise05_Factorial {

    public static void main(String[] args) {
        
        long numY=17, Resultado=1;

        while(numY>1) {
            Resultado*=numY;
            numY--;
        }
        System.out.println("\nEl resultado es "+Resultado);        

    }//fin main
    
}//fin class
