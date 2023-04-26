package examenes.examen3.pkt1;

import java.util.ArrayList;

import examenes.examen3.pkt2.ClaseExterna;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<Empleados> empleados=new ArrayList<Empleados>();
        empleados.add(new Empleados("12346788T","Victor Garcia",ClaseExterna.cargoRandom(),2018,1200.5f));
        empleados.add(new Empleados("99999999R","Juan Fernandez",ClaseExterna.cargoRandom(),2007,1100));
        empleados.add(new Empleados("12345093L","Manuel Rodrigez",ClaseExterna.cargoRandom(),2014,1085));
        empleados.add(new Empleados("73003057E","Andres Calleja",ClaseExterna.cargoRandom(),2011,1235.83f));
        empleados.add(new Empleados("14611671K","Ana Pascual",ClaseExterna.cargoRandom(),2000,1048.59f));
        empleados.add(new Empleados("18317922E","Rodrigo Diaz",ClaseExterna.cargoRandom(),2020,1188.75f));
        antiguosEmpleados(empleados);
        maxNomina(empleados);
    }//main

    public static void antiguosEmpleados(ArrayList<Empleados> empleados) {
        ArrayList<Empleados> antiguos=new ArrayList<Empleados>();
        for(Empleados empleado:empleados) {
            if(empleado.getAnoActual()-empleado.getAnoAlta()>9) {
                antiguos.add(empleado);
            }
        }
        System.out.println("\n\nEmpleados con más de 10 años en la empresa:\n");
        for(Empleados empleado: antiguos) {
            System.out.println(empleado);
        }
    }//antiguosEmpleados

    public static void maxNomina(ArrayList<Empleados> empleados) {
        Empleados maximaNomina=new Empleados();
        for(Empleados empleado:empleados) {
            maximaNomina=(empleado.getNomina()>maximaNomina.getNomina())? empleado:maximaNomina;
        }
        System.out.println("\nEmpleado con la nómina más alta:\n");
        System.out.println(maximaNomina);
    }//maxNomina

}//class