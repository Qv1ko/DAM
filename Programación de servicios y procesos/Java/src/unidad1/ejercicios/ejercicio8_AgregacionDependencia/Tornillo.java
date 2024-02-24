package unidad1.ejercicios.ejercicio8_AgregacionDependencia;

class Tornillo {

    private String codigo;

    public Tornillo() {
        this.codigo = null;
    }

    public Tornillo(String codigo) {
        this.codigo = codigo;
    }

    public String getTornillo() {
        return codigo;
    }

    public void setTornillo(String codigo) {
        this.codigo = codigo;
    }

}
