package unidad3.clases;

import java.text.DecimalFormat;

public class Clase04_Redondeo {
    
    public static void main(String[] args) {
        double numero=Math.random()*101;
        System.out.println("Sin formato -> "+numero);
        //Formateador "%.Nf"
        System.out.printf("Con formato -> %.2f",numero);
        //df -> decimal format
        DecimalFormat df=new DecimalFormat("#.###");
        System.out.println("\nCon DecimalFormat -> "+ df.format(numero));
    }//main

}//class
