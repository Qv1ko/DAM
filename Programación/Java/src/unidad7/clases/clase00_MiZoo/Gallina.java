package unidad7.clases.clase00_MiZoo;

public class Gallina extends Animal implements Sonidos {

    private String pico;

    public Gallina() {
        super();
        this.pico="";
    }

    public Gallina(String especie, String pico) {
        super(especie);
        this.pico=pico;
    }

    public String toString() {
        return "La gallina tiene pico "+pico;
    }

    public void sonido() {
        System.out.println("La gallina hace quiquiriqui");
    }

}
