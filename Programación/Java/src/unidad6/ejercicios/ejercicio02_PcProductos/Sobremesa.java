package unidad6.ejercicios.ejercicio02_PcProductos;

public class Sobremesa extends Informatica {

    private String caja;

    public Sobremesa() {
        super();
        this.caja = "ATX";
    }

    public Sobremesa(String nombre, float precio, String so, String caja) {
        super(nombre, precio, so);
        this.caja = caja;
    }

    public String verFicha() {
        return super.verFicha() + "\n\sSistema Operativo: " + getSo() + "\n\sTipo de caja: " + this.caja;
    }

    public float calcTasa() {
        return 0 * TASA;
    }

}
