package unidad4.clases.clase3_zoologico;

import java.util.Arrays;

public class Informe {
    
    public static void main(String[] args) {
        Zoo[] animales=new Zoo[4];
        animales[0]=new Zoo(1,"Leon",Habitats.TIERRA,"Carne",8.25);
        animales[1]=new Zoo(2,"Orangutan",Habitats.TIERRA,"Pescado",3.65);
        animales[2]=new Zoo(3,"Paloma",Habitats.AIRE,"Pienso",0.53);
        animales[3]=new Zoo(4,"Delfin",Habitats.MAR,"Pescado",4.65);
        System.out.println(Habitats.TIERRA);
        informe(animales);
        informeExcel(animales);
        copia();
    }//main

    private static void informe(Zoo[] animales) {
        String habitatTierra="",habitatMar="",habitatAire="";
        double comidaCarne=0.0,comidaPescado=0.0,comidaPienso=0.0;
        float costesTerrestres=0.0f,costesJaulas=0.0f,costesEstanques=0.0f,costeTerrestre=15.0f,costeJaula=20.0f,costeEstanques=45.0f;
        for(Zoo animal:animales) {
            if(animal.getHabitat().toString().equalsIgnoreCase("tierra")) {
                habitatTierra+=animal+"\n";
                costesTerrestres+=costeTerrestre;
            } else if(animal.getHabitat().toString().equalsIgnoreCase("mar")) {
                habitatMar+=animal+"\n";
                costesJaulas+=costeJaula;
            } else if(animal.getHabitat().toString().equalsIgnoreCase("aire")) {
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

    private static void informeExcel(Zoo[] animales) {
        String[][] datosInforme={{"Tierra","Mar","Aire"},{"carne","pescado","pienso"},{"15","45","20"},{"","",""},{"0","0","0"},{"0","0","0"}};
        double kg=0.0;
        int costes=0;
        for(int i=0;i<animales.length;i++) {
            for(int j=0;j<datosInforme[i].length;j++) {
                if(animales[i].getHabitat().toString().equalsIgnoreCase(datosInforme[0][j])) {
                    datosInforme[3][j]+=animales[i].toString()+"\n";
                    costes=Integer.parseInt(datosInforme[2][j])+Integer.parseInt(datosInforme[5][j]);
                    datosInforme[5][j]=String.valueOf(costes);
                }
                if(animales[i].getComida().equalsIgnoreCase(datosInforme[1][j])) {
                    kg=Double.parseDouble(datosInforme[4][j].replace(',','.'))+animales[i].getKgDiarios()*7;
                    datosInforme[4][j]=String.valueOf(String.format("%.2f",kg));
                }
            }
        }
        for(int i=0;i<datosInforme[0].length;i++) {
            System.out.println("**"+datosInforme[0][i]+"**");
            System.out.println(datosInforme[3][i]);
        }
        System.out.println(Arrays.toString(datosInforme[1]));
		System.out.println(Arrays.toString(datosInforme[4]));
		System.out.println(Arrays.toString(datosInforme[5])+"\n");
    }//informeExcel

    private static void copia() {
        Zoo leon=new Zoo(1,"Leon",Habitats.TIERRA,"Carne",9.80);
        Zoo copiaLeon=new Zoo(leon);
        leon.setEspecie("Leon Africano");
        System.out.println(leon);
        System.out.println("---------------------------------------");
        System.out.println(copiaLeon);
    }//copia

}//class
