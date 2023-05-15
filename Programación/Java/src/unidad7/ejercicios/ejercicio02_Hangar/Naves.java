package unidad7.ejercicios.ejercicio02_Hangar;

public class Naves {

    private String matricula;
    private boolean imperio;

    protected Naves() {
        this.matricula = "";
        this.imperio = false;
    }

    protected Naves(String matricula, boolean imperio) {
        this.matricula = matricula;
        this.imperio = imperio;
    }

    protected String getMatricula() {
        return matricula;
    }

    protected boolean isImperio() {
        return imperio;
    }

    protected void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    protected void setImperio(boolean imperio) {
        this.imperio = imperio;
    }

    public String toFile() {
        return getMatricula()+";"+isImperio()+";";
    }

}
