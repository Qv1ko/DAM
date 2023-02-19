package paqueteEjercicios2;

public class Ejercicio09_Habitaciones {

    private String habitacion;
    private boolean terraza;
    private int precio,id=100;

    public Ejercicio09_Habitaciones(String habitacion,boolean terraza) {
        this.habitacion=habitacion;
        this.terraza=terraza;
        id++;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion=habitacion;
    }

    public boolean isTerraza() {
        return terraza;
    }

    public void setTerraza(boolean terraza) {
        this.terraza=terraza;
    }

    public int getPrecio() {
        if(getHabitacion().equalsIgnoreCase("matrimonio")) {
            precio=(terraza)? 40:30;
        } else if(getHabitacion().equalsIgnoreCase("individual")) {
            precio=(terraza)? 25:20;
        }
        return precio;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Habitacion "+getId()+" - "+getHabitacion()+"\n\sPrecio: "+getPrecio()+" euros/dia";
    }

}