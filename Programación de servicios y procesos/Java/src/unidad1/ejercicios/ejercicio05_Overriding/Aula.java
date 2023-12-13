package unidad1.ejercicios.ejercicio05_Overriding;

abstract class Aula {

    private int numeroPlazas;
    private boolean disponible;
    public boolean ocupada;

    public Aula() {

        this.numeroPlazas = 0;
        this.disponible = false;
        this.ocupada = false;

    }

    public int getNumeroPlazas() {
        return this.numeroPlazas;
    }

    public void setNumeroPlazas(int plazas) {
        this.numeroPlazas = plazas;
    }

    public boolean getOcupada() {
        return this.ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean estaDisponible;

    public void imprimirEstado() {
        System.out.println((getNumeroPlazas() > 0 && !getOcupada()) ? "El aula está disponible" : "El aula no está disponible");
    }

}
