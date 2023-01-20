package paqueteEjercicios2;

public class Ejercicio06_MiBancoArray {
    
    public static void main(String[] args) {
        //Declaramos e instancimos un array para la clase Ejercicio06_CuentaCorriente
        Ejercicio06_CuentaCorriente[] clientes=new Ejercicio06_CuentaCorriente[5];
        // Ejercicio06_CuentaCorriente saul=new Ejercicio06_CuentaCorriente("Saul");
        // clientes[0]=saul;
        double saldoTotal=0;
        //Intanciamos el objeto y lo guardamos en una posicion del array
        clientes[0]=new Ejercicio06_CuentaCorriente("Saul");
        clientes[1]=new Ejercicio06_CuentaCorriente("Andres");
        clientes[2]=new Ejercicio06_CuentaCorriente("Marta");
        clientes[3]=new Ejercicio06_CuentaCorriente("Irene",55);
        clientes[4]=new Ejercicio06_CuentaCorriente("Constantin");
        clientes[0].ingresar(100);
        clientes[1].ingresar(99);
        //for each -> for(elementoIterador:lista){}
        for(Ejercicio06_CuentaCorriente cli:clientes) {
            System.out.println(cli);
            saldoTotal+=cli.getSaldo();
        }
        System.out.println("El banco maneja "+saldoTotal);
    }//main

}//class
