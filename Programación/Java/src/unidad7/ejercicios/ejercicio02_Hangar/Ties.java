package unidad7.ejercicios.ejercicio02_Hangar;

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
        return "Nave con matricula " + super.getMatricula() + " del bando " + (super.isImperio() ? "imperial" : "rebelde") + " tipo TIE con " + cilindrada + " cc";
    }

    public String toFile() {
        return "t;"+super.toFile()+getCilindrada();
    }

    public float getTotal() {
        return (isImperio()) ? getCilindrada() * IMP : getCilindrada() * REB;
    }

}
