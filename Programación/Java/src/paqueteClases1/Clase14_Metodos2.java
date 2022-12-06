package paqueteClases1;

import java.util.Scanner;

public class Clase14_Metodos2 {
 
    public static void main(String[] args) {
        
        Scanner ent=new Scanner(System.in);
        String nombre="";

        System.out.print("Introduce un nombre: ");
        nombre=ent.nextLine();

        bienvenida(nombre);

        System.out.println("FIN");

        ent.close();

    } //fin main

    public static void bienvenida(String nombre) {

        System.out.println("Bienvenido "+nombre);

    } //fin bienvenida

} //fin class