package unidad1.ejercicios.ejercicio8_AgregacionDependencia;

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
