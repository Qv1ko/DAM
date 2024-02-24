package unidad1.ejercicios.ejercicio8_AgregacionDependencia;

import java.util.ArrayList;

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
