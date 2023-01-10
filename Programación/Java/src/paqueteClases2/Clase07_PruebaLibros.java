package paqueteClases2;

public class Clase07_PruebaLibros {
    
    public static void main(String[] args) {
        Clase07_Libros elQuijote=new Clase07_Libros();
        Clase07_Libros elLazarillo=new Clase07_Libros(1234567890,"El lazarillo de Tormes","Andres Padin",true);
        System.out.println(elQuijote);
        System.out.println(elLazarillo);
    }

}
