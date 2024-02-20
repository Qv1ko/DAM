package unidad1.ejercicios.ejercicio12_TareaFinal.version2;

public abstract class Nave {
	
	protected String codigo;
	protected Modelo modelo;
    protected int tripulacion;
    protected Accion estado;

    public Nave(String codigo, Modelo modelo, int tripulacion, Accion estado) {
    	this.codigo = codigo;
        this.modelo = modelo;
        this.tripulacion = tripulacion;
        this.estado = estado;
    }

    public String getCodigo() {
		return this.codigo;
	}
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
	
    public Modelo getModelo() {
        return this.modelo;
    }
    
    public void setTripulacion(int tripulacion) {
        this.tripulacion = tripulacion;
    }

    public int getTripulacion() {
    	return this.tripulacion;
    }

    public Accion getEstado() {
        return estado;
    }

    public void setEstado(Accion estado) {
        this.estado = estado;
    }

    public abstract String toString();
    public abstract void imprimir();

}
