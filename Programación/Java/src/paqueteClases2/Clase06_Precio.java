package paqueteClases2;

public class Clase06_Precio {
    
    //Declarar los atributos
    private double cantidad;
    private String divisa;

    //Metodos
    //Construcctor sin parametros
    public Clase06_Precio() {
        cantidad=0.0;
        divisa="EUR";
    }//Clase06_Precio

    //Construcctor con parametros (puede tener tantos parametros como metodos)
    public Clase06_Precio(double cantidad) {
        this.cantidad=cantidad;
    }//Clase06_Precio

    public Clase06_Precio(String divisa) {
        this.divisa=divisa;
    }//Clase06_Precio

    public Clase06_Precio(double cantidad,String divisa) {
        this.cantidad=cantidad;
        this.divisa=divisa;
    }//Clase06_Precio

    //Getters
    public double getCantidad() {
        return this.cantidad;
    }//getCantidad

    public String getDivisa() {
        return this.divisa;
    }//getDivisa

    //Setters
    public void setCantidad(double cantidad) {
        this.cantidad=(cantidad<0)? 0:cantidad;
    }//setCantidad

    public void setDivisa(String divisa) {
        this.divisa=divisa;
    }

}//class
