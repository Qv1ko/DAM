package paqueteEjercicios2;

import java.util.Scanner;

public class Ejercicio06_MiBanco {

    public static void main(String[] args) {
        ejemplo1();
        // ejemplo2();
    }//main

    public static void ejemplo1() {
        Ejercicio06_CuentaCorriente pablo = new Ejercicio06_CuentaCorriente("Pablo");
		System.out.println(pablo.ingresarInfo(100));
		System.out.println(pablo.retirarInfo(50));
		System.out.println(pablo);
    }//ejemplo1

    public static void ejemplo2() {
        Scanner ent=new Scanner(System.in);
        String continuar=" ",operacion=" ";
        System.out.print("Introduce el nombre del titular de la cuenta: ");
        Ejercicio06_CuentaCorriente titular=new Ejercicio06_CuentaCorriente(ent.nextLine());
        do {
            System.out.print("Ingresar(I) / Retirar(R): ");
            operacion=ent.nextLine();
            if(operacion.equalsIgnoreCase("i")||operacion.equalsIgnoreCase("ingresar")) {
                System.out.print("Cantidad a ingresar: ");
                System.out.println(titular.ingresarInfo(ent.nextDouble()));ent.nextLine();
            } else if(operacion.equalsIgnoreCase("r")||operacion.equalsIgnoreCase("retirar")) {
                System.out.print("Cantidad a retirar: ");
                System.out.println(titular.retirarInfo(ent.nextDouble()));ent.nextLine();
            } else {
                System.out.println("\t! Error");
            }
            System.out.println(titular);
            System.out.print("Desea continuar Si/No: ");
            continuar=ent.nextLine();
        } while(continuar.equalsIgnoreCase("si")||continuar.equalsIgnoreCase("s"));
        System.out.println("\nSaliendo de la cuenta...\n");
        ent.close();
    }//ejemplo2

}//class
