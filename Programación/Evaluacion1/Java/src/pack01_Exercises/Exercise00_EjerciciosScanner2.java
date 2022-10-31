package pack01_Exercises;

import java.util.Scanner;

public class Exercise00_EjerciciosScanner2 {

    public static void main(String[] args) {
        
        String password="qwerty123";
        Scanner entrada=new Scanner(System.in);

        for(int i=3;i>0;i--) {
            System.out.print("Escriba la contasena: ");
            String input=entrada.next();
            if(input.equals(password)) {
                System.out.println("Enhorabuena");
                break;
            } else {
                System.out.println("Contrasena incorrecta");
            }
        }

    } //fin main
    
} //fin class