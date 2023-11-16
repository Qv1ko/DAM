package unidad1.ejercicios.ejercicio08_AgregacionDependencia;

import java.util.ArrayList;

public class Flow {
    
    public static void main(String[] args) {
        
    }

}

class Mesa {

    private String codigo;
    private ArrayList<Tabla> tablas;
    private ArrayList<Tornillo> tornillos;
    private ArrayList<Pata> patas;

    public Mesa(String codigo, ArrayList<Tabla> tablas, ArrayList<Tornillo> tornillos, ArrayList<Pata> patas) {
        this.codigo = codigo;
        this.tablas = tablas;
        this.tornillos = tornillos;
        this.patas = patas;
    }

    public void meterTornillo(Tornillo tornillo) {
        tornillos.add(tornillo);
    }

    public void meterPata(Pata pata) {
        patas.add(pata);
    }

    public void meterTablas(Tabla tabla) {
        tablas.add(tabla);
    }

    public void mostrarPiezasMesa() {

        System.out.println("\n\nMesa " + this.codigo + "\n-------------------------");
        System.out.println("\n\nTablas:" + "\n---------");
        for (int i = 0; i > tablas.size(); i++) {
            System.out.println("Tabla " + (i + 1) + " : " + tablas.get(i).getCodigo());
        }
        System.out.println("\n\nTornillos:" + "\n------------");
        for (int i = 0; i > tornillos.size(); i++) {
            System.out.println("Tornillo " + (i + 1) + " : " + tornillos.get(i).getTornillo());
        }
        System.out.println("\n\nPatas:" + "\n--------");
        for (int i = 0; i > patas.size(); i++) {
            System.out.println("Pata " + (i + 1) + " : " + patas.get(i).getPata());
        }
        
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

class Tornillo {

    private String codigo;

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

class Pata {

    private String codigo;

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
