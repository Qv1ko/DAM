package unidad7.ejercicios.ejercicio2_pcproductos;

import java.util.Comparator;

public class OrdenProductos implements Comparator<Productos> {

    public int compare(Productos obj1, Productos obj2) {
        return Float.compare(obj1.getPrecio(), obj2.getPrecio());
    }
    
}
