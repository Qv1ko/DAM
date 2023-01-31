package paqueteClases2;

import java.util.Scanner;

public class Clase08_Informe2 {
    
    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);
        String habitat="";
        Clase08_Zoo nuevo=new Clase08_Zoo();
        //Mediante teclado
        System.out.print("Introduce el id: ");
        nuevo.setId(Integer.parseInt(ent.nextLine()));
        System.out.print("Introduce la especie: ");
        nuevo.setEspecie(ent.nextLine());
        System.out.print("Introduce el habitat: ");
        // nuevo.setHabitat(Ejercicio09_Habitats.valueOf(ent.nextLine().toUpperCase()));
        habitat=ent.nextLine();
        nuevo.setHabitat((habitat.equalsIgnoreCase("tierra"))? Clase08_Habitats.TIERRA:(habitat.equalsIgnoreCase("mar"))? Clase08_Habitats.MAR:(habitat.equalsIgnoreCase("AIRE"))? Clase08_Habitats.AIRE:null);
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
