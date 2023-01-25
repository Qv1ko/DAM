package paqueteEjercicios2;

public class Ejercicio09_Informe {
    
    public static void main(String[] args) {
        Ejercicio09_Zoo[] animales=new Ejercicio09_Zoo[4];
        animales[0]=new Ejercicio09_Zoo(1,"Leon","Tierra","Carne",8.25);
        animales[1]=new Ejercicio09_Zoo(2,"Orangutan","Tierra","Pescado",3.65);
        animales[2]=new Ejercicio09_Zoo(3,"Paloma","Aire","Pienso",0.53);
        animales[3]=new Ejercicio09_Zoo(4,"Delfin","Mar","Pescado",4.65);
        informe(animales);
    }//main

    private static void informe(Ejercicio09_Zoo[] animales) {
        String[] habitats={"Tierra","Mar","Aire"};
        // String[] comidas={"Carne","Pescado","Pienso"};
        for(int i=0;i<animales.length;i++) {
            for(int j=0;j<habitats.length;j++) {
                if (animales[i].getHabitat().equalsIgnoreCase(habitats[j])) {
                    System.out.println("\nAnimales de "+habitats[j].toLowerCase()+":");
                    System.out.println(animales[i]);
                }
            }
            // for(int)
        }
    }//informe

}//class
