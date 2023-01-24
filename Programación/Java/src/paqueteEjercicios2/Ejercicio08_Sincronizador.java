package paqueteEjercicios2;

import java.util.Scanner;

public class Ejercicio08_Sincronizador {

    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);
        int opcion=0;
        System.out.print("Seleccione una frecuencia de inicio (80-180): ");
        Ejercicio08_Radio frequencia=new Ejercicio08_Radio(ent.nextDouble());
        do {
            System.out.print("(1) Subir frecuencia | (2) Bajar frecuencia | (3) Salir\nSelecciona una opcion: ");
            opcion=ent.nextInt();
            if(opcion==1) {
                frequencia.subirSintonia();
            } else if(opcion==2) {
                frequencia.bajarSintonia();
            } else {
                continue;
            }
            System.out.println(frequencia);
        } while(opcion!=3);
        ent.close();
    }//main

}//class
