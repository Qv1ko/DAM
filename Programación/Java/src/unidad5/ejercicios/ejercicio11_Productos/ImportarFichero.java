package unidad5.ejercicios.ejercicio11_Productos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ImportarFichero {
    
    public static void main(String[] args) {
        ArrayList<Productos> lista=new ArrayList<Productos>();
        FileReader fr=null;
        BufferedReader br=null;
        // String linea="";
        // String[] producto=null;
        // Ejercicio10_Productos prod=null;
        int linea=1;
        try {
            fr=new FileReader(new File("Programación\\Java\\src\\unidad5\\ejercicios\\ejercicio11_Productos\\productos.csv"));
            br=new BufferedReader(fr);
            br.readLine();
            while(br.ready()) {//Se ejecutara mientras el buffer este listo
                // linea=br.readLine();
                // producto=linea.split(";");
                // prod=new Ejercicio10_Productos(producto[0],producto[1],Integer.parseInt(producto[2]),Double.parseDouble(producto[3]));
                linea++;
                try {
                    lista.add(new Productos(br.readLine()));//Pasamos una cadena de texto que se añadira al arrayList
                } catch(NumberFormatException exc) {
                    System.out.println("\n! Los valores de la linea "+linea+" del fichero son incorrectos\n");
                } catch(Exception exc) {
                    System.out.println("\n! Error en la linea: "+linea+"\n");
                }
            }
            System.out.println(lista.size()+" productos importados");
            for(Productos producto:lista) {
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
