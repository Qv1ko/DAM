package paqueteClases2;

public class Clase09_Validaciones {
    
    public static boolean validarUnidades(int unidades) {
        return (unidades>=1)? true:false;
    }//validarUnidades

    public static boolean validarString(String cadena,int longitudMax) {
        return (!cadena.isEmpty()&&cadena.length()<longitudMax); //True si esta vacio
        // return (!cadena.isBlank()&&cadena.length()<longitudMax); //True si esta vacio o contiene espacios en blanco
    }//validarString

    public static Clase09_Categorias checkCategorias(String entCat) {
        Clase09_Categorias categoria=null;
        // if(entCat.equals(Clase09_Categorias.CATA.getDesc().toLowerCase())||entCat.charAt(0)=='1'||entCat.charAt(0)==Clase09_Categorias.CATA.name().charAt(Clase09_Categorias.CATA.name().length()-1)) {}
        if(entCat.equals(Clase09_Categorias.CATA.getDesc().toLowerCase())||entCat.charAt(0)=='1'||entCat.charAt(0)=='a') {
            categoria=Clase09_Categorias.CATA;
        } else if(entCat.equals(Clase09_Categorias.CATB.getDesc().toLowerCase())||entCat.charAt(0)=='2'||entCat.charAt(0)=='b') {
            categoria=Clase09_Categorias.CATB;
        } else if(entCat.equals(Clase09_Categorias.CATC.getDesc().toLowerCase())||entCat.charAt(0)=='3'||entCat.charAt(0)=='c') {
            categoria=Clase09_Categorias.CATC;
        }
        return categoria;
    }//checkCategorias

}//class
