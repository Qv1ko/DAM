package unidad4.ejercicios.ejercicio2_Radio;

public class Radio {
    
    //Declaracion de atributos
    private double frecuencia;
    public static final double fMax=180.0;
    public static final double fMin=80.0;

    //Construcctores
    public Radio() {
        this.frecuencia=fMin;
    }//Ejercicio08_Radio

    public Radio(double frecuencia){
        this.frecuencia=(frecuencia<fMin)? fMin:(frecuencia>fMax)? fMax:frecuencia;
    }//Ejercicio08_Radio

    public double getFrecuencia() {
        return this.frecuencia;
    }//getFrecuencia

    public void setFrecuencia(double frecuencia) {
        this.frecuencia=frecuencia;
    }//setFrecuencia

    public void subirSintonia() {
        this.frecuencia=(this.frecuencia<fMax)? this.frecuencia+0.5:fMin;
    }//subirSintonia

    public void bajarSintonia() {
        this.frecuencia=(this.frecuencia>fMin)? this.frecuencia-0.5:fMax;
    }//bajarSintonia

    public String toString() {
        return "Frecuencia sintonizada -> "+getFrecuencia();
    }//toString

}//class
