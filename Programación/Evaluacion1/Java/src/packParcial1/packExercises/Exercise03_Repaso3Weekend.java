package packParcial1.packExercises;

public class Exercise03_Repaso3Weekend {
    
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