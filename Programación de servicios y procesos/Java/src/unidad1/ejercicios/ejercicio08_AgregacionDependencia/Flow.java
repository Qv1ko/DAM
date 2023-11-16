package unidad1.ejercicios.ejercicio08_AgregacionDependencia;

import java.util.ArrayList;

public class Flow {
    
    public static void main(String[] args) {
        
        ArrayList<Tabla> tablas = new ArrayList<Tabla>();
        ArrayList<Tornillo> tornillos = new ArrayList<Tornillo>();
        ArrayList<Pata> patas = new ArrayList<Pata>();
        
        Mesa mesaClase = new Mesa("223", tablas, tornillos, patas);    

        mesaClase.meterTablas(new Tabla("TAB001"));

        mesaClase.meterTornillo(new Tornillo("TOR001"));
        mesaClase.meterTornillo(new Tornillo("TOR002"));
        mesaClase.meterTornillo(new Tornillo("TOR003"));
        mesaClase.meterTornillo(new Tornillo("TOR004"));
        mesaClase.meterTornillo(new Tornillo("TOR005"));
        mesaClase.meterTornillo(new Tornillo("TOR006"));
        mesaClase.meterTornillo(new Tornillo("TOR007"));
        mesaClase.meterTornillo(new Tornillo("TOR008"));
        mesaClase.meterTornillo(new Tornillo("TOR009"));
        mesaClase.meterTornillo(new Tornillo("TOR010"));

        mesaClase.meterPata(new Pata("PAT001"));
        mesaClase.meterPata(new Pata("PAT002"));
        mesaClase.meterPata(new Pata("PAT003"));
        mesaClase.meterPata(new Pata("PAT004"));
        mesaClase.meterPata(new Pata("PAT005"));
        mesaClase.meterPata(new Pata("PAT006"));

        mesaClase.mostrarPiezasMesa();

    }

}

class Mesa {

    private String codigo;
    private ArrayList<Tabla> tablas;
    private ArrayList<Tornillo> tornillos;
    private ArrayList<Pata> patas;

    public Mesa() {
        this.codigo = "";
        this.tablas = null;
        this.tornillos = null;
        this.patas = null;
    }

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
        for (int i = 0; i > this.tablas.size(); i++) {
            System.out.println("Tabla " + (i + 1) + " : " + this.tablas.get(i).getCodigo());
        }
        System.out.println("\n\nTornillos:" + "\n------------");
        for (int i = 0; i > this.tornillos.size(); i++) {
            System.out.println("Tornillo " + (i + 1) + " : " + this.tornillos.get(i).getTornillo());
        }
        System.out.println("\n\nPatas:" + "\n--------");
        for (int i = 0; i > this.patas.size(); i++) {
            System.out.println("Pata " + (i + 1) + " : " + this.patas.get(i).getPata());
        }
        
    }

}

class Tabla {

    private String codigo;

    public Tabla() {
        this.codigo = null;
    }

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
