package paqueteEjercicios3.ejercicio08_SemanaSanta;

/*
 * @author Victor
 * @version 0.6
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
    }

    public Vehiculos(String matricula,int plazas,Combustibles combustible,float precio,boolean alquilado) {
        this.matricula=matricula;
        this.plazas=plazas;
        this.combustible=combustible;
        this.precio=precio;
        this.alquilado=alquilado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula=matricula;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas=plazas;
    }

    public Combustibles getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustibles combustible) { 
        this.combustible=combustible;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio=precio;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado=alquilado;
    }

    private String alquiladoToString() {
        return (isAlquilado())? "Esta alquilado":"No esta alquilado";
    }

    public String toString() {
        return "Vehiculo "+getMatricula()+" a combustible "+getCombustible().toString()+" con "+getPlazas()+" plazas. "+alquiladoToString()+" ha "+getPrecio()+" por día.";
    }
    
}//class
