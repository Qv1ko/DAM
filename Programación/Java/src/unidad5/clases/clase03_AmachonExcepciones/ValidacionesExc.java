package unidad5.clases.clase03_AmachonExcepciones;

import unidad4.clases.clase03_Amachon.Categorias;

public class ValidacionesExc {
        
    public static void validarAbs(float valor) throws Exception {
        if(valor<=0) {
            throw new Exception("La cantidad ha de ser mayor que cero");
        }
    }//validarAbs

    public static void validarAbs(double valor) throws Exception {
        if(valor<=0) {
            throw new Exception("El precio ha de ser mayor que cero");
        }
    }//validarAbs

    public static boolean validarString(String cadena,int longitudMax) {
        return (!cadena.isEmpty()&&cadena.length()<longitudMax); //True si esta vacio
        // return (!cadena.isBlank()&&cadena.length()<longitudMax); //True si esta vacio o contiene espacios en blanco
    }//validarString

    public static Categorias checkCategorias(String entCat) {
        Categorias categoria=null;
        char carac=' ';
        if(entCat.length()==1) {
            carac=entCat.charAt(0);
        }
        // if(entCat.equals(Clase09_Categorias.CATA.getDesc().toLowerCase())||carac=='1'||carac==Clase09_Categorias.CATA.name().charAt(Clase09_Categorias.CATA.name().length()-1)) {}
        if(entCat.equals(Categorias.CATA.getDesc().toLowerCase())||carac=='1'||carac=='a') {
            categoria=Categorias.CATA;
        } else if(entCat.equals(Categorias.CATB.getDesc().toLowerCase())||carac=='2'||carac=='b') {
            categoria=Categorias.CATB;
        } else if(entCat.equals(Categorias.CATC.getDesc().toLowerCase())||carac=='3'||carac=='c') {
            categoria=Categorias.CATC;
        }
        return categoria;
    }//checkCategorias

}//class
