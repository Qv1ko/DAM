package unidad1.ejercicios.ejercicio1_CastingBasico;

public class TableroFabrica {
    
    protected double largo, ancho;

    protected TableroFabrica() {
        this.largo = 0.1;
        this.ancho = 0.1;
    }

    protected TableroFabrica(double largo, double ancho) { 
        this.largo = valor(largo);
        this.ancho = valor(ancho);
    }

    protected double getLargo() {
        return largo;
    }

    protected void setLargo(double largo) {
        this.largo = valor(largo);
    }

    protected double getAncho() {
        return ancho;
    }

    protected void setAncho(double ancho) {
        this.ancho = valor(ancho);
    }

    private double valor(double metros) {
        return (metros > 0) ? metros : 0.1;
    }

    protected double area() {
        return getLargo() * getAncho();
    }

}
