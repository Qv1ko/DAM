package paqueteEjercicios2;

public class Ejercicio09_Informe {
    
    public static void main(String[] args) {
        Ejercicio09_Zoo[] animales=new Ejercicio09_Zoo[4];
        animales[0]=new Ejercicio09_Zoo(1,"Leon","Tierra","Carne",8.25);
        animales[1]=new Ejercicio09_Zoo(2,"Orangutan","Tierra","Pescado",3.65);
        animales[2]=new Ejercicio09_Zoo(3,"Paloma","Aire","Pienso",0.53);
        animales[3]=new Ejercicio09_Zoo(4,"Delfin","Mar","Pescado",4.65);
        informe(animales);
        informeExcel(animales);
    }//main

    private static void informe(Ejercicio09_Zoo[] animales) {
        String habitatTierra="",habitatMar="",habitatAire="";
        double comidaCarne=0.0,comidaPescado=0.0,comidaPienso=0.0;
        float costesTerrestres=0.0f,costesJaulas=0.0f,costesEstanques=0.0f,costeTerrestre=15.0f,costeJaula=20.0f,costeEstanques=45.0f;
        for(Ejercicio09_Zoo animal:animales) {
            if(animal.getHabitat().equalsIgnoreCase("tierra")) {
                habitatTierra+=animal+"\n";
                costesTerrestres+=costeTerrestre;
            } else if(animal.getHabitat().equalsIgnoreCase("mar")) {
                habitatMar+=animal+"\n";
                costesJaulas+=costeJaula;
            } else if(animal.getHabitat().equalsIgnoreCase("aire")) {
                habitatAire+=animal+"\n";
                costesEstanques+=costeEstanques;
            }
            if(animal.getComida().equalsIgnoreCase("carne")) {
                comidaCarne+=animal.getKgDiarios()*7;
            } else if(animal.getComida().equalsIgnoreCase("pescado")) {
                comidaPescado+=animal.getKgDiarios()*7;
            } else if(animal.getComida().equalsIgnoreCase("pienso")) {
                comidaPienso+=animal.getKgDiarios()*7;
            }
        }
        System.out.println("Animales de habitat terrestre:\n"+habitatTierra+"\nAnimales de habitat marino:\n"+habitatMar+"\nAnimales de habitat aereo:\n"+habitatAire);
        System.out.println("Carne semanal -> "+comidaCarne+" kg"+"\nPescado semanal -> "+comidaPescado+" kg"+"\nPienso semanal -> "+comidaPienso+" kg\n");
        System.out.println("Mantenimiento de jaulas terrestes -> "+costesTerrestres+" euros\nMantenimiento de jaulas -> "+costesJaulas+" euros\nMantenimiento de estanques -> "+costesEstanques+" euros");
    }//informe

    private static void informeExcel(Ejercicio09_Zoo[] animales) {
        String[][] datosInforme=new String[4][4];
        double costeTerrestre=15.0f,costeJaula=20.0f,costeEstanques=45.0f;
        for(int i=0;i<datosInforme.length;i++) {
            for(int j=0;j<datosInforme[i].length;j++) {
                datosInforme[0][j]=(i==0&&j==0)? "Habitat":(i==0&&j==1)? "Especies":(i==0&&j==2)? "Kg semanales":(i==0&&j==3)? "Mantenimiento de jaulas":"";
                if(i==1) {
                    datosInforme[i][j]=(j==0)? "Terrestre":(j==1)? Integer.toString(cantAnimales(animales,"tierra")):(j==2)? "Kg semanales":(j==3)? Double.toString(cantAnimales(animales,"tierra")*costeTerrestre)+" euros":"";
                } else if(i==2) {
                    datosInforme[i][j]=(j==0)? "Marino":(j==1)? Integer.toString(cantAnimales(animales,"mar")):(j==2)? "Kg semanales":(j==3)? Double.toString(cantAnimales(animales,"mar")*costeEstanques)+" euros":"";
                } else if(i==3) {
                    datosInforme[i][j]=(j==0)? "Aereo":(j==1)? Integer.toString(cantAnimales(animales,"aire")):(j==2)? "Kg semanales":(j==3)? Double.toString(cantAnimales(animales,"aire")*costeJaula)+" euros":"";
                }
                System.out.print("| "+datosInforme[i][j]+" |");
            }
            System.out.println();
        }
    }//informeExcel

    private static int cantAnimales(Ejercicio09_Zoo[] animales,String habitat) {
        int numAnimales=0;
        for(Ejercicio09_Zoo animal:animales) {
            if(animal.getHabitat().equalsIgnoreCase(habitat)) {
                numAnimales++;
            }
        }
        return numAnimales;
    }//cantAnimales

}//class
