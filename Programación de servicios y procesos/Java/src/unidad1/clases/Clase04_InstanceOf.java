package unidad1.clases;

public class Clase04_InstanceOf {
    
    public static void main(String[] args) {

        Object str = "Hola, soy una cadena";
        Object number = 3;

        System.out.println((str instanceof String) ? "El objeto str es una cadena" : "El objeto str no es una cadena");
        System.out.println((number instanceof Integer) ? "El objeto number es un entero" : "El objeto no es number entero");

    }

}
