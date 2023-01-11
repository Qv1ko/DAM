package paqueteClases2;

public class Clase07_Libros {
    
    private int isbn;
    private String titulo;
    private Clase07_Autores autor;
    private boolean tapaDura;

    public Clase07_Libros() {
        this.isbn=0;
        this.titulo="Titulo sin definir";
        this.autor=new Clase07_Autores();
        this.tapaDura=false;
    }//Clase07_Libros

    public Clase07_Libros(int isbn,String titulo,Clase07_Autores autor,boolean tapaDura) {
        this.isbn=isbn;
        this.titulo=titulo;
        this.autor=autor;
        this.tapaDura=tapaDura;
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

    public String toString() {
        return "Libro ("+getIsbn()+")\n\sTitulo -> "+getTitulo()+"\n\sAutor -> "+getAutor()+"\n\sTipo de tapa -> "+(isTapaDura()? "Tapa dura":"Tapa blanda");
    }//toString

}//class
