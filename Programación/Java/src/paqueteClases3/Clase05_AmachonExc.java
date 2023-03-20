package paqueteClases3;

import paqueteClases2.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Victor
 * @version 2.4
 */

public class Clase05_AmachonExc {
    
    public static void main(String[] args) {
        ArrayList<Clase09_Productos> lista=new ArrayList<Clase09_Productos>();
        Scanner sc=new Scanner(System.in);
        menu(lista,sc);
        sc.close();
    }//main

    private static void menu(ArrayList<Clase09_Productos> lista,Scanner sc) {
        int opcion;
        do {
            System.out.print("\n(0) Salir, (1) Listar productos, (2) Añadir producto, (3) Modificar producto, (4) Eliminar producto\nSeleccione una opción: ");
            try {
                opcion=Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException exc) {
                System.out.println("\nError - Dato no numérico\n");
                opcion=-1;
            }            
            switch(opcion) {
                case 0 -> System.out.println("\nSaliendo...\n");
                case 1 -> listProducto(lista);
                case 2 -> addProducto(lista,sc);
                case 3 -> modProd(lista,sc);
                // case 4 -> delProd(lista,sc);
                default -> System.out.println("\nOpción no valida\n");
            }
        } while(opcion!=0);
    }//menuCorreccion

    private static void listProducto(ArrayList<Clase09_Productos> lista) {
        System.out.println("\nCesta con "+lista.size()+" producto/s");
        for(Clase09_Productos p:lista) {
            System.out.println(p);
        }
    }//listProducto

    private static void addProducto(ArrayList<Clase09_Productos> lista, Scanner ent) {
        String nombre="",desc="",entTeclado="";
        float cant=0.0f;
        double precio=0.0;
        Clase09_Categorias cat=null;
        boolean sinError=true,salir=false;
        do {
            sinError=true;
            System.out.print("Introduce el nombre del producto (introduzca salir para parar): ");
            nombre=ent.nextLine().trim();
            if(nombre.equalsIgnoreCase("salir")) {
                System.out.println("Hasta la próxima");
                sinError=false;
                salir=true;
            } else if(!Clase05_ValidacionesExc.validarString(nombre,25)) {
                System.out.println("\nEl nombre no puede ser vacio y no puede tener mas de 25 caracteres\n");
                sinError=false;
            }
        } while(!sinError&&!salir);
        if(!salir) {
            do {
                sinError=true;
                System.out.print("Introduce la descripción del producto (introduzca salir para parar): ");
                desc=ent.nextLine();
                if(desc.equalsIgnoreCase("salir")) {
                    System.out.println("Hasta la próxima");
                    sinError=false;
                    salir=true;
                } else if(!Clase05_ValidacionesExc.validarString(nombre,50)) {
                    System.out.println("\nLa descripción no puede ser vacía ni tener mas de 50 caracteres\n");
                    sinError=false;
                }
            } while(!sinError&&!salir);
        }
        if(!salir) {
            do {
                for(int i=0;i<Clase09_Categorias.values().length-1;i++) {
                    System.out.println((i+1)+") "+Clase09_Categorias.values()[i]);
                }
                System.out.print("Introduce la categoría del producto (introduzca salir para parar): ");
                entTeclado=ent.nextLine().toLowerCase();
                if(Clase05_ValidacionesExc.checkCategorias(entTeclado)!=null) {
                    cat=Clase05_ValidacionesExc.checkCategorias(entTeclado);
                    sinError=true;
                } else if(entTeclado.equals("salir")) {
                    salir=true;
                    sinError=false;
                } else {
                    System.out.println("Categoría incorrecta");
                    sinError=false;
                }
            } while(!sinError&&!salir);
        }
        if(!salir) {
            do {
                System.out.print("Introduce el número de unidades (introduzca salir para parar): ");
                try {
                    entTeclado=ent.nextLine().replace(',','.');
                    cant=Float.parseFloat(entTeclado);
                    // Clase05_ValidacionesExc.validarAbs(cant);
                    if(cant>0) {
                        sinError=true;
                    } else {
                        System.out.println("\nLa cantidad ha de ser mayor que cero\n");
                        sinError=false;
                    }
                    // sinError=true;
                } catch(NumberFormatException exc) {
                    if(entTeclado.equalsIgnoreCase("salir")) {
                        salir=true;
                    } else {
                        System.out.println("\nDato no numérico\n");
                        sinError=false;
                    }
                } //catch(Exception exc) {
                //     System.out.println(exc.getMessage());
                //     sinError=false;
                // }
            } while(!sinError&&!salir);
        }
        if(!salir) {
            do {
                System.out.print("Introduce el precio por unidad del producto (introduzca salir para parar): ");
                try {
                    entTeclado=ent.nextLine().replace(',','.');
                    precio=Double.parseDouble(entTeclado);
                    // Clase05_ValidacionesExc.validarAbs(precio);
                    if(precio>0) {
                        sinError=true;
                    } else {
                        System.out.println("\nLa cantidad ha de ser mayor que cero\n");
                        sinError=false;
                    }
                    // sinError=true;
                } catch(NumberFormatException exc) {
                    if(entTeclado.equalsIgnoreCase("salir")) {
                        salir=true;
                    } else {
                        System.out.println("\nDato no numérico\n");
                        sinError=false;
                    }
                } //catch(Exception exc) {
                //     System.out.println(exc.getMessage());
                // }
            } while(!sinError&&!salir);
        }
        if(sinError) {
            lista.add(new Clase09_Productos(nombre,desc,cat,cant,precio));
        }
    }//addProducto

    private static void modProd(ArrayList<Clase09_Productos> lista,Scanner sc) {
        
    }//modProd

}//class
