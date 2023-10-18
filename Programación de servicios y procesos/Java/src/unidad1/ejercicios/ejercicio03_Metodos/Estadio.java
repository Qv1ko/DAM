package unidad1.ejercicios.ejercicio03_Metodos;

public class Estadio {
    
    private int total;

    public Estadio() {
        this(0); // Estadio(0)
    }

    public Estadio(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
