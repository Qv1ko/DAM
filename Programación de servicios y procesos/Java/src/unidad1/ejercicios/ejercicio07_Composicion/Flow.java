package unidad1.ejercicios.ejercicio07_Composicion;

class Flow {

    public static void main(String[] args) {
        
    }

}

class Monoplaza {

    private double largo, ancho, alto;
    private int peso;

    Monoplaza() {
        this.largo = 0;
        this.ancho = 0;
        this. alto = 0;
        this.peso = 0;
    }

    Monoplaza(double largo, double ancho, double alto, int peso) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.peso = peso;
    }

    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }
    
    public double getAlto() {
        return alto;
    }
    
        public int getPeso() {
            return peso;
        }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void mostrar() {
        System.out.println("Monoplaza de (" + getLargo() + ", " + getAncho() + ", " + getAlto() + " con una altura de " + getPeso() + " Kg");
    }

}

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
        super.mostrar();
        System.out.println("Formula 1 con una potencia de " + getPotencia() + " rpm, una aceleracion de 0 a 100 Km/h de " + getAceleracion() + " segundos, " + (getDrs() ? "con DRS " : "sin DRS ") + ", con un deposito de " + getDepositoCombustible() + " litros y una caja de cambios de " + getCambios() + " velocidades");
    }

    public String toString() {
        return "Formula 1 con una potencia de " + getPotencia() + " rpm, una aceleracion de 0 a 100 Km/h de " + getAceleracion() + " segundos, " + (getDrs() ? "con DRS " : "sin DRS ") + ", con un deposito de " + getDepositoCombustible() + " litros y una caja de cambios de " + getCambios() + " velocidades";
    }

}

class FormulaE {

    private int potenciaElectrica, velocidad, regeneracion;
    private String trenMotriz;

    

}
