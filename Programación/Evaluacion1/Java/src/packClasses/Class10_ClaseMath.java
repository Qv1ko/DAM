package packClasses;

public class Class10_ClaseMath {
    
    public static void main(String[] args) {
        

        System.out.println(Math.pow(2, 3)); //Potencia de 2^3
        System.out.println(Math.random()); //numero aleatorio entre 0.0 y 1.0
        
        System.out.print("\n");


        //ejercicio 0 - Contador de numero X de 100 aleatorios
        int numX=23,count=0;

        for(int i=0;i<=99;i++) {

            int num=(int)(Math.random()*101);
            System.out.print(num+"|");

            if(num==numX){
                count++;
            }

        }

        System.out.println("\nEl numero "+numX+" aparece "+count);


        //ejercicio 1 - Factorial de Y
        long numY=17, Resultado=1;

        while(numY>1) {
            Resultado*=numY;
            numY--;
        }
        System.out.println("\nEl resultado es "+Resultado);


        //ejercicio 2 - Base y explonente
        int base=3,exp=4;

        // for(Tot)
        while(exp>0) {
            base*=base;
            exp--;
        }
        System.out.println();

    }//fin main

}//fin class
