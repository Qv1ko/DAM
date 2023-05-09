package unidad6.ejercicios.ejercicio02_PcProductos;

import java.util.HashMap;
import java.util.Map;

public class Mapeado {

    public static void main(String[] args) {
        Sobremesa nzxt = new Sobremesa("Pepino Gaming", 23335.95f, "Windows 11", "ATX");
        Portatil msi = new Portatil("MSI Force One", 1200.00f, "Sin SO", 13.5f);
        Hogar lavadora = new Hogar("Siemens", 550.55f, true);
        Hogar lavavajillas = new Hogar("Balay", 200f, false);

        Map<String, Productos> lista = new HashMap<String, Productos>();
        // HashMap<String, Productos> map = new HashMap<String, Productos>();

        lista.put("nzxt", nzxt);
        lista.put("msi", msi);
        lista.put("siemens", lavadora);
        lista.put("balay", lavavajillas);
        
        System.out.println(lista.get("msi").verFicha());

        Map<Integer, Productos> mapa = new HashMap<Integer, Productos>();

        mapa.put(1, nzxt);
        mapa.put(2, msi);
        mapa.put(3, lavadora);
        mapa.put(4, lavavajillas);
        
        for(Integer s : mapa.keySet()) {
            System.out.println(mapa.get(s).verFicha());
        }

    }

}
