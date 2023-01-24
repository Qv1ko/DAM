package paqueteEjercicios2;

public class Ejercicio08_Radio {
    
    private double frequencia;

    public Ejercicio08_Radio(double frequencia){
        this.frequencia=(frequencia<80)? 80:(frequencia>180)? 180:frequencia;
    }//Ejercicio08_Radio

    public void subirSintonia() {
        this.frequencia=(this.frequencia<180)? this.frequencia+0.5:80.0;
    }//subirSintonia

    public void bajarSintonia() {
        this.frequencia=(this.frequencia>80)? this.frequencia-0.5:180;
    }//bajarSintonia

    public String toString() {
        return "Frecuencia sintonizada -> "+this.frequencia;
    }//toString

}//class
