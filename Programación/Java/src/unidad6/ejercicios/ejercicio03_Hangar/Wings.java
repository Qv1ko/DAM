package unidad6.ejercicios.ejercicio03_Hangar;

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
        return super.toString() + "Wing [motores=" + motores + "]";
    }

    public String toFile() {
        return "t;"+super.toFile()+motores;
    }

    public float getTotal() {
        return (isImperio()) ? getMotores() * IMP : getMotores() * REB;
    }

}
