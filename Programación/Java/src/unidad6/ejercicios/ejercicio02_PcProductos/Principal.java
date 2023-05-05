package unidad6.ejercicios.ejercicio02_PcProductos;

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
