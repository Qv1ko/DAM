package paqueteEjercicios3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import paqueteClases2.Clase09_Categorias;
import paqueteClases2.Clase09_Validaciones;

/**
 * @author Victor
 * @version 2.2
 */

public class Ejercicio11_CestaAmachon {
    
    public static void main(String[] args) {
        ArrayList<Ejercicio11_Productos> lista=new ArrayList<Ejercicio11_Productos>();
        Scanner sc=new Scanner(System.in);
        int opcion;
        do {
            System.out.print("\n(0) Salir, (1) Listar productos, (2) Añadir producto, (3) Modificar producto, (4) Eliminar producto\nSeleccione una opcion: ");
            opcion=sc.nextInt();sc.nextLine();
            switch(opcion) {
                case 0 -> System.out.println("\nSaliendo...\n");
                case 1 -> listProducto(lista);
                case 2 -> addProducto(lista,sc);
                case 3 -> modProd(lista,sc);
                case 4 -> delProd(lista,sc);
            }
        } while(opcion!=0);
        try {
            writeCsv(lista);
        } catch(IOException exc) {
            System.out.println("\n! Error en la entrada o salida\n");
        }
        sc.close();
    }//main

    private static void listProducto(ArrayList<Ejercicio11_Productos> lista) {
        // FileReader fr=null;
        // BufferedReader br=null;
        // int linea=1;
        // try {
        //     fr=new FileReader(new File("C:\\Users\\Usuario\\DAM\\Programación\\Java\\src\\paqueteEjercicios3\\ejercicio11_fichero\\productos.csv"));
        //     br=new BufferedReader(fr);
        //     br.readLine();
        //     while(br.ready()) {
        //         linea++;
        //         try {
        //             lista.add(new Ejercicio11_Productos(br.readLine()));
        //         } catch(NumberFormatException exc) {
        //             System.out.println("\n! Los valores de la linea "+linea+" del fichero son incorrectos\n");
        //         } catch(Exception exc) {
        //             System.out.println("\n! Error en la linea: "+linea+"\n");
        //         }
        //     }
        //     System.out.println(lista.size()+" productos importados");
        //     for(Ejercicio11_Productos producto:lista) {
        //         System.out.println(producto.toString());
        //     }
        //     br.close();
        // } catch(FileNotFoundException exc) {
        //     System.out.println("\n! El archivo no se ha encontrado\n");
        // } catch(IOException exc) {
        //     System.out.println("\n! Error en la entrada o salida\n");
        // }
    }//listProducto

    private static void addProducto(ArrayList<Ejercicio11_Productos> lista, Scanner ent) {
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
                System.out.println("Hasta la proxima");
                sinError=false;
                salir=true;
            } else if(!Clase09_Validaciones.validarString(nombre,25)) {
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
                } else if(!Clase09_Validaciones.validarString(nombre,50)) {
                    System.out.println("\nLa descripcion no puede ser vacia ni tener mas de 50 caracteres\n");
                    sinError=false;
                }
            } while(!sinError&&!salir);
        }
        if(!salir) {
            do {
                for(int i=0;i<Clase09_Categorias.values().length-1;i++) {
                    System.out.println((i+1)+") "+Clase09_Categorias.values()[i]);
                }
                System.out.print("Introduce la categoria del producto: ");
                entCat=ent.nextLine().toLowerCase();
                if(Clase09_Validaciones.checkCategorias(entCat)!=null) {
                    cat=Clase09_Validaciones.checkCategorias(entCat);
                } else if(entCat.equals("salir")) {
                    salir=true;
                    sinError=false;
                } else {
                    System.out.println("Categoria incorrecta");
                    sinError=false;
                }
            } while(!sinError&&!salir);
        }
        if(!salir) {
            do {
                for(int i=0;i<Clase09_Categorias.values().length-1;i++) {
                    System.out.println((i+1)+") "+Clase09_Categorias.values()[i]);
                }
                System.out.print("Introduce la categoria del producto: ");
                entCat=ent.nextLine().toLowerCase();
                if(Clase09_Validaciones.checkCategorias(entCat)!=null) {
                    cat=Clase09_Validaciones.checkCategorias(entCat);
                } else if(entCat.equals("salir")) {
                    salir=true;
                    sinError=false;
                } else {
                    System.out.println("Categoria incorrecta");
                    sinError=false;
                }
            } while(!sinError&&!salir);
        }
        System.out.print("Cantidad: ");
        cant=ent.nextFloat();ent.nextLine();
        System.out.print("Precio del producto: ");
        precio=Double.parseDouble(ent.nextLine().replace(',', '.'));  
        if(sinError) {
            lista.add(new Ejercicio11_Productos(nombre,desc,cat,cant,precio));
        }
    }//addProducto

    private static void delProd(ArrayList<Ejercicio11_Productos> lista,Scanner sc) {
        int identificador;
        System.out.print("Escriba el id del producto que desea eliminar: ");
        identificador=sc.nextInt();
        for(int i=0;i<lista.size();i++) {
            if(lista.get(i).getId()==identificador) {
                lista.remove(i);
            }
        }
    }//delProd
    
    private static void modProd(ArrayList<Ejercicio11_Productos> lista,Scanner sc) {
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

    private static void writeCsv(ArrayList<Ejercicio11_Productos> lista) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\Usuario\\DAM\\Programación\\Java\\src\\paqueteEjercicios3\\ejercicio11_fichero\\productos.csv"));
        for(Ejercicio11_Productos producto:lista) {
            bw.write(producto.toCsv());
            bw.newLine();
        }
        bw.close();
    }

}//class
