package paqueteEjercicios2;

public class Ejercicio09_Zoo {
    
    private int id;
    private String especie,comida;
    private double kgDiarios;
    private Ejercicio09_Habitats habitat;
    // private static int totalId=1; //Variable de id incremental

    public Ejercicio09_Zoo() {
        this.id=0;
        this.especie="Sin identificar";
        this.habitat=null;
        this.comida="Sin definir";
        this.kgDiarios=0.0;
    }//Ejercicio09_Zoo

    public Ejercicio09_Zoo(int id,String especie,Ejercicio09_Habitats habitat,String comida,double kgDiarios) {
        // this.id= ++totalId; //Incremento del id
        this.id=id+10;
        this.especie=especie;
        this.habitat=habitat;
        this.comida=comida;
        this.kgDiarios=kgDiarios;
    }//Ejercicio09_Zoo

    //Construcctor copia
    public Ejercicio09_Zoo(Ejercicio09_Zoo anim) {
        this.id=anim.getId();
        this.especie=anim.especie;
        this.habitat=anim.habitat;
        this.comida=anim.comida;
        this.kgDiarios=anim.kgDiarios;
    }//Ejercicio09_Zoo

    public int getId() {
        return id;
    }//getId

    public String getEspecie() {
        return especie;
    }//getEspecie

    public Ejercicio09_Habitats getHabitat() {
        return this.habitat;
    }//getHabitat

    public String getComida() {
        return comida;
    }//getComida

    public double getKgDiarios() {
        return kgDiarios;
    }//getKgDiarios

    public void setId(int id) {
        this.id=id;
    }//setId

    public void setEspecie(String especie) {
        this.especie=especie;
    }//setEspecie

    public void setHabitat(Ejercicio09_Habitats habitat) {
        this.habitat=habitat;
    }//setHabitat

    public void setComida(String comida) {
        this.comida=comida;
    }//setComida

    public void setKgDiarios(double kgDiarios) {
        this.kgDiarios=kgDiarios;
    }//setKgDiarios

    public String toString() {
        return "Identificador: "+getId()+"\n\sEspecie: "+getEspecie()+"\n\sTipo de habitat: "+getHabitat()+"\n\sTipo de comida: "+getComida()+"\n\sCantidad de kilogramos semanales: "+Math.floor(getKgDiarios()*7);
    }

}//class
