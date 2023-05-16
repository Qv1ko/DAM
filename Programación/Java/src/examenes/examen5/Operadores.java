package examenes.examen5;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Operadores extends Empleados implements CalcSueldo {

    private int numTaller;

    public Operadores() {
        super();
        this.numTaller=0;
    }

    public Operadores(String nombre, String apellidos, String dni, LocalTime hEntrada, LocalTime hSalida, int numTaller) {
        super(nombre, apellidos, dni, hEntrada, hSalida);
        this.numTaller=numTaller;
    }

    public int getNumTaller() {
        return numTaller;
    }

    public String getSalario() {
        float salarioDia=0;
        int horas=0;
        horas=(int)ChronoUnit.HOURS.between(gethEntrada(), gethSalida());
        if(horas>HORASBASE) {
            salarioDia=((horas-HORASBASE)*OPEEXTRA)+(HORASBASE*OPEBASE);
        } else {
            salarioDia=horas*OPEBASE;
        }
        return Float.toString(salarioDia);
    }

    public String toNominas() {
        return super.toNominas()+";"+getNumTaller()+";"+getSalario()+";"+getJornada();
    }
   
}
