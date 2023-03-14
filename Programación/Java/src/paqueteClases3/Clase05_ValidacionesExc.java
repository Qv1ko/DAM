package paqueteClases3;

import paqueteClases2.Clase09_Categorias;

public class Clase05_ValidacionesExc {
        
    public static boolean validarUnidades(float unidades) {
        return (unidades>=1)? true:false;
    }//validarUnidades

    public static boolean validarString(String cadena,int longitudMax) {
        return (!cadena.isEmpty()&&cadena.length()<longitudMax); //True si esta vacio
        // return (!cadena.isBlank()&&cadena.length()<longitudMax); //True si esta vacio o contiene espacios en blanco
    }//validarString

    public static Clase09_Categorias checkCategorias(String entCat) {
        Clase09_Categorias categoria=null;
        char carac=' ';
        if(entCat.length()==1) {
            carac=entCat.charAt(0);
        }
        // if(entCat.equals(Clase09_Categorias.CATA.getDesc().toLowerCase())||carac=='1'||carac==Clase09_Categorias.CATA.name().charAt(Clase09_Categorias.CATA.name().length()-1)) {}
        if(entCat.equals(Clase09_Categorias.CATA.getDesc().toLowerCase())||carac=='1'||carac=='a') {
            categoria=Clase09_Categorias.CATA;
        } else if(entCat.equals(Clase09_Categorias.CATB.getDesc().toLowerCase())||carac=='2'||carac=='b') {
            categoria=Clase09_Categorias.CATB;
        } else if(entCat.equals(Clase09_Categorias.CATC.getDesc().toLowerCase())||carac=='3'||carac=='c') {
            categoria=Clase09_Categorias.CATC;
        }
        return categoria;
    }//checkCategorias

}//class
