package unidad1.ejercicios.ejercicio12_TareaFinal;

public class NaveTransporte extends Nave implements Volador {
	
    private int cargaMaxima;

    public NaveTransporte(String modelo, int capacidad, int cargaMaxima) {
        super(modelo, capacidad);
        this.cargaMaxima = cargaMaxima;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    @Override
    public void despegar() {
        System.out.println("La nave de transporte " + getModelo() + " est� despegando.");
    }

    @Override
    public void aterrizar() {
        System.out.println("La nave de transporte " + getModelo() + " est� aterrizando.");
    }

    @Override
    public void volar() {
    	System.out.println("La nave de transporte " + getModelo() + " est� volando.");
    }
}
