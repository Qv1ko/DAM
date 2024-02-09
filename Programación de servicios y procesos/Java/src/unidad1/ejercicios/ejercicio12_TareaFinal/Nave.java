package unidad1.ejercicios.ejercicio12_TareaFinal;

public abstract class Nave {
	
	protected int codigo;
	protected String modelo;
    protected int capacidad;
    protected Bando bando;

    public Nave(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public abstract void despegar();
    public abstract void aterrizar();

    public String getModelo() {
        return this.modelo;
    }

    public int getCapacidad() {
    	return this.capacidad;
    }
    
    public void volar() {
        System.out.println("La nave est� volando.");
    }
}
