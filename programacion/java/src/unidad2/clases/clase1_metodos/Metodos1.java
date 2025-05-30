package unidad2.clases.clase1_metodos;

public class Metodos1 {

    public static void main(String[] args) { /*
        * public static -> modificadores de acceso
        * void -> tipo de dato (retorno)
        * main -> id
        * (String[] args) -> parametros formales
        */

        String saludo="Hola";
        saludar(saludo); /*llamada al metodo
            * saludar -> identificador del objeto
            * (saludo) -> tipo de entrada
            */

    } //fin main

    public static void saludar(String cadena) { /*
        * public static -> modificadores de acceso
        * void -> tipo de dato
        * saludar -> identificador
        * (String cadena) -> parametros formales
        */

        System.out.println(cadena);

    } //fin saludar

} //fin class