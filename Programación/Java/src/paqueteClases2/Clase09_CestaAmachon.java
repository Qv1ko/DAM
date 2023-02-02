package paqueteClases2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Victor
 * @version 1.0
 */

public class Clase09_CestaAmachon {
    
    public static void main(String[] args) {
        //Declaramos una lista de tipo ArrayList
        ArrayList<Clase09_Productos> lista=new ArrayList<Clase09_Productos>();
        // ejemploColchon();
        Scanner sc=new Scanner(System.in);
        menu(lista,sc);
        sc.close();
    }//main

    public static void ejemploColchon() {
        ArrayList<Clase09_Productos> lista=new ArrayList<Clase09_Productos>();
        Clase09_Productos colchon=new Clase09_Productos("Colchon","Muy comodo",Clase09_Categorias.CATB,5,650.95);
        // colchon.setNombre("Buen colchon");
        lista.add(colchon);
        //Tamano de la lista
        System.out.println(lista.size());
        //Valor de la lista
        System.out.println(lista.get(0).toString());
    }//ejemploColchon

    private static void menu(ArrayList<Clase09_Productos> lista,Scanner sc) {
        boolean exit=false;
        int opcion;
        do {
            System.out.print("(0) Salir, (1) Listar productos, (2) Añadir producto, (3) Eliminar producto, (4) Modificar producto, (5) Mistery box\nSeleccione una opcion: ");
            opcion=sc.nextInt();sc.nextLine();
            switch(opcion) {
                case 0 -> exit=true;
                case 1 -> listaProd(lista);
                case 2 -> addProd(lista,sc);
                case 3 -> delProd(lista,sc);
                case 4 -> modProd(lista,sc);
                case 5 -> misteryBox();
                default -> exit=true;
            }
        } while(!exit);
        System.out.println("\nSaliendo...\n");
    }//menu

    private static void listaProd(ArrayList<Clase09_Productos> lista) {
        for(int i=0;i<lista.size();i++) {
            System.out.println(lista.get(i).toString());
        }
    }//listaProd

    private static void addProd(ArrayList<Clase09_Productos> lista,Scanner sc) {
        Clase09_Productos producto=new Clase09_Productos();
        String cateProducto="";
        System.out.println("Introduce los datos del producto:");
        System.out.print("Nombre del producto: ");
        producto.setNombre(sc.nextLine());
        System.out.print("Descripcion del producto: ");
        producto.setDescripcion(sc.nextLine());
        System.out.print("Categoria del producto (A,B o C): ");
        cateProducto=sc.nextLine();
        producto.setCate((cateProducto.equalsIgnoreCase("A"))? Clase09_Categorias.CATA:(cateProducto.equalsIgnoreCase("B"))? Clase09_Categorias.CATB:(cateProducto.equalsIgnoreCase("C"))? Clase09_Categorias.CATC:Clase09_Categorias.CATD);
        System.out.print("Cantidad: ");
        producto.setCant(sc.nextFloat());
        System.out.print("Precio del producto: ");
        producto.setPrecio(Double.parseDouble(sc.nextLine().replace(',', '.')));
        lista.add(producto);
    }//addProd

    private static void delProd(ArrayList<Clase09_Productos> lista,Scanner sc) {
        int identificador;
        System.out.print("Escriba el id del producto que desea eliminar: ");
        identificador=sc.nextInt();
        for(int i=0;i<lista.size();i++) {
            if(lista.get(i).getId()==identificador) {
                lista.remove(i);
            }
        }
    }//delProd

    private static void modProd(ArrayList<Clase09_Productos> lista,Scanner sc) {
        int identificador;
        String atributo,cateProducto,exit;
        System.out.print("Escriba el id del producto que desea modificar: ");
        identificador=sc.nextInt();sc.nextLine();
        for(int i=0;i<lista.size();i++) {
            if(lista.get(i).getId()==identificador) {
                do {
                    System.out.print("Que atributo desea modificar (nombre,descripcion,categoria,cantidad,precio): ");
                    atributo=sc.nextLine().toLowerCase();
                    switch(atributo) {
                        case "nombre":
                            System.out.print("Nuevo nombre: ");
                            lista.get(i).setNombre(sc.nextLine());
                            break;
                        case "descripcion":
                            System.out.print("Nueva descripcion: ");
                            lista.get(i).setDescripcion(sc.nextLine());
                            break;
                        case "descripción":
                            System.out.print("Nueva descripcion: ");
                            lista.get(i).setDescripcion(sc.nextLine());
                            break;
                        case "categoria":
                            System.out.print("Seleccione la nueva categoria (A,B o C): ");
                            cateProducto=sc.nextLine();
                            lista.get(i).setCate((cateProducto.equalsIgnoreCase("A"))? Clase09_Categorias.CATA:(cateProducto.equalsIgnoreCase("B"))? Clase09_Categorias.CATB:(cateProducto.equalsIgnoreCase("C"))? Clase09_Categorias.CATC:Clase09_Categorias.CATD);
                            break;
                        case "cantidad":
                            System.out.print("Cantidad: ");
                            lista.get(i).setCant(sc.nextFloat());
                            break;
                        case "precio":
                            System.out.print("Precio: ");
                            lista.get(i).setPrecio(Double.parseDouble(sc.nextLine().replace(',', '.')));
                            break;
                    }
                    System.out.print("Quieres salir del menu de modificacion (Si/No): ");
                    exit=sc.nextLine().toLowerCase();
                } while(!(exit.equals("si")||exit.equals("yes")||exit.equals("s"))? true:false);
            }
        }
    }//modProd

    private static void misteryBox() {

    }//misteryBox

}//class
