package unidad1.ejercicios.ejercicio04_Cifras;

public class Cifras {

    public static void main(String[] args) {

        // int num=374284;

        // if(num<=9) {
        //     System.out.println("El numero tiene 1 cifra");            
        // } else if(num<=99) {
        //     System.out.println("El numero tiene 2 cifras");
        // } else if(num<=999) {
        //     System.out.println("El numero tiene 3 cifras");
        // } else if(num<=9999) {
        //     System.out.println("El numero tiene 4 cifras");
        // } else if(num<=99999) {
        //     System.out.println("El numero tiene 5 cifras");
        // } else if(num<=999999) {
        //     System.out.println("El numero tiene 6 cifras");
        // } else if(num<=9999999) {
        //     System.out.println("El numero tiene 7 cifras");
        // } else if(num<=99999999) {
        //     System.out.println("El numero tiene 8 cifras");
        // } else if(num<=999999999) {
        //     System.out.println("El numero tiene 9 cifras");
        // }

        int num=(int)(Math.random()*999999);
        int cifra=0;

        System.out.println("Numero generado -> "+num);

        do {

            num/=10;
            cifra++;

        } while(num>0);

        if(cifra==1) {
            System.out.println("El numero tiene "+cifra+" cifra");
        } else {
            System.out.println("El numero tiene "+cifra+" cifras");
        }

    }//fin main

}//fin class