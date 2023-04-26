package unidad6.ejercicios.ejercicio00_Nas;

public abstract class Multimedia {
    
    private String titulo,genero;

    protected Multimedia() {
        this.titulo="Sin definir";
        this.genero="Sin definir";
    }

    protected Multimedia(String titulo, String genero) {
        this.titulo=titulo;
        this.genero=genero;
    }

    protected String getTitulo() {
        return titulo;
    }

    protected void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    protected String getGenero() {
        return genero;
    }

    protected void setGenero(String genero) {
        this.genero = genero;
    }

    public String toString() {
        return getTitulo()+" del genero de "+getGenero();
    }

    // public String toFile() {
    //     return ";"+getTitulo()+";"+getGenero()+";";
    // }

    public abstract String toFile();

}
