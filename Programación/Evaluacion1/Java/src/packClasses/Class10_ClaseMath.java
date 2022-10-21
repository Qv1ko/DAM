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

    }//fin main

}//fin class
