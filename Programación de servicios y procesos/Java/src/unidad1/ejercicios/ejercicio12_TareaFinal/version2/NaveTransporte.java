package unidad1.ejercicios.ejercicio12_TareaFinal.version2;

public class NaveTransporte extends Nave {
	
    private float carga;

    public NaveTransporte(String codigo, Modelo modelo, int tripulacion, Accion estado, float carga) {
        super(codigo, modelo, tripulacion, estado);
        this.carga = carga;
    }

    public float getCarga() {
        return this.carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    @Override
	public String toString() {
		return "Nave " + super.getCodigo() + "\nModelo: " + super.getModelo() + "\nNúmero de tripulación: " + super.getTripulacion() + "\nPeso de la carga: " + getCarga();
	}

	@Override
	public void imprimir() {
		System.out.println(toString());
	}
	
}
