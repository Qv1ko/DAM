package unidad1.ejercicios.ejercicio01_CastingBasico;

public class TableroCarpinteria {
    
    protected int largo, ancho;

    protected TableroCarpinteria() {
        this.largo = 1;
        this.ancho = 1;
    }

    protected TableroCarpinteria(int largo, int ancho) {
        this.largo = valor(largo);
        this.ancho = valor(ancho);
    }

    protected int getLargo() {
        return largo;
    }

    protected void setLargo(int largo) {
        this.largo = valor(largo);
    }

    protected int getAncho() {
        return ancho;
    }

    protected void setAncho(int ancho) {
        this.ancho = valor(ancho);
    }

    private int valor(int metros) {
        return (metros > 0) ? metros : 1;
    }

    protected int area() {
        return getLargo() * getAncho();
    }
    
}
