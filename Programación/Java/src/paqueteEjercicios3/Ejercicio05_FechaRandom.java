package paqueteEjercicios3;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio05_FechaRandom {
    
    public static void main(String[] args) {
            System.out.println("La fecha aleatorio es "+genFecha());
            System.out.println("La fecha aleatorio es "+genFechaDF());
    }//main

    private static LocalDate genFecha() {
        LocalDate fecha=null;
        boolean flag=false;
        do {
            try {
                fecha=LocalDate.of((int)(Math.random()*(LocalDate.now().getYear())+1),(int)(Math.random()*12)+1,(int)(Math.random()*31)+1);
                flag=false;
            } catch(DateTimeException exc) {
                System.out.println("\tFecha erronea");
                flag=true;
            }
        } while(flag);
        return fecha;
    }//genFecha

    private static String genFechaDF() {
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        int dia=0,mes=0,ano=0;
        LocalDate fecha=null,leapValidator=null;
        boolean flag=false;
        do {
            try {
                dia=(int)(Math.random()*31)+1;
                mes=(int)(Math.random()*12)+1;
                ano=(int)(Math.random()*(LocalDate.now().getYear())+1);
                leapValidator=LocalDate.of(ano,1,1);
                if(dia>28&&mes==2) {
                    throw new Exception("\tFecha erronea");
                } else if(dia>29&&mes==2&&leapValidator.isLeapYear()) {
                    throw new Exception("\tFecha erronea");
                } else if(dia>30&&(mes==4||mes==6||mes==9||mes==11)) {
                    throw new Exception("\tFecha erronea");
                }
                fecha=LocalDate.parse((((Integer.toString(dia).length()==2)? Integer.toString(dia):("0"+dia))+"/"+((Integer.toString(mes).length()==2)? Integer.toString(mes):("0"+mes))+"/"+((Integer.toString(ano).length()==4)? Integer.toString(ano):(Integer.toString(ano).length()==3)? ("0"+ano):(Integer.toString(ano).length()==2)? ("00"+ano):("000"+ano))),df);
                flag=false;
            } catch(Exception exc) {
                System.out.println(exc.getMessage());
                flag=true;
            }
        } while(flag);
        return fecha.format(df);
    }//genFechaDF

}//class