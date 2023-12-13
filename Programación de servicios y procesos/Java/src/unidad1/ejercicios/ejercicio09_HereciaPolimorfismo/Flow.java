package unidad1.ejercicios.ejercicio09_HereciaPolimorfismo;

class Flow {

    public static void main(String[] args) {
        
        Formula1 mclaren = new Formula1(5.224, 1.9, 1.097, 755, 8750, 2.9, true, 125, 6);
        FormulaE nissan = new FormulaE(5.16, 1.77, 1.050, 900, 250, 174, 250, "Trasero");

        mclaren.mostrar();
        nissan.mostrar();

    }

}

abstract class Monoplaza {

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

    public String toString() {
        return "Monoplaza de (" + getLargo() + ", " + getAncho() + ", " + getAlto() + ") con un peso de " + getPeso() + " Kg";
    }

    public abstract void mostrar();

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
        System.out.println(super.toString() + this.toString());
    }

    public String toString() {
        return " diseñado para la formula 1 con una potencia de " + getPotencia() + " rpm, una aceleracion de 0 a 100 Km/h de " + getAceleracion() + " segundos, " + (getDrs() ? "con DRS " : "sin DRS ") + ", con un deposito de " + getDepositoCombustible() + " litros y una caja de cambios de " + getCambios() + " velocidades";
    }

}

class FormulaE extends Monoplaza {

    private int potenciaElectrica, velocidad, regeneracion;
    private String trenMotriz;

    public FormulaE() {
        super();
        this.potenciaElectrica = 0;
        this.velocidad = 0;
        this.regeneracion = 0;
        this.trenMotriz = "";
    }

    public FormulaE(double largo, double ancho, double alto, int peso, int potenciaElectrica, int velocidad, int regeneracion, String trenMotriz) {
        super(largo, ancho, alto, peso);
        this.potenciaElectrica = potenciaElectrica;
        this.velocidad = velocidad;
        this.regeneracion = regeneracion;
        this.trenMotriz = trenMotriz;
    }

    public int getPotenciaElectrica() {
        return potenciaElectrica;
    }
    
    public int getVelocidad() {
        return velocidad;
    }
    
    public int getRegeneracion() {
        return regeneracion;
    }

    public String getTrenMotriz() {
        return trenMotriz;
    }

    public void setPotenciaElectrica(int potenciaElectrica) {
        this.potenciaElectrica = potenciaElectrica;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setRegeneracion(int regeneracion) {
        this.regeneracion = regeneracion;
    }

    public void setTrenMotriz(String trenMotriz) {
        this.trenMotriz = trenMotriz;
    }
    
    public void mostrar() {
        System.out.println(super.toString() + this.toString());
    }
    
    public String toString() {
        return " diseñado para la formula E con una potencia electrica de " + getPotenciaElectrica() + " kW, una velocidad de " + getVelocidad() + " mph, una regeneración de " + getRegeneracion() + " kW y un tren motriz " + getTrenMotriz();
    }

}
