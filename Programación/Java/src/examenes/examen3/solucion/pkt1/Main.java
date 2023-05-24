package examenes.examen3.solucion.pkt1;

import java.util.ArrayList;

import examenes.examen3.solucion.pkt2.ClaseExterna;

public class Main {

    public static void main(String[] args) {
        ArrayList<Empleados> misMinions=new ArrayList<Empleados>();
        Empleados masNomina=new Empleados();
        misMinions.add(new Empleados("99999999R","Pepe Perez",ClaseExterna.getCargo(),1993,2300.44f));
        misMinions.add(new Empleados("99999999R","Luisa Perez",ClaseExterna.getCargo(),2015,1334.44f));
        misMinions.add(new Empleados("99999999R","Maria Perez",ClaseExterna.getCargo(),2001,1111.44f));
        misMinions.add(new Empleados("99999999R","Jose Perez",ClaseExterna.getCargo(),2022,999.44f));
        misMinions.add(new Empleados("99999999R","Luis Perez",ClaseExterna.getCargo(),2014,3456.44f));
        misMinions.add(new Empleados("99999999R","Felisa Perez",ClaseExterna.getCargo(),1999,1200.44f));
        for(Empleados viejuno:misMinions) {
            if(viejuno.getExperiencia()>10) {
                System.out.println(viejuno);
            }
            if(viejuno.getNomina()>masNomina.getNomina()) {
                masNomina=viejuno;
            }
        }
        System.out.println("El empleado con mas nomina es "+masNomina);
    }//main
    
}//class