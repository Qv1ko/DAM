package unidad6.ejercicios.ejercicio03_Hangar;

public class Ties extends Naves implements Tasas {

    private float cilindrada;

    protected Ties() {
        super();
        this.cilindrada = 0.0f;
    }

    protected Ties(String matricula, boolean imperio, float cilindrada) {
        super(matricula, imperio);
        this.cilindrada = cilindrada;
    }

    protected float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String toString() {
        return super.toString() + "Tie [cilindrada=" + cilindrada + "]";
    }

    public String toFile() {
        return super.toFile()+cilindrada;
    }

    public float getTotal() {
        return (isImperio()) ? getCilindrada() * IMP : getCilindrada() * REB;
    }

}
