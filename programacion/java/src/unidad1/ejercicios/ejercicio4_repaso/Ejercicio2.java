package unidad1.ejercicios.ejercicio4_repaso;

public class Ejercicio2 {
    
    public static void main(String[] args) {

        char letra='a';

        while(letra<='z') {

            System.out.print(letra);
            
            if(letra=='n') {
                System.out.print('ñ');
            }

            letra++;

        }
        // System.out.print("\n");

        // int ascii=97;

        // while(ascii<=122) {
        //     System.out.print((char)ascii);

        //     if(ascii==110) {
        //         System.out.print((char)241);
        //     }

        //     ascii++;
        // }

    }//fin main

}//fin class
