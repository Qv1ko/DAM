package examenes.examen4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Facturas {

    String codigo,nombreCliente;
    float importe;
    LocalDate fechaFactura;
    DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Facturas() {
        this.codigo="sin codigo";
        this.nombreCliente="no identificado";
        this.importe=0.0f;
        this.fechaFactura=LocalDate.parse(LocalDate.now().format(df),df);
    }//Facturas vacio

    public Facturas(String codigo,String nombre,float importe,LocalDate fecha) {
        this.codigo=codigo;
        this.nombreCliente=nombre;
        this.importe=importe;
        this.fechaFactura=LocalDate.parse(fecha.format(df),df);
    }//Facturas

    public String getCodigo() {
        return codigo;
    }//getCodigo

    public String getNombreCliente() {
        return nombreCliente;
    }//getNombreCliente

    public float getImporte() {
        return importe;
    }//getImporte

    public String getFechaFactura() {
        return this.fechaFactura.format(df);
    }//getFechaFactura

    public String fechaCobro() {
        if(getImporte()<10000) {
            this.fechaFactura=LocalDate.parse(getFechaFactura(),df).plusDays(30);
        } else if(getImporte()>=10000&&getImporte()<50000) {
            this.fechaFactura=LocalDate.parse(getFechaFactura(),df).plusDays(60);
        } else {
            this.fechaFactura=LocalDate.parse(getFechaFactura(),df).plusDays(90);
        }
        while(LocalDate.parse(getFechaFactura(),df).getDayOfWeek().getValue()==6||LocalDate.parse(getFechaFactura(),df).getDayOfWeek().getValue()==7) {
            this.fechaFactura=LocalDate.parse(getFechaFactura(),df).plusDays(1);
        }
        return this.fechaFactura.format(df);
    }//fechaCobro

    public String diaSemana() {
        return switch (LocalDate.parse(fechaCobro(),df).getDayOfWeek().getValue()) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            default -> "Sabado o Domingo :(";
        };
    }//diaSemana

    public String toString() {
        return "La factura "+getCodigo()+" del cliente "+getNombreCliente()+" tiene un importe de "+getImporte()+" euros a combrar antes del "+fechaCobro()+" ("+diaSemana()+")";
    }//toString

}//class