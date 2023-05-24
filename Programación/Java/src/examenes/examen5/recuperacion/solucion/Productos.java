package examenes.examen5.recuperacion.solucion;

import java.text.DecimalFormat;

public class Productos {
    
    private String nombre, desc;
    private int cant;
    private float precio;

    protected Productos(String nombre, String desc, int cant, float precio) {
        this.nombre=nombre;
        this.desc=desc;
        this.cant=cant;
        this.precio=precio;
    }

    protected String getTotal() {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(cant*precio);
    }

    public String toString() {
        return "Productos [nombre=" + nombre + ", desc=" + desc + ", cant=" + cant + ", precio=" + precio + ", total=" + getTotal() + "]";
    }

}
