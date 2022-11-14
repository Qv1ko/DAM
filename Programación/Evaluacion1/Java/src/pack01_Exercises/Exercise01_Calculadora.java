package pack01_Exercises;

import java.util.Scanner;

public class Exercise01_Calculadora {

    public static void main(String[] args) {
        
        Scanner ent=new Scanner(System.in);
        int option=0;
        float num1=0.0f,num2=0.0f;

        System.out.println("¿Que tipo de operacion quieres realizar?\n1) Sumar\n2) Restar\n3) Multiplicar\n4) Dividir\n5) Salir de la calculadora");
        option=ent.nextInt();

        switch(option) {
            case 1:
                System.out.println("Introduce el primer operando -> ");
                num1=ent.nextInt();

        }

    }
    
}
