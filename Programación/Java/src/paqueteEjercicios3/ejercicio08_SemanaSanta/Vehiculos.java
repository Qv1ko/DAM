package paqueteEjercicios3.ejercicio08_SemanaSanta;

import java.util.regex.Pattern;

/*
 * @author Victor
 * @version 0.3
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

    public Vehiculos(String matricula,int plazas,Combustibles combustible,String precio,boolean alquilado) {
        this.matricula=matricula;
        this.plazas=plazas;
        this.combustible=combustible;
        this.precio=Float.parseFloat(String.format("%.2f",precio));
        this.alquilado=alquilado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) throws Exception {
        String matriculaPatron="^\\d\\d\\d\\d\\w\\w\\w$";
        if(!Pattern.compile(matriculaPatron).matcher(matricula).find()) {
           throw new Exception("\n! La matricula no es valida\n");
        }
        this.matricula=matricula;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) throws Exception {
        if(plazas<1||plazas>9) {
            throw new Exception("\n! El número de plazas no es valido\n");
        }
        this.plazas=plazas;
    }

    public Combustibles getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) throws Exception { 
        if(combustible.equalsIgnoreCase(Combustibles.DIESEL.toString())||combustible.equalsIgnoreCase("D")) {
            this.combustible=Combustibles.DIESEL;
        } else if(combustible.equalsIgnoreCase(Combustibles.GAS.toString())||combustible.equalsIgnoreCase("G")) {
            this.combustible=Combustibles.GAS;
        } else if(combustible.equalsIgnoreCase(Combustibles.ELECTRICO.toString())||combustible.equalsIgnoreCase("E")) {
            this.combustible=Combustibles.ELECTRICO;
        } else if(combustible.equalsIgnoreCase(Combustibles.HIBRIDO.toString())||combustible.equalsIgnoreCase("H")) {
            this.combustible=Combustibles.HIBRIDO;
        } else {
            throw new Exception("\n! Combustible no valido\n");
        }
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio=Float.parseFloat(String.format("%.2f",precio));
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
