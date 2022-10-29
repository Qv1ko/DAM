package pack01_Exercises;

import java.util.Scanner;

public class Exercise00_EjerciciosScanner2 {

    public static void main(String[] args) {
        
        String password="qwerty123",input;
        Scanner entrada=new Scanner(System.in);

        for(int i=3;i>0;i--) {
            System.out.print("Escriba la contasena: ");
            input=entrada.nextLine();
            if(input!=password) {
                System.out.println("Contrasena incorrecta");
            } else {
                System.out.println("Enhorabuena");
                break;
            }
        }

    } //fin main
    
} //fin class
