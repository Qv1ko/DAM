package unidad1.ejercicios.ejercicio05_Overriding;

class Flow {

    public static void main(String[] args) {
        
        AulaInformatica obj = new AulaInformatica();

        obj.setNumeroPlazas(24);
        obj.setHabilitada(true);

        obj.imprimirEstado();

        obj.setOcupada(true);

        obj.imprimirEstado();

    }

}

class Aula {

    private int numeroPlazas = 0;
    private boolean disponible = false;
    public boolean ocupada = false;
    
    public Aula() {

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

    public boolean estaDisponible() {
        return this.disponible;
    }

    public void imprimirEstado() {
        String estado = (getNumeroPlazas() > 0 && !getOcupada()) ? "está disponible" : "no está disponible";
        System.out.println("El aula " + estado);
    }    
    
}

class AulaInformatica extends Aula {

    private boolean habilitada = false;

    public boolean getHabilitada() {
        return this.habilitada;
    }

    public void setHabilitada(boolean habilitada) {
        this.habilitada = habilitada;
    }

    public boolean estaDisponible() {
        return super.getDisponible();
    }

    public void imprimirEstado() {
        String estado = (super.getNumeroPlazas() > 0 && !getOcupada() && getDisponible()) ? "está disponible" : "no está disponible";
        System.out.println("El aula de informática " + estado);
    } 

}
