package unidad1.ejercicios.ejercicio12_TareaFinal;

public class NaveMilitar extends Nave implements Volador {
	
    private int armamento;

    public NaveMilitar(String modelo, int capacidad, int armamento) {
        super(modelo, capacidad);
        this.armamento = armamento;
    }

    public int getArmamento() {
        return armamento;
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
    public void volar() {
    	System.out.println("La nave militar " + getModelo() + " est� volando.");
    }
}
