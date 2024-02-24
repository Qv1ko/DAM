package unidad1.ejercicios.ejercicio8_AgregacionDependencia;

class TablaDescripcion {

    private Tabla codigo;
    private double largo, ancho;
    public double grosor;

    public TablaDescripcion() {
        this.codigo = new Tabla("");
        this.largo = 0;
        this.ancho = 0;
        this.grosor = 0;
    }

    public TablaDescripcion(String codigo, double largo, double ancho, double grosor) {
        this.codigo = new Tabla(codigo);
        this.largo = largo;
        this.ancho = ancho;
        this.grosor = grosor;
    }

    public Tabla getCodigo() {
        return codigo;
    }

    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

    public double getGrosor() {
        return grosor;
    }

    public void setCodigo(Tabla codigo) {
        this.codigo = codigo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setGrosor(double grosor) {
        this.grosor = grosor;
    }

    public String toString() {
        return "";
    }

    public void mostrar() {
        System.out.println("\n\nDescripción de la tabla" + "\n-------------------------" + "\n\nCódigo: " + getCodigo() + "\n\nLargo: "+ getLargo() + "\n\nAncho: " + getAncho() + "\n\nGrosor: " + getGrosor());
    }

}
