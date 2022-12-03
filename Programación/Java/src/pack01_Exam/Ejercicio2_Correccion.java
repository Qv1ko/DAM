package pack01_Exam;

import java.util.Scanner;

public class Ejercicio2_Correccion {

    public static void main(String[] args) {
      
        //tipo A
        // Scanner ent=new Scanner(System.in);
        // int numero=0;
        // String respuesta="";

        // do {
        //     System.out.print("Introduce un numero: ");
        //     numero=ent.nextInt();
        //     if(numero>=1&&numero<=5) {
        //         System.out.println("La vocal "+vocal(numero)+" es la "+numero);
        //     } else {
        //         System.out.println("Valor incorrecto (1 al 5)");
        //     }
        //     System.out.print("Desea continuar? (Si/No): ");
        //     respuesta=ent.next();
        // } while(respuesta.equalsIgnoreCase("si"));

        // ent.close();

        //tipo B
        Scanner sc=new Scanner(System.in);
        int num=0;
        String rsp="";

        do {
            System.out.print("Introduce un numero: ");
            num=sc.nextInt();

            System.out.println("El numero -> "+num+" es igual "+ascii(num));
            
            System.out.print("Desea continuar? (Si/No): ");
            rsp=sc.next();
        } while(rsp.equalsIgnoreCase("si"));

        sc.close();

    } //fin main

    //metodo vocal - tipo A
    public static char vocal(int num) {

        char letra=' ';

        switch(num) {
            case 1:
                letra='a';
                break;
            case 2:
                letra='e';
                break;
            case 3:
                letra='i';
                break;
            case 4:
                letra='o';
                break;
            case 5:
                letra='u';
                break;
            default:
        }

        return letra;

    } //fin vocal - tipo A

    //metodo ascii - tipo B
    public static char ascii(int num){

        return (char)num;

    } //fin ascii - tipo B
    
} //fin class