package examenes.examen5;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Oficinistas extends Empleados implements CalcSueldo {
    
    private String departamento;

    public Oficinistas() {
        super();
        this.departamento="sin definir";
    }

    public Oficinistas(String nombre, String apellidos, String dni, LocalTime hEntrada, LocalTime hSalida, String departamento) {
        super(nombre, apellidos, dni, hEntrada, hSalida);
        this.departamento=departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getSalario() {
        float salarioDia=0.0f;
        int horas=0;
        horas=(int)ChronoUnit.HOURS.between(gethEntrada(), gethSalida());
        if(horas>HORASBASE) {
            salarioDia=((horas-HORASBASE)*OFIEXTRA)+(HORASBASE*OFIBASE);
        } else {
            salarioDia=horas*OFIBASE;
        }
        return Float.toString(salarioDia);
    }

    public String toNominas() {
        return super.toNominas()+";"+getDepartamento()+";"+getSalario()+";"+getJornada();
    }

}
