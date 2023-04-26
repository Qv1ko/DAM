package unidad4.ejercicios.ejercicio01_Radio;

public class Radio {
    
    //Declaracion de atributos
    private double frequencia;
    public static final double fMax=180.0;
    public static final double fMin=80.0;

    //Construcctores
    public Radio() {
        this.frequencia=fMin;
    }//Ejercicio08_Radio

    public Radio(double frequencia){
        this.frequencia=(frequencia<fMin)? fMin:(frequencia>fMax)? fMax:frequencia;
    }//Ejercicio08_Radio

    public double getFrecuencia() {
        return this.frequencia;
    }//getFrecuencia

    public void setFrequencia(double frequencia) {
        this.frequencia=frequencia;
    }//setFrequencia

    public void subirSintonia() {
        this.frequencia=(this.frequencia<fMax)? this.frequencia+0.5:fMin;
    }//subirSintonia

    public void bajarSintonia() {
        this.frequencia=(this.frequencia>fMin)? this.frequencia-0.5:fMax;
    }//bajarSintonia

    public String toString() {
        return "Frecuencia sintonizada -> "+getFrecuencia();
    }//toString

}//class
