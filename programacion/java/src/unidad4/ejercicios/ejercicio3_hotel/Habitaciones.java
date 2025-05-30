package unidad4.ejercicios.ejercicio3_hotel;

public enum Habitaciones {

    HABIT(101,"Individual",true),HABI1(102,"Individual",false),HABI2(103,"Individual",false),HABMT(104,"Matrimonio",true),HABM1(105,"Matrimonio",false),HABM2(106,"Matrimonio",false);

    private String habitacion;
    private boolean terraza,alquilado;
    private int precio,id;

    private Habitaciones(int id,String habitacion,boolean terraza) {
        this.id=id;
        this.habitacion=habitacion;
        this.terraza=terraza;
        this.alquilado=false;
    }//Ejercicio09_Habitaciones

    public String getHabitacion() {
        return habitacion;
    }//getHabitacion

    public boolean isTerraza() {
        return terraza;
    }//isTerraza

    public void setAlquilado(boolean alquilado) {
        this.alquilado=alquilado;
    }//setAlquilado

    public boolean isAlquilar() {
        return alquilado;
    }//isAlquilar

    //Metodo para obtener el precio de la habitacion
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

    //Metodo para obtener la String para el metodo toString del numero de camas de la habitacion
    public String getNumCamas() {
        return (getHabitacion().equalsIgnoreCase("individual"))? " 2 camas individuales":" 1 cama de matrimonio";
    }//getNumCamas

    //Metodo para obtener la String para el metodo toString del tipo de habitacion (con o sin terraza)
    public String getTipoHabitacion() {
        return (isTerraza())? " con terraza y":" con ventana y";
    }//getTipoHabitacion

    //Metodo para obtener la String de si esta disponible o no la habitacion para el metodo listado dentro de la clase Ejercicio09_Hotel
    public String getDisponibilidad() {
        return (isAlquilar())? "No disponible\n":"Disponible\n";
    }//getDisponibilidad

    public String toString() {
        return "Habitacion "+getId()+getTipoHabitacion()+getNumCamas()+"\n\sPrecio: "+getPrecio()+" euros/dia\n";
    }//toString

}//class