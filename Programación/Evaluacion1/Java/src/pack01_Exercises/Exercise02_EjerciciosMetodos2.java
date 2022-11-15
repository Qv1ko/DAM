package pack01_Exercises;

import java.util.Scanner;

public class Exercise02_EjerciciosMetodos2 {

    public static void main(String[] args) {
        
        Scanner ent=new Scanner(System.in);
        int num1=0,num2=0;

        System.out.print("Escribe un numero: ");
        num1=ent.nextInt();
        System.out.print("Escribe otro numero: ");
        num2=ent.nextInt();

        System.out.println("El numero menor es "+menor(num1, num2));

        ent.close();

    } //fin main
    
    public static int menor(int a,int b) {

        int numMenor=0;

        if(a<b) {
            numMenor=a;
        } else {
            numMenor=b;
        }

        return numMenor;

    } //fin menor

} //fin class