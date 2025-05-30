package examenes.examen3.solucion.pkg1;

import examenes.examen3.solucion.pkg2.ClaseExterna;

public class Empleados {

    private String dni,nombre,cargo;
    private int ano;
    private float salario;
    private final int YEAR=2023;

    public Empleados() {
        this.dni="";
        this.nombre="";
        this.cargo="";
        this.ano=this.YEAR;
        this.salario=0.0f;
    }//SolucionEmpleados

    public Empleados(String dni,String nombre,String cargo,int ano,float salario) {
        this.dni=dni;
        this.nombre=nombre;
        this.cargo=cargo;
        this.ano=ano;
        this.salario=salario;
    }//SolucionEmleados

    public String getDni() {
        return ClaseExterna.validarDni(dni.toUpperCase());
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getYEAR() {
        return YEAR;
    }

    public float getNomina() {
        int trienio=getExperiencia()/3;
        return this.getSalario()+(trienio*100);
    }//getNomina

    public int getExperiencia() {
        return (YEAR-this.getAno());
    }//getExperiencia

    public String toString() {
        return this.getDni()+" "+this.getNombre()+"\n"+this.getCargo()+" "+this.getAno()+"\n"+this.getNomina();
    }//toString

}//class