package unidad6.clases.clase00_Vehiculos;

public class Taxi extends Vehiculo {

    private int numLicencia;

    public Taxi() {
        super();
        this.numLicencia = 0;
    }

    public Taxi(String matricula, String modelo, int potencia, int numLicencia) {
        super(matricula, modelo, potencia);
        this.numLicencia = numLicencia;
    }
    
    public int getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(int numLicencia) {
        this.numLicencia = numLicencia;
    }

    public String toString() {
        return "El taxi con matricula "+getMatricula()+"\n Modelo: "+getModelo()+"\n Potencia: "+getPotencia()+"\n Número de licencia: "+getNumLicencia();
    }

}
