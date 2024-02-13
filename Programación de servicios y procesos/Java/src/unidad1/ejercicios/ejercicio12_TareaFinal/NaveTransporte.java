package unidad1.ejercicios.ejercicio12_TareaFinal;

public class NaveTransporte extends Nave {
	
    private int carga;

    public NaveTransporte(String codigo, Modelo modelo, int tripulacion, int carga) {
        super(codigo, modelo, tripulacion);
        this.carga = carga;
    }

    public int getCarga() {
        return this.carga;
    }

    @Override
    public void despegar() {
        System.out.println("La nave de transporte " + getModelo() + " está despegando.");
    }

    @Override
    public void aterrizar() {
        System.out.println("La nave de transporte " + getModelo() + " está aterrizando.");
    }
    
    @Override
	public String toString() {
		return null;
	}

	@Override
	public void imprimir() {
		toString();
	}
	
	
}
