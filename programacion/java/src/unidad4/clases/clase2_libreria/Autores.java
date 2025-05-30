package unidad4.clases.clase2_libreria;

public class Autores {
    
    private String nombre,apellidos;
    private int numObras;

    public Autores() {
        this.nombre="Sin definir";
        this.apellidos="Sin definir";
        this.numObras=0;
    }//Clase07_Autores

    public Autores(String nombre,String apellidos,int numObras) {
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.numObras=numObras;
    }//Clase07_Autores

    public String getNombre() {
        return this.nombre;
    }//getNombre

    public String getApellidos() {
        return this.apellidos;
    }//getApellidos

    public int getNumObras() {
        return this.numObras;
    }//getNumObras

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }//setNombre

    public void setApellidos(String apellidos) {
        this.apellidos=apellidos;
    }//setApellidos

    public void setNumObras(int numObras) {
        this.numObras=numObras;
    }//setNumObras

    public void setNombreCompleto(String nombreCompleto) {
        this.nombre=nombreCompleto.split(" ")[0];
        this.apellidos=nombreCompleto.split(" ")[1];
    }//setNombreCompleto

    public String toString() {
        return nombre+" "+apellidos+" ("+numObras+" obra/s)";
    }//toString

}//class
