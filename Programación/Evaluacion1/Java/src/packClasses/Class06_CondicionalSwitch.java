package packClasses;

public class Class06_CondicionalSwitch{

    public static void main(String[] args) {
    
        int entrada=1;
        
        //condicional switch -> realiza la accion dependiendo del valor de la variable
        //ejemplo 0 - Switch de entero
        switch(entrada) {

            case 0:
                System.out.println("Entrada 0");//lineas de codigo
                break;
            case 1:
                System.out.println("Entrada 1");
                break;
            case 2:
                System.out.println("Entrada 2");
                break;
            case 3:
                System.out.println("Entrada 3");
                break;
            default:
                System.out.println("Escriba otro valor");

        }


        //utilizacion de la tabla ascii en variables
        int ascii0='a';
        System.out.println("\nCaracter a en numero ascii por lo variable int "+ascii0);//muestra el valor del caracter de la variable int al numero en ascii
        char ascii1=23;
        System.out.println("Caracter 23 en un caracter ascii por la variable char "+ascii1);//muestra el valor del numero de la variable char al caracter en ascii


        //ejemplo 1 - Switch de caracter
        char input='a';

        switch(input) {

            case 'a':
                System.out.println("\nEntrada A");//lineas de codigo
                break;
            case 'b':
                System.out.println("\nEntrada B");
                break;
            case 'c':
                System.out.println("\nEntrada C");
                break;
            case 'd':
                System.out.println("\nEntrada D");
                break;
            default:
                System.out.println("\nEscriba otro valor");

        }


        //ejemplo 2 - Switch de cadena de texto
        String cadena="martes";

        switch(cadena) {

            case "lunes":
                System.out.println("\nEs lunes");//lineas de codigo
                break;
            case "martes":
                System.out.println("\nEs martes");
                break;
            case "miercoles":
                System.out.println("\nEs miercoles");
                break;
            case "jueves":
                System.out.println("\nEs jueves");
                break;
            case "viernes":
                System.out.println("\nEs viernes");
                break;
            case "sabado":
                System.out.println("\nEs sabado");
                break;
            case "domingo":
                System.out.println("\nEs domingo");
                break;
            default:
                System.out.println("\nEscriba el dia de la semana en minuscula");


        }

    }//fin main

}//fin class