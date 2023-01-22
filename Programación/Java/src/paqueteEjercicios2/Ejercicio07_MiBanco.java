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
        String titular="",beneficiario="";
        double cantidadIngresar=0.0,cantidadRetirar=0.0,cantidadTransferente=0.0;
        boolean finDeTransferencia=false;
        do {
            do {
                System.out.print("Opciones -> (1) Ver clientes | (2) Ingresar dinero | (3) Retirar dinero | (4) Transferir dinero | (5) Salir\nSeleccione una opcion: ");
                opcion=sc.nextInt();sc.nextLine();
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
                        if(clientes[i].getTitular().equalsIgnoreCase(titular)) {
                           System.out.print("Cantidad a ingresar: ");
                           cantidadIngresar=sc.nextDouble();
                           clientes[i].ingresar(cantidadIngresar);
                           break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Escriba el titular: ");
                    titular=sc.nextLine();
                    for(Ejercicio06_CuentaCorriente cliente:clientes) {
                        if(cliente.getTitular().equalsIgnoreCase(titular)) {
                            System.out.print("Cantidad a retirar: ");
                            cantidadRetirar=sc.nextDouble();
                            cliente.retirar(cantidadRetirar);
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Titular ordenante: ");
                    titular=sc.nextLine();
                    System.out.print("Titular beneficiario: ");
                    beneficiario=sc.nextLine();
                    System.out.print("Cantidad a transferir: ");
                    cantidadTransferente=sc.nextDouble();
                    for(int i=0;i<clientes.length;i++) {
                        for(Ejercicio06_CuentaCorriente cliente:clientes) {
                            if(clientes[i].getTitular().equalsIgnoreCase(titular)&&cliente.getTitular().equalsIgnoreCase(beneficiario)) {
                                clientes[i].retirar(cantidadTransferente);
                                cliente.ingresar(cantidadTransferente);
                                finDeTransferencia=true;
                                break;
                            }
                        }
                        if(finDeTransferencia==true) {break;}
                    }
                    break;
                case 5:
                    System.out.println("\nSaliendo...");
            }//switch
        }while(opcion!=5);
        sc.close();
    }//menu

}//class
