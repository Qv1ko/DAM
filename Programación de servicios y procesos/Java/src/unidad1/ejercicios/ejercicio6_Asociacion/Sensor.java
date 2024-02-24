package unidad1.ejercicios.ejercicio6_Asociacion;

class Sensor extends Recinto {

    private boolean activo;

    public Sensor() {
        super();
        this.activo = false;
    }

    public boolean getActivo() {
        return this.activo;
    }

    public void comprobarActivo(boolean intruso) {
        this.activo = intruso;
    }

}
