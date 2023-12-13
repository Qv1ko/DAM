package unidad1.ejercicios.ejercicio09_Polimorfismo;

class Formula1 extends Monoplaza {

    private int potencia, depositoCombustible, cambios;
    private double aceleracion;
    private boolean drs;

    public Formula1() {
        super();
        this.potencia = 0;
        this.aceleracion = 0;
        this.drs = false;
        this.depositoCombustible = 0;
        this.cambios = 0;
    }

    public Formula1(double largo, double ancho, double alto, int peso, int potencia, double aceleracion, boolean drs, int depositoCombustible, int cambios) {
        super(largo, ancho, alto, peso);
        this.potencia = potencia;
        this.aceleracion = aceleracion;
        this.drs = drs;
        this.depositoCombustible = depositoCombustible;
        this.cambios = cambios;
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
    
    public void mostrar() {
        System.out.println(this.toString());
    }

    public String toString() {
        return "\n\n--------Formula 1--------\n\n\tLargo: " + super.getLargo() + " metros\n\tAncho: " + super.getAncho() + " metros\n\tAlto: " + super.getAlto() + " metros\n\tPeso: " + super.getPeso() + " Kg\n\tPotencia: " + this.getPotencia() + " rpm\n\tAceleración (0 a 100 Km/h): " + this.getAceleracion() + " segundos\n\tDRS: " + (this.getDrs() ? "Sí" : "No") + "\n\tCapacidad del depósito de combustible: " + this.getDepositoCombustible() + " litros\n\tCaja de cambios: " + this.getCambios() + " velocidades";
    }

}
