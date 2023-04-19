package paqueteEjercicios3;

public class Ejercicio10_Productos {
    
    private String nombre;
    private String desc;
    private int cantidad;
    private double precio;
    
    public Ejercicio10_Productos() {
        this.nombre="";
        this.desc="";
        this.cantidad=0;
        this.precio=0.0;
    }//Ejercicio10_FileToArray - Constructor vacio

    public Ejercicio10_Productos(String nombre,String desc,int cant,double precio) {
        this.nombre=nombre;
        this.desc=desc;
        this.cantidad=cant;
        this.precio=precio;
    }//Ejercicio10_FileToArray

    public Ejercicio10_Productos(String linea) throws NumberFormatException {
        //Divide el String pasada en diferentes partes y guarda cada una en su variable correspondiente
        this.nombre=linea.split(";")[0];
        this.desc=linea.split(";")[1];
        this.cantidad=Integer.parseInt(linea.split(";")[2]);
        this.precio=Double.parseDouble(linea.split(";")[3]); 
    }//Ejercicio10_Productos - Constructor personalizado

    public String toString() {
        return "Producto: "+nombre+"\n\sDescripción: "+desc+"\n\sCantidad: "+cantidad+" unidades\n\sPrecio und: "+precio+" euros";
    }//toString

}//class
