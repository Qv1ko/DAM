package paqueteEjercicios3;

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
                fecha=LocalDate.of((int)(Math.random()*(LocalDate.now().getYear()+1)),(int)(Math.random()*12)+1,(int)(Math.random()*31)+1);
                if(fecha.getDayOfMonth()>28&&fecha.getMonth().getValue()==2) {
                    throw new Exception("\nFecha erronea\n");
                }
                flag=false;
            } catch(Exception exc) {
                System.out.println(exc.getMessage());
                flag=true;
            }
        } while(flag);
        return fecha;
    }//genFecha

}//class