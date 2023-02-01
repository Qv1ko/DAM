package paqueteClases2;

import java.util.ArrayList;

/**
 * @author Victor
 * @version 1.0
 */

public class Clase09_CestaAmachon {
    
    public static void main(String[] args) {
        //Declaramos una lista de tipo ArrayList
        ArrayList<Clase09_Productos> lista=new ArrayList<Clase09_Productos>();
        Clase09_Productos colchon=new Clase09_Productos("Colchon","Muy comodo",Clase09_Categorias.CATB,5,650.95);
        // colchon.setNombre("Buen colchon");
        lista.add(colchon);
        //Tamano de la lista
        System.out.println(lista.size());
        //Valor de la lista
        System.out.println(lista.get(0).toString());
        //(0) Salir,(1) Listar productos, (2) Anadir, (3) Eliminar, (4) Modificar producto, (5) Mistery box
    }//main

}//class
