package unidad2.ejercicios.ejercicio3_repaso;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner ent=new Scanner(System.in);
        int entInf=0,entAdul=0;

        System.out.print("Escriba el numero de entradas infantiles: ");
        entInf=ent.nextInt();
        System.out.print("Escriba el numero de entradas de adulto: ");
        entAdul=ent.nextInt();

        System.out.print("El importe total es de "+importe(entInf,entAdul)+" euros");

        ent.close();

    } //fin main

    public static float importe(int inf,int adul) {

        float imp=(float)((inf*10)+(adul*15));
        return ((imp>100)? (imp-(imp/10)):imp);

    } //fin importe
    
} //fin class