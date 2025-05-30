package unidad1.clases;

public class Clase5_CondicionalIf {
    
    public static void main(String[] args) {
        
        //ejemplo1 - Alumnos
        int numAlumnos=22;//declaracion y inicializacion

        //se ejecuta el codigo si la condicion se cumple
        if (numAlumnos>=1) {
            System.out.println("Hay alumnos");
        }
        System.out.println("Fin del condicional Alumnos");
        

        //ejemplo2 - Semaforo1
        int velocidad=40, luzSemaforo=0;//luzSemaforo -> 1=verde , 0=rojo

        //se ejecua el codigo si la condicion se cumple, si no, se ejecuta la codigo de else
        if (luzSemaforo==1) {
            System.out.println("\nSemaforo verde, velocidad="+velocidad);
        }
        else {
            velocidad=0;
            System.out.println("\nSemaforo rojo, velocidad="+velocidad);
        }
        System.out.println("Fin del condicional Semaforo1");


        //ejercicio1 - Portero
        int edad=17;

        if (edad>=18) {
            System.out.println("\nPuede entrar");
        }
        else {
            System.out.println("\nNo puede entrar");
        }
                

        //ejemplo3 - Semaforo2
        int velocidadVehiculo=40, semaforo=10;//luz semaforo: 1=verde , 0=rojo , 2=ambar, 10=apagado

        if (semaforo==1){
            System.out.println("\nSemaforo en verder, velocidad del vehiculo="+velocidadVehiculo);
        }
        else if (semaforo==2){
            velocidadVehiculo=0;
            System.out.println("\nSemaforo en ambar, velocidad del vehiculo="+velocidadVehiculo);
        }
        else if (semaforo==0){
            velocidadVehiculo=0;
            System.out.println("\nSemaforo en rojo, velocidad del vehiculo="+velocidadVehiculo);
        }
        else {
            System.out.println("\nSemaforo apagado o aberiado, velocidad del vehiculo="+velocidadVehiculo);
        }
        System.out.println("Fin del condicional Semaforo2");


        //ejercicio2 - Valores
        int valor=36;

        if(valor<10) {
            System.out.println("\n"+valor+" es < 10");
        }
        else if(valor<50) {
            System.out.println("\n"+valor+" es >= 10 y < 50");
        }
        else {
            System.out.println("\n"+valor+" es >= 50");
        }

        if(valor<10) {
            System.out.println("\n"+valor+" es menor que 10");
        }
        else if(valor>=10 && valor<50) {
            System.out.println("\n"+valor+" es mayor o igual a 10 y menor que 50");
        }
        else if(valor>=50) {
            System.out.println("\n"+valor+" es mayor o igual a 50");
        }


        //ejercicio3 - Numeros
        int num1=9,num2=6;

        //lineas de codigo
        if(num1>num2) {
            System.out.println("\nEl mayor es "+num1);
        }
        else if(num1<num2) {
            System.out.println("\nEl mayor es "+num2);
        }
        else {
            System.out.println("\nLos numeros son iguales");
        }


        //ejemplo 4 - Interruptor
        boolean interruptor=true;

        if(interruptor==true) {
            System.out.println("\nEl interruptor esta encendido");
        }
        else{
            System.out.println("\nEl interruptor esta apagado");
        }
        
        //se ejecuta la primera condicion si interruptor es true
        if(interruptor) {
            System.out.println("El interruptor esta encendido");
        }
        else{
            System.out.println("El interruptor esta apagado");
        }

    }//fin main

}//fin class
