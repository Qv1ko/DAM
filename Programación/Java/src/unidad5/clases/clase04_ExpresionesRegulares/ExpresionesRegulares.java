package unidad5.clases.clase04_ExpresionesRegulares;

import java.util.Scanner;

public class ExpresionesRegulares {

    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);
        String dniRegex="^[0-9]{8}[A-HJ-NP-TV-Z]$";
        // String dniRegex="^\\d{8}[A-HJ-NP-TV-Z]$";
        System.out.print("Introduce un dni: ");
        System.out.println((ent.nextLine().toUpperCase().matches(dniRegex))? "DNI válido":"No válido");
        String matriculaRegex="^[0-9]{4}[A-Z]{3}$";
        // String matriculaRegex="^\\d{4}[A-Z]{3}$";
        System.out.print("Introduce una matrícula: ");
        System.out.println(ent.nextLine().toUpperCase().matches(matriculaRegex)? "Matrícula válida":"No válida");
        ent.close();
    }//main

}//class