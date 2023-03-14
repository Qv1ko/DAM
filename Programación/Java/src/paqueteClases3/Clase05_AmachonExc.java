package paqueteClases3;

import paqueteClases2.*;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author Victor
 * @version 2.3
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
                // case 3 -> modProd(lista,sc);
                // case 4 -> delProd(lista,sc);
                default -> System.out.println("\nOpción no valida\n");
            }
        } while(opcion!=0);
    }//menuCorreccion

    private static void listProducto(ArrayList<Clase09_Productos> lista) {
        for(Clase09_Productos p:lista) {
            System.out.println(p);
        }
    }//listProducto

    private static void addProducto(ArrayList<Clase09_Productos> lista, Scanner ent) {
        String nombre="",desc="",entCat="";
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
                System.out.print("Introduce la descripción del producto: ");
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
                System.out.print("Introduce la categoría del producto: ");
                entCat=ent.nextLine().toLowerCase();
                if(Clase05_ValidacionesExc.checkCategorias(entCat)!=null) {
                    cat=Clase05_ValidacionesExc.checkCategorias(entCat);
                    sinError=true;
                } else if(entCat.equals("salir")) {
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
                System.out.print("Introduce el número de unidades: ");
                try {
                    cant=Float.parseFloat(ent.nextLine().replace(',','.'));
                    if(!Clase05_ValidacionesExc.validarUnidades(cant)) {
                        throw new Exception("Valor negativo no valido");
                    }
                    sinError=true;
                } catch(NoSuchElementException exc) {
                    System.out.println("\nValor no valido\n");
                    sinError=false;
                } catch(NullPointerException exc) {
                    System.out.println("\nValor no valido\n");
                    sinError=false;
                } catch(NumberFormatException exc) {
                    System.out.println("\nDato no numérico\n");
                    sinError=false;
                } catch(Exception exc) {
                    System.out.println(exc.getMessage());
                    sinError=false;
                }
            } while(!sinError&&!salir);
        }
        if(!salir) {
            do {
                System.out.print("Introduce el precio por unidad del producto: ");
                try {
                    precio=Double.parseDouble(ent.nextLine().replace(',','.'));
                    sinError=true;
                } catch(NoSuchElementException exc) {
                    System.out.println("\nValor no valido\n");
                    sinError=false;
                } catch(NullPointerException exc) {
                    System.out.println("\nValor no valido\n");
                    sinError=false;
                } catch(NumberFormatException exc) {
                    System.out.println("\nDato no numérico\n");
                    sinError=false;
                }
            } while(!sinError&&!salir);
        }
        if(sinError) {
            lista.add(new Clase09_Productos(nombre,desc,cat,cant,precio));
        }
    }//addProducto

}//class
