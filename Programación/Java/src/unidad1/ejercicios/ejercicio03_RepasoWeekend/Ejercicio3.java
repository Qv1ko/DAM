package unidad1.ejercicios.ejercicio03_RepasoWeekend;

public class Ejercicio3 {
    
    public static void main(String[] args) {

        char letra='A';

        do {

            System.out.print(letra);

            if(letra=='N') {
                System.out.print('Ñ');
            }

            letra++;

        }
        while(letra<='Z');

    }//fin main

}//fin class