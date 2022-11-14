package pack01_Exercises;

import java.util.Scanner;

public class Exercise01_Calculadora {

    public static void main(String[] args) {
        
        Scanner ent=new Scanner(System.in);
        int option=0, num1=0,num2=0,total=0;

        System.out.println("Escriba el numero correspondiente a la operacion que quieres realizar:\n  1) Sumar\n  2) Restar\n  3) Multiplicar\n  4) Dividir\n  5) Salir de la calculadora");
        option=ent.nextInt();

        switch(option) {
            case 1:
                System.out.print("Introduce el primer operando -> ");
                num1=ent.nextInt();
                System.out.print("Introduce el segundo operando -> ");
                num2=ent.nextInt();
                total=num1+num2;
                System.out.println("El resultado de la suma es -> "+total);
                break;
            case 2:
                System.out.print("Introduce el primer operando -> ");
                num1=ent.nextInt();
                System.out.print("Introduce el segundo operando -> ");
                num2=ent.nextInt();
                total=num1-num2;
                System.out.println("El resultado de la resta es -> "+total);
                break;
            case 3:
                System.out.print("Introduce el primer operando -> ");
                num1=ent.nextInt();
                System.out.print("Introduce el segundo operando -> ");
                num2=ent.nextInt();
                total=num1*num2;
                System.out.println("El resultado de la multiplicacion es -> "+total);
                break;
            case 4:
                System.out.print("Introduce el primer operando -> ");
                num1=ent.nextInt();
                System.out.print("Introduce el segundo operando -> ");
                num2=ent.nextInt();
                total=num1/num2;
                System.out.println("El resultado de la division es -> "+total);
                break;
            case 5:
                System.out.println("\nSaliendo...\n");
                break;
            default:
                System.out.println("No escribio una opcion valida");
        }

        ent.close();

    } //fin main
    
} //fin class