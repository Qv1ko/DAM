package unidad1.ejercicios.ejercicio06_Asociacion;

public class Flow {
  
    public static void main(String[] args) {
        
        Recinto casa = new Recinto();
        Sensor sensorPuerta = new Sensor();
        Actuador alarmaSeguridad = new Actuador();

        casa.setIntruso(true);
        sensorPuerta.comprobarActivo(casa.getIntruso());
        alarmaSeguridad.comprobarDisparador(sensorPuerta.getActivo());
        
        alarmaSeguridad.alarma();

    }

}

class Recinto {

    private boolean intruso;

    public Recinto() {
        this.intruso = false;
    }

    public boolean getIntruso() {
        return this.intruso;
    }

    public void setIntruso(boolean intruso) {
        this.intruso = intruso;
    }

}

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
