package unidad1.ejercicios.ejercicio06_RepasoWeekend;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        int numbase=5,exp;
        int resultado=1;

        for(exp=3;exp>0;exp--) {
            resultado*=numbase;
        }
        System.out.println(resultado);

        long base=(long)(Math.random()*11), expo=(long)(Math.random()*11);
        long res=1;

        for(int i=1; i<=expo; i++) {
            res*=base;
        }
        System.out.println("Resultado de "+base+"^"+expo+" -> "+res);

    }//fin main

}//fin class
