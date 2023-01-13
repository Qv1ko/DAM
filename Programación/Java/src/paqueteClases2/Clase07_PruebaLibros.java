package paqueteClases2;

public class Clase07_PruebaLibros {
    
    public static void main(String[] args) {
        // Clase07_Autores cervantes=new Clase07_Autores();
        Clase07_Autores tolkien=new Clase07_Autores("J.R.","Tolkien",9);
        // cervantes.setNombre("Miguel");
        // cervantes.setApellidos("de Cervantes");
        // cervantes.setNumObras(1);
        // System.out.println(cervantes.getNombre());
        System.out.println(tolkien.getNombre());
        Clase07_Libros quijote=new Clase07_Libros(12442,"El Quijote",new Clase07_Autores("Miguel","de Cervantes",1),true);
        // quijote.setAutor(cervantes);
        // quijote.setIsbn(1244);
        // quijote.setTitulo("El Quijote de la Mancha");
        // quijote.setTapaDura(true);
        System.out.println(quijote);
    }

}
