package examenes.examen3.pkg1;

import examenes.examen3.pkg2.ClaseExterna;

public class Empleados {

    private String dni;
    private String nombreApellidos;
    private String cargo;
    private int anoAlta;
    private float salarioBase;
    private final int anoActual=2023;

    public Empleados() {
        this.dni="DNI sin identificar";
        this.nombreApellidos="sin identificar";
        this.cargo="sin identificar";
        this.anoAlta=this.anoActual;
        this.salarioBase=1000;
    }//Constructor vacio

    public Empleados(String dni,String nombreApellidos,String cargo,int anoAlta,float salarioBase) {
        this.dni=dni;
        this.nombreApellidos=nombreApellidos;
        this.cargo=cargo;
        this.anoAlta=anoAlta;
        this.salarioBase=salarioBase;
    }//Constructor con parametros

    public String getDni() {
        ClaseExterna.validarDni(this.dni);
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getAnoAlta() {
        return anoAlta;
    }

    public void setAnoAlta(int anoAlta) {
        this.anoAlta = anoAlta;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getAnoActual() {
        return this.anoActual;
    }

    public float getNomina() {
        return getSalarioBase()+(((this.anoActual-getAnoAlta())/3)*100);
    }//getNomina

    public String toString() {
        return "DNI: "+getDni()+"\tNombre: "+getNombreApellidos()+"\nCargo: "+getCargo()+"\tAños de experiencia: "+getAnoAlta()+"\n\tImporte Nómina: "+getNomina()+"\n";
    }//toString

}//class