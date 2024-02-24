package unidad4.clases.clase4_Amachon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Victor
 * @version 2.1
 */

public class CestaAmachon {
    
    public static void main(String[] args) {
        //Declaramos una lista de tipo ArrayList
        ArrayList<Productos> lista=new ArrayList<Productos>();
        // ejemploColchon();
        Scanner sc=new Scanner(System.in);
        menu(lista,sc);
        menuCorreccion(lista,sc);
        sc.close();
    }//main

    public static void ejemploColchon() {
        ArrayList<Productos> lista=new ArrayList<Productos>();
        Productos colchon=new Productos("Colchon","Muy comodo",Categorias.CATB,5,650.95);
        // colchon.setNombre("Buen colchon");
        lista.add(colchon);
        //Tamano de la lista
        System.out.println(lista.size());
        //Valor de la lista
        System.out.println(lista.get(0).toString());
    }//ejemploColchon

    private static void menu(ArrayList<Productos> lista,Scanner sc) {
        int opcion;
        do {
            System.out.print("\n(0) Salir, (1) Listar productos, (2) Añadir producto, (3) Eliminar producto, (4) Modificar producto, (5) Mistery box\nSeleccione una opcion: ");
            opcion=sc.nextInt();sc.nextLine();
            switch(opcion) {
                case 0 -> System.out.println("\nSaliendo...\n");
                case 1 -> listProd(lista);
                case 2 -> addProd(lista,sc);
                case 3 -> delProd(lista,sc);
                case 4 -> modProd(lista,sc);
                case 5 -> misteryBox();
            }
        } while(opcion!=0);
    }//menu

    private static void listProd(ArrayList<Productos> lista) {
        System.out.println("\nCesta con "+lista.size()+" producto/s");
        for(Productos producto:lista) {
            System.out.println(producto);
        }
    }//listaProd

    private static void addProd(ArrayList<Productos> lista,Scanner sc) {
        Productos producto;
        String cateProducto="",precio="";
        int addProd=0;
        System.out.println("Cuantos productos quieres agregar a la cesta: ");
        addProd=sc.nextInt();sc.nextLine();
        for(int i=0;i<addProd;i++) {
            producto=new Productos();
            System.out.print("Nombre del producto: ");
            producto.setNombre(sc.nextLine());
            System.out.print("Descripcion del producto: ");
            producto.setDescripcion(sc.nextLine());
            System.out.print("Categoria del producto (A,B o C): ");
            cateProducto=sc.nextLine();
            producto.setCate((cateProducto.equalsIgnoreCase("A"))? Categorias.CATA:(cateProducto.equalsIgnoreCase("B"))? Categorias.CATB:(cateProducto.equalsIgnoreCase("C"))? Categorias.CATC:Categorias.CATD);
            System.out.print("Cantidad: ");
            producto.setCant(sc.nextFloat());sc.nextLine();
            System.out.print("Precio del producto: ");
            precio=sc.nextLine();
            producto.setPrecio(Double.parseDouble(precio.replace(',', '.')));
            lista.add(producto);
        }
    }//addProd

    private static void delProd(ArrayList<Productos> lista,Scanner sc) {
        int identificador;
        System.out.print("Escriba el id del producto que desea eliminar: ");
        identificador=sc.nextInt();
        for(int i=0;i<lista.size();i++) {
            if(lista.get(i).getId()==identificador) {
                lista.remove(i);
            }
        }
    }//delProd

    private static void modProd(ArrayList<Productos> lista,Scanner sc) {
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
                            lista.get(i).setCate((cateProducto.equalsIgnoreCase("A"))? Categorias.CATA:(cateProducto.equalsIgnoreCase("B"))? Categorias.CATB:(cateProducto.equalsIgnoreCase("C"))? Categorias.CATC:Categorias.CATD);
                            break;
                        case "cantidad":
                            System.out.print("Cantidad: ");
                            lista.get(i).setCant(sc.nextFloat());sc.nextLine();
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

    private static void menuCorreccion(ArrayList<Productos> lista,Scanner sc) {
        int opcion;
        do {
            System.out.print("\n(0) Salir, (1) Listar productos, (2) Añadir producto, (3) Modificar producto, (4) Eliminar producto\nSeleccione una opcion: ");
            opcion=sc.nextInt();sc.nextLine();
            switch(opcion) {
                case 0 -> System.out.println("\nSaliendo...\n");
                case 1 -> listProducto(lista);
                case 2 -> addProducto(lista,sc);
                // case 3 -> modProd(lista,sc);
                // case 4 -> delProd(lista,sc);
            }
        } while(opcion!=0);
    }//menuCorreccion

    private static void listProducto(ArrayList<Productos> lista) {
        for(Productos p:lista) {
            System.out.println(p);
        }
    }//listProducto

    private static void addProducto(ArrayList<Productos> lista, Scanner ent) {
        String nombre="",desc="",entCat="";
        float cant=0.0f;
        double precio=0.0;
        Categorias cat=null;
        boolean sinError=true,salir=false;
        do {
            sinError=true;
            System.out.print("Introduce el nombre del producto (introduzca salir para parar): ");
            nombre=ent.nextLine().trim();
            if(nombre.equalsIgnoreCase("salir")) {
                System.out.println("Hasta la proxima");
                sinError=false;
                salir=true;
            } else if(!Validaciones.validarString(nombre,25)) {
                System.out.println("\nEl nombre no puede ser vacio y no puede tener mas de 25 caracteres\n");
                sinError=false;
            }
        } while(!sinError&&!salir);
        if(!salir) {
            do {
                System.out.print("Introduce la descripcion del producto: ");
                desc=ent.nextLine();
                if(desc.equalsIgnoreCase("salir")) {
                    System.out.println("Hasta la proxima");
                    sinError=false;
                    salir=true;
                } else if(!Validaciones.validarString(nombre,50)) {
                    System.out.println("\nLa descripcion no puede ser vacia ni tener mas de 50 caracteres\n");
                    sinError=false;
                }
            } while(!sinError&&!salir);
        }
        //Control de la categoria del producto
        if(!salir) {
            do {
                for(int i=0;i<Categorias.values().length-1;i++) {
                    System.out.println((i+1)+") "+Categorias.values()[i]);
                }
                System.out.print("Introduce la categoria del producto: ");
                entCat=ent.nextLine().toLowerCase();
                if(Validaciones.checkCategorias(entCat)!=null) {
                    cat=Validaciones.checkCategorias(entCat);
                } else if(entCat.equals("salir")) {
                    salir=true;
                    sinError=false;
                } else {
                    System.out.println("Categoria incorrecta");
                    sinError=false;
                }
            } while(!sinError&&!salir);
        }        
        if(sinError) {
            lista.add(new Productos(nombre,desc,cat,cant,precio));
        }
    }//addProducto

}//class
