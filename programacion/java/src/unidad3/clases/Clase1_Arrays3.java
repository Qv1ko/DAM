package unidad3.clases;

import java.util.Scanner;

public class Clase1_Arrays3 {

    public static void main(String[] args) {
        
        // int[] notas={5,8,2,7,6};
        String[] alumnos= {"Irene","German","Andres","Javier","Yoel"};
        String nombreABuscar="",salida="No existe";
        Scanner ent=new Scanner(System.in);

        System.out.print("Escribe el nombre del alumno: ");
        nombreABuscar=ent.nextLine();

        for(int i=0;i<alumnos.length;i++) {
            if(alumnos[i].equalsIgnoreCase(nombreABuscar)) {
                System.out.println("El nombre esta en la posicion "+i);
                break;
            } else if(i==alumnos.length-1) {
                System.out.println("No existe");
            }
        }

        for(int i=0;i<alumnos.length;i++) {
            if(alumnos[i].equalsIgnoreCase(nombreABuscar)) {
                salida="El nombre esta en la posicion "+i;
                break;
            }
        }
        System.out.println(salida);

        ent.close();

    }//main
    
}//class
