package unidad1.ejercicios.ejercicio08_AgregacionDependencia;

import static org.junit.Assert.assertNotEquals;

public class Flow {
    
    public static void main(String[] args) {
        
    }

}

class Tabla {

    private String codigo;

    public Tabla(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    

}

class TablaDescripcion {

    private Tabla codigo;
    private double largo, ancho;
    public double grosor;

    TablaDescripcion() {
        this.codigo = new Tabla("");
        this.largo = 0;
        this.ancho = 0;
        this.grosor = 0;
    }

    TablaDescripcion(String codigo, double largo, double ancho, double grosor) {
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
        System.out.println();
    }

}
