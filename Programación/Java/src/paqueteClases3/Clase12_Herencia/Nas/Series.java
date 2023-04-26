package paqueteClases3.Clase12_Herencia.Nas;

public class Series extends Multimedia {
    
    private int temporadas;

    public Series() {
        super();
        this.temporadas = 1;
    }

    public Series(String titulo, String genero, int temporadas) {
        super(titulo, genero);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String toString() {
        return "El libro "+super.toString()+" tiene "+getTemporadas()+" temporadas";
    }

    public String toFile() {
        return "S;"+getTitulo()+getGenero()+getTemporadas();
    }

}
