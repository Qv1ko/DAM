package paqueteClases2;

public class Clase09_Validaciones {
    
    public static boolean validarUnidades(int unidades) {
        return (unidades>=1)? true:false;
    }//validarUnidades

    public static boolean validarString(String cadena) {
        return (!cadena.isEmpty()); //True si esta vacio
        // return (!cadena.isBlank()); //True si esta vacio o contiene espacios en blanco
    }

}
