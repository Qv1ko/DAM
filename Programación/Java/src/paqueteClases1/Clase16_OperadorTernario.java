package paqueteClases1;

import java.util.Scanner;

public class Clase16_OperadorTernario {

    public static void main(String[] args) {
        
        // (condicion)? true:flase
        // System.out.println((5>3)? "Mayor":"Menor");

        Scanner ent=new Scanner(System.in);

        //ejemplo 0 - Obtener caracteres con scanner
        System.out.print("Escriba un caracter: ");
        char resp=ent.next().charAt(0);
        System.out.println(resp);

        //ejemplo 1 - Continuar?
        System.out.print("Desea continuar? S/N\n--> ");
        char rsp=ent.next().toUpperCase().charAt(0);
        System.out.println((rsp=='S'||rsp=='Y')? "Continuando...":"Saliendo...");

        ent.close();
        
    } //fin main
    
} //fin class