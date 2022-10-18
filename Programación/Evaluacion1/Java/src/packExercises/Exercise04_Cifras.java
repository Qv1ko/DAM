package packExercises;

public class Exercise04_Cifras {

    public static void main(String[] args) {

        int num=39567;

        if(num>=0) {
            if(num/10>0) {
                System.out.println("El numero tiene 1 cifra");
            }
            if(num/100>0) {
                System.out.println("El numero tiene 2 cifra");
            }
            if(num/1000>0) {
                System.out.println("El numero tiene 3 cifra");
            }
            if(num/10000>0) {
                System.out.println("El numero tiene 4 cifra");
            }
            if(num/100000>0) {
                System.out.println("El numero tiene 5 cifra");
            }
            if(num/1000000>0) {
                System.out.println("El numero tiene 6 cifra");
            }
            if(num/10000000>0) {
                System.out.println("El numero tiene 7 cifra");
            }
            if(num/100000000>0) {
                System.out.println("El numero tiene 8 cifra");
            }
            if(num/1000000000>0) {
                System.out.println("El numero tiene 9 cifra");
            }

        }
        

    }//fin main

}//fin class