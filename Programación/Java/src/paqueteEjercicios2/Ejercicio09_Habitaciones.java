package paqueteEjercicios2;

public enum Ejercicio09_Habitaciones {

    HABIT(101,"Individual",true),HABI1(102,"Individual",false),HABI2(103,"Individual",false),HABMT(104,"Matrimonio",true),HABM1(105,"Matrimonio",false),HABM2(106,"Matrimonio",false);

    private String habitacion;
    private boolean terraza,alquilado;
    private int precio,id;

    private Ejercicio09_Habitaciones(int id,String habitacion,boolean terraza) {
        this.habitacion=habitacion;
        this.terraza=terraza;
        this.id=id;
    }//Ejercicio09_Habitaciones

    public String getHabitacion() {
        return habitacion;
    }//getHabitacion

    public boolean isTerraza() {
        return terraza;
    }//isTerraza

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }//setAlquilado

    public boolean isAlquilar() {
        return alquilado;
    }//isAlquilar

    public int getPrecio() {
        if(getHabitacion().equalsIgnoreCase("matrimonio")) {
            precio=(terraza)? 40:30;
        } else if(getHabitacion().equalsIgnoreCase("individual")) {
            precio=(terraza)? 25:20;
        }
        return precio;
    }//getPrecio

    public int getId() {
        return id;
    }//getId

    public String getNumCamas() {
        return (getHabitacion().equalsIgnoreCase("individual"))? " 2 camas individuales ":" 1 cama de matrimonio";
    }//getNumCamas

    public String getTipoHabitacion() {
        return (isTerraza())? " con terraza y":" con ventana y";
    }//getTipoHabitacion

    public String getDisposicion() {
        return (isAlquilar())? "No disponible\n":"Disponible\n";
    }//getDisposicion

    public String toString() {
        return "Habitacion "+getId()+getTipoHabitacion()+getNumCamas()+"\n\sPrecio: "+getPrecio()+" euros/dia\n";
    }//toString

}//class