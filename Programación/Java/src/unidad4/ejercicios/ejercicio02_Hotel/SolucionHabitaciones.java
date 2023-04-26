package unidad4.ejercicios.ejercicio02_Hotel;

public class SolucionHabitaciones {

    private int id;
    private String cama;
    private boolean terraza,libre;
    private float precio;


    public SolucionHabitaciones(int id,String cama,boolean terraza,float precio,boolean libre) {
        this.id=id;
        this.cama=cama;
        this.terraza=terraza;
        this.precio=precio;
        this.libre=libre;
    }

    public boolean isLibre() {
        return this.libre;
    }

    public String liberar() {
        this.libre=true;
        int dias=(int)(Math.random()*5)+1;
        String mensaje;
        this.libre=true;
        mensaje=this.precio+" por dia, "+"por "+dias+", total = "+(this.precio*dias);
        return mensaje;
    }

    public String reservar() {
        this.libre=false;
        return this.id+" habitacion reservada";
    }

    public String getHabitaculo() {
        String vistas="";
        if(this.terraza) {
            vistas=" con terraza";
        } else {
            vistas=" con ventanas";
        }
        return vistas;
    }

    public String toString() {
        return "Ejercicio09_SolucionHabitaciones [id=" + id + ", cama=" + cama + ", terraza=" + terraza + ", libre="+ libre + ", precio=" + precio + "]";
    }

}