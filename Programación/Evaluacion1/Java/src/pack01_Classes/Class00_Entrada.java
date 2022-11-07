package pack01_Classes;

import java.util.Scanner;

public class Class00_Entrada {

    public static void main(String[] args) {
        
        //String nombre="Victor"; //referencia a un objeto (nombre es un objeto)
        
        /*declaracion de un objeto (porque el tipo de dato que precede al identificador esta en mayus -> Scanner)
         todo objeto en java tiene un construcctor*/
        Scanner entrada; //declaramos el objeto

        //declaracion de variable
        long numero;

        //instanciamos el objeto (guardar un tamano en memoria para el objeto)
        entrada=new Scanner(System.in); //definimos como parametro de entrada para el Scanner la clase Input System

        //declaracion e instancia
        // Scanner input=new Scanner(System.in);

        System.out.println("Introduce un numero");
        numero=entrada.nextLong(); //llamada de un metodo de la clase Scanner para introducir el metodo por teclado al ejecutar
        System.out.println("Has introducido -> "+numero);

        System.out.println("Introduce tu nombre");
        String cadena=entrada.next(); //tambien se puede usar nextLine()
        System.out.println("Tu nombre es -> "+cadena);

        entrada.close(); //cerrar el objeto
        
    } //fin main

} //fin class