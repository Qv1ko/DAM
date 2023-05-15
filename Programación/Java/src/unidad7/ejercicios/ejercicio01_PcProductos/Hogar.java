package unidad7.ejercicios.ejercicio01_PcProductos;

public class Hogar extends Productos {

    private boolean eficiente;

    public Hogar() {
        super();
        this.eficiente = false;
    }

    protected Hogar(String nombre, float precio, boolean eficiente) {
        super(nombre, precio);
        this.eficiente = eficiente;
    }

    public String verFicha() {
        return super.verFicha() + "\n\sEficiencia: " + ((this.eficiente) ? "producto eficiente a " : "producto no eficiente a ") + (getPrecio() + calcTasa()) + " euros";
    }

    public float calcTasa() {
        return (this.eficiente) ? 0.0f : (getPrecio() * TASA / 100);
    }

}
