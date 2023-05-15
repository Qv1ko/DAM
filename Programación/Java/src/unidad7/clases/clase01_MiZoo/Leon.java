package unidad7.clases.clase01_MiZoo;

public class Leon extends Animal implements Sonidos {

    private String manada;

    public Leon() {
        super();
        this.manada="";
    }

    public Leon(String especie, String manada) {
        super(especie);
        this.manada=manada;
    }

    public String toString() {
        return "La manada del león es "+manada;
    }

    public void sonido() {
        System.out.println("El león hace grr");
    }

}
