package paqueteEjercicios3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ejercicio10_ImportarFichero {
    
    public static void main(String[] args) {
        ArrayList<Ejercicio10_Productos> lista=new ArrayList<Ejercicio10_Productos>();
        FileReader fr=null;
        BufferedReader br=null;
        // String linea="";
        // String[] producto=null;
        // Ejercicio10_Productos prod=null;
        int linea=1;
        try {
            fr=new FileReader(new File("C:\\Users\\Usuario\\DAM\\Programación\\Java\\src\\paqueteEjercicios3\\ejercicio10_fichero\\productos.csv"));
            br=new BufferedReader(fr);
            br.readLine();
            while(br.ready()) {//Se ejecutara mientras el buffer este listo
                // linea=br.readLine();
                // producto=linea.split(";");
                // prod=new Ejercicio10_Productos(producto[0],producto[1],Integer.parseInt(producto[2]),Double.parseDouble(producto[3]));
                linea++;
                try {
                    lista.add(new Ejercicio10_Productos(br.readLine()));//Pasamos una cadena de texto que se añadira al arrayList
                } catch(NumberFormatException exc) {
                    System.out.println("\n! Los valores de la linea "+linea+" del fichero son incorrectos\n");
                } catch(Exception exc) {
                    System.out.println("\n! Error en la linea: "+linea+"\n");
                }
            }
            System.out.println(lista.size()+" productos importados");
            for(Ejercicio10_Productos producto:lista) {
                System.out.println(producto.toString());
            }
            br.close();
        } catch(FileNotFoundException exc) {
            System.out.println("\n! El archivo no se ha encontrado\n");
        } catch(IOException exc) {
            System.out.println("\n! Error en la entrada o salida\n");
        }
    }//main

}//class
