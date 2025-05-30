package examenes.examen2;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner ent=new Scanner(System.in);
        String frase="";

        System.out.print("Escribe una frase: ");
        frase=ent.nextLine();

        for(int i=frase.length()-1;i>=0;i--) {
            System.out.print(frase.charAt(i));
        }
        
        ent.close();

    } //fin main

} //fin class