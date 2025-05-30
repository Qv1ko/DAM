package examenes.examen2.solucion;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        //tipo A
        Scanner ent=new Scanner(System.in);
        String frase="";

        System.out.print("Introduce una frase: ");
        frase=ent.nextLine();

        for(int i=0;i<frase.length();i++) {
            System.out.println("Caracter: "+frase.charAt(i)+" -> Ascii: "+(int)frase.charAt(i));
        }

        ent.close();

        //tipo B
        Scanner sc=new Scanner(System.in);
        String entrada="";

        System.out.print("Introduce una frase: ");
        entrada=ent.nextLine();

        for(int i=entrada.length()-1;i>=0;i--) {
            System.out.println(entrada.charAt(i));
        }

        sc.close();

    } //fin main

} //fin class