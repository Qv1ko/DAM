package unidad1.ejercicios.ejercicio12_TareaFinal;

public class NaveMilitar extends Nave {
	
    private Bando bando;

    public NaveMilitar(String codigo, Modelo modelo, int tripulacion, Bando bando) {
        super(codigo, modelo, tripulacion);
        this.bando = bando;
    }

    protected Bando getBando() {
		return this.bando;
	}

    @Override
    public void despegar() {
        System.out.println("La nave militar " + getModelo() + " est� despegando.");
    }

    @Override
    public void aterrizar() {
        System.out.println("La nave militar " + getModelo() + " est� aterrizando.");
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
