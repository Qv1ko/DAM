package paqueteEjercicios3;

import paqueteClases2.Clase09_Categorias;

public class Ejercicio11_Productos {

    // Lista de atributos
    private int id;
    private String nombre, descripcion;
    private Clase09_Categorias cate;
    private float cant;
    private double precio;

    // Atributo estatico
    private static int autoId;

    // Constructores
    public Ejercicio11_Productos() {
        this.id=++autoId;
        this.nombre="Sin definir";
        this.descripcion="";
        this.cate=Clase09_Categorias.CATA;
        this.cant=0.0f;
        this.precio=0.0;
    }// Ejercicio11_Productos

    public Ejercicio11_Productos(String nombre, String descripcion, Clase09_Categorias cate, float cantidad,double precio) {
        this.id=++autoId;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.cate=cate;
        this.cant=cantidad;
        this.precio=precio;
    }// Ejercicio11_Productos

    // public Ejercicio11_Productos(String linea) throws NumberFormatException {
    //     this.id=Integer.parseInt(linea.split(";")[0]);
    //     this.nombre=linea.split(";")[1];
    //     this.descripcion=linea.split(";")[2];
    //     this.cate=linea.split(";")[3]; 
    //     this.cant=Float.parseFloat(linea.split(";")[4]);
    //     this.precio=Double.parseDouble(linea.split(";")[5]);
    // }//Ejercicio11_Productos - Constructor personalizado


    public int getId() {
        return id;
    }// getId

    public String getNombre() {
        return nombre;
    }// getNombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }// setNombre

    public String getDescripcion() {
        return descripcion;
    }// getDescripcion

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }// setDescipcion

    public Clase09_Categorias getCate() {
        return cate;
    }// getCate

    public void setCate(Clase09_Categorias cate) {
        this.cate = cate;
    }// setCate

    public float getCant() {
        return cant;
    }// getCant

    public void setCant(float cant) {
        this.cant = cant;
    }// setCant

    public double getPrecio() {
        return precio;
    }// getPrecio

    public void setPrecio(double precio) {
        this.precio = precio;
    }// setPrecio

    public void setId(int id) {
        this.id = id;
    }// setId

    public double getTotal() {
        return this.cant*this.precio*cate.getDto()*cate.getImpuesto();
    }

    public String toString() {
        return getNombre()+" ("+getId()+")\n\sDesc: "+getDescripcion()+"\n\sCategoria: "+getCate()+"\n\sCantidad: "+getCant()+"\n\sPrecio Und: "+getPrecio()+" euros\n\sPrecio total: "+getTotal()+" euros\n";
    }//toString

    public String toCsv() {
        return getId()+";"+getNombre()+";"+getDescripcion()+";"+getCate().name()+";"+getCant()+";"+getPrecio();
    }

}// class
