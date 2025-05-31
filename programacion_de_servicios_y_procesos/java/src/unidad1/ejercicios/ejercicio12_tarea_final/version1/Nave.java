package unidad1.ejercicios.ejercicio12_tarea_final.version1;

public abstract class Nave implements ControlTorre {

    protected int codigo;
    protected String nombre;
    protected int capacidad;
    protected boolean estado;
    private Controler controler;

    public Nave() {
        this.codigo=0;
        this.nombre="";
        this.capacidad = 0;
        this.estado=true;
    }

    public Nave(int codigo, String nombre,int capacidad, boolean estado) {
        this.codigo=codigo;
        this.nombre=nombre;
        this.capacidad = capacidad;
        this.estado=estado;
    }

	public abstract String despegar();
    public abstract String aterrizar();

    public void setControler(Controler controler) {
    	this.controler=controler;
    }
  
    public String solicitarDespegar() {
		return null;	
    }

    public String solicitarAterrizar() {
		return null;
    	
    }

}
