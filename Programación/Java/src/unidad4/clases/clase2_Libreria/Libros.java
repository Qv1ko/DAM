package unidad4.clases.clase2_Libreria;

import java.text.DecimalFormat;

public class Libros {
    
    private int isbn;
    private String titulo;
    private Autores autor;
    private boolean tapaDura;
    private float precio;

    public Libros() {
        this.isbn=0;
        this.titulo="Titulo sin definir";
        this.autor=new Autores();
        this.tapaDura=false;
        this.precio=0.0f;
    }//Clase07_Libros

    public Libros(int isbn,String titulo,Autores autor,boolean tapaDura,float precio) {
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

    public Autores getAutor() {
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

    public void setAutor(Autores autor) {
        this.autor=autor;
    }//setAutor

    public void setTapaDura(boolean tapaDura) {
        this.tapaDura=tapaDura;
    }//setTapaDura

    public void setTapaDuraText(String tapaDura) {
        if(tapaDura.equalsIgnoreCase("si")||tapaDura.equalsIgnoreCase("dura")||tapaDura.equalsIgnoreCase("tapa dura")||tapaDura.equalsIgnoreCase("tapadura")||tapaDura.equalsIgnoreCase("true")||tapaDura.equalsIgnoreCase("yes")) {
            this.tapaDura=true;
        } else {
            this.tapaDura=false;
        }
    }//setTapaDuraText

    public void setPrecio(float precio) {
        this.precio=Math.abs(precio);
    }//setPrecio

    public String toString() {
        DecimalFormat df=new DecimalFormat("#.##");
        return "Libro ("+getIsbn()+")\n\sTitulo -> "+getTitulo()+"\n\sAutor -> "+getAutor()+"\n\sTipo de tapa -> "+(isTapaDura()? "Tapa dura":"Tapa blanda")+"\n\sPrecio -> "+df.format(getPrecio())+" euros";
    }//toString

}//class
