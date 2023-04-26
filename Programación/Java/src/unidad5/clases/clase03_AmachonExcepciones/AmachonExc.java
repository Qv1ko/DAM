package unidad5.clases.clase03_AmachonExcepciones;

import unidad4.clases.clase03_Amachon.Categorias;
import unidad4.clases.clase03_Amachon.Productos;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author Victor
 * @version 2.6
 */

public class AmachonExc {
    
    public static void main(String[] args) {
        ArrayList<Productos> lista=new ArrayList<Productos>();
        Scanner sc=new Scanner(System.in);
        menu(lista,sc);
        sc.close();
    }//main

    private static void menu(ArrayList<Productos> lista,Scanner sc) {
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
                case 4 -> delProd(lista,sc);
                default -> System.out.println("\nOpción no valida\n");
            }
        } while(opcion!=0);
    }//menuCorreccion

    private static void listProducto(ArrayList<Productos> lista) {
        System.out.println("\nCesta con "+lista.size()+" producto/s");
        for(Productos p:lista) {
            System.out.println(p);
        }
    }//listProducto

    private static void addProducto(ArrayList<Productos> lista, Scanner ent) {
        String nombre="",desc="",entTeclado="";
        float cant=0.0f;
        double precio=0.0;
        Categorias cat=null;
        boolean sinError=true,salir=false;
        do {
            sinError=true;
            System.out.print("Introduce el nombre del producto (introduzca salir para parar): ");
            nombre=ent.nextLine().trim();
            if(nombre.equalsIgnoreCase("salir")) {
                System.out.println("Hasta la próxima");
                sinError=false;
                salir=true;
            } else if(!ValidacionesExc.validarString(nombre,25)) {
                System.out.println("\nEl nombre no puede ser vacío y no puede tener mas de 25 caracteres\n");
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
                } else if(!ValidacionesExc.validarString(nombre,50)) {
                    System.out.println("\nLa descripción no puede ser vacía ni tener mas de 50 caracteres\n");
                    sinError=false;
                }
            } while(!sinError&&!salir);
        }
        if(!salir) {
            do {
                for(int i=0;i<Categorias.values().length-1;i++) {
                    System.out.println((i+1)+") "+Categorias.values()[i]);
                }
                System.out.print("Introduce la categoría del producto (introduzca salir para parar): ");
                entTeclado=ent.nextLine().toLowerCase();
                if(ValidacionesExc.checkCategorias(entTeclado)!=null) {
                    cat=ValidacionesExc.checkCategorias(entTeclado);
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
            lista.add(new Productos(nombre,desc,cat,cant,precio));
        }
    }//addProducto

    private static void modProd(ArrayList<Productos> lista,Scanner sc) {
        int identificador=0;
        String atributo="",cateProducto="";
        System.out.print("Escriba el id del producto que desea modificar: ");
        try {
            identificador=sc.nextInt();sc.nextLine();
            for(int i=0;i<lista.size();i++) {
                if(lista.get(i).getId()==identificador) {
                    do {
                        System.out.print("Que atributo desea modificar (nombre,descripcion,categoria,cantidad,precio), (introduzca salir para parar): ");
                        try {
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
                                default:
                                    if(!atributo.equalsIgnoreCase("salir")) {
                                        throw new Exception("El atributo del producto no existe");
                                    }
                            }
                        } catch(NoSuchElementException exc) {
                            System.out.println("Error - El campo no puede estar vacío");
                        } catch(Exception exc) {
                            System.out.println(exc.getMessage());
                        }
                    } while(!atributo.equalsIgnoreCase("salir"));
                }
            }
        } catch(InputMismatchException exc) {
            System.out.println("Error - El campo no puede estar vacío");
        }
    }//modProd

    private static void delProd(ArrayList<Productos> lista,Scanner sc) {
        int identificador;
        String userInput="";
        do {
            System.out.print("Escriba el id del producto que desea eliminar (introduzca salir para parar): ");
            try{
                userInput=sc.nextLine();
                if(!userInput.equalsIgnoreCase("salir")) {
                    identificador=Integer.parseInt(userInput);
                    for(int i=0;i<lista.size();i++) {
                        if(lista.get(i).getId()==identificador) {
                            lista.remove(i);
                        }
                    }
                }
            } catch(NumberFormatException exc) {
                System.out.println("Introduce un valor númerico entero");                
            }        
        } while(!userInput.equalsIgnoreCase("salir"));
    }//delProd

}//class
