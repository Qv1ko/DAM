package unidad1.ejercicios.ejercicio2_RepasoWeekend;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        float num=3.5f;//declaracion y inicializacion

        /*redondeo de la variable con la clase Math
         *uso del metodo round para redondear al numero posterior en caso de ser 0.5 o superior
         */
        System.out.println(Math.round(num));//impresion por pantalla del redondeo
        
        /*redondeo de la variable con cast
         *suma a la variable 0.5
         *al pasarlo a entero (int) corta los decimales
         *si es mayor de n.5 sube al siguiente entero y al cortarlo, se queda en el numero superior
         */
        int resultado=(int)(num+0.5);//cast
        System.out.println(resultado);//impresion por pantalla del redondeo
        
    }//fin main

}//fin class
