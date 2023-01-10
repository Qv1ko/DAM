package paqueteClases2;

public class Clase07_Libros {
    
    private int isbn;
    private String titulo,autor;
    private boolean tapaDura;

    public Clase07_Libros() {
        this.isbn=0;
        this.titulo="Titulo sin definir";
        this.autor="Autor sin definir";
        this.tapaDura=false;
    }//Clase07_Libros

    public Clase07_Libros(int isbn,String titulo,String autor,boolean tapaDura) {
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

    public String getAutor() {
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

    public void setAutor(String autor) {
        this.autor=autor;
    }//setAutor

    public void setTapaDura(boolean tapaDura) {
        this.tapaDura=tapaDura;
    }//setTapaDura

    public String toString() {
        return "Libro:\n\tISBN -> "+getIsbn()+"\n\tTitulo -> "+getTitulo()+"\n\tAutor -> "+getAutor()+"\n\tTipo de tapa -> "+isTapaDura();
    }//toString

}//class
