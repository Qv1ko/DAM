package unidad2.clases.clase01_ComaReplace;

import java.util.Scanner;

public class ComaPunto {

    public static void main(String[] args) {
        
        Scanner ent=new Scanner(System.in);

        //ejemplo 0 - Numero con coma
        System.out.print("Escribe un numero decimal con coma: ");
        float numeroComa=ent.nextFloat();
        System.out.println("Mi numero es -> "+numeroComa);

        //ejemplo 1 - Numero con punto
        System.out.print("Escribe un numero decimal con punto: ");
        float numeroPunto=Float.parseFloat(ent.next().replace(',', '.'));
        System.out.println("Mi numero es -> "+numeroPunto);

        ent.close();

    } //fin main
    
} //fin class