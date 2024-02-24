package unidad1.ejercicios.ejercicio6_Asociacion;

public class Flow {
  
    public static void main(String[] args) {
        
        Recinto casa = new Recinto();
        Sensor sensorPuerta = new Sensor();
        Actuador alarmaSeguridad = new Actuador();

        alarmaSeguridad.comprobarDisparador(sensorPuerta.getIntruso());
        alarmaSeguridad.alarma();

        casa.setIntruso(true);
        sensorPuerta.comprobarActivo(casa.getIntruso());
        alarmaSeguridad.comprobarDisparador(sensorPuerta.getActivo());
        
        alarmaSeguridad.alarma();

    }

}
