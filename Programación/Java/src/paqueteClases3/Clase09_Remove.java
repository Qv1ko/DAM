package paqueteClases3;

import java.util.ArrayList;

public class Clase09_Remove {
    
    public static void main(String[] args) {
        ArrayList<String> asignaturas=new ArrayList<String>();
        asignaturas.add("FOL");
        asignaturas.add("BBDD");
        asignaturas.add("PROG");
        asignaturas.add("LMSGI");
        asignaturas.add("SSII");
        asignaturas.add("EEDD");
        for(int i=0;i<asignaturas.size();i++) {
            if(asignaturas.get(i).equals("BBDD")) {
                asignaturas.remove("BBDD");
            }
            System.out.println(asignaturas.get(i));
        }
        //Va a dar error porque modificamos la lista del for each mientras esta se ejecuta
        for(String asig:asignaturas) {
            if(asig.equals("BBDD")) {
                asignaturas.remove(asig);
            }
            System.out.println(asig);
        }
    }//main

}//class