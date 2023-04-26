package examenes.examen3.pkt1;

import java.util.ArrayList;

import examenes.examen3.pkt2.SolucionClaseExterna;

public class SolucionMain {

    public static void main(String[] args) {
        ArrayList<SolucionEmpleados> misMinions=new ArrayList<SolucionEmpleados>();
        SolucionEmpleados masNomina=new SolucionEmpleados();
        misMinions.add(new SolucionEmpleados("99999999R","Pepe Perez",SolucionClaseExterna.getCargo(),1993,2300.44f));
        misMinions.add(new SolucionEmpleados("99999999R","Luisa Perez",SolucionClaseExterna.getCargo(),2015,1334.44f));
        misMinions.add(new SolucionEmpleados("99999999R","Maria Perez",SolucionClaseExterna.getCargo(),2001,1111.44f));
        misMinions.add(new SolucionEmpleados("99999999R","Jose Perez",SolucionClaseExterna.getCargo(),2022,999.44f));
        misMinions.add(new SolucionEmpleados("99999999R","Luis Perez",SolucionClaseExterna.getCargo(),2014,3456.44f));
        misMinions.add(new SolucionEmpleados("99999999R","Felisa Perez",SolucionClaseExterna.getCargo(),1999,1200.44f));
        for(SolucionEmpleados viejuno:misMinions) {
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