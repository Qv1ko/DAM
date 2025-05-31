package unidad1.ejercicios.ejercicio6_asociacion;

class Actuador extends Sensor {

    private boolean disparador;

    public Actuador() {
        super();
        this.disparador = false;
    }

    public boolean getDisparador() {
        return this.disparador;
    }

    public void comprobarDisparador(boolean activo) {
        this.disparador = activo;
    }

    public void alarma() {
        System.out.println(getDisparador() ? "ALERTA INTRUSO" : "");
    }

}
