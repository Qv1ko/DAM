package unidad7.ejercicios.ejercicio01_PcProductos;

public class Portatil extends Informatica {

    private float pulgadas;

    public Portatil() {
        super();
        this.pulgadas = 0.0f;
    }

    public Portatil(String nombre, float precio, String so, float pulgadas) {
        super(nombre, precio, so);
        this.pulgadas = pulgadas;
    }

    public String verFicha() {
        return super.verFicha() + "\n\sSistema Operativo: " + getSo() + "\n\sPulgadas: " + this.pulgadas;
    }

    public float calcTasa() {
        return 0 * TASA;
    }

}
