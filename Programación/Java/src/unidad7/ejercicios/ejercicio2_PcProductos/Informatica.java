package unidad7.ejercicios.ejercicio2_PcProductos;

public class Informatica extends Productos {

    private String so;

    protected Informatica() {
        super();
        this.so = "FreeDOS";
    }

    protected Informatica(String nombre, float precio, String so) {
        super(nombre, precio);
        this.so = so;
    }

    protected String getSo() {
        return so;
    }

}
