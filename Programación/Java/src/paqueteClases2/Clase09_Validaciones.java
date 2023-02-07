package paqueteClases2;

public class Clase09_Validaciones {
    
    public static boolean validarUnidades(int unidades) {
        return (unidades>=1)? true:false;
    }//validarUnidades

    public static boolean validarString(String cadena,int longitudMax) {
        return (!cadena.isEmpty()&&cadena.length()<longitudMax); //True si esta vacio
        // return (!cadena.isBlank()&&cadena.length()<longitudMax); //True si esta vacio o contiene espacios en blanco
    }

}
