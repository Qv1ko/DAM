package unidad1.clases;

import java.util.ArrayList;

class Clase11_Interfaces {

    public static void main(String[] args) {
        
        AppITV aitv = new AppITV();

        DatosMinisterioTransportes vp1 = new VehiculoIndustrial("1234AAA", "1111111111", "16/01/2022", "Citroen", "Berlingo", "Diesel", "Delantera", 150.5, 180.5, 2.5, 1.5, 8, 2400, 5, "12345678A");
        DatosMinisterioTransportes vp2 = new VehiculoIndustrial("1235BBB", "2222222222", "24/06/2019", "Citroen", "Berlingo", "Diesel", "Delantera", 150.5, 180.5, 2.5, 1.5, 8, 2400, 5, "12121212B");
        DatosMinisterioTransportes vi1 = new VehiculoIndustrial("1236CCC", "3333333333", "05/04/2016", "Citroen", "Berlingo", "Diesel", "Delantera", 150.5, 180.5, 2.5, 1.5, 8, 2400, 5, "12344321C");
        DatosMinisterioTransportes vi2 = new VehiculoIndustrial("1237DDD", "4444444444", "02/03/2012", "Citroen", "Berlingo", "Diesel", "Delantera", 150.5, 180.5, 2.5, 1.5, 8, 2400, 5, "12312334D");

        aitv.addVehiculo(vp1);
        aitv.addVehiculo(vp2);
        aitv.addVehiculo(vi1);
        aitv.addVehiculo(vi2);

        aitv.mostrarLista();

    }

}

class AppITV {

    ArrayList<DatosMinisterioTransportes> lista;

    public AppITV() {
        this.lista = new ArrayList<DatosMinisterioTransportes>();
    }

    public void addVehiculo(DatosMinisterioTransportes dmt) {
        lista.add(dmt);
    }

    public void mostrarLista() {
        for(DatosMinisterioTransportes aux : lista) {
            if (aux instanceof VehiculoPrivado) {
                ((VehiculoPrivado)aux).mostrarVehiculo();
            } else {
                ((VehiculoIndustrial)aux).mostrarVehiculo();
            }
        }
    }

}

interface DatosMinisterioTransportes {

    int PLAZAS_PASAJEROS = 9;
    String VEHICULO_M1 = "Sentados";
    double FURGONETA_N1 = 3500;

    public static void infoTurismo() {
        System.out.println("\nInformación del ministerio de transportes\n\nVehículo privado\nNúmero máximo de pasajeros: " + PLAZAS_PASAJEROS + "\nNúmero máximo de plazas: " + VEHICULO_M1);
    };

    public static void infoFurgoneta() {
        System.out.println("\nInformación del ministerio de transportes\n\nVehículo privado\nNúmero máximo de pasajeros: " + PLAZAS_PASAJEROS + "\nNúmero máximo de plazas: " + VEHICULO_M1);
    }

}

abstract class Vehiculo implements DatosMinisterioTransportes{

    private String matricula, numeroBastidor, fechaMatriculacion, marca, modelo, combustible, traccion;
    private double potencia, velocidad, freno, humos, luces, peso;
    private int plazas;

    public Vehiculo() {
        this.matricula = "sin asignar";
        this.numeroBastidor = "sin asignar";
        this.fechaMatriculacion = "sin asignar";
        this.marca = "sin asignar";
        this.modelo = "sin asignar";
        this.combustible = "sin asignar";
        this.traccion = "sin asignar";
        this.potencia = 0;
        this.velocidad = 0;
        this.freno = 0;
        this.humos = 0;
        this.luces = 0;
        this.peso = 0;
        this.plazas = 0;
    }

    public Vehiculo(String matricula, String numeroBastidor, String fechaMatriculacion, String marca, String modelo, String combustible, String traccion, double potencia, double velocidad, double freno, double humos, double luces, double peso, int plazas) {
        this.matricula = matricula;
        this.numeroBastidor = numeroBastidor;
        this.fechaMatriculacion = fechaMatriculacion;
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
        this.traccion = traccion;
        this.potencia = potencia;
        this.velocidad = velocidad;
        this.freno = freno;
        this.humos = humos;
        this.luces = luces;
        this.peso = peso;
        this.plazas = plazas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNumeroBastidor() {
        return numeroBastidor;
    }

    public void setNumeroBastidor(String numeroBastidor) {
        this.numeroBastidor = numeroBastidor;
    }

    public String getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(String fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getFreno() {
        return freno;
    }

    public void setFreno(double freno) {
        this.freno = freno;
    }

    public double getHumos() {
        return humos;
    }

    public void setHumos(double humos) {
        this.humos = humos;
    }

    public double getLuces() {
        return luces;
    }

    public void setLuces(double luces) {
        this.luces = luces;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    @Override
    public String toString() {
        return "Vehiculo:\nMatricula: " + getMatricula() + "\nNumero de bastidor: " + getNumeroBastidor() + "\nFecha matriculacion: " + getFechaMatriculacion() + "\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nPotencia: " + getPotencia() + "\nVelocidad: " + getVelocidad() + "\nCombustible: " + getCombustible() + "\nTraccion: " + getTraccion() + "\nFreno: " + getFreno() + "\nHumos: " + getHumos() + "\nLuces: " +getLuces() + "\nPeso: " + getPeso() + "\nPlazas: " + getPlazas();
    }

    public abstract void mostrarVehiculo();

    public void infoClasificacion() {
        System.out.println("ITV - Vehículo");
    }

}

class VehiculoPrivado extends Vehiculo implements Privado {

    private String dniTitular;

    public VehiculoPrivado() {
        super();
        this.dniTitular = "sin asignar";
    }

    public VehiculoPrivado(String matricula, String numeroBastidor, String fechaMatriculacion, String marca, String modelo, String combustible, String traccion, double potencia, double velocidad, double freno, double humos, double luces, double peso, int plazas, String dniTitular) {
        super(matricula, numeroBastidor, fechaMatriculacion, marca, modelo, combustible, traccion, potencia, velocidad, freno, humos, luces, peso, plazas);
        this.dniTitular = dniTitular;
    }

    public String getDniTitular() {
        return dniTitular;
    }

    public void setDniTitular(String dniTitular) {
        this.dniTitular = dniTitular;
    }

    @Override
    public void mostrarVehiculo() {
        Privado.super.infoClasificacion();
        System.out.println("DNI Titular: " + getDniTitular() + "\n" + this.toString());
    }

}

interface Privado {

    public int ITV_PLAZO_DE_4_A_10 = 2, ITV_PLAZO_MAYOR_10 = 1;

    default public void infoClasificacion() {
        System.out.println("ITV - Vehículo privado");
    }
    
}

class VehiculoIndustrial extends Vehiculo implements Industrial {

    private String nif;

    public VehiculoIndustrial() {
        super();
        this.nif = "sin asignar";
    }

    public VehiculoIndustrial(String matricula, String numeroBastidor, String fechaMatriculacion, String marca, String modelo, String combustible, String traccion, double potencia, double velocidad, double freno, double humos, double luces, double peso, int plazas, String nif) {
        super(matricula, numeroBastidor, fechaMatriculacion, marca, modelo, combustible, traccion, potencia, velocidad, freno, humos, luces, peso, plazas);
        this.nif = nif;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public void mostrarVehiculo() {
        Industrial.super.infoClasificacion();
        System.out.println("NIF Titular: " + getNif() + "\n" + this.toString());
    }

}

interface Industrial {

    public int ITV_PLAZO_DE_2_A_6 = 2, ITV_PLAZO_DE_6_A_10 = 1;
    public double ITV_PLAZO_MAYOR_10 = 0.5;

    default public void infoClasificacion() {
        System.out.println("ITV - Vehículo industrial");
    }
    
}
