package unidad5.ejercicios.ejercicio9_semana_santa;

/**
 * @author Víctor
 * @version 1.0
 */

public class Vehiculos {

    private String matricula;
    private int plazas;
    private Combustibles combustible;
    private float precio;
    private boolean alquilado;

    public Vehiculos() {
        this.matricula="0000AAAA";
        this.plazas=4;
        this.combustible=Combustibles.DIESEL;
        this.precio=(float)Math.random()*1001;
        this.alquilado=false;
    }//Vehiculos - Constructor vacío

    public Vehiculos(String matricula,int plazas,Combustibles combustible,float precio,boolean alquilado) {
        this.matricula=matricula;
        this.plazas=plazas;
        this.combustible=combustible;
        this.precio=precio;
        this.alquilado=alquilado;
    }//Vehiculos

    public String getMatricula() {
        return matricula;
    }//getMatricula

    public void setMatricula(String matricula) {
        this.matricula=matricula;
    }//setMatricula

    public int getPlazas() {
        return plazas;
    }//getPlazas

    public void setPlazas(int plazas) {
        this.plazas=plazas;
    }//setPlazas

    public Combustibles getCombustible() {
        return combustible;
    }//getCombustible

    public void setCombustible(Combustibles combustible) { 
        this.combustible=combustible;
    }//setCombustible

    public float getPrecio() {
        return precio;
    }//getPrecio

    public void setPrecio(float precio) {
        this.precio=precio;
    }//setPrecio

    public boolean isAlquilado() {
        return alquilado;
    }//isAlquilado

    public void setAlquilado(boolean alquilado) {
        this.alquilado=alquilado;
    }//setAlquilado

    private String alquiladoToString() {
        return (isAlquilado())? "Está alquilado a "+getPrecio()+" euros por día.":"Se alquila por "+getPrecio()+" euros al día.";
    }//alquiladoToString

    public String toString() {
        return "Vehículo "+getMatricula()+" a combustible "+getCombustible().toString().toLowerCase()+" con "+getPlazas()+" plazas. "+alquiladoToString();
    }//toString
    
}//class
