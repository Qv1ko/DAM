package unidad1.clases;

public class Clase6_OperadoresLogicos {
    
    public static void main(String[] args) {
        
        //ejercicio1 - Numero mayor y par
        int num1=8;

        if((num1>10)&&(num1%2==0)) {
            System.out.println("El numero "+num1+" es mayor a 10 y par");
        }
        else if(num1>10) {
            System.out.println("El numero "+num1+" es mayor que 10 e impar");
        }
        else if(num1%2==0) {
            System.out.println("El numero "+num1+" es menor que 10 y par");
        }
        else {
            System.out.println("El numero "+num1+" no es ni mayor que 10 ni par");
        }


        //ejercicio2 - Ascensor
        int planta=-3,peso=500;

        if((planta<=8)&&(peso<=500)||(planta>=9)&&(peso<=300)) {
            System.out.println("\nSubiendo a la planta "+planta+" con un peso de "+peso);
        }
        else if((planta<=8)&&(peso>=501)||(planta>=9)&&(peso>=300)) {
            System.out.println("\nPeso maximo alcanzado, no puede subir");
        }


        //ejercicio3 - Mayor de edad
        int diaNacimiento=4,mesNacimiento=11,anoNacimiento=2004;//fecha de nacimiento
        int diaActual=9,mesActual=10,anoActual=2023;//fecha actual

        // if((anoActual>anoNacimiento)&&(mesActual>=mesNacimiento)&&(diaActual>diaNacimiento)){
        //     System.out.println("\nEs mayor de edad");
        // }
        // else{
        //     System.out.println("\nEs menor de edad");
        // }

        if((anoNacimiento<(anoActual-18))||(anoNacimiento==(anoActual-18))&&(mesNacimiento<mesActual)||(anoNacimiento==(anoActual-18))&&(mesNacimiento==mesActual)&&(diaNacimiento<=diaActual)){
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("Es menor de edad");
        }

    }//fin main

}//fin class
