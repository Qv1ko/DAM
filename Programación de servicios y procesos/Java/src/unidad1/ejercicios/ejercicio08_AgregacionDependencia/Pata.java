package unidad1.ejercicios.ejercicio08_AgregacionDependencia;

class Pata {

    private String codigo;

    public Pata() {
        this.codigo = null;
    }

    public Pata(String codigo) {
        this.codigo = codigo;
    }

    public String getPata() {
        return codigo;
    }

    public void setPata(String codigo) {
        this.codigo = codigo;
    }

}
