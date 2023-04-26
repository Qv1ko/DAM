package unidad6.clases.clase00_Vehiculos;

public class Autobus extends Vehiculo {

    private int numPlazas;

    public Autobus() {
        super();
        this.numPlazas = 0;
    }

    public Autobus(String matricula, String modelo, int potencia, int numPlazas) {
        super(matricula, modelo, potencia);
        this.numPlazas = numPlazas;
    }
    
    public int getNumLicencia() {
        return numPlazas;
    }

    public void setNumLicencia(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public String toString() {
        return "El autobus con matricula "+getMatricula()+"\n Modelo: "+getModelo()+"\n Potencia: "+getPotencia()+"\n Número de plazas: "+getNumLicencia();
    }

}
