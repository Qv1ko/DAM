package paqueteExamenes.examen4;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SolucionFacturas {
    
    private int numFactura;
    private String nomCliente;
    private float importe;
    private LocalDate fechaF;

    public SolucionFacturas() {
        this.numFactura=0;
        this.nomCliente="";
        this.importe=0.0f;
        this.fechaF=LocalDate.now();
    }

    public SolucionFacturas(int numFactura,String nomCliente,float importe,LocalDate fecha) {
        this.numFactura=numFactura;
        this.nomCliente=nomCliente;
        this.importe=importe;
        this.fechaF=fecha;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) throws Exception {
        if(importe<=0) {
            throw new Exception("Importe no válido");
        }
        this.importe = importe;
    }

    public LocalDate getFechaF() {
        return fechaF;
    }

    public void setFechaF(LocalDate fechaF) {
        this.fechaF = fechaF;
    }

    public LocalDate getFechaCobro() {
        LocalDate fCobro=null;
        if(this.getImporte()<10000) {
            fCobro=fechaF.plusDays(30);
        } else if(this.getImporte()>=10000&&this.getImporte()<50000) {
            fCobro=fechaF.plusDays(60);
        } else {
            fCobro=fechaF.plusDays(60);
        }
        if(fCobro.getDayOfWeek()==DayOfWeek.SATURDAY) {
            fCobro=fCobro.plusDays(2);
        } else if(fCobro.getDayOfWeek()==DayOfWeek.SUNDAY) {
            fCobro=fCobro.plusDays(1);
        }
        return fCobro;
    }

    public String toString() {
        return "Factura numero "+getNumFactura()+" del cliente "+getNomCliente()+" con un importe de "+getImporte()+"\nFecha de factura: "+getFechaF()+"\nFecha de cobro: "+getFechaCobro();
    }

}
