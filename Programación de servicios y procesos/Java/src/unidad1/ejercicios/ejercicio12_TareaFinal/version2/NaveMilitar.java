package unidad1.ejercicios.ejercicio12_TareaFinal.version2;

public class NaveMilitar extends Nave {
	
    private Bando bando;

    public NaveMilitar(String codigo, Modelo modelo, int tripulacion, Accion estado, Bando bando) {
        super(codigo, modelo, tripulacion, estado);
        this.bando = bando;
    }

    public Bando getBando() {
		return this.bando;
	}

	public void setBando(Bando bando) {
        this.bando = bando;
    }

    @Override
	public String toString() {
		return "Nave " + super.getCodigo() + "\nModelo: " + super.getModelo() + "\nBando: " + getBando() + "\nNúmero de tripulación: " + super.getTripulacion();
	}

	@Override
	public void imprimir() {
		System.out.println(toString());
	}
}
