package unidad1.ejercicios.ejercicio05_Overriding;

class AulaInformatica extends Aula {

    private boolean habilitada;

    public AulaInformatica() {
        super();
        this.habilitada = false;
    }

    public boolean getHabilitada() {
        return this.habilitada;
    }

    public void setHabilitada(boolean habilitada) {
        this.habilitada = habilitada;
    }

    public boolean estaDisponible() {

        if (super.getNumeroPlazas() > 0 && !super.getOcupada() && getHabilitada()) {
            super.setDisponible(true);
        } else {
            super.setDisponible(false);
        }

        return super.getDisponible();

    }

    @Override
    public void imprimirEstado() {
        System.out.println((getNumeroPlazas() > 0 && !getOcupada() && getHabilitada()) ? "El aula de informática está disponible" : "El aula de informática no está disponible");
    }

}
