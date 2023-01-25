package paqueteEjercicios2;

public class Ejercicio09_Zoo {
    
    private int id=0;
    private String especie=" ",habitat=" ",comida= " ";
    private double kgDiarios=0.0f;

    public Ejercicio09_Zoo() {
        this.id=0;
        this.especie="Sin identificar";
        this.habitat="Sin definir";
        this.comida="Sin definir";
        this.kgDiarios=0.0;
    }//Ejercicio09_Zoo

    public Ejercicio09_Zoo(int id,String especie,String habitat,String comida,double kgDiarios) {
        this.id=id+10;
        this.especie=especie;
        this.habitat=habitat;
        this.comida=comida;
        this.kgDiarios=kgDiarios;
    }//Ejercicio09_Zoo

    public int getId() {
        return id;
    }//getId

    public String getEspecie() {
        return especie;
    }//getEspecie

    public String getHabitat() {
        return habitat;
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

    public void setHabitat(String habitat) {
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
