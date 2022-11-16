package pack01_Exercises;

import java.util.Scanner;

public class Exercise04_Vocales {

    public static void main(String[] args) {
        
        Scanner ent=new Scanner(System.in);
        String cadena="";

        System.out.print("Escriba una cadena de texto: ");
        cadena=ent.nextLine();

        contador(cadena);

        ent.close();

    } //fin main

    public static void contador(String cadena) {

        int countA=0,countE=0,countI=0,countO=0,countU=0,countVocales=0;

        for(int i=0;i<cadena.length();i++) {
            if(cadena.charAt(i)=='a'||cadena.charAt(i)=='A') {
                countA++;
                countVocales++;
            } else if(cadena.charAt(i)=='e'||cadena.charAt(i)=='E') {
                countE++;
                countVocales++;
            } else if(cadena.charAt(i)=='i'||cadena.charAt(i)=='I') {
                countI++;
                countVocales++;
            } else if(cadena.charAt(i)=='o'||cadena.charAt(i)=='O') {
                countO++;
                countVocales++;
            } else if(cadena.charAt(i)=='u'||cadena.charAt(i)=='U') {
                countU++;
                countVocales++;
            }
        }

        System.out.println("\nNumero de a -> "+countA+"\nNumero de e -> "+countE+"\nNumero de i -> "+countI+"\nNumero de o -> "+countO+"\nNumero de u -> "+countU+"\n\nEn total hay "+countVocales+" vocales");

    } //fin contador

} //fin class