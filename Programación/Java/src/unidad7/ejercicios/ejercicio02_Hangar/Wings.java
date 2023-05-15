package unidad7.ejercicios.ejercicio02_Hangar;

public class Wings extends Naves implements Tasas {

    private int motores;

    protected Wings() {
        super();
        this.motores = 1;
    }

    protected Wings(String matricula, boolean imperio, int motores) {
        super(matricula, imperio);
        this.motores = motores;
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public String toString() {
        return "Nave con matricula " + super.getMatricula() + " del bando " + (super.isImperio() ? "imperial" : "rebelde") + " tipo Wing con " + motores + " motores";
    }

    public String toFile() {
        return "w;"+super.toFile()+getMotores();
    }

    public float getTotal() {
        return (isImperio()) ? getMotores() * IMP : getMotores() * REB;
    }

}
