package paqueteEjercicios2;

import java.util.Scanner;

public class Ejercicio07_MiBanco {
    
    public static void main(String[] args) {
        Ejercicio06_CuentaCorriente[] clientes=new Ejercicio06_CuentaCorriente[5];
        clientes[0]=new Ejercicio06_CuentaCorriente("Saul");
        clientes[1]=new Ejercicio06_CuentaCorriente("Andres");
        clientes[2]=new Ejercicio06_CuentaCorriente("Marta");
        clientes[3]=new Ejercicio06_CuentaCorriente("Irene",55);
        clientes[4]=new Ejercicio06_CuentaCorriente("Constantin");
        menu(clientes);
    }//main

    private static void menu(Ejercicio06_CuentaCorriente[] clientes) {
        Scanner sc=new Scanner(System.in);
        int opcion=0;
        String titular="";
        do {
            do {
                System.out.print("Opciones -> (1) Ver clientes | (2) Ingresar dinero | (3) Retirar dinero | (4) Transferir dinero | (5) Salir\nSeleccione una opcion: ");
                opcion=sc.nextInt();
            } while(opcion<1||opcion>5);
            switch(opcion) {
                case 1: 
                    for(Ejercicio06_CuentaCorriente cliente: clientes) {
                        System.out.println(cliente);
                    }
                    break;
                case 2:
                    System.out.print("Escriba el titular: ");
                    titular=sc.nextLine();
                    for(int i=0;i<clientes.length;i++) {
                        if(clientes[i].getTitular()==titular) {
                           System.out.print("Cantidad a ingresar: ");
                           clientes[i].ingresar(sc.nextDouble());
                        }
                    }
            }
        }while(opcion!=5);
        sc.close();
    }//menu

}//class
