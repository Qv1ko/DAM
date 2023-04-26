package unidad4.ejercicios.ejercicio00_Banco;

public class MiBancoArray {
    
    public static void main(String[] args) {
        //Declaramos e instancimos un array para la clase Ejercicio06_CuentaCorriente
        CuentaCorriente[] clientes=new CuentaCorriente[5];
        // Ejercicio06_CuentaCorriente saul=new Ejercicio06_CuentaCorriente("Saul");
        // clientes[0]=saul;
        double saldoTotal=0;
        //Intanciamos el objeto y lo guardamos en una posicion del array
        clientes[0]=new CuentaCorriente("Saul");
        clientes[1]=new CuentaCorriente("Andres");
        clientes[2]=new CuentaCorriente("Marta");
        clientes[3]=new CuentaCorriente("Irene",55);
        clientes[4]=new CuentaCorriente("Constantin");
        clientes[0].ingresar(100);
        clientes[1].ingresar(99);
        //for each -> for(elementoIterador:lista){}
        for(CuentaCorriente cli:clientes) {
            System.out.println(cli);
            saldoTotal+=cli.getSaldo();
        }
        System.out.println("El banco maneja "+saldoTotal);
    }//main

}//class
