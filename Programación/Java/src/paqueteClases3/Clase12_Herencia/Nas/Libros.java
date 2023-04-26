package paqueteClases3.Clase12_Herencia.Nas;

public class Libros extends Multimedia {

    private String autor;

    public Libros() {
        super();
        this.autor = "desconocido";
    }

    public Libros(String titulo, String genero, String autor) {
        super(titulo, genero);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String toString() {
        return "El libro "+super.toString()+" es del autor "+getAutor();
    }

    public String toFile() {
        return "L;"+getTitulo()+";"+getGenero()+";"+getAutor();
    }

}
