package unidad5.ejercicios.ejercicio4_Fiestas;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class FiestasPopulares {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Fiestas> fiestas=new ArrayList<Fiestas>();
        String nombre="",localidad="";
        LocalDate fechaInicio=null,fechaFin=null;
        boolean error=false;
        for(int i=0;i<5;i++) {
            do {
                System.out.print("\nNombre de la "+(fiestas.size()+1)+"º fiesta popular: ");
                nombre=sc.nextLine();
                System.out.print("Localidad de la "+(fiestas.size()+1)+"º fiesta popular: ");
                localidad=sc.nextLine();
                try {
                    System.out.print("Fecha de inicio de la "+(fiestas.size()+1)+"º fiesta popular: ");
                    fechaInicio=LocalDate.parse(sc.nextLine());
                    System.out.print("Fecha de fin de la "+(fiestas.size()+1)+"º fiesta popular: ");
                    fechaFin=LocalDate.parse(sc.nextLine());
                    fiestas.add(new Fiestas(nombre,localidad,fechaInicio,fechaFin));
                    error=false;
                } catch(DateTimeParseException exc) {
                    System.out.println("\nError - Introduce la fecha correctamente con formato (yyyy-mm-dd)\n");
                    error=true;
                }
            } while(error);
        }
        for(Fiestas fiesta:fiestas) {
            System.out.println(fiesta);
        }
        sc.close();
    }//main

}//class