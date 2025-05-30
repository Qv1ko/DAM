package unidad7.ejercicios.ejercicio2_pcproductos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Principal {

    public static void main(String[] args) {
        Sobremesa nzxt = new Sobremesa("Pepino Gaming", 23335.95f, "Windows 11", "ATX");
        Portatil msi = new Portatil("MSI Force One", 1200.00f, "Sin SO", 13.5f);
        Hogar lavadora = new Hogar("Siemens", 550.55f, true);
        Hogar lavavajillas = new Hogar("Balay", 200f, false);

        ArrayList<Productos> lista = new ArrayList<Productos>();

        lista.add(nzxt);
        lista.add(msi);
        lista.add(lavadora);
        lista.add(lavavajillas);

        File directorio = new File("Programación\\Java\\src\\unidad7\\ejercicios\\ejercicio01_PcProductos\\backups");

        if (!directorio.exists()) {
            directorio.mkdir();
        }

        int contador = 0;
        BufferedWriter bw = null;
        // BufferedReader br = null;

        try {
            bw = new BufferedWriter(new FileWriter(new File(directorio + "\\listabk.dat")));
            while (contador < lista.size()) {
                bw.write(lista.get(contador).verFicha());
                contador++;
                bw.newLine();
            }
            bw.close();
            // for (Productos producto : lista) {
            //     bw.newLine();
            //     bw.write(producto.verFicha());
            //     bw.close();
            // }
        } catch (NullPointerException exc) {
            exc.getMessage();
        } catch (IOException exc) {
            exc.getMessage();
        }

        System.out.print("Desea eliminar todo S/N: ");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String res = br.readLine();
            if(res.equalsIgnoreCase("S") || res.equalsIgnoreCase("si")) {
                for(File fichero : directorio.listFiles()) {
                    fichero.delete();
                }
                directorio.delete();
            }
        } catch (Exception exc) {
            exc.getMessage();
        }

        for (Productos p : lista) {
            System.out.println(p.verFicha());
        }

        // System.out.println("*********************************************************");

        // System.out.println(lista[0].compareTo(msi));

        Collections.sort(lista, new OrdenProductos());

        for (Productos p : lista) {
            System.out.println(p.verFicha());
        }

    }

}
