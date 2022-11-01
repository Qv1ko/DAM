package pack01_Exercises;

import java.util.Scanner;

public class Exercise00_EjerciciosScanner5 {

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        int num=0,mayor=0,menor=0,sumTotal=0,sumPos=0,sumNeg=0,count=0;
        float mediaSum=0;

        while(true) {
            System.out.print("Escriba un numero: ");
            num=entrada.nextInt();

            if(num==-1) {
                break;
            } else {
                if(num>mayor) {
                    mayor=num;
                }
                if(num<menor) {
                    menor=num;
                }
                if(num>=0) {
                    sumTotal+=num;
                    count++;
                    sumPos+=num;
                } else {
                    sumTotal+=num;
                    count++;
                    sumNeg+=num;
                }
                mediaSum=(float)sumTotal/count;
            }
        }
        System.out.println("\nMayor numero introducido -> "+mayor+"\nMenor numero introducido -> "+menor);
        System.out.println("Suma de todos los numeros -> "+sumTotal+"\nSuma de los numeros positivos -> "+sumPos+"\nSuma de los numeros negativos -> "+sumNeg);
        System.out.println("Media de la suma total -> "+mediaSum);

    } //fin main
    
} //fin class