package unidad2.ejercicios.ejercicio3_repaso;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner ent=new Scanner(System.in);
        String cadena="";

        System.out.print("Escriba una cadena de texto: ");
        cadena=ent.nextLine().toLowerCase();

        contador(cadena);

        ent.close();

    } //fin main

    public static void contador(String cadena) {

        int countA=0,countE=0,countI=0,countO=0,countU=0;

        for(int i=0;i<cadena.length();i++) {
            if(cadena.charAt(i)=='a') {
                countA++;
            } else if(cadena.charAt(i)=='e') {
                countE++;
            } else if(cadena.charAt(i)=='i') {
                countI++;
            } else if(cadena.charAt(i)=='o') {
                countO++;
            } else if(cadena.charAt(i)=='u') {
                countU++;
            }
            // switch(cadena.charAt(i)) {
            //     case 'a':
            //         countA++;
            //         break;
            //     case 'e':
            //         countE++;
            //         break;
            //     case 'i':
            //         countI++;
            //         break;
            //     case 'o':
            //         countO++;
            //         break;
            //     case 'u':
            //         countU++;
            //         break;
            //     default:
            // }
        } //fin for

        System.out.println("\nNumero de a -> "+countA+"\nNumero de e -> "+countE+"\nNumero de i -> "+countI+"\nNumero de o -> "+countO+"\nNumero de u -> "+countU+"\n\nEn total hay "+(countA+countE+countI+countO+countU)+" vocales");

    } //fin contador

} //fin class