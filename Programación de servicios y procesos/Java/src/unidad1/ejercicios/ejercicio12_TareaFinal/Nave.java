package unidad1.ejercicios.ejercicio12_TareaFinal;

public abstract class Nave {
	
	protected String codigo;
	protected Modelo modelo;
    protected int tripulacion;

    public Nave(String codigo, Modelo modelo, int tripulacion) {
    	this.codigo = codigo;
        this.modelo = modelo;
        this.tripulacion = tripulacion;
    }

    protected String getCodigo() {
		return this.codigo;
	}
	
    public Modelo getModelo() {
        return this.modelo;
    }

    public int getTripulacion() {
    	return this.tripulacion;
    }
    
    public abstract String toString();
    public abstract void imprimir();
	public abstract void despegar();
    public abstract void aterrizar();

}
