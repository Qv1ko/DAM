package pack01_Exercises;

import java.util.Scanner;

public class Exercise02_EjerciciosMetodos1 {

    public static void main(String[] args) {
        
        Scanner ent=new Scanner(System.in);
        int num1=0,num2=0;

        System.out.print("Escribe un numero: ");
        num1=ent.nextInt();
        System.out.print("Escribe otro numero: ");
        num2=ent.nextInt();

        if(mayor(num1,num2)) {
            System.out.println("El primer numero es mayor");
        } else {
            System.out.println("El segundo numero es mayor");
        }

        ent.close();

    } //fin main
    
    public static boolean mayor(int a, int b) {

        boolean aMayor;

        if(a>b) {
            aMayor=true;
        } else {
            aMayor=false;
        }

        return aMayor;

    } //fin mayor

} //fin class