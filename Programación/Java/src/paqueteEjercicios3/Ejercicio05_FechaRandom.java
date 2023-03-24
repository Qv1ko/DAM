package paqueteEjercicios3;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Ejercicio05_FechaRandom {
    
    public static void main(String[] args) {
            System.out.println("La fecha aleatorio es "+genFecha());
    }//main

    private static LocalDate genFecha() {
        LocalDate fecha=null;
        boolean flag=false;
        do {
            try {
                fecha=LocalDate.of((int)(Math.random()*(LocalDate.now().getYear())+1),(int)(Math.random()*12)+1,(int)(Math.random()*31)+1);
                // if(fecha.getDayOfMonth()>28&&fecha.getMonth().getValue()==2) {
                //     throw new Exception("\tFecha erronea");
                // } else if(fecha.getDayOfMonth()>29&&fecha.getMonth().getValue()==2&&fecha.isLeapYear()) {
                //     throw new Exception("\tFecha erronea");
                // } else if(fecha.getDayOfMonth()>30&&(fecha.getMonth().getValue()==4||fecha.getMonth().getValue()==6||fecha.getMonth().getValue()==9||fecha.getMonth().getValue()==11)) {
                //     throw new Exception("\tFecha erronea");
                // }
                flag=false;
            // } catch(Exception exc) {
            //     System.out.println(exc.getMessage());
            //     flag=true;
            } catch(DateTimeException exc) {
                System.out.println("\tFecha erronea");
                flag=true;
            }
        } while(flag);
        return fecha;
    }//genFecha

}//class