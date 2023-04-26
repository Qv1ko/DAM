package unidad1.ejercicios.ejercicio08_Calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
        Scanner ent=new Scanner(System.in);
        int option=0;
        double num1=0.0,num2=0.0;
        boolean exit=true;

        do{
            System.out.println("Escriba el numero correspondiente a la operacion que quieres realizar:\n  1) Sumar\n  2) Restar\n  3) Multiplicar\n  4) Dividir\n  5) Salir de la calculadora");
            option=ent.nextInt();

            switch(option) {
                case 1:
                    do {
                        System.out.print("Introduce el primer operando -> ");
                        num1=Double.parseDouble(ent.next().replace(',', '.'));
                        if ((num1>(Double.MAX_VALUE)||num1<(Double.MIN_VALUE))) {
                            System.out.println("Introdujiste un operando muy largo, reducelo para continuar");
                        }
                    } while(num1>(Double.MAX_VALUE)||num1<(Double.MIN_VALUE));
                    do {
                        System.out.print("Introduce el segundo operando -> ");
                        num2=Double.parseDouble(ent.next().replace(',', '.'));
                        if ((num2>(Double.MAX_VALUE)||num2<(Double.MIN_VALUE))) {
                            System.out.println("Introdujiste un operando muy largo, reducelo para continuar");
                        }
                    } while(num2>(Double.MAX_VALUE)||num2<(Double.MIN_VALUE));
                    System.out.println("El resultado de la suma es -> "+(num1+num2)+"\n");
                    break;
                case 2:
                    do {
                        System.out.print("Introduce el primer operando -> ");
                        num1=Double.parseDouble(ent.next().replace(',', '.'));
                        if ((num1>(Double.MAX_VALUE)||num1<(Double.MIN_VALUE))) {
                            System.out.println("Introdujiste un operando muy largo, reducelo para continuar");
                        }
                    } while(num1>(Double.MAX_VALUE)||num1<(Double.MIN_VALUE));
                    do {
                        System.out.print("Introduce el segundo operando -> ");
                        num2=Double.parseDouble(ent.next().replace(',', '.'));
                        if ((num2>(Double.MAX_VALUE)||num2<(Double.MIN_VALUE))) {
                            System.out.println("Introdujiste un operando muy largo, reducelo para continuar");
                        }
                    } while(num2>(Double.MAX_VALUE)||num2<(Double.MIN_VALUE));
                    System.out.println("El resultado de la resta es -> "+(num1-num2)+"\n");
                    break;
                case 3:
                    do {
                        System.out.print("Introduce el primer operando -> ");
                        num1=Double.parseDouble(ent.next().replace(',', '.'));
                        if ((num1>(Double.MAX_VALUE)||num1<(Double.MIN_VALUE))) {
                            System.out.println("Introdujiste un operando muy largo, reducelo para continuar");
                        }
                    } while(num1>(Double.MAX_VALUE)||num1<(Double.MIN_VALUE));
                    do {
                        System.out.print("Introduce el segundo operando -> ");
                        num2=Double.parseDouble(ent.next().replace(',', '.'));
                        if ((num2>(Double.MAX_VALUE)||num2<(Double.MIN_VALUE))) {
                            System.out.println("Introdujiste un operando muy largo, reducelo para continuar");
                        }
                    } while(num2>(Double.MAX_VALUE)||num2<(Double.MIN_VALUE));
                    System.out.println("El resultado de la multiplicacion es -> "+(num1*num2)+"\n");
                    break;
                case 4:
                    do {
                        System.out.print("Introduce el primer operando -> ");
                        num1=Double.parseDouble(ent.next().replace(',', '.'));
                        if ((num1>(Double.MAX_VALUE)||num1<(Double.MIN_VALUE))) {
                            System.out.println("Introdujiste un operando muy largo, reducelo para continuar");
                        }
                    } while(num1>(Double.MAX_VALUE)||num1<(Double.MIN_VALUE));
                    do {
                        System.out.print("Introduce el segundo operando -> ");
                        num2=Double.parseDouble(ent.next().replace(',', '.'));
                        if ((num2>(Double.MAX_VALUE)||num2<(Double.MIN_VALUE))) {
                            System.out.println("Introdujiste un operando muy largo, reducelo para continuar");
                        }
                    } while(num2>(Double.MAX_VALUE)||num2<(Double.MIN_VALUE));
                    System.out.println("El resultado de la division es -> "+(num1/num2)+"\n");
                    System.out.println("El resto de la divison es -> "+(num1%num2));
                    break;
                case 5:
                    System.out.println("\nSaliendo...\n");
                    exit=false;
                    break;
                default:
                    System.out.println("No escribio una opcion valida\n");
            }
        } while(exit);

        ent.close();

    } //fin main
    
} //fin class