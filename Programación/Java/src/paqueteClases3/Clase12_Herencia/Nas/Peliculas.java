package paqueteClases3.Clase12_Herencia.Nas;

public class Peliculas extends Multimedia {

    private int duracion;

    public Peliculas() {
        super();
        this.duracion = 65;
    }

    public Peliculas(String titulo, String genero, int duracion) {
        super(titulo, genero);
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String toString() {
        return "La pelicula "+super.toString()+" tiene una duración de "+getDuracion()+" minutos";
    }

    public String toFile() {
        return "P;"+getTitulo()+getGenero()+getDuracion();
    }

}
