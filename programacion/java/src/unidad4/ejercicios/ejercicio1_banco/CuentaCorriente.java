package unidad4.ejercicios.ejercicio1_banco;

public class CuentaCorriente {

    private String titular;
    private double saldo;

    public CuentaCorriente(String titular) {
        this(titular,0);
    }//Ejercicio06_CuentaCorriente

    public CuentaCorriente(String titular,double saldo) {
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
            mensaje="Se han ingresado a "+this.getTitular()+" "+cantidad+" euros. El saldo final es de "+this.saldo+" euros";
        } else {
            mensaje="No se permite ingresar cantidades negativas";
        }
        return mensaje;
    }//ingresarInfo

    public String retirarInfo(double cantidad) {
        String mensaje="";
        if(cantidad>0&&cantidad<=this.getSaldo()) {
            this.retirar(cantidad);
            mensaje="Se han retirado "+this.getTitular()+" "+cantidad+" euros. El saldo final es de "+this.getSaldo()+" euros";
        } else {
            mensaje="La cantidad es incorrecta o el saldo es insuficiente";   
        }
        return mensaje;
    }//retirarInfo

    public String toString() {
        return "\nTitular: "+getTitular()+"\n\sSaldo: "+String.format("%.2f",getSaldo())+"\n";
    }//toString

}//class
