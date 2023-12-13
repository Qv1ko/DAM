package unidad1.ejercicios.ejercicio07_Composicion;

class Formula1 extends Monoplaza {

    private int potencia, depositoCombustible, cambios;
    private double aceleracion;
    private boolean drs;
    private Piloto piloto;

    public Formula1() {
        super();
        this.potencia = 0;
        this.aceleracion = 0;
        this.drs = false;
        this.depositoCombustible = 0;
        this.cambios = 0;
        piloto = new Piloto();
    }

    public Formula1(double largo, double ancho, double alto, int peso, int potencia, double aceleracion, boolean drs, int depositoCombustible, int cambios, String licenciaFia, String nombre, int edad, double estatura, int pesoPiloto) {
        super(largo, ancho, alto, peso);
        this.potencia = potencia;
        this.aceleracion = aceleracion;
        this.drs = drs;
        this.depositoCombustible = depositoCombustible;
        this.cambios = cambios;
        piloto = new Piloto(licenciaFia, nombre, edad, estatura, pesoPiloto);
    }

    public int getPotencia() {
        return potencia;
    }
    
    public double getAceleracion() {
        return aceleracion;
    }

    public boolean getDrs() {
        return drs;
    }
    
    public int getDepositoCombustible() {
        return depositoCombustible;
    }

    public int getCambios() {
        return cambios;
    }
        
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    public void setDrs(boolean drs) {
        this.drs = drs;
    }

    public void setDepositoCombustible(int depositoCombustible) {
        this.depositoCombustible = depositoCombustible;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public String toString() {
        return super.toString() + " diseñado para la formula 1 con una potencia de " + getPotencia() + " rpm, una aceleracion de 0 a 100 Km/h de " + getAceleracion() + " segundos, " + (getDrs() ? "con DRS " : "sin DRS ") + ", con un deposito de " + getDepositoCombustible() + " litros y una caja de cambios de " + getCambios() + " velocidades. Pilotado por " + piloto.toString();
    }

    public void mostrar() {
        System.out.println(this.toString());
    }

}
