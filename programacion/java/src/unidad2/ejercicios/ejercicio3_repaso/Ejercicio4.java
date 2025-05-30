package unidad2.ejercicios.ejercicio3_repaso;

import java.util.Scanner;

public class Ejercicio4 {
    
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

    public static boolean digit(String dat) {

        boolean bool=false;

        for(int i=0;i<dat.length();i++) {
            if(Character.isDigit(dat.charAt(i))||dat.charAt(i)=='.') {
                bool=false;
            } else {
                bool=true;
                break;
            }
        }

        return bool;

    } //fin digit

    public static void cal(String numero) {

        double num=Double.parseDouble(numero);
        System.out.println("El numero "+num+" es "+((num%2==0)? "par":"impar"));

    } //fin cal

} //fin class