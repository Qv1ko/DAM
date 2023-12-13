package unidad1.ejercicios.ejercicio09_Polimorfismo;

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
        System.out.println(this.toString());
    }
    
    public String toString() {
        return "\n\n--------Formula E--------\n\n\tLargo: " + super.getLargo() + " metros\n\tAncho: " + super.getAncho() + " metros\n\tAlto: " + super.getAlto() + " metros\n\tPeso: " + super.getPeso() + " Kg\n\tPotencia máxima: " + this.getPotenciaElectrica() + " kW\n\tVelocidad máxima: " + this.getVelocidad() + " mph\n\tRegeneración máxima: " + this.getRegeneracion() + " kW\n\tTren motriz: " + this.getTrenMotriz();
    }

}
