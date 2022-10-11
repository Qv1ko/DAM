package packClasses;

public class Class07_BucleWhile {
    
    public static void main(String[] args) {

        //ejemplo 0 - Contador
        int contador=0;

        while(contador<=9) {

            System.out.print(contador);
            contador++;

        }
        System.out.println("\n");

        //ejercicio 0 - Tabla multiplicar
        int cont=0,tabla=3;

        while(cont<=10) {
            
            System.out.println(tabla+"*"+cont+"="+(tabla*cont));
            cont++;

        }
        System.out.println("\n");

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

    }//fin main

}//fin class
