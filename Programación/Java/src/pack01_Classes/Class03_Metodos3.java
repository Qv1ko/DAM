package pack01_Classes;

public class Class03_Metodos3 {

    public static void main(String[] args) {
        
        System.out.println("Inicio");

        String salida=saludar();
        System.out.println(salida);

        System.out.println("Fin");

    } //fin main

    public static String saludar() {

        String hello="Hola mundo";

        return hello; //retorna el valor de saludo donde a sido llamado

    }
    
} //fin class