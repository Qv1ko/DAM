package paqueteEjercicios2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04_PasswordNavidad {
    
    public static void main(String[] args) {
        int[] cadena=new int[6];
        String[] acertados=new String[cadena.length];
        int num=0;
        Scanner sc=new Scanner(System.in);
        generarRandom(cadena);
        rellenar(acertados);
        for(int i=10;i>0;i--) {
            do {
                System.out.print("\nEscribe un numero del 1 al 20: ");
                num=sc.nextInt();
            } while(num<1||num>20);
            for(int j=0;j<cadena.length;j++) {
                if(num==cadena[j]) {
                    acertados[j]=Integer.toString(num);
                }
            }
            System.out.println(Arrays.toString(acertados));
            if(comprobar(acertados)) {
                break;
            } else if(i==1) {
                System.out.println("\nFinalizaste los intentos");
                break;
            } else {
                pista(cadena,acertados,num);
            }
        }
        sc.close();
    }//main

    public static void generarRandom(int[] arrayCadena) {
        for(int i=0;i<arrayCadena.length;i++) {
            arrayCadena[i]=(int)((Math.random()*20)+1);
        }
    }//generarRandom

    public static void rellenar(String[] arrayAcertados) {
        for(int i=0;i<arrayAcertados.length;i++) {
            arrayAcertados[i]="*";
        }
    }//rellenar

    public static boolean comprobar(String[] arrayAcertados) {
        for(int i=0;i<arrayAcertados.length;i++) {
            if(arrayAcertados[i]=="*") {
                return false;
            }
        }
        return true;
    }//comprobar

    public static void pista(int[] arrayCadena,String[] arrayAcertados,int numero) {
        for(int i=0;i<arrayCadena.length;i++) {
            if(!(arrayAcertados[i].equals(Integer.toString(arrayCadena[i])))) {
                System.out.println("El número de la posición "+(i+1)+" es "+valorPista(arrayCadena[i],numero));
            }
        }
    }//pista

    public static String valorPista(int valorCadena,int numero) {
        if(valorCadena>numero) {
            return "mayor";
        } else {
            return "menor";
        }
    }//valorPista

}//class
