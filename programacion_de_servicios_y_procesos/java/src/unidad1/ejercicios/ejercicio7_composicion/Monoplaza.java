package unidad1.ejercicios.ejercicio7_composicion;

class Monoplaza {

    private double largo, ancho, alto;
    private int peso;

    Monoplaza() {
        this.largo = 0;
        this.ancho = 0;
        this. alto = 0;
        this.peso = 0;
    }

    Monoplaza(double largo, double ancho, double alto, int peso) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.peso = peso;
    }

    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }
    
    public double getAlto() {
        return alto;
    }
    
    public int getPeso() {
        return peso;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public String toString() {
        return "Monoplaza de (" + getLargo() + ", " + getAncho() + ", " + getAlto() + ") con un peso de " + getPeso() + " Kg";
    }

    public void mostrar() {
        System.out.println(this.toString());
    }

}
