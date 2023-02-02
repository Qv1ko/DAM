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

    private static void menu(ArrayList lista,Scanner sc) {
        boolean exit=false;
        Clase09_Productos producto=new Clase09_Productos();
        String categoriaProducto="",atribProd="",salida="";
        int opcion,idProd;
        do {
            System.out.print("(0) Salir, (1) Listar productos, (2) Añadir producto, (3) Eliminar producto, (4) Modificar producto, (5) Mistery box\nSeleccione una opcion: ");
            opcion=sc.nextInt();sc.nextLine();
            switch(opcion) {
                case 0:
                    exit=true;
                    break;
                case 1:
                    for(int i=0;i<lista.size();i++) {
                        System.out.println(lista.get(i).toString());
                    }
                    break;
                case 2:
                    System.out.println("Introduce los datos del producto:");
                    System.out.print("Nombre del producto: ");
                    producto.setNombre(sc.nextLine());
                    System.out.print("Descripcion del producto: ");
                    producto.setDescripcion(sc.nextLine());
                    System.out.print("Categoria del producto (A,B o C): ");
                    categoriaProducto=sc.nextLine();
                    producto.setCate((categoriaProducto.equalsIgnoreCase("A"))? Clase09_Categorias.CATA:(categoriaProducto.equalsIgnoreCase("B"))? Clase09_Categorias.CATB:(categoriaProducto.equalsIgnoreCase("C"))? Clase09_Categorias.CATC:Clase09_Categorias.CATD);
                    System.out.print("Cantidad: ");
                    producto.setCant(sc.nextFloat());
                    System.out.print("Precio del producto: ");
                    producto.setPrecio(sc.nextDouble());
                    lista.add(producto);
                    break;
                case 3:
                    System.out.print("Escriba el id del producto que desea eliminar: ");
                    idProd=sc.nextInt();
                    for(int i=0;i<lista.size();i++) {
                        if(lista.get(i).getId()==idProd) {
                            lista.remove(i);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Escriba el id del producto que desea modificar: ");
                    idProd=sc.nextInt();
                    for(int i=0;i<lista.size();i++) {
                        if(lista.get(i).getId()==idProd) {
                            do {
                                System.out.print("Que atributo desea modificar (nombre,descripcion,categoria,cantidad,precio): ");
                                atribProd=sc.nextLine().toLowerCase();
                                switch(atribProd) {
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
                                        categoriaProducto=sc.nextLine();
                                        lista.get(i).setCate((categoriaProducto.equalsIgnoreCase("A"))? Clase09_Categorias.CATA:(categoriaProducto.equalsIgnoreCase("B"))? Clase09_Categorias.CATB:(categoriaProducto.equalsIgnoreCase("C"))? Clase09_Categorias.CATC:Clase09_Categorias.CATD);
                                        break;
                                    case "cantidad":
                                        System.out.print("Cantidad: ");
                                        lista.get(i).setCant(sc.nextFloat());
                                        break;
                                }
                                System.out.print("Quieres salir del menu de modificacion (Si/No): ");
                                salida=sc.nextLine().toLowerCase();
                                exit=(salida.equals("si")||salida.equals("yes")||salida.equals("s"))? false:true;
                            } while(!exit);
                        }
                    }
                default:
                    exit=true;
            }
        } while(!exit);
        System.out.println("\nSaliendo...\n");
    }//menu

}//class
