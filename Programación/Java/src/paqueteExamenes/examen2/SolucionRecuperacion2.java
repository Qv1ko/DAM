package paqueteExamenes.examen2;

import java.util.Scanner;

public class SolucionRecuperacion2 {

    public static void main(String[] args) {
        
        Scanner ent=new Scanner(System.in);
        String frase="", fraseLarga="";

        do{
            System.out.print("Introduce una frase: ");
            frase=ent.nextLine();

            if(frase.length()>fraseLarga.length()) {
                fraseLarga=frase;
            }

            if(frase.equalsIgnoreCase("terminar")) {
                break;
            }
        } while(true);

        System.out.println("La frase mas larga es:\n"+fraseLarga);

        ent.close();

    } //fin main
    
} //fin class