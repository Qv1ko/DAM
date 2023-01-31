package paqueteEjercicios2;

import java.util.Scanner;

public class Ejercicio09_Informe2 {
    
    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);
        String habitat="";
        Ejercicio09_Zoo nuevo=new Ejercicio09_Zoo();
        //Mediante teclado
        System.out.print("Introduce el id: ");
        nuevo.setId(Integer.parseInt(ent.nextLine()));
        System.out.print("Introduce la especie: ");
        nuevo.setEspecie(ent.nextLine());
        System.out.print("Introduce el habitat: ");
        // nuevo.setHabitat(Ejercicio09_Habitats.valueOf(ent.nextLine().toUpperCase()));
        habitat=ent.nextLine();
        nuevo.setHabitat((habitat.equalsIgnoreCase("tierra"))? Ejercicio09_Habitats.TIERRA:(habitat.equalsIgnoreCase("mar"))? Ejercicio09_Habitats.MAR:(habitat.equalsIgnoreCase("AIRE"))? Ejercicio09_Habitats.AIRE:null);
        // if(nuevo.getHabitat()==Ejercicio09_Habitats.TIERRA) {
        //     System.out.println("Verdadero");
        // } else {
        //     System.out.println("Falso");
        // }
        System.out.print("Introduce el tipo de comida: ");
        nuevo.setComida(ent.nextLine());
        System.out.print("Introduce la cantidad de comida diaria: ");
        nuevo.setKgDiarios(Double.parseDouble(ent.nextLine().replace(',','.')));
        System.out.println(nuevo);
        ent.close();
    }//main

}//class
