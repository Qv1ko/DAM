package pack01_Exam;

import java.util.Scanner;

public class Recuperacion1_Correccion {

    public static void main(String[] args) {
        
        Scanner ent=new Scanner(System.in);
        int num1=0,num2=0,num3=0;

        System.out.print("Introduce el primer numero: ");
        num1=ent.nextInt();
        System.out.print("Introduce el segundo numero: ");
        num2=ent.nextInt();
        System.out.print("Introduce el tercer numero: ");
        num3=ent.nextInt();

        System.out.println("El mayor es -> "+elMayor(num1, num2, num3));

        ent.close();

    } //fin main

    public static int elMayor(int n1,int n2,int n3) {

        int mayor=0;
        if(n1>n2&&n1>n3) {
            mayor=n1;
        } else if(n2>n3) {
            mayor=n2;
        } else{
            mayor=n3;
        }
        return mayor;

    } //fin elMayor

} //fin class