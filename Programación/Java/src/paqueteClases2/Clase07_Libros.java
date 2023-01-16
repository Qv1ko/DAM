package paqueteClases2;

public class Clase07_Libros {
    
    private int isbn;
    private String titulo;
    private Clase07_Autores autor;
    private boolean tapaDura;
    private float precio;

    public Clase07_Libros() {
        this.isbn=0;
        this.titulo="Titulo sin definir";
        this.autor=new Clase07_Autores();
        this.tapaDura=false;
        this.precio=0.0f;
    }//Clase07_Libros

    public Clase07_Libros(int isbn,String titulo,Clase07_Autores autor,boolean tapaDura,float precio) {
        this.isbn=isbn;
        this.titulo=titulo;
        this.autor=autor;
        this.tapaDura=tapaDura;
        this.precio=precio;
    }//Clase07_Libros

    public int getIsbn() {
        return this.isbn;
    }//getIsbn

    public String getTitulo() {
        return this.titulo;
    }//getTitulo

    public Clase07_Autores getAutor() {
        return this.autor;
    }//getAutor

    public boolean isTapaDura() {
        return this.tapaDura;
    }//isTapaDura

    public float getPrecio() {
        // float precioFinal=precio;
        // if(tapaDura) {
        //     precioFinal*=1.05f;
        // }
        // return precioFinal;
        return (isTapaDura())? this.precio*1.05f:this.precio;
    }//getPrecio

    public void setIsbn(int isbn) {
        this.isbn=isbn;
    }//setIsbn

    public void setTitulo(String titulo) {
        this.titulo=titulo;
    }//setTitulo

    public void setAutor(Clase07_Autores autor) {
        this.autor=autor;
    }//setAutor

    public void setTapaDura(boolean tapaDura) {
        this.tapaDura=tapaDura;
    }//setTapaDura

    public void setPrecio(float precio) {
        if(precio<0){
            precio=Math.abs(precio);
        }
        this.precio=precio;
    }//setPrecio

    public String toString() {
        return "Libro ("+getIsbn()+")\n\sTitulo -> "+getTitulo()+"\n\sAutor -> "+getAutor()+"\n\sTipo de tapa -> "+(isTapaDura()? "Tapa dura":"Tapa blanda")+"\n\sPrecio -> "+getPrecio()+" euros";
    }//toString

}//class
