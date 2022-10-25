package pack00_Classes;

public class Class07_BucleWhile {
    
    public static void main(String[] args) {

        //ejemplo 0 - Contador
        int contador=0;

        while(contador<=9) {

            System.out.print(contador);
            contador++;

        }
        System.out.print("\n");

        //ejercicio 0 - Tabla multiplicar
        int cont=0,tabla=3;

        while(cont<=10) {
            
            System.out.println(tabla+"*"+cont+"="+(tabla*cont));
            cont++;

        }
        System.out.print("\n");

        //ejercicio 1 - Numeros pares de 100 a 0
        int num=100;

        while(num>=0) {
            
            // if(num%2==0) {
            //     System.out.println(num);
            // }
            // num--;
            
            System.out.println(num);
            num-=2;

        }
        System.out.print("\n");

        //ejemplo 1 - Numeros pares de 100 a 48
        int number=100;

        while(number>=0) {

            System.out.println(number);
            number-=2;

            //rompe el bucle al cumplirse la condicion
            if(number==46) {
                break;
            }

        }
        System.out.print("\n");

        //ejemplo 2 - Numeros pares de 100 a 0 menos el 48
        int num1=100;

        while(num1>=0) {

            //continua el bucle al cumplirse la condicion sin mostrar el valor de la variable
            if(num1==48) {
                num1-=2;
                continue;
            }

            System.out.println(num1);
            num1-=2;      

        }

    }//fin main

}//fin class
