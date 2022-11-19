package pack01_Exercises;

import java.util.Scanner;

public class Exercise04_EjerciciosRepaso4 {
    
    public static void main(String[] args) {
        
        Scanner ent=new Scanner(System.in);
        String dato="";

        while(true) {
            System.out.print("Introduce un dato: ");
            dato=ent.next().replace(',', '.');
            if(digit(dato)) {
                break;
            }
            cal(dato);
        }

        ent.close();

    } //fin main

    public static boolean digit(String inp) {
        for (int i=0;i<inp.length();i++) {
            if(Character.isDigit(inp.charAt(i))) {
                return false;
            } else {
                return true;
            }
        }
    }

    public static void cal(String numero) {

        double num=Double.parseDouble(numero);
        System.out.println("El numero "+num+" es "+((num%2==0)? "par":"impar"));

    } //fin cal

} //fin class