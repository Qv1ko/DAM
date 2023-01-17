package paqueteEjercicios2;

import java.util.Scanner;

public class Ejercicio06_MiBanco {

    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);
        System.out.print("Introduce el nombre del titular de la cuenta: ");
        Ejercicio06_CuentaCorriente titular=new Ejercicio06_CuentaCorriente(ent.nextLine());
        do {
            System.out.print("Ingresar(I) / Retirar(R): ");
            if(ent.nextLine().equalsIgnoreCase("i")||ent.nextLine().equalsIgnoreCase("ingresar")) {
                System.out.print("Cantidad a ingresar: ");
                titular.ingresarInfo(ent.nextDouble());
            } else if(ent.nextLine().equalsIgnoreCase("r")||ent.nextLine().equalsIgnoreCase("retirar")) {
                System.out.print("Cantidad a retirar: ");
                titular.retirarInfo(ent.nextDouble());
            } else {
                System.out.println("\t! Error");
            }
            System.out.println(titular);
            System.out.print("Desea continuar Si/No: ");
        } while(ent.nextLine().equalsIgnoreCase("si"));
        ent.close();
    }//main

}//class
