package unidad1.ejercicios.ejercicio07_Composicion;

class Flow {

    public static void main(String[] args) {
        
        Formula1 mclaren = new Formula1(5.224, 1.9, 1.097, 755, 8750, 2.9, true, 125, 6, "Licencia 844", "Lando", 22, 1.87, 84);
        FormulaE nissan = new FormulaE(5.16, 1.77, 1.050, 900, 250, 174, 250, "Trasero", "Licencia 983", "Waldo", 20, 1.92, 79);

        mclaren.mostrar();
        nissan.mostrar();

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

    public String toString() {
        return "Monoplaza de (" + getLargo() + ", " + getAncho() + ", " + getAlto() + ") con un peso de " + getPeso() + " Kg";
    }

    public void mostrar() {
        System.out.println(this.toString());
    }

}

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
