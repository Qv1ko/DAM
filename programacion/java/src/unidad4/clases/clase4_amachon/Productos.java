package unidad4.clases.clase4_amachon;

public class Productos {

    // Lista de atributos
    private int id;
    private String nombre, descripcion;
    private Categorias cate;
    private float cant;
    private double precio;

    // Atributo estatico
    private static int autoId;

    // Constructores
    public Productos() {
        this.id=++autoId;
        this.nombre="Sin definir";
        this.descripcion="";
        this.cate=Categorias.CATA;
        this.cant=0.0f;
        this.precio=0.0;
    }// Clase09_Productos

    public Productos(String nombre, String descripcion, Categorias cate, float cantidad,double precio) {
        this.id=++autoId;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.cate=cate;
        this.cant=cantidad;
        this.precio=precio;
    }// Clase09_Productos

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

    public Categorias getCate() {
        return cate;
    }// getCate

    public void setCate(Categorias cate) {
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

}// class
