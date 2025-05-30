package unidad4.ejercicios.ejercicio2_radio;

import java.util.Scanner;

public class Sincronizador {

    public static void main(String[] args) {
        Radio emisora=new Radio(90.8);
        Scanner ent=new Scanner(System.in);
        int opcion=0;
        do {
            System.out.print("(1) Subir frecuencia | (2) Bajar frecuencia | (3) Salir\nSelecciona una opcion: ");
            opcion=ent.nextInt();
            if(opcion==1) {
                emisora.subirSintonia();
            } else if(opcion==2) {
                emisora.bajarSintonia();
            } else {
                continue;
            }
            System.out.println(emisora);
        } while(opcion!=3);
        ent.close();
    }//main

}//class
