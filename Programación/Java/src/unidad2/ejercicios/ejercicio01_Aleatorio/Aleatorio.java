package unidad2.ejercicios.ejercicio01_Aleatorio;

import java.util.Scanner;

public class Aleatorio {

    public static void main(String[] args) {
        
        Scanner ent=new Scanner(System.in);
        int num1=0,num2=0;

        System.out.print("Escribe el primer numero: ");
        num1=ent.nextInt();
        System.out.print("Escribe el segundo numero: ");
        num2=ent.nextInt();

        System.out.println(aleatorio(num1, num2));

        ent.close();

    } //fin main
    
    public static int aleatorio(int numero1,int numero2) {

        int mayor=Math.max(numero1,numero2);
        int menor=Math.min(numero1,numero2);

        int random=(int)(Math.random()*(mayor-menor+1)+menor);

        return random;

    }

} //fin class