package paqueteClases2;

public class Clase06_Precio {
    
    //Declarar los atributos
    public double euros;
    public String divisa;

    //Metodos
    //Construcctor sin parametros
    public Clase06_Precio() {
        euros=0.0;
    }//Clase06_Precio

    //Construcctor con parametros (puede tener tantos parametros como metodos)
    public Clase06_Precio(double euros) {
        this.euros=euros;
    }//Clase06_Precio

    public Clase06_Precio(String divisa) {
        this.divisa=divisa;
    }//Clase06_Precio

    public Clase06_Precio(double euros,String divisa) {
        this.euros=euros;
        this.divisa=divisa;
    }//Clase06_Precio

    public double set() {
        return euros;
    }//set

    public void get(double euros) {
        this.euros=euros;
    }//get

}//class
