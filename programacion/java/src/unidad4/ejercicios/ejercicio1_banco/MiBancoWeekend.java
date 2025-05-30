package unidad4.ejercicios.ejercicio1_banco;

import java.util.Scanner;

public class MiBancoWeekend {
    
    public static void main(String[] args) {
        CuentaCorriente[] clientes=new CuentaCorriente[5];
        clientes[0]=new CuentaCorriente("Saul");
        clientes[1]=new CuentaCorriente("Andres");
        clientes[2]=new CuentaCorriente("Marta");
        clientes[3]=new CuentaCorriente("Irene",55);
        clientes[4]=new CuentaCorriente("Constantin");
        // menu(clientes);
        menuCorreccion();
    }//main

    public static void menu(CuentaCorriente[] clientes) {
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
                    for(CuentaCorriente cliente: clientes) {
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
                    for(CuentaCorriente cliente:clientes) {
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
                        for(CuentaCorriente cliente:clientes) {
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

    public static void menuCorreccion() {
        CuentaCorriente[] clientes=new CuentaCorriente[5];
        int opcion=0;
        Scanner ent=new Scanner(System.in);
        clientes[0]=new CuentaCorriente("Saul");
        clientes[1]=new CuentaCorriente("Andres");
        clientes[2]=new CuentaCorriente("Marta");
        clientes[3]=new CuentaCorriente("Irene",55);
        clientes[4]=new CuentaCorriente("Constantin");
        do {
            System.out.print("Introduce una opcion: ");
            opcion=ent.nextInt();ent.nextLine();
            switch(opcion) {
                case 1 -> listarClientes(clientes);
                case 2 -> ingresar(clientes,ent);
                case 3 -> retirar(clientes,ent);
                case 4 -> transferir(clientes,ent);
                case 5 -> System.out.println("Adios");
                default -> {
                    System.out.println("Error - Entrada incorrecta");
                }
            }
        } while(opcion!=5);
        ent.close();
    }//menuCorreccion

    private static void listarClientes(CuentaCorriente[] lista) {
        for(CuentaCorriente cli:lista) {
            System.out.println(cli);
        }
    }//listarClientes

    private static void ingresar(CuentaCorriente[] lista,Scanner ent) {
        String nombre=" ";
        System.out.print("Introduce el nombre del titular: ");
        nombre=ent.nextLine();
        for(CuentaCorriente cli:lista) {
            if(cli.getTitular().equalsIgnoreCase(nombre)) {
                System.out.print("Importe a ingresar: ");
                System.out.println(cli.ingresarInfo(ent.nextDouble()));
                break;
            }
        }
    }//ingresar

    private static void retirar(CuentaCorriente[] lista,Scanner ent) {
        String nombre=" ";
        System.out.print("Introduce el nombre del titular: ");
        nombre=ent.nextLine();
        // for(Ejercicio06_CuentaCorriente cli:lista) {
        //     if(cli.getTitular().equalsIgnoreCase(nombre)) {
        //         System.out.print("Importe a retirar: ");
        //         System.out.println(cli.retirarInfo(ent.nextDouble()));
        //         break;
        //     }
        // }
        for(int i=0;i<lista.length;i++) {
            if(lista[i].getTitular().equalsIgnoreCase(nombre)) {
                System.out.print("Importe a retirar: ");
                System.out.println(lista[i].retirarInfo(ent.nextDouble()));
                break;
            }
        }
    }//retirar

    private static void transferir(CuentaCorriente[] lista,Scanner ent) {
        CuentaCorriente ordenante=null,beneficiario=null;
        double cantidad=0.0;
        System.out.print("Introduzca la cuenta ordenante: ");
        ordenante=buscarCuentaCorriente(ent.nextLine(),lista);
        System.out.print("Introduzca la cuenta beneficiaria: ");
        beneficiario=buscarCuentaCorriente(ent.nextLine(),lista);
        System.out.print("Cantidad a transferir: ");
        cantidad=ent.nextDouble();
        if(ordenante!=null&&beneficiario!=null) {
            System.out.println(ordenante.retirarInfo(cantidad));
            System.out.println(beneficiario.ingresarInfo(cantidad));
        } else {
            System.out.println("No existe uno de los titulares");
        }
    }//transferir

    private static CuentaCorriente buscarCuentaCorriente(String titular,CuentaCorriente[] lista) {
        CuentaCorriente cliente=null;
        for(CuentaCorriente cli:lista) {
            if(cli.getTitular().equalsIgnoreCase(titular)) {
                cliente=cli;
            }
        }
        return cliente;
    }//buscarCuentaCorriente

}//class
