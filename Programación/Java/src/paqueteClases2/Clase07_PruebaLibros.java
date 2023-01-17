package paqueteClases2;

import java.util.Scanner;

public class Clase07_PruebaLibros {
    
    public static void main(String[] args) {
        // ejemplo1();
        // ejemplo2();
        ejemplo3();
    }//main

    public static void ejemplo1() {
        // Clase07_Autores cervantes=new Clase07_Autores();
        Clase07_Autores tolkien=new Clase07_Autores("J.R.","Tolkien",9);
        // cervantes.setNombre("Miguel");
        // cervantes.setApellidos("de Cervantes");
        // cervantes.setNumObras(1);
        // System.out.println(cervantes.getNombre());
        System.out.println(tolkien.getNombre());
        Clase07_Libros quijote=new Clase07_Libros(12442,"El Quijote",new Clase07_Autores("Miguel","de Cervantes",1),true,21);
        // quijote.setAutor(cervantes);
        // quijote.setIsbn(1244);
        // quijote.setTitulo("El Quijote de la Mancha");
        // quijote.setTapaDura(true);
        System.out.println(quijote);
    }//ejemplo1

    public static void ejemplo2() {
        Scanner ent=new Scanner(System.in);
        Clase07_Autores autor=new Clase07_Autores();
        System.out.print("Introduce los datos de un autor:\n\tNombre: ");
        autor.setNombre(ent.nextLine());
        System.out.print("\tApellidos: ");
        autor.setApellidos(ent.nextLine());
        System.out.print("\tNumero de obras: ");
        autor.setNumObras(ent.nextInt());
        System.out.println(autor);
        ent.close();
    }//ejemplo2

    public static void ejemplo3() {
        Scanner ent=new Scanner(System.in);
        Clase07_Libros libro=new Clase07_Libros();
        Clase07_Autores autor=new Clase07_Autores();
        System.out.print("\nIntroduce los datos de un libro:\n\tISBN: ");
        libro.setIsbn(ent.nextInt());ent.nextLine();
        System.out.print("\tTitulo: ");
        libro.setTitulo(ent.nextLine());
        System.out.print("\tNombre del autor: ");
        autor.setNombre(ent.nextLine());
        System.out.print("\tApellidos del autor: ");
        autor.setApellidos(ent.nextLine());
        System.out.print("\tNumero de obras: ");
        autor.setNumObras(ent.nextInt());ent.nextLine();
        libro.setAutor(autor);
        System.out.print("\t¿Es de tapa dura? ");
        libro.setTapaDuraText(ent.nextLine());
        System.out.print("\tPrecio: ");
        libro.setPrecio(Float.parseFloat(ent.nextLine().replace(',', '.')));
        //Con los datos del autor se asocia al libro
        System.out.println("\n"+libro);
        ent.close();
    }//ejemplo3

}//class
