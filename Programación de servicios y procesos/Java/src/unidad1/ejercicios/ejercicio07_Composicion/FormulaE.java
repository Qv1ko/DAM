package unidad1.ejercicios.ejercicio07_Composicion;

class FormulaE extends Monoplaza {

    private int potenciaElectrica, velocidad, regeneracion;
    private String trenMotriz;
    private Piloto piloto;

    public FormulaE() {
        super();
        this.potenciaElectrica = 0;
        this.velocidad = 0;
        this.regeneracion = 0;
        this.trenMotriz = "";
        piloto = new Piloto();
    }

    public FormulaE(double largo, double ancho, double alto, int peso, int potenciaElectrica, int velocidad, int regeneracion, String trenMotriz, String licenciaFia, String nombre, int edad, double estatura, int pesoPiloto) {
        super(largo, ancho, alto, peso);
        this.potenciaElectrica = potenciaElectrica;
        this.velocidad = velocidad;
        this.regeneracion = regeneracion;
        this.trenMotriz = trenMotriz;
        piloto = new Piloto(licenciaFia, nombre, edad, estatura, pesoPiloto);
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
    
    public String toString() {
        return super.toString() + " diseñado para la formula E con una potencia electrica de " + getPotenciaElectrica() + " kW, una velocidad de " + getVelocidad() + " mph, una regeneración de " + getRegeneracion() + " kW y un tren motriz " + getTrenMotriz() + ". Pilotado por " + piloto.toString();
    }

    public void mostrar() {
        System.out.println(this.toString());
    }

}

class Piloto {

    private String licenciaFia, nombre;
    private int edad, peso;
    private double estatura;

    public Piloto() {
        this.licenciaFia = "";
        this.nombre = "";
        this.edad = 0;
        this.estatura = 0;
        this.peso = 0;
    }

    public Piloto(String licenciaFia, String nombre, int edad, double estatura, int peso) {
        this.licenciaFia = licenciaFia;
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
    }

    public String getLicenciaFia() {
        return licenciaFia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public int getPeso() {
        return peso;
    }

    public void setLicenciaFia(String licenciaFia) {
        this.licenciaFia = licenciaFia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String toString() {
        return getNombre() + " con licencia " + getLicenciaFia() + ", tiene una edad de " + getEdad() + " años, una estatura de " + getEstatura() + " y un peso de " + getPeso() + " Kg";
    }

    public void mostrar() {
        System.out.println(this.toString());
    }

}

