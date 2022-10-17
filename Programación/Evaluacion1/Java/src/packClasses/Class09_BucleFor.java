package packClasses;

public class Class09_BucleFor {
    
    public static void main(String[] args) {

        //ejemplo 0 - Bucle de 5
        for(int i=1;i<=10;i+=5) {
            System.out.println("Hola"+i);
        }
        System.out.print("\n");


        //ejercicio 0 - Tabla de multiplicar
        int num=3;

        //bucle de la tabla de multiplicar
        for(int x=0;x<=10;x++) {
            System.out.println("Resultado de "+num+"*"+x+" -> "+num*x);
        }
        System.out.print("\n");


        //ejercicio 1 - Tablas de multiplicar
        for(int tabla=0;tabla<=10;tabla++) {
            System.out.println("Tabla del "+tabla+':');
            for(int numero=0;numero<=10;numero++) {
                System.out.println(tabla+"*"+numero+" = "+(tabla*numero));
            }
        }

    }//fin main

}//fin class
