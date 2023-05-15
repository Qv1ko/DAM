package unidad7.ejercicios.ejercicio02_PcProductos;

public class Productos implements Mostrable, Comparable<Productos> {

    private String nombre;
    private float precio;

    protected Productos() {
        this.nombre = "no definido";
        this.precio = 0;
    }

    protected Productos(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    protected float getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String verFicha() {
        return "Producto: " + this.nombre + "\n\sPrecio: " + this.precio;
    }

    public float calcTasa() {
        return 0.0f;
    }

    public int compareTo(Productos obj) {
        return this.getNombre().compareTo(obj.getNombre());
    }

}