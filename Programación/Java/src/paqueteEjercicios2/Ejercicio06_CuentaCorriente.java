package paqueteEjercicios2;

public class Ejercicio06_CuentaCorriente {

    private String titular;
    private double saldo;

    public Ejercicio06_CuentaCorriente(String titular) {
        this(titular,0);
    }//Ejercicio06_CuentaCorriente

    public Ejercicio06_CuentaCorriente(String titular,double saldo) {
        this.titular=titular;
        this.saldo=saldo;
    }//Ejercicio06_CuentaCorriente

    public void setTitular(String titular) {
        this.titular=titular;
    }//setTitular

    public void setSaldo(double saldo) {
        this.saldo=saldo;
    }//setSaldo

    public void ingresar(double cantidad) {
        if(cantidad>0) {
            this.saldo+=cantidad;
        }
    }//ingresar

    public void retirar(double cantidad) {
        if(cantidad<=this.saldo&&cantidad>0) {
            this.saldo-=cantidad;
        } else if(cantidad>this.saldo&&cantidad>0) {
            this.saldo-=this.saldo;
        }
    }//retirar

    public String getTitular() {
        return this.titular;
    }//getTitular

    public double getSaldo() {
        return this.saldo;
    }//getSaldo

    public String ingresarInfo(double cantidad) {
        ingresar(cantidad);
        String mensaje="";
        if(cantidad>0) {
            mensaje="Se ha ingresado "+cantidad+" euros. El saldo final es de "+this.saldo+" euros";
        } else {
            mensaje="No se permite ingresar cantidades negativas";
        }
        return mensaje;
    }//ingresarInfo

    public String retirarInfo(double cantidad) {
        retirar(cantidad);
        String mensaje="";
        if(cantidad>0) {
            if(cantidad<=this.saldo) {
                mensaje="Se han retirado "+cantidad+" euros. El saldo final es de "+this.saldo+" euros";
            } else {
                mensaje="La cantidad a retirar es superior al saldo. Se a retirado el total del saldo";   
            }
        } else {
            mensaje="No se permite retirar cantidades negativas";
        }
        return mensaje;
    }//retirarInfo

    public String toString() {
        return "\nTitular: "+getTitular()+"\n\sSaldo: "+String.format("%.2f",getSaldo())+"\n";
    }//toString

}//class
