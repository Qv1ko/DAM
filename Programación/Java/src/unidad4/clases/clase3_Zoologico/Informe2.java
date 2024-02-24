package unidad4.clases.clase3_Zoologico;

import java.util.Scanner;

public class Informe2 {
    
    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);
        String habitat="";
        Zoo nuevo=new Zoo();
        //Mediante teclado
        System.out.print("Introduce el id: ");
        nuevo.setId(Integer.parseInt(ent.nextLine()));
        System.out.print("Introduce la especie: ");
        nuevo.setEspecie(ent.nextLine());
        System.out.print("Introduce el habitat: ");
        // nuevo.setHabitat(Ejercicio09_Habitats.valueOf(ent.nextLine().toUpperCase()));
        habitat=ent.nextLine();
        nuevo.setHabitat((habitat.equalsIgnoreCase("tierra"))? Habitats.TIERRA:(habitat.equalsIgnoreCase("mar"))? Habitats.MAR:(habitat.equalsIgnoreCase("AIRE"))? Habitats.AIRE:null);
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
